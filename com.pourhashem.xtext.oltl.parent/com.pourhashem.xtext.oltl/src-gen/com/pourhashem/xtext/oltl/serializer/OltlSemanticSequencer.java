/*
 * generated by Xtext 2.10.0
 */
package com.pourhashem.xtext.oltl.serializer;

import com.google.inject.Inject;
import com.pourhashem.xtext.oltl.oltl.AP;
import com.pourhashem.xtext.oltl.oltl.Model;
import com.pourhashem.xtext.oltl.oltl.OltlPackage;
import com.pourhashem.xtext.oltl.oltl.SoftAllTI;
import com.pourhashem.xtext.oltl.oltl.SoftFormula;
import com.pourhashem.xtext.oltl.oltl.SoftTI;
import com.pourhashem.xtext.oltl.oltl.TempFormula;
import com.pourhashem.xtext.oltl.oltl.WFloat;
import com.pourhashem.xtext.oltl.oltl.WInt;
import com.pourhashem.xtext.oltl.oltl.Weight;
import com.pourhashem.xtext.oltl.services.OltlGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OltlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OltlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OltlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OltlPackage.AP:
				sequence_AP(context, (AP) semanticObject); 
				return; 
			case OltlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case OltlPackage.SOFT_ALL_TI:
				sequence_SoftAllTI(context, (SoftAllTI) semanticObject); 
				return; 
			case OltlPackage.SOFT_FORMULA:
				sequence_SoftFormula(context, (SoftFormula) semanticObject); 
				return; 
			case OltlPackage.SOFT_TI:
				sequence_SoftTI(context, (SoftTI) semanticObject); 
				return; 
			case OltlPackage.TEMP_FORMULA:
				sequence_TempFormula(context, (TempFormula) semanticObject); 
				return; 
			case OltlPackage.WFLOAT:
				sequence_WFloat(context, (WFloat) semanticObject); 
				return; 
			case OltlPackage.WINT:
				sequence_WInt(context, (WInt) semanticObject); 
				return; 
			case OltlPackage.WEIGHT:
				sequence_Weight(context, (Weight) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AP returns AP
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AP(ISerializationContext context, AP semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OltlPackage.Literals.AP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OltlPackage.Literals.AP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAPAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (bound=INT softBound=INT? tempFormula=TempFormula softFormulae+=SoftFormula*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SoftAllTI returns SoftAllTI
	 *
	 * Constraint:
	 *     (ap=AP id=ID? weight=Weight)
	 */
	protected void sequence_SoftAllTI(ISerializationContext context, SoftAllTI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SoftFormula returns SoftFormula
	 *
	 * Constraint:
	 *     (softAll=SoftAllTI | softAt=SoftTI)
	 */
	protected void sequence_SoftFormula(ISerializationContext context, SoftFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SoftTI returns SoftTI
	 *
	 * Constraint:
	 *     (ap=AP ti=INT id=ID? weight=Weight)
	 */
	protected void sequence_SoftTI(ISerializationContext context, SoftTI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TempFormula returns TempFormula
	 *
	 * Constraint:
	 *     (
	 *         ap=AP | 
	 *         fa+=TempFormula+ | 
	 *         fo+=TempFormula+ | 
	 *         fnot=TempFormula | 
	 *         (op2=OP2 f1=TempFormula f2=TempFormula) | 
	 *         (opf=OPF f=TempFormula)
	 *     )
	 */
	protected void sequence_TempFormula(ISerializationContext context, TempFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WFloat returns WFloat
	 *
	 * Constraint:
	 *     (int1=INT int2=INT)
	 */
	protected void sequence_WFloat(ISerializationContext context, WFloat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OltlPackage.Literals.WFLOAT__INT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OltlPackage.Literals.WFLOAT__INT1));
			if (transientValues.isValueTransient(semanticObject, OltlPackage.Literals.WFLOAT__INT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OltlPackage.Literals.WFLOAT__INT2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWFloatAccess().getInt1INTTerminalRuleCall_0_0(), semanticObject.getInt1());
		feeder.accept(grammarAccess.getWFloatAccess().getInt2INTTerminalRuleCall_2_0(), semanticObject.getInt2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WInt returns WInt
	 *
	 * Constraint:
	 *     int=INT
	 */
	protected void sequence_WInt(ISerializationContext context, WInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OltlPackage.Literals.WINT__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OltlPackage.Literals.WINT__INT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWIntAccess().getIntINTTerminalRuleCall_0(), semanticObject.getInt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Weight returns Weight
	 *
	 * Constraint:
	 *     (wInt=WInt | wFloat=WFloat)
	 */
	protected void sequence_Weight(ISerializationContext context, Weight semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
