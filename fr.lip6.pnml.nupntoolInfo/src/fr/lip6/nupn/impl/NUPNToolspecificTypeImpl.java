/**
 */
package fr.lip6.nupn.impl;

import fr.lip6.nupn.NUPNToolspecificType;
import fr.lip6.nupn.NupnPackage;
import fr.lip6.nupn.SizeType;
import fr.lip6.nupn.StructureType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NUPN Toolspecific Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link fr.lip6.nupn.impl.NUPNToolspecificTypeImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUPNToolspecificTypeImpl extends MinimalEObjectImpl.Container implements NUPNToolspecificType {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected SizeType size;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected StructureType structure;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = "nupn";

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * This is true if the Tool attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toolESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VERSION_EDEFAULT = new BigDecimal("1.1");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUPNToolspecificTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NupnPackage.Literals.NUPN_TOOLSPECIFIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(SizeType newSize, NotificationChain msgs) {
		SizeType oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE, oldSize, newSize);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(SizeType newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject) size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject) newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE, newSize,
					newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(StructureType newStructure, NotificationChain msgs) {
		StructureType oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE, oldStructure, newStructure);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(StructureType newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		boolean oldToolESet = toolESet;
		toolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL, oldTool,
					tool, !oldToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTool() {
		String oldTool = tool;
		boolean oldToolESet = toolESet;
		tool = TOOL_EDEFAULT;
		toolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL, oldTool,
					TOOL_EDEFAULT, oldToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTool() {
		return toolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(BigDecimal newVersion) {
		BigDecimal oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION,
					oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		BigDecimal oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION,
					oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this, NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE:
			return basicSetSize(null, msgs);
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP:
			return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION:
			return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE:
			return getSize();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE:
			return getStructure();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL:
			return getTool();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION:
			return getVersion();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP:
			if (coreType)
				return getXMLNSPrefixMap();
			else
				return getXMLNSPrefixMap().map();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION:
			if (coreType)
				return getXSISchemaLocation();
			else
				return getXSISchemaLocation().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE:
			setSize((SizeType) newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE:
			setStructure((StructureType) newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL:
			setTool((String) newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION:
			setVersion((BigDecimal) newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP:
			((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION:
			((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE:
			setSize((SizeType) null);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE:
			setStructure((StructureType) null);
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL:
			unsetTool();
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION:
			unsetVersion();
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED:
			getMixed().clear();
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP:
			getXMLNSPrefixMap().clear();
			return;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION:
			getXSISchemaLocation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__SIZE:
			return size != null;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__STRUCTURE:
			return structure != null;
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__TOOL:
			return isSetTool();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__VERSION:
			return isSetVersion();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__MIXED:
			return mixed != null && !mixed.isEmpty();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XMLNS_PREFIX_MAP:
			return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
		case NupnPackage.NUPN_TOOLSPECIFIC_TYPE__XSI_SCHEMA_LOCATION:
			return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tool: ");
		if (toolESet)
			result.append(tool);
		else
			result.append("<unset>");
		result.append(", version: ");
		if (versionESet)
			result.append(version);
		else
			result.append("<unset>");
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //NUPNToolspecificTypeImpl
