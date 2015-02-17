/**
 *  Copyright 2009-2015 Université Paris Ouest and Sorbonne Universités,
 * 							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 */
package fr.lip6.move.pnml.ptnet.impl;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.pnml.framework.general.PnmlExport;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.ModelRepository;
import fr.lip6.move.pnml.framework.utils.PNMLEncoding;
import fr.lip6.move.pnml.framework.utils.PrettyPrintData;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.ptnet.AnyObject;
import fr.lip6.move.pnml.ptnet.Label;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PnObject;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.ToolInfo;
import fr.lip6.move.pnml.ptnet.util.PtnetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getFormattedXMLBuffer <em>Formatted XML Buffer</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getToolInfoGrammarURI <em>Tool Info Grammar URI</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getContainerPetriNet <em>Container Petri Net</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getContainerPnObject <em>Container Pn Object</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getContainerLabel <em>Container Label</em>}</li>
 *   <li>{@link fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl#getToolInfoModel <em>Tool Info Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolInfoImpl extends MinimalEObjectImpl implements ToolInfo {
	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = null;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormattedXMLBuffer() <em>Formatted XML Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormattedXMLBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final StringBuffer FORMATTED_XML_BUFFER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormattedXMLBuffer() <em>Formatted XML Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormattedXMLBuffer()
	 * @generated
	 * @ordered
	 */
	protected StringBuffer formattedXMLBuffer = FORMATTED_XML_BUFFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolInfoGrammarURI() <em>Tool Info Grammar URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolInfoGrammarURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI TOOL_INFO_GRAMMAR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolInfoGrammarURI() <em>Tool Info Grammar URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolInfoGrammarURI()
	 * @generated
	 * @ordered
	 */
	protected URI toolInfoGrammarURI = TOOL_INFO_GRAMMAR_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToolInfoModel() <em>Tool Info Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolInfoModel()
	 * @generated
	 * @ordered
	 */
	protected AnyObject toolInfoModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PtnetPackage.Literals.TOOL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBuffer getFormattedXMLBuffer() {
		return formattedXMLBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormattedXMLBuffer(StringBuffer newFormattedXMLBuffer) {
		StringBuffer oldFormattedXMLBuffer = formattedXMLBuffer;
		formattedXMLBuffer = newFormattedXMLBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__FORMATTED_XML_BUFFER,
					oldFormattedXMLBuffer, formattedXMLBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getToolInfoGrammarURI() {
		return toolInfoGrammarURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToolInfoGrammarURI(URI newToolInfoGrammarURI) {
		URI oldToolInfoGrammarURI = toolInfoGrammarURI;
		toolInfoGrammarURI = newToolInfoGrammarURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__TOOL_INFO_GRAMMAR_URI,
					oldToolInfoGrammarURI, toolInfoGrammarURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getContainerPetriNet() {
		if (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPetriNet(PetriNet newContainerPetriNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPetriNet, PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPetriNet(PetriNet newContainerPetriNet) {
		if (newContainerPetriNet != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET && newContainerPetriNet != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPetriNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPetriNet != null)
				msgs = ((InternalEObject) newContainerPetriNet).eInverseAdd(this,
						PtnetPackage.PETRI_NET__TOOLSPECIFICS, PetriNet.class, msgs);
			msgs = basicSetContainerPetriNet(newContainerPetriNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET,
					newContainerPetriNet, newContainerPetriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PnObject getContainerPnObject() {
		if (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT)
			return null;
		return (PnObject) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPnObject(PnObject newContainerPnObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerPnObject, PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPnObject(PnObject newContainerPnObject) {
		if (newContainerPnObject != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT && newContainerPnObject != null)) {
			if (EcoreUtil.isAncestor(this, newContainerPnObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerPnObject != null)
				msgs = ((InternalEObject) newContainerPnObject).eInverseAdd(this,
						PtnetPackage.PN_OBJECT__TOOLSPECIFICS, PnObject.class, msgs);
			msgs = basicSetContainerPnObject(newContainerPnObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT,
					newContainerPnObject, newContainerPnObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getContainerLabel() {
		if (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_LABEL)
			return null;
		return (Label) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerLabel(Label newContainerLabel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainerLabel, PtnetPackage.TOOL_INFO__CONTAINER_LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerLabel(Label newContainerLabel) {
		if (newContainerLabel != eInternalContainer()
				|| (eContainerFeatureID() != PtnetPackage.TOOL_INFO__CONTAINER_LABEL && newContainerLabel != null)) {
			if (EcoreUtil.isAncestor(this, newContainerLabel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerLabel != null)
				msgs = ((InternalEObject) newContainerLabel).eInverseAdd(this, PtnetPackage.LABEL__TOOLSPECIFICS,
						Label.class, msgs);
			msgs = basicSetContainerLabel(newContainerLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__CONTAINER_LABEL,
					newContainerLabel, newContainerLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyObject getToolInfoModel() {
		return toolInfoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolInfoModel(AnyObject newToolInfoModel, NotificationChain msgs) {
		AnyObject oldToolInfoModel = toolInfoModel;
		toolInfoModel = newToolInfoModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL, oldToolInfoModel, newToolInfoModel);
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
	@Override
	public void setToolInfoModel(AnyObject newToolInfoModel) {
		if (newToolInfoModel != toolInfoModel) {
			NotificationChain msgs = null;
			if (toolInfoModel != null)
				msgs = ((InternalEObject) toolInfoModel).eInverseRemove(this,
						PtnetPackage.ANY_OBJECT__CONTAINER_TOOL_INFO, AnyObject.class, msgs);
			if (newToolInfoModel != null)
				msgs = ((InternalEObject) newToolInfoModel).eInverseAdd(this,
						PtnetPackage.ANY_OBJECT__CONTAINER_TOOL_INFO, AnyObject.class, msgs);
			msgs = basicSetToolInfoModel(newToolInfoModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL,
					newToolInfoModel, newToolInfoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPetriNet((PetriNet) otherEnd, msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerPnObject((PnObject) otherEnd, msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainerLabel((Label) otherEnd, msgs);
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			if (toolInfoModel != null)
				msgs = ((InternalEObject) toolInfoModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL, null, msgs);
			return basicSetToolInfoModel((AnyObject) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			return basicSetContainerPetriNet(null, msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			return basicSetContainerPnObject(null, msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			return basicSetContainerLabel(null, msgs);
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			return basicSetToolInfoModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.PETRI_NET__TOOLSPECIFICS, PetriNet.class,
					msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.PN_OBJECT__TOOLSPECIFICS, PnObject.class,
					msgs);
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			return eInternalContainer().eInverseRemove(this, PtnetPackage.LABEL__TOOLSPECIFICS, Label.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PtnetPackage.TOOL_INFO__TOOL:
			return getTool();
		case PtnetPackage.TOOL_INFO__VERSION:
			return getVersion();
		case PtnetPackage.TOOL_INFO__FORMATTED_XML_BUFFER:
			return getFormattedXMLBuffer();
		case PtnetPackage.TOOL_INFO__TOOL_INFO_GRAMMAR_URI:
			return getToolInfoGrammarURI();
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			return getContainerPetriNet();
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			return getContainerPnObject();
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			return getContainerLabel();
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			return getToolInfoModel();
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
		case PtnetPackage.TOOL_INFO__TOOL:
			setTool((String) newValue);
			return;
		case PtnetPackage.TOOL_INFO__VERSION:
			setVersion((String) newValue);
			return;
		case PtnetPackage.TOOL_INFO__FORMATTED_XML_BUFFER:
			setFormattedXMLBuffer((StringBuffer) newValue);
			return;
		case PtnetPackage.TOOL_INFO__TOOL_INFO_GRAMMAR_URI:
			setToolInfoGrammarURI((URI) newValue);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			setContainerPetriNet((PetriNet) newValue);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			setContainerPnObject((PnObject) newValue);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			setContainerLabel((Label) newValue);
			return;
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			setToolInfoModel((AnyObject) newValue);
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
		case PtnetPackage.TOOL_INFO__TOOL:
			setTool(TOOL_EDEFAULT);
			return;
		case PtnetPackage.TOOL_INFO__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case PtnetPackage.TOOL_INFO__FORMATTED_XML_BUFFER:
			setFormattedXMLBuffer(FORMATTED_XML_BUFFER_EDEFAULT);
			return;
		case PtnetPackage.TOOL_INFO__TOOL_INFO_GRAMMAR_URI:
			setToolInfoGrammarURI(TOOL_INFO_GRAMMAR_URI_EDEFAULT);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			setContainerPetriNet((PetriNet) null);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			setContainerPnObject((PnObject) null);
			return;
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			setContainerLabel((Label) null);
			return;
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			setToolInfoModel((AnyObject) null);
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
		case PtnetPackage.TOOL_INFO__TOOL:
			return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
		case PtnetPackage.TOOL_INFO__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case PtnetPackage.TOOL_INFO__FORMATTED_XML_BUFFER:
			return FORMATTED_XML_BUFFER_EDEFAULT == null ? formattedXMLBuffer != null : !FORMATTED_XML_BUFFER_EDEFAULT
					.equals(formattedXMLBuffer);
		case PtnetPackage.TOOL_INFO__TOOL_INFO_GRAMMAR_URI:
			return TOOL_INFO_GRAMMAR_URI_EDEFAULT == null ? toolInfoGrammarURI != null
					: !TOOL_INFO_GRAMMAR_URI_EDEFAULT.equals(toolInfoGrammarURI);
		case PtnetPackage.TOOL_INFO__CONTAINER_PETRI_NET:
			return getContainerPetriNet() != null;
		case PtnetPackage.TOOL_INFO__CONTAINER_PN_OBJECT:
			return getContainerPnObject() != null;
		case PtnetPackage.TOOL_INFO__CONTAINER_LABEL:
			return getContainerLabel() != null;
		case PtnetPackage.TOOL_INFO__TOOL_INFO_MODEL:
			return toolInfoModel != null;
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
		result.append(tool);
		result.append(", version: ");
		result.append(version);
		result.append(", formattedXMLBuffer: ");
		result.append(formattedXMLBuffer);
		result.append(", toolInfoGrammarURI: ");
		result.append(toolInfoGrammarURI);
		result.append(')');
		return result.toString();
	}

	//TODO this element (toolInfoGrammarURI) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (toolInfoModel) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public String toPNML() {
		//id 0
		//idref 0
		//attributes 2
		//sons 1

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<toolspecific");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getTool() != null) {
			sb.append(" tool");
			sb.append("=\"");
			sb.append(getTool());
			sb.append("\"");
		}

		if (getVersion() != null) {
			sb.append(" version");
			sb.append("=\"");
			sb.append(getVersion());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getFormattedXMLBuffer() != null) {

			sb.append(getFormattedXMLBuffer().toString());

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		if (haveSons) {
			sb.append(headline);
			sb.append("</toolspecific>");
			sb.append(retline);
		} else {
			sb.delete(sb.lastIndexOf(">"), sb.length());
			sb.append("/>");
		}

		return sb.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void fromPNML(OMElement locRoot, IdRefLinker idr) throws InnerBuildException, InvalidIDException,
			VoidRepositoryException {
		//0
		//0
		//2
		//1
		@SuppressWarnings("unused")
		PtnetFactory fact = PtnetFactory.eINSTANCE;

		//processing id

		//processing idref

		//processing attributes

		if (locRoot.getAttributeValue(new QName("tool")) != null) {
			try {
				this.setTool(new String(locRoot.getAttributeValue(new QName("tool"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		if (locRoot.getAttributeValue(new QName("version")) != null) {
			try {
				this.setVersion(new String(locRoot.getAttributeValue(new QName("version"))));
			} catch (Exception e) {
				throw new fr.lip6.move.pnml.framework.utils.exception.InnerBuildException(e);
			}
		}

		//processing sons

		for (Iterator iterator = locRoot.getChildElements(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			OMElement type = (OMElement) iterator.next();

			//Any Elements
			//all sub element of <toolspecific> will be serialized in a java.lang.StringBuffer
			StringBuffer sb = new StringBuffer();
			sb.append(locRoot.toString());
			this.setFormattedXMLBuffer(new java.lang.StringBuffer(sb.toString()));

		}

	}

	//TODO this element (toolInfoGrammarURI) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	//TODO this element (toolInfoModel) seems not to have any ToPNML associated tag.
	//This is maybe a mistake ?

	/**
	 * Return the string containing the pnml output
	 */
	@Override
	public void toPNML(FileChannel fc) {
		//id 0
		//idref 0
		//attributes 2
		//sons 1

		final int bufferSizeKB = 8;
		final int bufferSize = bufferSizeKB * 1024;
		final ByteBuffer bytebuf = ByteBuffer.allocateDirect(bufferSize);
		final String charsetEncoding = PNMLEncoding.ISO_8859_1.getName();

		Boolean prettyPrintStatus = ModelRepository.getInstance().isPrettyPrintActive();
		String retline = "";
		String headline = "";
		PrettyPrintData prpd = null;
		if (prettyPrintStatus) {
			retline = "\n";
			prpd = ModelRepository.getInstance().getPrettyPrintData();
			headline = prpd.getCurrentLineHeader();
		}

		StringBuilder sb = new StringBuilder();
		sb.append(headline);
		sb.append("<toolspecific");
		if (prettyPrintStatus) {
			headline = prpd.increaseLineHeaderLevel();
		}
		//begin attributes, id and id ref processing

		if (getTool() != null) {
			sb.append(" tool");
			sb.append("=\"");
			sb.append(getTool());
			sb.append("\"");
		}

		if (getVersion() != null) {
			sb.append(" version");
			sb.append("=\"");
			sb.append(getVersion());
			sb.append("\"");
		}

		boolean haveSons = false;
		sb.append(">");
		sb.append(retline);

		//sons, follow processing

		if (getFormattedXMLBuffer() != null) {

			sb.append(getFormattedXMLBuffer().toString());

			haveSons = true;

		}

		/****/

		if (prettyPrintStatus) {
			headline = prpd.decreaseLineHeaderLevel();
		}

		sb.append(headline);
		sb.append("</toolspecific>");
		sb.append(retline);

		try {
			writeIntoStream(bytebuf, fc, sb.toString().getBytes(Charset.forName(charsetEncoding)));
		} catch (IOException io) {
			io.printStackTrace();
			// fail fast
			return;
		}
		sb = null;
	}

	/**
	 * Writes buffer of a given max size into file channel.
	 */
	private static final void writeIntoStream(final ByteBuffer bytebuf, final FileChannel fc, final byte[] contents)
			throws IOException {
		final int chopSize = 6 * 1024;
		if (contents.length >= bytebuf.capacity()) {
			List<byte[]> chops = PnmlExport.chopBytes(contents, chopSize);
			for (byte[] buf : chops) {
				bytebuf.put(buf);
				bytebuf.flip();
				fc.write(bytebuf);
				bytebuf.clear();
			}
		} else {
			bytebuf.put(contents);
			bytebuf.flip();
			fc.write(bytebuf);
			bytebuf.clear();
		}
	}

	/**
	 * -
	 */
	@Override
	public boolean validateOCL(DiagnosticChain diagnostics) {

		PtnetValidator val = new PtnetValidator();
		boolean retour = true;

		if (getToolInfoModel() != null) {
			retour &= getToolInfoModel().validateOCL(diagnostics);
		}

		retour &= val.validate(this, diagnostics, null);
		return retour;

	}
} //ToolInfoImpl
