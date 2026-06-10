#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
RELENG_DIR="$(cd "${SCRIPT_DIR}/.." && pwd)"
POM_FILE="${RELENG_DIR}/pom.xml"

M2_REPO="${M2_REPO:-$HOME/.m2/repository}"
P2_BUNDLE_BASE="${M2_REPO}/p2/osgi/bundle"

if [[ ! -f "${POM_FILE}" ]]; then
  echo "Cannot find releng pom: ${POM_FILE}" >&2
  exit 1
fi

latest_bundle_version() {
  local bundle="$1"
  local bundle_dir="${P2_BUNDLE_BASE}/${bundle}"

  if [[ ! -d "${bundle_dir}" ]]; then
    echo ""
    return
  fi

  find "${bundle_dir}" -mindepth 1 -maxdepth 1 -type d -printf '%f\n' \
    | sort -V \
    | tail -n 1
}

set_property() {
  local property_name="$1"
  local property_value="$2"

  if [[ -z "${property_value}" ]]; then
    echo "Missing value for property ${property_name}" >&2
    exit 1
  fi

  sed -i -E "s#(<${property_name}>)[^<]*(</${property_name}>)#\\1${property_value}\\2#" "${POM_FILE}"
}

javax_activation_version="$(latest_bundle_version "javax.activation")"
emf_common_version="$(latest_bundle_version "org.eclipse.emf.common")"
emf_ecore_version="$(latest_bundle_version "org.eclipse.emf.ecore")"
ocl_version="$(latest_bundle_version "org.eclipse.ocl")"

missing=0
for pair in \
  "javax.activation:${javax_activation_version}" \
  "org.eclipse.emf.common:${emf_common_version}" \
  "org.eclipse.emf.ecore:${emf_ecore_version}" \
  "org.eclipse.ocl:${ocl_version}"; do
  bundle_name="${pair%%:*}"
  bundle_version="${pair#*:}"
  if [[ -z "${bundle_version}" ]]; then
    echo "Could not resolve bundle version for ${bundle_name} from ${P2_BUNDLE_BASE}" >&2
    missing=1
  fi
done

if [[ "${missing}" -ne 0 ]]; then
  exit 1
fi

set_property "javax.activation.version" "${javax_activation_version}"
set_property "emf.common.p2.version" "${emf_common_version}"
set_property "emf.ecore.p2.version" "${emf_ecore_version}"
set_property "ocl.p2.version" "${ocl_version}"

echo "Updated fatjar p2 version properties in ${POM_FILE}:"
echo "  javax.activation.version=${javax_activation_version}"
echo "  emf.common.p2.version=${emf_common_version}"
echo "  emf.ecore.p2.version=${emf_ecore_version}"
echo "  ocl.p2.version=${ocl_version}"