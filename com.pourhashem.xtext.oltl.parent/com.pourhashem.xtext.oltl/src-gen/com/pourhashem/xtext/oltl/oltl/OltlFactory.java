/**
 * generated by Xtext 2.10.0
 */
package com.pourhashem.xtext.oltl.oltl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.pourhashem.xtext.oltl.oltl.OltlPackage
 * @generated
 */
public interface OltlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OltlFactory eINSTANCE = com.pourhashem.xtext.oltl.oltl.impl.OltlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weight</em>'.
   * @generated
   */
  Weight createWeight();

  /**
   * Returns a new object of class '<em>WInt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WInt</em>'.
   * @generated
   */
  WInt createWInt();

  /**
   * Returns a new object of class '<em>WFloat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WFloat</em>'.
   * @generated
   */
  WFloat createWFloat();

  /**
   * Returns a new object of class '<em>Temp Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Formula</em>'.
   * @generated
   */
  TempFormula createTempFormula();

  /**
   * Returns a new object of class '<em>AP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AP</em>'.
   * @generated
   */
  AP createAP();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OltlPackage getOltlPackage();

} //OltlFactory