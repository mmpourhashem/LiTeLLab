/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.liTeLLab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.liTeLLab.LiTeLLabPackage
 * @generated
 */
public interface LiTeLLabFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LiTeLLabFactory eINSTANCE = org.xtext.example.mydsl.liTeLLab.impl.LiTeLLabFactoryImpl.init();

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
   * Returns a new object of class '<em>Temp Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Term</em>'.
   * @generated
   */
  TempTerm createTempTerm();

  /**
   * Returns a new object of class '<em>AP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AP</em>'.
   * @generated
   */
  AP createAP();

  /**
   * Returns a new object of class '<em>VAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VAR</em>'.
   * @generated
   */
  VAR createVAR();

  /**
   * Returns a new object of class '<em>old VAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>old VAR</em>'.
   * @generated
   */
  oldVAR createoldVAR();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LiTeLLabPackage getLiTeLLabPackage();

} //LiTeLLabFactory