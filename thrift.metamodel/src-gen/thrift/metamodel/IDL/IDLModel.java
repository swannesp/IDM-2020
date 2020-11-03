/**
 */
package thrift.metamodel.IDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thrift.metamodel.IDL.IDLModel#getServices <em>Services</em>}</li>
 *   <li>{@link thrift.metamodel.IDL.IDLModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see thrift.metamodel.IDL.ThriftidlPackage#getIDLModel()
 * @model
 * @generated
 */
public interface IDLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Service)
	 * @see thrift.metamodel.IDL.ThriftidlPackage#getIDLModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	Service getServices();

	/**
	 * Sets the value of the '{@link thrift.metamodel.IDL.IDLModel#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Service value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see thrift.metamodel.IDL.ThriftidlPackage#getIDLModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link thrift.metamodel.IDL.IDLModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IDLModel
