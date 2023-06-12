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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOltlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OP2", "RULE_OPF", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'('", "'&&'", "')'", "'||'", "'!!'", "'w'", "'next'", "'P'", "'p'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_OPF=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOltlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOltlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOltlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOltl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalOltl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOltl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOltl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOltl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_tempFormula_0_0= ruleTempFormula ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tempFormula_0_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:77:2: ( ( (lv_tempFormula_0_0= ruleTempFormula ) ) )
            // InternalOltl.g:78:2: ( (lv_tempFormula_0_0= ruleTempFormula ) )
            {
            // InternalOltl.g:78:2: ( (lv_tempFormula_0_0= ruleTempFormula ) )
            // InternalOltl.g:79:3: (lv_tempFormula_0_0= ruleTempFormula )
            {
            // InternalOltl.g:79:3: (lv_tempFormula_0_0= ruleTempFormula )
            // InternalOltl.g:80:4: lv_tempFormula_0_0= ruleTempFormula
            {

            				newCompositeNode(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_tempFormula_0_0=ruleTempFormula();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"tempFormula",
            					lv_tempFormula_0_0,
            					"com.pourhashem.xtext.oltl.Oltl.TempFormula");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWeight"
    // InternalOltl.g:100:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalOltl.g:100:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalOltl.g:101:2: iv_ruleWeight= ruleWeight EOF
            {
             newCompositeNode(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeight=ruleWeight();

            state._fsp--;

             current =iv_ruleWeight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalOltl.g:107:1: ruleWeight returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_wInt_1_0 = null;

        EObject lv_wFloat_2_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:113:2: ( ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) ) )
            // InternalOltl.g:114:2: ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) )
            {
            // InternalOltl.g:114:2: ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) )
            // InternalOltl.g:115:3: ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) )
            {
            // InternalOltl.g:115:3: ( (lv_neg_0_0= '-' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOltl.g:116:4: (lv_neg_0_0= '-' )
                    {
                    // InternalOltl.g:116:4: (lv_neg_0_0= '-' )
                    // InternalOltl.g:117:5: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_neg_0_0, grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWeightRule());
                    					}
                    					setWithLastConsumed(current, "neg", lv_neg_0_0, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalOltl.g:129:3: ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==17) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOltl.g:130:4: ( (lv_wInt_1_0= ruleWInt ) )
                    {
                    // InternalOltl.g:130:4: ( (lv_wInt_1_0= ruleWInt ) )
                    // InternalOltl.g:131:5: (lv_wInt_1_0= ruleWInt )
                    {
                    // InternalOltl.g:131:5: (lv_wInt_1_0= ruleWInt )
                    // InternalOltl.g:132:6: lv_wInt_1_0= ruleWInt
                    {

                    						newCompositeNode(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_wInt_1_0=ruleWInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWeightRule());
                    						}
                    						set(
                    							current,
                    							"wInt",
                    							lv_wInt_1_0,
                    							"com.pourhashem.xtext.oltl.Oltl.WInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:150:4: ( (lv_wFloat_2_0= ruleWFloat ) )
                    {
                    // InternalOltl.g:150:4: ( (lv_wFloat_2_0= ruleWFloat ) )
                    // InternalOltl.g:151:5: (lv_wFloat_2_0= ruleWFloat )
                    {
                    // InternalOltl.g:151:5: (lv_wFloat_2_0= ruleWFloat )
                    // InternalOltl.g:152:6: lv_wFloat_2_0= ruleWFloat
                    {

                    						newCompositeNode(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_wFloat_2_0=ruleWFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWeightRule());
                    						}
                    						set(
                    							current,
                    							"wFloat",
                    							lv_wFloat_2_0,
                    							"com.pourhashem.xtext.oltl.Oltl.WFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleWInt"
    // InternalOltl.g:174:1: entryRuleWInt returns [EObject current=null] : iv_ruleWInt= ruleWInt EOF ;
    public final EObject entryRuleWInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWInt = null;


        try {
            // InternalOltl.g:174:45: (iv_ruleWInt= ruleWInt EOF )
            // InternalOltl.g:175:2: iv_ruleWInt= ruleWInt EOF
            {
             newCompositeNode(grammarAccess.getWIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWInt=ruleWInt();

            state._fsp--;

             current =iv_ruleWInt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWInt"


    // $ANTLR start "ruleWInt"
    // InternalOltl.g:181:1: ruleWInt returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleWInt() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalOltl.g:187:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalOltl.g:188:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalOltl.g:188:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalOltl.g:189:3: (lv_int_0_0= RULE_INT )
            {
            // InternalOltl.g:189:3: (lv_int_0_0= RULE_INT )
            // InternalOltl.g:190:4: lv_int_0_0= RULE_INT
            {
            lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_int_0_0, grammarAccess.getWIntAccess().getIntINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWIntRule());
            				}
            				setWithLastConsumed(
            					current,
            					"int",
            					lv_int_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWInt"


    // $ANTLR start "entryRuleWFloat"
    // InternalOltl.g:209:1: entryRuleWFloat returns [EObject current=null] : iv_ruleWFloat= ruleWFloat EOF ;
    public final EObject entryRuleWFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWFloat = null;


        try {
            // InternalOltl.g:209:47: (iv_ruleWFloat= ruleWFloat EOF )
            // InternalOltl.g:210:2: iv_ruleWFloat= ruleWFloat EOF
            {
             newCompositeNode(grammarAccess.getWFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWFloat=ruleWFloat();

            state._fsp--;

             current =iv_ruleWFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWFloat"


    // $ANTLR start "ruleWFloat"
    // InternalOltl.g:216:1: ruleWFloat returns [EObject current=null] : ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) ;
    public final EObject ruleWFloat() throws RecognitionException {
        EObject current = null;

        Token lv_int1_0_0=null;
        Token otherlv_1=null;
        Token lv_int2_2_0=null;


        	enterRule();

        try {
            // InternalOltl.g:222:2: ( ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) )
            // InternalOltl.g:223:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            {
            // InternalOltl.g:223:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            // InternalOltl.g:224:3: ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) )
            {
            // InternalOltl.g:224:3: ( (lv_int1_0_0= RULE_INT ) )
            // InternalOltl.g:225:4: (lv_int1_0_0= RULE_INT )
            {
            // InternalOltl.g:225:4: (lv_int1_0_0= RULE_INT )
            // InternalOltl.g:226:5: lv_int1_0_0= RULE_INT
            {
            lv_int1_0_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_int1_0_0, grammarAccess.getWFloatAccess().getInt1INTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"int1",
            						lv_int1_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWFloatAccess().getFullStopKeyword_1());
            		
            // InternalOltl.g:246:3: ( (lv_int2_2_0= RULE_INT ) )
            // InternalOltl.g:247:4: (lv_int2_2_0= RULE_INT )
            {
            // InternalOltl.g:247:4: (lv_int2_2_0= RULE_INT )
            // InternalOltl.g:248:5: lv_int2_2_0= RULE_INT
            {
            lv_int2_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_int2_2_0, grammarAccess.getWFloatAccess().getInt2INTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"int2",
            						lv_int2_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWFloat"


    // $ANTLR start "entryRuleTempFormula"
    // InternalOltl.g:268:1: entryRuleTempFormula returns [EObject current=null] : iv_ruleTempFormula= ruleTempFormula EOF ;
    public final EObject entryRuleTempFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempFormula = null;


        try {
            // InternalOltl.g:268:52: (iv_ruleTempFormula= ruleTempFormula EOF )
            // InternalOltl.g:269:2: iv_ruleTempFormula= ruleTempFormula EOF
            {
             newCompositeNode(grammarAccess.getTempFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempFormula=ruleTempFormula();

            state._fsp--;

             current =iv_ruleTempFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTempFormula"


    // $ANTLR start "ruleTempFormula"
    // InternalOltl.g:275:1: ruleTempFormula returns [EObject current=null] : ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' ) ) ;
    public final EObject ruleTempFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_op2_14_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_opf_19_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_32=null;
        EObject lv_ap_0_0 = null;

        EObject lv_fa_3_0 = null;

        EObject lv_fo_7_0 = null;

        EObject lv_fnot_11_0 = null;

        EObject lv_f1_15_0 = null;

        EObject lv_f2_16_0 = null;

        EObject lv_f_20_0 = null;

        EObject lv_ap_24_0 = null;

        EObject lv_weight_25_0 = null;

        EObject lv_fNext_29_0 = null;

        EObject lv_x1_30_0 = null;

        EObject lv_x2_31_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:281:2: ( ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' ) ) )
            // InternalOltl.g:282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' ) )
            {
            // InternalOltl.g:282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' ) )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalOltl.g:283:3: ( (lv_ap_0_0= ruleAP ) )
                    {
                    // InternalOltl.g:283:3: ( (lv_ap_0_0= ruleAP ) )
                    // InternalOltl.g:284:4: (lv_ap_0_0= ruleAP )
                    {
                    // InternalOltl.g:284:4: (lv_ap_0_0= ruleAP )
                    // InternalOltl.g:285:5: lv_ap_0_0= ruleAP
                    {

                    					newCompositeNode(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ap_0_0=ruleAP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    					}
                    					set(
                    						current,
                    						"ap",
                    						lv_ap_0_0,
                    						"com.pourhashem.xtext.oltl.Oltl.AP");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:303:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    {
                    // InternalOltl.g:303:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    // InternalOltl.g:304:4: otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalOltl.g:312:4: ( (lv_fa_3_0= ruleTempFormula ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalOltl.g:313:5: (lv_fa_3_0= ruleTempFormula )
                    	    {
                    	    // InternalOltl.g:313:5: (lv_fa_3_0= ruleTempFormula )
                    	    // InternalOltl.g:314:6: lv_fa_3_0= ruleTempFormula
                    	    {

                    	    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFaTempFormulaParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_fa_3_0=ruleTempFormula();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fa",
                    	    							lv_fa_3_0,
                    	    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOltl.g:337:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    {
                    // InternalOltl.g:337:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    // InternalOltl.g:338:4: otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1());
                    			
                    // InternalOltl.g:346:4: ( (lv_fo_7_0= ruleTempFormula ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOltl.g:347:5: (lv_fo_7_0= ruleTempFormula )
                    	    {
                    	    // InternalOltl.g:347:5: (lv_fo_7_0= ruleTempFormula )
                    	    // InternalOltl.g:348:6: lv_fo_7_0= ruleTempFormula
                    	    {

                    	    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFoTempFormulaParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_fo_7_0=ruleTempFormula();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fo",
                    	    							lv_fo_7_0,
                    	    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOltl.g:371:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    {
                    // InternalOltl.g:371:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    // InternalOltl.g:372:4: otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1());
                    			
                    // InternalOltl.g:380:4: ( (lv_fnot_11_0= ruleTempFormula ) )
                    // InternalOltl.g:381:5: (lv_fnot_11_0= ruleTempFormula )
                    {
                    // InternalOltl.g:381:5: (lv_fnot_11_0= ruleTempFormula )
                    // InternalOltl.g:382:6: lv_fnot_11_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFnotTempFormulaParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fnot_11_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"fnot",
                    							lv_fnot_11_0,
                    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOltl.g:405:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    {
                    // InternalOltl.g:405:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    // InternalOltl.g:406:4: otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')'
                    {
                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalOltl.g:410:4: ( (lv_op2_14_0= RULE_OP2 ) )
                    // InternalOltl.g:411:5: (lv_op2_14_0= RULE_OP2 )
                    {
                    // InternalOltl.g:411:5: (lv_op2_14_0= RULE_OP2 )
                    // InternalOltl.g:412:6: lv_op2_14_0= RULE_OP2
                    {
                    lv_op2_14_0=(Token)match(input,RULE_OP2,FOLLOW_6); 

                    						newLeafNode(lv_op2_14_0, grammarAccess.getTempFormulaAccess().getOp2OP2TerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTempFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op2",
                    							lv_op2_14_0,
                    							"com.pourhashem.xtext.oltl.Oltl.OP2");
                    					

                    }


                    }

                    // InternalOltl.g:428:4: ( (lv_f1_15_0= ruleTempFormula ) )
                    // InternalOltl.g:429:5: (lv_f1_15_0= ruleTempFormula )
                    {
                    // InternalOltl.g:429:5: (lv_f1_15_0= ruleTempFormula )
                    // InternalOltl.g:430:6: lv_f1_15_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getF1TempFormulaParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_f1_15_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"f1",
                    							lv_f1_15_0,
                    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOltl.g:447:4: ( (lv_f2_16_0= ruleTempFormula ) )
                    // InternalOltl.g:448:5: (lv_f2_16_0= ruleTempFormula )
                    {
                    // InternalOltl.g:448:5: (lv_f2_16_0= ruleTempFormula )
                    // InternalOltl.g:449:6: lv_f2_16_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getF2TempFormulaParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_f2_16_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"f2",
                    							lv_f2_16_0,
                    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOltl.g:472:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    {
                    // InternalOltl.g:472:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    // InternalOltl.g:473:4: otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalOltl.g:477:4: ( (lv_opf_19_0= RULE_OPF ) )
                    // InternalOltl.g:478:5: (lv_opf_19_0= RULE_OPF )
                    {
                    // InternalOltl.g:478:5: (lv_opf_19_0= RULE_OPF )
                    // InternalOltl.g:479:6: lv_opf_19_0= RULE_OPF
                    {
                    lv_opf_19_0=(Token)match(input,RULE_OPF,FOLLOW_6); 

                    						newLeafNode(lv_opf_19_0, grammarAccess.getTempFormulaAccess().getOpfOPFTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTempFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"opf",
                    							lv_opf_19_0,
                    							"com.pourhashem.xtext.oltl.Oltl.OPF");
                    					

                    }


                    }

                    // InternalOltl.g:495:4: ( (lv_f_20_0= ruleTempFormula ) )
                    // InternalOltl.g:496:5: (lv_f_20_0= ruleTempFormula )
                    {
                    // InternalOltl.g:496:5: (lv_f_20_0= ruleTempFormula )
                    // InternalOltl.g:497:6: lv_f_20_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFTempFormulaParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_f_20_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"f",
                    							lv_f_20_0,
                    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOltl.g:520:3: (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' )
                    {
                    // InternalOltl.g:520:3: (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' )
                    // InternalOltl.g:521:4: otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')'
                    {
                    otherlv_22=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_6_0());
                    			
                    otherlv_23=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getTempFormulaAccess().getWKeyword_6_1());
                    			
                    // InternalOltl.g:529:4: ( (lv_ap_24_0= ruleAP ) )
                    // InternalOltl.g:530:5: (lv_ap_24_0= ruleAP )
                    {
                    // InternalOltl.g:530:5: (lv_ap_24_0= ruleAP )
                    // InternalOltl.g:531:6: lv_ap_24_0= ruleAP
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ap_24_0=ruleAP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"ap",
                    							lv_ap_24_0,
                    							"com.pourhashem.xtext.oltl.Oltl.AP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOltl.g:548:4: ( (lv_weight_25_0= ruleWeight ) )
                    // InternalOltl.g:549:5: (lv_weight_25_0= ruleWeight )
                    {
                    // InternalOltl.g:549:5: (lv_weight_25_0= ruleWeight )
                    // InternalOltl.g:550:6: lv_weight_25_0= ruleWeight
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_weight_25_0=ruleWeight();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_25_0,
                    							"com.pourhashem.xtext.oltl.Oltl.Weight");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOltl.g:573:3: (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' )
                    {
                    // InternalOltl.g:573:3: (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' )
                    // InternalOltl.g:574:4: otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_27, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_28, grammarAccess.getTempFormulaAccess().getNextKeyword_7_1());
                    			
                    // InternalOltl.g:582:4: ( (lv_fNext_29_0= ruleTempFormula ) )
                    // InternalOltl.g:583:5: (lv_fNext_29_0= ruleTempFormula )
                    {
                    // InternalOltl.g:583:5: (lv_fNext_29_0= ruleTempFormula )
                    // InternalOltl.g:584:6: lv_fNext_29_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_fNext_29_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"fNext",
                    							lv_fNext_29_0,
                    							"com.pourhashem.xtext.oltl.Oltl.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOltl.g:601:4: ( (lv_x1_30_0= ruleWInt ) )
                    // InternalOltl.g:602:5: (lv_x1_30_0= ruleWInt )
                    {
                    // InternalOltl.g:602:5: (lv_x1_30_0= ruleWInt )
                    // InternalOltl.g:603:6: lv_x1_30_0= ruleWInt
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_x1_30_0=ruleWInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"x1",
                    							lv_x1_30_0,
                    							"com.pourhashem.xtext.oltl.Oltl.WInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOltl.g:620:4: ( (lv_x2_31_0= ruleWInt ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalOltl.g:621:5: (lv_x2_31_0= ruleWInt )
                            {
                            // InternalOltl.g:621:5: (lv_x2_31_0= ruleWInt )
                            // InternalOltl.g:622:6: lv_x2_31_0= ruleWInt
                            {

                            						newCompositeNode(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_7_4_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_x2_31_0=ruleWInt();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                            						}
                            						set(
                            							current,
                            							"x2",
                            							lv_x2_31_0,
                            							"com.pourhashem.xtext.oltl.Oltl.WInt");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTempFormula"


    // $ANTLR start "entryRuleAP"
    // InternalOltl.g:648:1: entryRuleAP returns [EObject current=null] : iv_ruleAP= ruleAP EOF ;
    public final EObject entryRuleAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAP = null;


        try {
            // InternalOltl.g:648:43: (iv_ruleAP= ruleAP EOF )
            // InternalOltl.g:649:2: iv_ruleAP= ruleAP EOF
            {
             newCompositeNode(grammarAccess.getAPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAP=ruleAP();

            state._fsp--;

             current =iv_ruleAP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAP"


    // $ANTLR start "ruleAP"
    // InternalOltl.g:655:1: ruleAP returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleAP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOltl.g:661:2: ( (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalOltl.g:662:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalOltl.g:662:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalOltl.g:663:3: otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAPAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAPAccess().getHyphenMinusKeyword_1());
            		
            // InternalOltl.g:671:3: (otherlv_2= 'P' | otherlv_3= 'p' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOltl.g:672:4: otherlv_2= 'P'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getAPAccess().getPKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOltl.g:677:4: otherlv_3= 'p'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAPAccess().getPKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAPAccess().getHyphenMinusKeyword_3());
            		
            // InternalOltl.g:686:3: ( (lv_pName_5_0= RULE_ID ) )
            // InternalOltl.g:687:4: (lv_pName_5_0= RULE_ID )
            {
            // InternalOltl.g:687:4: (lv_pName_5_0= RULE_ID )
            // InternalOltl.g:688:5: lv_pName_5_0= RULE_ID
            {
            lv_pName_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_pName_5_0, grammarAccess.getAPAccess().getPNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pName",
            						lv_pName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAPAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAP"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\1\5\10\uffff";
    static final String dfa_3s = "\1\17\1\25\10\uffff";
    static final String dfa_4s = "\2\uffff\1\7\1\10\1\3\1\5\1\6\1\1\1\2\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\5\1\6\6\uffff\1\7\2\uffff\1\10\1\uffff\1\4\1\11\1\2\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'next' ( (lv_fNext_29_0= ruleTempFormula ) ) ( (lv_x1_30_0= ruleWInt ) ) ( (lv_x2_31_0= ruleWInt ) )? otherlv_32= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});

}