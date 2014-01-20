# Important change made to class NodeImpl.java
The method public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
was modified for thread-safety, to allow concurrent insertions of Arcs in the model.
Consequently its annotation was changed to @generatedNOT, in all Petri net types plugins. DO NOT remove this file.

TODO: the same consideration applies to eInverseRemove (concurrent modification), but so far, PNML Framework
is used just to exchange models (import/export) between different formats. There is no application to date
that uses it as internal library to handle and modify models in memory. But this should be closely watched
in the near future.

In case you accidentally delete the file to regenerate code here is the current version:
```
/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.NODE__IN_ARCS:
			synchronized (this) {
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInArcs())
						.basicAdd(otherEnd, msgs);
			}
		case PtnetPackage.NODE__OUT_ARCS:
			synchronized (this) {
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutArcs())
					.basicAdd(otherEnd, msgs);
			}
		case PtnetPackage.NODE__NODEGRAPHICS:
			if (nodegraphics != null)
				msgs = ((InternalEObject) nodegraphics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PtnetPackage.NODE__NODEGRAPHICS, null, msgs);
			return basicSetNodegraphics((NodeGraphics) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
```
