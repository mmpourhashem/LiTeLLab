/**
 * generated by Xtext 2.10.0
 */
package com.pourhashem.xtext.oltl.oltl.impl;

import com.pourhashem.xtext.oltl.oltl.Model;
import com.pourhashem.xtext.oltl.oltl.OltlFactory;
import com.pourhashem.xtext.oltl.oltl.OltlPackage;
import com.pourhashem.xtext.oltl.oltl.TempFormula;
import com.pourhashem.xtext.oltl.oltl.WFloat;
import com.pourhashem.xtext.oltl.oltl.WInt;
import com.pourhashem.xtext.oltl.oltl.Weight;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OltlPackageImpl extends EPackageImpl implements OltlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tempFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.pourhashem.xtext.oltl.oltl.OltlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OltlPackageImpl()
  {
    super(eNS_URI, OltlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OltlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OltlPackage init()
  {
    if (isInited) return (OltlPackage)EPackage.Registry.INSTANCE.getEPackage(OltlPackage.eNS_URI);

    // Obtain or create and register package
    OltlPackageImpl theOltlPackage = (OltlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OltlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OltlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOltlPackage.createPackageContents();

    // Initialize created meta-data
    theOltlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOltlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OltlPackage.eNS_URI, theOltlPackage);
    return theOltlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_TempFormula()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeight()
  {
    return weightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeight_Neg()
  {
    return (EAttribute)weightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeight_WInt()
  {
    return (EReference)weightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeight_WFloat()
  {
    return (EReference)weightEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWInt()
  {
    return wIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWInt_Int()
  {
    return (EAttribute)wIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWFloat()
  {
    return wFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWFloat_Int1()
  {
    return (EAttribute)wFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWFloat_Int2()
  {
    return (EAttribute)wFloatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTempFormula()
  {
    return tempFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_Ap()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_Fa()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_Fo()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_Fnot()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTempFormula_Op2()
  {
    return (EAttribute)tempFormulaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_F1()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_F2()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTempFormula_Opf()
  {
    return (EAttribute)tempFormulaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_F()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_Weight()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_FNext()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_X1()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempFormula_X2()
  {
    return (EReference)tempFormulaEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAP()
  {
    return apEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAP_PName()
  {
    return (EAttribute)apEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OltlFactory getOltlFactory()
  {
    return (OltlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__TEMP_FORMULA);

    weightEClass = createEClass(WEIGHT);
    createEAttribute(weightEClass, WEIGHT__NEG);
    createEReference(weightEClass, WEIGHT__WINT);
    createEReference(weightEClass, WEIGHT__WFLOAT);

    wIntEClass = createEClass(WINT);
    createEAttribute(wIntEClass, WINT__INT);

    wFloatEClass = createEClass(WFLOAT);
    createEAttribute(wFloatEClass, WFLOAT__INT1);
    createEAttribute(wFloatEClass, WFLOAT__INT2);

    tempFormulaEClass = createEClass(TEMP_FORMULA);
    createEReference(tempFormulaEClass, TEMP_FORMULA__AP);
    createEReference(tempFormulaEClass, TEMP_FORMULA__FA);
    createEReference(tempFormulaEClass, TEMP_FORMULA__FO);
    createEReference(tempFormulaEClass, TEMP_FORMULA__FNOT);
    createEAttribute(tempFormulaEClass, TEMP_FORMULA__OP2);
    createEReference(tempFormulaEClass, TEMP_FORMULA__F1);
    createEReference(tempFormulaEClass, TEMP_FORMULA__F2);
    createEAttribute(tempFormulaEClass, TEMP_FORMULA__OPF);
    createEReference(tempFormulaEClass, TEMP_FORMULA__F);
    createEReference(tempFormulaEClass, TEMP_FORMULA__WEIGHT);
    createEReference(tempFormulaEClass, TEMP_FORMULA__FNEXT);
    createEReference(tempFormulaEClass, TEMP_FORMULA__X1);
    createEReference(tempFormulaEClass, TEMP_FORMULA__X2);

    apEClass = createEClass(AP);
    createEAttribute(apEClass, AP__PNAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_TempFormula(), this.getTempFormula(), null, "tempFormula", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weightEClass, Weight.class, "Weight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeight_Neg(), ecorePackage.getEString(), "neg", null, 0, 1, Weight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeight_WInt(), this.getWInt(), null, "wInt", null, 0, 1, Weight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeight_WFloat(), this.getWFloat(), null, "wFloat", null, 0, 1, Weight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wIntEClass, WInt.class, "WInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWInt_Int(), ecorePackage.getEInt(), "int", null, 0, 1, WInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wFloatEClass, WFloat.class, "WFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWFloat_Int1(), ecorePackage.getEInt(), "int1", null, 0, 1, WFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWFloat_Int2(), ecorePackage.getEInt(), "int2", null, 0, 1, WFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tempFormulaEClass, TempFormula.class, "TempFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTempFormula_Ap(), this.getAP(), null, "ap", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_Fa(), this.getTempFormula(), null, "fa", null, 0, -1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_Fo(), this.getTempFormula(), null, "fo", null, 0, -1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_Fnot(), this.getTempFormula(), null, "fnot", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTempFormula_Op2(), ecorePackage.getEString(), "op2", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_F1(), this.getTempFormula(), null, "f1", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_F2(), this.getTempFormula(), null, "f2", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTempFormula_Opf(), ecorePackage.getEString(), "opf", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_F(), this.getTempFormula(), null, "f", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_Weight(), this.getWeight(), null, "weight", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_FNext(), this.getTempFormula(), null, "fNext", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_X1(), this.getWInt(), null, "x1", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempFormula_X2(), this.getWInt(), null, "x2", null, 0, 1, TempFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(apEClass, com.pourhashem.xtext.oltl.oltl.AP.class, "AP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAP_PName(), ecorePackage.getEString(), "pName", null, 0, 1, com.pourhashem.xtext.oltl.oltl.AP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //OltlPackageImpl