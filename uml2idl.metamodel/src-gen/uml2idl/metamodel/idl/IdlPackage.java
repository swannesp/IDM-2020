/**
 */
package uml2idl.metamodel.idl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml2idl.metamodel.idl.IdlFactory
 * @model kind="package"
 * @generated
 */
public interface IdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "idl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlPackage eINSTANCE = uml2idl.metamodel.idl.impl.IdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.ServiceImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml2idl.metamodel.idl.impl.IDLModelImpl <em>IDL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2idl.metamodel.idl.impl.IDLModelImpl
	 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getIDLModel()
	 * @generated
	 */
	int IDL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see uml2idl.metamodel.idl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link uml2idl.metamodel.idl.IDLModel <em>IDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Model</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel
	 * @generated
	 */
	EClass getIDLModel();

	/**
	 * Returns the meta object for the containment reference '{@link uml2idl.metamodel.idl.IDLModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getServices()
	 * @see #getIDLModel()
	 * @generated
	 */
	EReference getIDLModel_Services();

	/**
	 * Returns the meta object for the attribute '{@link uml2idl.metamodel.idl.IDLModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2idl.metamodel.idl.IDLModel#getName()
	 * @see #getIDLModel()
	 * @generated
	 */
	EAttribute getIDLModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdlFactory getIdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.ServiceImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link uml2idl.metamodel.idl.impl.IDLModelImpl <em>IDL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2idl.metamodel.idl.impl.IDLModelImpl
		 * @see uml2idl.metamodel.idl.impl.IdlPackageImpl#getIDLModel()
		 * @generated
		 */
		EClass IDL_MODEL = eINSTANCE.getIDLModel();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_MODEL__SERVICES = eINSTANCE.getIDLModel_Services();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_MODEL__NAME = eINSTANCE.getIDLModel_Name();

	}

} //IdlPackage
