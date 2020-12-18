/**
 */
package uml2idl.metamodel.idl.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml2idl.metamodel.idl.IdlPackage;
import uml2idl.metamodel.idl.StructuralElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StructuralElementImpl extends MinimalEObjectImpl.Container implements StructuralElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlPackage.Literals.STRUCTURAL_ELEMENT;
	}

} //StructuralElementImpl
