/**
 */
package org.gemoc.sequential.model.arduino.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sequential.model.arduino.ArduinoPackage;
import org.gemoc.sequential.model.arduino.ChangeType;
import org.gemoc.sequential.model.arduino.WaitFor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sequential.model.arduino.impl.WaitForImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.gemoc.sequential.model.arduino.impl.WaitForImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitForImpl extends UtilitiesImpl implements WaitFor {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected org.gemoc.sequential.model.arduino.Module module;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeType MODE_EDEFAULT = ChangeType.RISING;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ChangeType mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.WAIT_FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.sequential.model.arduino.Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (org.gemoc.sequential.model.arduino.Module)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.WAIT_FOR__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.sequential.model.arduino.Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(org.gemoc.sequential.model.arduino.Module newModule) {
		org.gemoc.sequential.model.arduino.Module oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.WAIT_FOR__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ChangeType newMode) {
		ChangeType oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.WAIT_FOR__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.WAIT_FOR__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case ArduinoPackage.WAIT_FOR__MODE:
				return getMode();
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
			case ArduinoPackage.WAIT_FOR__MODULE:
				setModule((org.gemoc.sequential.model.arduino.Module)newValue);
				return;
			case ArduinoPackage.WAIT_FOR__MODE:
				setMode((ChangeType)newValue);
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
			case ArduinoPackage.WAIT_FOR__MODULE:
				setModule((org.gemoc.sequential.model.arduino.Module)null);
				return;
			case ArduinoPackage.WAIT_FOR__MODE:
				setMode(MODE_EDEFAULT);
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
			case ArduinoPackage.WAIT_FOR__MODULE:
				return module != null;
			case ArduinoPackage.WAIT_FOR__MODE:
				return mode != MODE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //WaitForImpl