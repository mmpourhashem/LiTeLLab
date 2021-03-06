/*
 * generated by Xtext 2.10.0
 */
grammar InternalOltl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.pourhashem.xtext.oltl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.pourhashem.xtext.oltl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.pourhashem.xtext.oltl.services.OltlGrammarAccess;

}

@parser::members {

 	private OltlGrammarAccess grammarAccess;

    public InternalOltlParser(TokenStream input, OltlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected OltlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bound:'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getBoundKeyword_0());
		}
		(
			(
				lv_bound_1_0=RULE_INT
				{
					newLeafNode(lv_bound_1_0, grammarAccess.getModelAccess().getBoundINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"bound",
						lv_bound_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_2='SoftBound:'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSoftBoundKeyword_2_0());
			}
			(
				(
					lv_softBound_3_0=RULE_INT
					{
						newLeafNode(lv_softBound_3_0, grammarAccess.getModelAccess().getSoftBoundINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"softBound",
							lv_softBound_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_4='Formula:'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFormulaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_4_0());
				}
				lv_tempFormula_5_0=ruleTempFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"tempFormula",
						lv_tempFormula_5_0,
						"com.pourhashem.xtext.oltl.Oltl.TempFormula");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='SoftFormulae:'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getSoftFormulaeKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getSoftFormulaeSoftFormulaParserRuleCall_5_1_0());
					}
					lv_softFormulae_7_0=ruleSoftFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"softFormulae",
							lv_softFormulae_7_0,
							"com.pourhashem.xtext.oltl.Oltl.SoftFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleSoftFormula
entryRuleSoftFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoftFormulaRule()); }
	iv_ruleSoftFormula=ruleSoftFormula
	{ $current=$iv_ruleSoftFormula.current; }
	EOF;

// Rule SoftFormula
ruleSoftFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftFormulaAccess().getSoftAllSoftAllTIParserRuleCall_0_0());
				}
				lv_softAll_0_0=ruleSoftAllTI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftFormulaRule());
					}
					set(
						$current,
						"softAll",
						lv_softAll_0_0,
						"com.pourhashem.xtext.oltl.Oltl.SoftAllTI");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftFormulaAccess().getSoftAtSoftTIParserRuleCall_1_0());
				}
				lv_softAt_1_0=ruleSoftTI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftFormulaRule());
					}
					set(
						$current,
						"softAt",
						lv_softAt_1_0,
						"com.pourhashem.xtext.oltl.Oltl.SoftTI");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSoftAllTI
entryRuleSoftAllTI returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoftAllTIRule()); }
	iv_ruleSoftAllTI=ruleSoftAllTI
	{ $current=$iv_ruleSoftAllTI.current; }
	EOF;

// Rule SoftAllTI
ruleSoftAllTI returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getSoftAllTIAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='soft'
		{
			newLeafNode(otherlv_1, grammarAccess.getSoftAllTIAccess().getSoftKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftAllTIAccess().getApAPParserRuleCall_2_0());
				}
				lv_ap_2_0=ruleAP
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftAllTIRule());
					}
					set(
						$current,
						"ap",
						lv_ap_2_0,
						"com.pourhashem.xtext.oltl.Oltl.AP");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_id_3_0=RULE_ID
				{
					newLeafNode(lv_id_3_0, grammarAccess.getSoftAllTIAccess().getIdIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSoftAllTIRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftAllTIAccess().getWeightWeightParserRuleCall_4_0());
				}
				lv_weight_4_0=ruleWeight
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftAllTIRule());
					}
					set(
						$current,
						"weight",
						lv_weight_4_0,
						"com.pourhashem.xtext.oltl.Oltl.Weight");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getSoftAllTIAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleSoftTI
entryRuleSoftTI returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoftTIRule()); }
	iv_ruleSoftTI=ruleSoftTI
	{ $current=$iv_ruleSoftTI.current; }
	EOF;

// Rule SoftTI
ruleSoftTI returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='soft'
		{
			newLeafNode(otherlv_1, grammarAccess.getSoftTIAccess().getSoftKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='@'
		{
			newLeafNode(otherlv_3, grammarAccess.getSoftTIAccess().getCommercialAtKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftTIAccess().getApAPParserRuleCall_4_0());
				}
				lv_ap_4_0=ruleAP
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftTIRule());
					}
					set(
						$current,
						"ap",
						lv_ap_4_0,
						"com.pourhashem.xtext.oltl.Oltl.AP");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_ti_5_0=RULE_INT
				{
					newLeafNode(lv_ti_5_0, grammarAccess.getSoftTIAccess().getTiINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSoftTIRule());
					}
					setWithLastConsumed(
						$current,
						"ti",
						lv_ti_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				lv_id_7_0=RULE_ID
				{
					newLeafNode(lv_id_7_0, grammarAccess.getSoftTIAccess().getIdIDTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSoftTIRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSoftTIAccess().getWeightWeightParserRuleCall_8_0());
				}
				lv_weight_8_0=ruleWeight
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoftTIRule());
					}
					set(
						$current,
						"weight",
						lv_weight_8_0,
						"com.pourhashem.xtext.oltl.Oltl.Weight");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_9());
		}
	)
;

// Entry rule entryRuleWeight
entryRuleWeight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWeightRule()); }
	iv_ruleWeight=ruleWeight
	{ $current=$iv_ruleWeight.current; }
	EOF;

// Rule Weight
ruleWeight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_0_0());
				}
				lv_wInt_0_0=ruleWInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWeightRule());
					}
					set(
						$current,
						"wInt",
						lv_wInt_0_0,
						"com.pourhashem.xtext.oltl.Oltl.WInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_0());
				}
				lv_wFloat_1_0=ruleWFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWeightRule());
					}
					set(
						$current,
						"wFloat",
						lv_wFloat_1_0,
						"com.pourhashem.xtext.oltl.Oltl.WFloat");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWInt
entryRuleWInt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWIntRule()); }
	iv_ruleWInt=ruleWInt
	{ $current=$iv_ruleWInt.current; }
	EOF;

// Rule WInt
ruleWInt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_int_0_0=RULE_INT
			{
				newLeafNode(lv_int_0_0, grammarAccess.getWIntAccess().getIntINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getWIntRule());
				}
				setWithLastConsumed(
					$current,
					"int",
					lv_int_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleWFloat
entryRuleWFloat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWFloatRule()); }
	iv_ruleWFloat=ruleWFloat
	{ $current=$iv_ruleWFloat.current; }
	EOF;

// Rule WFloat
ruleWFloat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_int1_0_0=RULE_INT
				{
					newLeafNode(lv_int1_0_0, grammarAccess.getWFloatAccess().getInt1INTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWFloatRule());
					}
					setWithLastConsumed(
						$current,
						"int1",
						lv_int1_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getWFloatAccess().getFullStopKeyword_1());
		}
		(
			(
				lv_int2_2_0=RULE_INT
				{
					newLeafNode(lv_int2_2_0, grammarAccess.getWFloatAccess().getInt2INTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWFloatRule());
					}
					setWithLastConsumed(
						$current,
						"int2",
						lv_int2_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTempFormula
entryRuleTempFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTempFormulaRule()); }
	iv_ruleTempFormula=ruleTempFormula
	{ $current=$iv_ruleTempFormula.current; }
	EOF;

// Rule TempFormula
ruleTempFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_0_0());
				}
				lv_ap_0_0=ruleAP
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
					}
					set(
						$current,
						"ap",
						lv_ap_0_0,
						"com.pourhashem.xtext.oltl.Oltl.AP");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0());
			}
			otherlv_2='&&'
			{
				newLeafNode(otherlv_2, grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getFaTempFormulaParserRuleCall_1_2_0());
					}
					lv_fa_3_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						add(
							$current,
							"fa",
							lv_fa_3_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3());
			}
		)
		    |
		(
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0());
			}
			otherlv_6='||'
			{
				newLeafNode(otherlv_6, grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getFoTempFormulaParserRuleCall_2_2_0());
					}
					lv_fo_7_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						add(
							$current,
							"fo",
							lv_fo_7_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3());
			}
		)
		    |
		(
			otherlv_9='('
			{
				newLeafNode(otherlv_9, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0());
			}
			otherlv_10='!!'
			{
				newLeafNode(otherlv_10, grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getFnotTempFormulaParserRuleCall_3_2_0());
					}
					lv_fnot_11_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						set(
							$current,
							"fnot",
							lv_fnot_11_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12=')'
			{
				newLeafNode(otherlv_12, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3());
			}
		)
		    |
		(
			otherlv_13='('
			{
				newLeafNode(otherlv_13, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0());
			}
			(
				(
					lv_op2_14_0=RULE_OP2
					{
						newLeafNode(lv_op2_14_0, grammarAccess.getTempFormulaAccess().getOp2OP2TerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTempFormulaRule());
						}
						setWithLastConsumed(
							$current,
							"op2",
							lv_op2_14_0,
							"com.pourhashem.xtext.oltl.Oltl.OP2");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getF1TempFormulaParserRuleCall_4_2_0());
					}
					lv_f1_15_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						set(
							$current,
							"f1",
							lv_f1_15_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getF2TempFormulaParserRuleCall_4_3_0());
					}
					lv_f2_16_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						set(
							$current,
							"f2",
							lv_f2_16_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=')'
			{
				newLeafNode(otherlv_17, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4());
			}
		)
		    |
		(
			otherlv_18='('
			{
				newLeafNode(otherlv_18, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0());
			}
			(
				(
					lv_opf_19_0=RULE_OPF
					{
						newLeafNode(lv_opf_19_0, grammarAccess.getTempFormulaAccess().getOpfOPFTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTempFormulaRule());
						}
						setWithLastConsumed(
							$current,
							"opf",
							lv_opf_19_0,
							"com.pourhashem.xtext.oltl.Oltl.OPF");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTempFormulaAccess().getFTempFormulaParserRuleCall_5_2_0());
					}
					lv_f_20_0=ruleTempFormula
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTempFormulaRule());
						}
						set(
							$current,
							"f",
							lv_f_20_0,
							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=')'
			{
				newLeafNode(otherlv_21, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3());
			}
		)
	)
;

// Entry rule entryRuleAP
entryRuleAP returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAPRule()); }
	iv_ruleAP=ruleAP
	{ $current=$iv_ruleAP.current; }
	EOF;

// Rule AP
ruleAP returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getAPAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getAPAccess().getHyphenMinusKeyword_1());
		}
		(
			otherlv_2='P'
			{
				newLeafNode(otherlv_2, grammarAccess.getAPAccess().getPKeyword_2_0());
			}
			    |
			otherlv_3='p'
			{
				newLeafNode(otherlv_3, grammarAccess.getAPAccess().getPKeyword_2_1());
			}
		)
		otherlv_4='-'
		{
			newLeafNode(otherlv_4, grammarAccess.getAPAccess().getHyphenMinusKeyword_3());
		}
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getAPAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAPRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAPAccess().getRightParenthesisKeyword_5());
		}
	)
;

RULE_OP2 : ('->'|'<->'|'until'|'since'|'release'|'trigger');

RULE_OPF : ('next'|'yesterday'|'alw'|'som'|'alwf'|'somf'|'alwp'|'somp');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
