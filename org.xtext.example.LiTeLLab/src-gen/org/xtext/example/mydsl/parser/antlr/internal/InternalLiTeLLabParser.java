package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.LiTeLLabGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLiTeLLabParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OP2", "RULE_OPF", "RULE_COMP", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'('", "'&&'", "')'", "'||'", "'!!'", "'w'", "'iw'", "'next'", "'(['", "']'", "'P'", "'p'", "'V'", "'v'", "'old'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COMP=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_OPF=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLiTeLLabParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLiTeLLabParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLiTeLLabParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLiTeLLab.g"; }



     	private LiTeLLabGrammarAccess grammarAccess;

        public InternalLiTeLLabParser(TokenStream input, LiTeLLabGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LiTeLLabGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLiTeLLab.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLiTeLLab.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalLiTeLLab.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalLiTeLLab.g:71:1: ruleModel returns [EObject current=null] : ( (lv_tempFormula_0_0= ruleTempFormula ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tempFormula_0_0 = null;



        	enterRule();

        try {
            // InternalLiTeLLab.g:77:2: ( ( (lv_tempFormula_0_0= ruleTempFormula ) ) )
            // InternalLiTeLLab.g:78:2: ( (lv_tempFormula_0_0= ruleTempFormula ) )
            {
            // InternalLiTeLLab.g:78:2: ( (lv_tempFormula_0_0= ruleTempFormula ) )
            // InternalLiTeLLab.g:79:3: (lv_tempFormula_0_0= ruleTempFormula )
            {
            // InternalLiTeLLab.g:79:3: (lv_tempFormula_0_0= ruleTempFormula )
            // InternalLiTeLLab.g:80:4: lv_tempFormula_0_0= ruleTempFormula
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
            					"org.xtext.example.mydsl.LiTeLLab.TempFormula");
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
    // InternalLiTeLLab.g:100:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalLiTeLLab.g:100:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalLiTeLLab.g:101:2: iv_ruleWeight= ruleWeight EOF
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
    // InternalLiTeLLab.g:107:1: ruleWeight returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_wInt_1_0 = null;

        EObject lv_wFloat_2_0 = null;



        	enterRule();

        try {
            // InternalLiTeLLab.g:113:2: ( ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) ) )
            // InternalLiTeLLab.g:114:2: ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) )
            {
            // InternalLiTeLLab.g:114:2: ( ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) ) )
            // InternalLiTeLLab.g:115:3: ( (lv_neg_0_0= '-' ) )? ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) )
            {
            // InternalLiTeLLab.g:115:3: ( (lv_neg_0_0= '-' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLiTeLLab.g:116:4: (lv_neg_0_0= '-' )
                    {
                    // InternalLiTeLLab.g:116:4: (lv_neg_0_0= '-' )
                    // InternalLiTeLLab.g:117:5: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(lv_neg_0_0, grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWeightRule());
                    					}
                    					setWithLastConsumed(current, "neg", lv_neg_0_0, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalLiTeLLab.g:129:3: ( ( (lv_wInt_1_0= ruleWInt ) ) | ( (lv_wFloat_2_0= ruleWFloat ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==18) ) {
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
                    // InternalLiTeLLab.g:130:4: ( (lv_wInt_1_0= ruleWInt ) )
                    {
                    // InternalLiTeLLab.g:130:4: ( (lv_wInt_1_0= ruleWInt ) )
                    // InternalLiTeLLab.g:131:5: (lv_wInt_1_0= ruleWInt )
                    {
                    // InternalLiTeLLab.g:131:5: (lv_wInt_1_0= ruleWInt )
                    // InternalLiTeLLab.g:132:6: lv_wInt_1_0= ruleWInt
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
                    							"org.xtext.example.mydsl.LiTeLLab.WInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:150:4: ( (lv_wFloat_2_0= ruleWFloat ) )
                    {
                    // InternalLiTeLLab.g:150:4: ( (lv_wFloat_2_0= ruleWFloat ) )
                    // InternalLiTeLLab.g:151:5: (lv_wFloat_2_0= ruleWFloat )
                    {
                    // InternalLiTeLLab.g:151:5: (lv_wFloat_2_0= ruleWFloat )
                    // InternalLiTeLLab.g:152:6: lv_wFloat_2_0= ruleWFloat
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
                    							"org.xtext.example.mydsl.LiTeLLab.WFloat");
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
    // InternalLiTeLLab.g:174:1: entryRuleWInt returns [EObject current=null] : iv_ruleWInt= ruleWInt EOF ;
    public final EObject entryRuleWInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWInt = null;


        try {
            // InternalLiTeLLab.g:174:45: (iv_ruleWInt= ruleWInt EOF )
            // InternalLiTeLLab.g:175:2: iv_ruleWInt= ruleWInt EOF
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
    // InternalLiTeLLab.g:181:1: ruleWInt returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleWInt() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalLiTeLLab.g:187:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalLiTeLLab.g:188:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalLiTeLLab.g:188:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalLiTeLLab.g:189:3: (lv_int_0_0= RULE_INT )
            {
            // InternalLiTeLLab.g:189:3: (lv_int_0_0= RULE_INT )
            // InternalLiTeLLab.g:190:4: lv_int_0_0= RULE_INT
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
    // InternalLiTeLLab.g:209:1: entryRuleWFloat returns [EObject current=null] : iv_ruleWFloat= ruleWFloat EOF ;
    public final EObject entryRuleWFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWFloat = null;


        try {
            // InternalLiTeLLab.g:209:47: (iv_ruleWFloat= ruleWFloat EOF )
            // InternalLiTeLLab.g:210:2: iv_ruleWFloat= ruleWFloat EOF
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
    // InternalLiTeLLab.g:216:1: ruleWFloat returns [EObject current=null] : ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) ;
    public final EObject ruleWFloat() throws RecognitionException {
        EObject current = null;

        Token lv_int1_0_0=null;
        Token otherlv_1=null;
        Token lv_int2_2_0=null;


        	enterRule();

        try {
            // InternalLiTeLLab.g:222:2: ( ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) )
            // InternalLiTeLLab.g:223:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            {
            // InternalLiTeLLab.g:223:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            // InternalLiTeLLab.g:224:3: ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) )
            {
            // InternalLiTeLLab.g:224:3: ( (lv_int1_0_0= RULE_INT ) )
            // InternalLiTeLLab.g:225:4: (lv_int1_0_0= RULE_INT )
            {
            // InternalLiTeLLab.g:225:4: (lv_int1_0_0= RULE_INT )
            // InternalLiTeLLab.g:226:5: lv_int1_0_0= RULE_INT
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

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWFloatAccess().getFullStopKeyword_1());
            		
            // InternalLiTeLLab.g:246:3: ( (lv_int2_2_0= RULE_INT ) )
            // InternalLiTeLLab.g:247:4: (lv_int2_2_0= RULE_INT )
            {
            // InternalLiTeLLab.g:247:4: (lv_int2_2_0= RULE_INT )
            // InternalLiTeLLab.g:248:5: lv_int2_2_0= RULE_INT
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
    // InternalLiTeLLab.g:268:1: entryRuleTempFormula returns [EObject current=null] : iv_ruleTempFormula= ruleTempFormula EOF ;
    public final EObject entryRuleTempFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempFormula = null;


        try {
            // InternalLiTeLLab.g:268:52: (iv_ruleTempFormula= ruleTempFormula EOF )
            // InternalLiTeLLab.g:269:2: iv_ruleTempFormula= ruleTempFormula EOF
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
    // InternalLiTeLLab.g:275:1: ruleTempFormula returns [EObject current=null] : ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' ) | (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' ) | (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' ) ) ;
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
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_comp_39_0=null;
        Token otherlv_40=null;
        Token otherlv_43=null;
        EObject lv_ap_0_0 = null;

        EObject lv_fa_3_0 = null;

        EObject lv_fo_7_0 = null;

        EObject lv_fnot_11_0 = null;

        EObject lv_f1_15_0 = null;

        EObject lv_f2_16_0 = null;

        EObject lv_f_20_0 = null;

        EObject lv_ap_24_0 = null;

        EObject lv_weight_25_0 = null;

        EObject lv_iap_29_0 = null;

        EObject lv_weight_30_0 = null;

        EObject lv_fNext_34_0 = null;

        EObject lv_x1_35_0 = null;

        EObject lv_x2_36_0 = null;

        EObject lv_tt1_41_0 = null;

        EObject lv_tt2_42_0 = null;



        	enterRule();

        try {
            // InternalLiTeLLab.g:281:2: ( ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' ) | (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' ) | (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' ) ) )
            // InternalLiTeLLab.g:282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' ) | (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' ) | (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' ) )
            {
            // InternalLiTeLLab.g:282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' ) | (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' ) | (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalLiTeLLab.g:283:3: ( (lv_ap_0_0= ruleAP ) )
                    {
                    // InternalLiTeLLab.g:283:3: ( (lv_ap_0_0= ruleAP ) )
                    // InternalLiTeLLab.g:284:4: (lv_ap_0_0= ruleAP )
                    {
                    // InternalLiTeLLab.g:284:4: (lv_ap_0_0= ruleAP )
                    // InternalLiTeLLab.g:285:5: lv_ap_0_0= ruleAP
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
                    						"org.xtext.example.mydsl.LiTeLLab.AP");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:303:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    {
                    // InternalLiTeLLab.g:303:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    // InternalLiTeLLab.g:304:4: otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalLiTeLLab.g:312:4: ( (lv_fa_3_0= ruleTempFormula ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16||LA3_0==24) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalLiTeLLab.g:313:5: (lv_fa_3_0= ruleTempFormula )
                    	    {
                    	    // InternalLiTeLLab.g:313:5: (lv_fa_3_0= ruleTempFormula )
                    	    // InternalLiTeLLab.g:314:6: lv_fa_3_0= ruleTempFormula
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
                    	    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
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

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:337:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    {
                    // InternalLiTeLLab.g:337:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    // InternalLiTeLLab.g:338:4: otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1());
                    			
                    // InternalLiTeLLab.g:346:4: ( (lv_fo_7_0= ruleTempFormula ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16||LA4_0==24) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalLiTeLLab.g:347:5: (lv_fo_7_0= ruleTempFormula )
                    	    {
                    	    // InternalLiTeLLab.g:347:5: (lv_fo_7_0= ruleTempFormula )
                    	    // InternalLiTeLLab.g:348:6: lv_fo_7_0= ruleTempFormula
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
                    	    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
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

                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLiTeLLab.g:371:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    {
                    // InternalLiTeLLab.g:371:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    // InternalLiTeLLab.g:372:4: otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1());
                    			
                    // InternalLiTeLLab.g:380:4: ( (lv_fnot_11_0= ruleTempFormula ) )
                    // InternalLiTeLLab.g:381:5: (lv_fnot_11_0= ruleTempFormula )
                    {
                    // InternalLiTeLLab.g:381:5: (lv_fnot_11_0= ruleTempFormula )
                    // InternalLiTeLLab.g:382:6: lv_fnot_11_0= ruleTempFormula
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
                    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLiTeLLab.g:405:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    {
                    // InternalLiTeLLab.g:405:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    // InternalLiTeLLab.g:406:4: otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalLiTeLLab.g:410:4: ( (lv_op2_14_0= RULE_OP2 ) )
                    // InternalLiTeLLab.g:411:5: (lv_op2_14_0= RULE_OP2 )
                    {
                    // InternalLiTeLLab.g:411:5: (lv_op2_14_0= RULE_OP2 )
                    // InternalLiTeLLab.g:412:6: lv_op2_14_0= RULE_OP2
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
                    							"org.xtext.example.mydsl.LiTeLLab.OP2");
                    					

                    }


                    }

                    // InternalLiTeLLab.g:428:4: ( (lv_f1_15_0= ruleTempFormula ) )
                    // InternalLiTeLLab.g:429:5: (lv_f1_15_0= ruleTempFormula )
                    {
                    // InternalLiTeLLab.g:429:5: (lv_f1_15_0= ruleTempFormula )
                    // InternalLiTeLLab.g:430:6: lv_f1_15_0= ruleTempFormula
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
                    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:447:4: ( (lv_f2_16_0= ruleTempFormula ) )
                    // InternalLiTeLLab.g:448:5: (lv_f2_16_0= ruleTempFormula )
                    {
                    // InternalLiTeLLab.g:448:5: (lv_f2_16_0= ruleTempFormula )
                    // InternalLiTeLLab.g:449:6: lv_f2_16_0= ruleTempFormula
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
                    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLiTeLLab.g:472:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    {
                    // InternalLiTeLLab.g:472:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    // InternalLiTeLLab.g:473:4: otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalLiTeLLab.g:477:4: ( (lv_opf_19_0= RULE_OPF ) )
                    // InternalLiTeLLab.g:478:5: (lv_opf_19_0= RULE_OPF )
                    {
                    // InternalLiTeLLab.g:478:5: (lv_opf_19_0= RULE_OPF )
                    // InternalLiTeLLab.g:479:6: lv_opf_19_0= RULE_OPF
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
                    							"org.xtext.example.mydsl.LiTeLLab.OPF");
                    					

                    }


                    }

                    // InternalLiTeLLab.g:495:4: ( (lv_f_20_0= ruleTempFormula ) )
                    // InternalLiTeLLab.g:496:5: (lv_f_20_0= ruleTempFormula )
                    {
                    // InternalLiTeLLab.g:496:5: (lv_f_20_0= ruleTempFormula )
                    // InternalLiTeLLab.g:497:6: lv_f_20_0= ruleTempFormula
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
                    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLiTeLLab.g:520:3: (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' )
                    {
                    // InternalLiTeLLab.g:520:3: (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' )
                    // InternalLiTeLLab.g:521:4: otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')'
                    {
                    otherlv_22=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_6_0());
                    			
                    otherlv_23=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getTempFormulaAccess().getWKeyword_6_1());
                    			
                    // InternalLiTeLLab.g:529:4: ( (lv_ap_24_0= ruleAP ) )
                    // InternalLiTeLLab.g:530:5: (lv_ap_24_0= ruleAP )
                    {
                    // InternalLiTeLLab.g:530:5: (lv_ap_24_0= ruleAP )
                    // InternalLiTeLLab.g:531:6: lv_ap_24_0= ruleAP
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_ap_24_0=ruleAP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"ap",
                    							lv_ap_24_0,
                    							"org.xtext.example.mydsl.LiTeLLab.AP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:548:4: ( (lv_weight_25_0= ruleWeight ) )
                    // InternalLiTeLLab.g:549:5: (lv_weight_25_0= ruleWeight )
                    {
                    // InternalLiTeLLab.g:549:5: (lv_weight_25_0= ruleWeight )
                    // InternalLiTeLLab.g:550:6: lv_weight_25_0= ruleWeight
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
                    							"org.xtext.example.mydsl.LiTeLLab.Weight");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLiTeLLab.g:573:3: (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' )
                    {
                    // InternalLiTeLLab.g:573:3: (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' )
                    // InternalLiTeLLab.g:574:4: otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')'
                    {
                    otherlv_27=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_28, grammarAccess.getTempFormulaAccess().getIwKeyword_7_1());
                    			
                    // InternalLiTeLLab.g:582:4: ( (lv_iap_29_0= ruleAP ) )
                    // InternalLiTeLLab.g:583:5: (lv_iap_29_0= ruleAP )
                    {
                    // InternalLiTeLLab.g:583:5: (lv_iap_29_0= ruleAP )
                    // InternalLiTeLLab.g:584:6: lv_iap_29_0= ruleAP
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getIapAPParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_iap_29_0=ruleAP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"iap",
                    							lv_iap_29_0,
                    							"org.xtext.example.mydsl.LiTeLLab.AP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:601:4: ( (lv_weight_30_0= ruleWeight ) )
                    // InternalLiTeLLab.g:602:5: (lv_weight_30_0= ruleWeight )
                    {
                    // InternalLiTeLLab.g:602:5: (lv_weight_30_0= ruleWeight )
                    // InternalLiTeLLab.g:603:6: lv_weight_30_0= ruleWeight
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_weight_30_0=ruleWeight();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_30_0,
                    							"org.xtext.example.mydsl.LiTeLLab.Weight");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_4());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalLiTeLLab.g:626:3: (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' )
                    {
                    // InternalLiTeLLab.g:626:3: (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' )
                    // InternalLiTeLLab.g:627:4: otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')'
                    {
                    otherlv_32=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_32, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_8_0());
                    			
                    otherlv_33=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_33, grammarAccess.getTempFormulaAccess().getNextKeyword_8_1());
                    			
                    // InternalLiTeLLab.g:635:4: ( (lv_fNext_34_0= ruleTempFormula ) )
                    // InternalLiTeLLab.g:636:5: (lv_fNext_34_0= ruleTempFormula )
                    {
                    // InternalLiTeLLab.g:636:5: (lv_fNext_34_0= ruleTempFormula )
                    // InternalLiTeLLab.g:637:6: lv_fNext_34_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_fNext_34_0=ruleTempFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"fNext",
                    							lv_fNext_34_0,
                    							"org.xtext.example.mydsl.LiTeLLab.TempFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:654:4: ( (lv_x1_35_0= ruleWInt ) )
                    // InternalLiTeLLab.g:655:5: (lv_x1_35_0= ruleWInt )
                    {
                    // InternalLiTeLLab.g:655:5: (lv_x1_35_0= ruleWInt )
                    // InternalLiTeLLab.g:656:6: lv_x1_35_0= ruleWInt
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_x1_35_0=ruleWInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"x1",
                    							lv_x1_35_0,
                    							"org.xtext.example.mydsl.LiTeLLab.WInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:673:4: ( (lv_x2_36_0= ruleWInt ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalLiTeLLab.g:674:5: (lv_x2_36_0= ruleWInt )
                            {
                            // InternalLiTeLLab.g:674:5: (lv_x2_36_0= ruleWInt )
                            // InternalLiTeLLab.g:675:6: lv_x2_36_0= ruleWInt
                            {

                            						newCompositeNode(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_8_4_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_x2_36_0=ruleWInt();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                            						}
                            						set(
                            							current,
                            							"x2",
                            							lv_x2_36_0,
                            							"org.xtext.example.mydsl.LiTeLLab.WInt");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_37, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_8_5());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalLiTeLLab.g:698:3: (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' )
                    {
                    // InternalLiTeLLab.g:698:3: (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' )
                    // InternalLiTeLLab.g:699:4: otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')'
                    {
                    otherlv_38=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_38, grammarAccess.getTempFormulaAccess().getLeftParenthesisLeftSquareBracketKeyword_9_0());
                    			
                    // InternalLiTeLLab.g:703:4: ( (lv_comp_39_0= RULE_COMP ) )
                    // InternalLiTeLLab.g:704:5: (lv_comp_39_0= RULE_COMP )
                    {
                    // InternalLiTeLLab.g:704:5: (lv_comp_39_0= RULE_COMP )
                    // InternalLiTeLLab.g:705:6: lv_comp_39_0= RULE_COMP
                    {
                    lv_comp_39_0=(Token)match(input,RULE_COMP,FOLLOW_20); 

                    						newLeafNode(lv_comp_39_0, grammarAccess.getTempFormulaAccess().getCompCOMPTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTempFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comp",
                    							lv_comp_39_0,
                    							"org.xtext.example.mydsl.LiTeLLab.COMP");
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_40, grammarAccess.getTempFormulaAccess().getRightSquareBracketKeyword_9_2());
                    			
                    // InternalLiTeLLab.g:725:4: ( (lv_tt1_41_0= ruleTempTerm ) )
                    // InternalLiTeLLab.g:726:5: (lv_tt1_41_0= ruleTempTerm )
                    {
                    // InternalLiTeLLab.g:726:5: (lv_tt1_41_0= ruleTempTerm )
                    // InternalLiTeLLab.g:727:6: lv_tt1_41_0= ruleTempTerm
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getTt1TempTermParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_tt1_41_0=ruleTempTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"tt1",
                    							lv_tt1_41_0,
                    							"org.xtext.example.mydsl.LiTeLLab.TempTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLiTeLLab.g:744:4: ( (lv_tt2_42_0= ruleTempTerm ) )
                    // InternalLiTeLLab.g:745:5: (lv_tt2_42_0= ruleTempTerm )
                    {
                    // InternalLiTeLLab.g:745:5: (lv_tt2_42_0= ruleTempTerm )
                    // InternalLiTeLLab.g:746:6: lv_tt2_42_0= ruleTempTerm
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getTt2TempTermParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_tt2_42_0=ruleTempTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTempFormulaRule());
                    						}
                    						set(
                    							current,
                    							"tt2",
                    							lv_tt2_42_0,
                    							"org.xtext.example.mydsl.LiTeLLab.TempTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_43, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_9_5());
                    			

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


    // $ANTLR start "entryRuleTempTerm"
    // InternalLiTeLLab.g:772:1: entryRuleTempTerm returns [EObject current=null] : iv_ruleTempTerm= ruleTempTerm EOF ;
    public final EObject entryRuleTempTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempTerm = null;


        try {
            // InternalLiTeLLab.g:772:49: (iv_ruleTempTerm= ruleTempTerm EOF )
            // InternalLiTeLLab.g:773:2: iv_ruleTempTerm= ruleTempTerm EOF
            {
             newCompositeNode(grammarAccess.getTempTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempTerm=ruleTempTerm();

            state._fsp--;

             current =iv_ruleTempTerm; 
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
    // $ANTLR end "entryRuleTempTerm"


    // $ANTLR start "ruleTempTerm"
    // InternalLiTeLLab.g:779:1: ruleTempTerm returns [EObject current=null] : ( ( (lv_int1_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleVAR ) ) | ( (lv_oldVar_2_0= ruleoldVAR ) ) ) ;
    public final EObject ruleTempTerm() throws RecognitionException {
        EObject current = null;

        Token lv_int1_0_0=null;
        EObject lv_var_1_0 = null;

        EObject lv_oldVar_2_0 = null;



        	enterRule();

        try {
            // InternalLiTeLLab.g:785:2: ( ( ( (lv_int1_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleVAR ) ) | ( (lv_oldVar_2_0= ruleoldVAR ) ) ) )
            // InternalLiTeLLab.g:786:2: ( ( (lv_int1_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleVAR ) ) | ( (lv_oldVar_2_0= ruleoldVAR ) ) )
            {
            // InternalLiTeLLab.g:786:2: ( ( (lv_int1_0_0= RULE_INT ) ) | ( (lv_var_1_0= ruleVAR ) ) | ( (lv_oldVar_2_0= ruleoldVAR ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==14) ) {
                    alt7=2;
                }
                else if ( (LA7_2==30) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLiTeLLab.g:787:3: ( (lv_int1_0_0= RULE_INT ) )
                    {
                    // InternalLiTeLLab.g:787:3: ( (lv_int1_0_0= RULE_INT ) )
                    // InternalLiTeLLab.g:788:4: (lv_int1_0_0= RULE_INT )
                    {
                    // InternalLiTeLLab.g:788:4: (lv_int1_0_0= RULE_INT )
                    // InternalLiTeLLab.g:789:5: lv_int1_0_0= RULE_INT
                    {
                    lv_int1_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int1_0_0, grammarAccess.getTempTermAccess().getInt1INTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTempTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"int1",
                    						lv_int1_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:806:3: ( (lv_var_1_0= ruleVAR ) )
                    {
                    // InternalLiTeLLab.g:806:3: ( (lv_var_1_0= ruleVAR ) )
                    // InternalLiTeLLab.g:807:4: (lv_var_1_0= ruleVAR )
                    {
                    // InternalLiTeLLab.g:807:4: (lv_var_1_0= ruleVAR )
                    // InternalLiTeLLab.g:808:5: lv_var_1_0= ruleVAR
                    {

                    					newCompositeNode(grammarAccess.getTempTermAccess().getVarVARParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_1_0=ruleVAR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTempTermRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_1_0,
                    						"org.xtext.example.mydsl.LiTeLLab.VAR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:826:3: ( (lv_oldVar_2_0= ruleoldVAR ) )
                    {
                    // InternalLiTeLLab.g:826:3: ( (lv_oldVar_2_0= ruleoldVAR ) )
                    // InternalLiTeLLab.g:827:4: (lv_oldVar_2_0= ruleoldVAR )
                    {
                    // InternalLiTeLLab.g:827:4: (lv_oldVar_2_0= ruleoldVAR )
                    // InternalLiTeLLab.g:828:5: lv_oldVar_2_0= ruleoldVAR
                    {

                    					newCompositeNode(grammarAccess.getTempTermAccess().getOldVarOldVARParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_oldVar_2_0=ruleoldVAR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTempTermRule());
                    					}
                    					set(
                    						current,
                    						"oldVar",
                    						lv_oldVar_2_0,
                    						"org.xtext.example.mydsl.LiTeLLab.oldVAR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleTempTerm"


    // $ANTLR start "entryRuleAP"
    // InternalLiTeLLab.g:849:1: entryRuleAP returns [EObject current=null] : iv_ruleAP= ruleAP EOF ;
    public final EObject entryRuleAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAP = null;


        try {
            // InternalLiTeLLab.g:849:43: (iv_ruleAP= ruleAP EOF )
            // InternalLiTeLLab.g:850:2: iv_ruleAP= ruleAP EOF
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
    // InternalLiTeLLab.g:856:1: ruleAP returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
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
            // InternalLiTeLLab.g:862:2: ( (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalLiTeLLab.g:863:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalLiTeLLab.g:863:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalLiTeLLab.g:864:3: otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_pName_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAPAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAPAccess().getHyphenMinusKeyword_1());
            		
            // InternalLiTeLLab.g:872:3: (otherlv_2= 'P' | otherlv_3= 'p' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLiTeLLab.g:873:4: otherlv_2= 'P'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getAPAccess().getPKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:878:4: otherlv_3= 'p'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getAPAccess().getPKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getAPAccess().getHyphenMinusKeyword_3());
            		
            // InternalLiTeLLab.g:887:3: ( (lv_pName_5_0= RULE_ID ) )
            // InternalLiTeLLab.g:888:4: (lv_pName_5_0= RULE_ID )
            {
            // InternalLiTeLLab.g:888:4: (lv_pName_5_0= RULE_ID )
            // InternalLiTeLLab.g:889:5: lv_pName_5_0= RULE_ID
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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleVAR"
    // InternalLiTeLLab.g:913:1: entryRuleVAR returns [EObject current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final EObject entryRuleVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR = null;


        try {
            // InternalLiTeLLab.g:913:44: (iv_ruleVAR= ruleVAR EOF )
            // InternalLiTeLLab.g:914:2: iv_ruleVAR= ruleVAR EOF
            {
             newCompositeNode(grammarAccess.getVARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAR=ruleVAR();

            state._fsp--;

             current =iv_ruleVAR; 
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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalLiTeLLab.g:920:1: ruleVAR returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'V' | otherlv_3= 'v' ) otherlv_4= '-' ( (lv_vName_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_vName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalLiTeLLab.g:926:2: ( (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'V' | otherlv_3= 'v' ) otherlv_4= '-' ( (lv_vName_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalLiTeLLab.g:927:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'V' | otherlv_3= 'v' ) otherlv_4= '-' ( (lv_vName_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalLiTeLLab.g:927:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'V' | otherlv_3= 'v' ) otherlv_4= '-' ( (lv_vName_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalLiTeLLab.g:928:3: otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'V' | otherlv_3= 'v' ) otherlv_4= '-' ( (lv_vName_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getVARAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVARAccess().getHyphenMinusKeyword_1());
            		
            // InternalLiTeLLab.g:936:3: (otherlv_2= 'V' | otherlv_3= 'v' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLiTeLLab.g:937:4: otherlv_2= 'V'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getVARAccess().getVKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:942:4: otherlv_3= 'v'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getVARAccess().getVKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getVARAccess().getHyphenMinusKeyword_3());
            		
            // InternalLiTeLLab.g:951:3: ( (lv_vName_5_0= RULE_ID ) )
            // InternalLiTeLLab.g:952:4: (lv_vName_5_0= RULE_ID )
            {
            // InternalLiTeLLab.g:952:4: (lv_vName_5_0= RULE_ID )
            // InternalLiTeLLab.g:953:5: lv_vName_5_0= RULE_ID
            {
            lv_vName_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_vName_5_0, grammarAccess.getVARAccess().getVNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVARRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vName",
            						lv_vName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVARAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleoldVAR"
    // InternalLiTeLLab.g:977:1: entryRuleoldVAR returns [EObject current=null] : iv_ruleoldVAR= ruleoldVAR EOF ;
    public final EObject entryRuleoldVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoldVAR = null;


        try {
            // InternalLiTeLLab.g:977:47: (iv_ruleoldVAR= ruleoldVAR EOF )
            // InternalLiTeLLab.g:978:2: iv_ruleoldVAR= ruleoldVAR EOF
            {
             newCompositeNode(grammarAccess.getOldVARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoldVAR=ruleoldVAR();

            state._fsp--;

             current =iv_ruleoldVAR; 
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
    // $ANTLR end "entryRuleoldVAR"


    // $ANTLR start "ruleoldVAR"
    // InternalLiTeLLab.g:984:1: ruleoldVAR returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'old' ( (lv_var_2_0= ruleVAR ) ) otherlv_3= ')' ) ;
    public final EObject ruleoldVAR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalLiTeLLab.g:990:2: ( (otherlv_0= '(' otherlv_1= 'old' ( (lv_var_2_0= ruleVAR ) ) otherlv_3= ')' ) )
            // InternalLiTeLLab.g:991:2: (otherlv_0= '(' otherlv_1= 'old' ( (lv_var_2_0= ruleVAR ) ) otherlv_3= ')' )
            {
            // InternalLiTeLLab.g:991:2: (otherlv_0= '(' otherlv_1= 'old' ( (lv_var_2_0= ruleVAR ) ) otherlv_3= ')' )
            // InternalLiTeLLab.g:992:3: otherlv_0= '(' otherlv_1= 'old' ( (lv_var_2_0= ruleVAR ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getOldVARAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOldVARAccess().getOldKeyword_1());
            		
            // InternalLiTeLLab.g:1000:3: ( (lv_var_2_0= ruleVAR ) )
            // InternalLiTeLLab.g:1001:4: (lv_var_2_0= ruleVAR )
            {
            // InternalLiTeLLab.g:1001:4: (lv_var_2_0= ruleVAR )
            // InternalLiTeLLab.g:1002:5: lv_var_2_0= ruleVAR
            {

            					newCompositeNode(grammarAccess.getOldVARAccess().getVarVARParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_2_0=ruleVAR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOldVARRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.xtext.example.mydsl.LiTeLLab.VAR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOldVARAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleoldVAR"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\1\5\12\uffff";
    static final String dfa_3s = "\1\30\1\27\12\uffff";
    static final String dfa_4s = "\2\uffff\1\12\1\6\1\2\1\4\1\7\1\10\1\11\1\1\1\3\1\5";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2",
            "\1\13\1\3\7\uffff\1\11\2\uffff\1\4\1\uffff\1\12\1\5\1\6\1\7\1\10",
            "",
            "",
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
            return "282:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) | (otherlv_22= '(' otherlv_23= 'w' ( (lv_ap_24_0= ruleAP ) ) ( (lv_weight_25_0= ruleWeight ) ) otherlv_26= ')' ) | (otherlv_27= '(' otherlv_28= 'iw' ( (lv_iap_29_0= ruleAP ) ) ( (lv_weight_30_0= ruleWeight ) ) otherlv_31= ')' ) | (otherlv_32= '(' otherlv_33= 'next' ( (lv_fNext_34_0= ruleTempFormula ) ) ( (lv_x1_35_0= ruleWInt ) ) ( (lv_x2_36_0= ruleWInt ) )? otherlv_37= ')' ) | (otherlv_38= '([' ( (lv_comp_39_0= RULE_COMP ) ) otherlv_40= ']' ( (lv_tt1_41_0= ruleTempTerm ) ) ( (lv_tt2_42_0= ruleTempTerm ) ) otherlv_43= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}