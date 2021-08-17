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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_OP2", "RULE_OPF", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bound:'", "'SoftBound:'", "'Formula:'", "'SoftFormulae:'", "'('", "'soft'", "')'", "'@'", "'.'", "'&&'", "'||'", "'!!'", "'-'", "'P'", "'p'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=6;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_OPF=7;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalOltl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Bound:' ( (lv_bound_1_0= RULE_INT ) ) (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )? otherlv_4= 'Formula:' ( (lv_tempFormula_5_0= ruleTempFormula ) ) (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bound_1_0=null;
        Token otherlv_2=null;
        Token lv_softBound_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tempFormula_5_0 = null;

        EObject lv_softFormulae_7_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:77:2: ( (otherlv_0= 'Bound:' ( (lv_bound_1_0= RULE_INT ) ) (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )? otherlv_4= 'Formula:' ( (lv_tempFormula_5_0= ruleTempFormula ) ) (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )? ) )
            // InternalOltl.g:78:2: (otherlv_0= 'Bound:' ( (lv_bound_1_0= RULE_INT ) ) (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )? otherlv_4= 'Formula:' ( (lv_tempFormula_5_0= ruleTempFormula ) ) (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )? )
            {
            // InternalOltl.g:78:2: (otherlv_0= 'Bound:' ( (lv_bound_1_0= RULE_INT ) ) (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )? otherlv_4= 'Formula:' ( (lv_tempFormula_5_0= ruleTempFormula ) ) (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )? )
            // InternalOltl.g:79:3: otherlv_0= 'Bound:' ( (lv_bound_1_0= RULE_INT ) ) (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )? otherlv_4= 'Formula:' ( (lv_tempFormula_5_0= ruleTempFormula ) ) (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getBoundKeyword_0());
            		
            // InternalOltl.g:83:3: ( (lv_bound_1_0= RULE_INT ) )
            // InternalOltl.g:84:4: (lv_bound_1_0= RULE_INT )
            {
            // InternalOltl.g:84:4: (lv_bound_1_0= RULE_INT )
            // InternalOltl.g:85:5: lv_bound_1_0= RULE_INT
            {
            lv_bound_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_bound_1_0, grammarAccess.getModelAccess().getBoundINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bound",
            						lv_bound_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOltl.g:101:3: (otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOltl.g:102:4: otherlv_2= 'SoftBound:' ( (lv_softBound_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSoftBoundKeyword_2_0());
                    			
                    // InternalOltl.g:106:4: ( (lv_softBound_3_0= RULE_INT ) )
                    // InternalOltl.g:107:5: (lv_softBound_3_0= RULE_INT )
                    {
                    // InternalOltl.g:107:5: (lv_softBound_3_0= RULE_INT )
                    // InternalOltl.g:108:6: lv_softBound_3_0= RULE_INT
                    {
                    lv_softBound_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_softBound_3_0, grammarAccess.getModelAccess().getSoftBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"softBound",
                    							lv_softBound_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFormulaKeyword_3());
            		
            // InternalOltl.g:129:3: ( (lv_tempFormula_5_0= ruleTempFormula ) )
            // InternalOltl.g:130:4: (lv_tempFormula_5_0= ruleTempFormula )
            {
            // InternalOltl.g:130:4: (lv_tempFormula_5_0= ruleTempFormula )
            // InternalOltl.g:131:5: lv_tempFormula_5_0= ruleTempFormula
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_tempFormula_5_0=ruleTempFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"tempFormula",
            						lv_tempFormula_5_0,
            						"com.pourhashem.xtext.oltl.Oltl.TempFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOltl.g:148:3: (otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOltl.g:149:4: otherlv_6= 'SoftFormulae:' ( (lv_softFormulae_7_0= ruleSoftFormula ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getSoftFormulaeKeyword_5_0());
                    			
                    // InternalOltl.g:153:4: ( (lv_softFormulae_7_0= ruleSoftFormula ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalOltl.g:154:5: (lv_softFormulae_7_0= ruleSoftFormula )
                    	    {
                    	    // InternalOltl.g:154:5: (lv_softFormulae_7_0= ruleSoftFormula )
                    	    // InternalOltl.g:155:6: lv_softFormulae_7_0= ruleSoftFormula
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getSoftFormulaeSoftFormulaParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_softFormulae_7_0=ruleSoftFormula();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"softFormulae",
                    	    							lv_softFormulae_7_0,
                    	    							"com.pourhashem.xtext.oltl.Oltl.SoftFormula");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSoftFormula"
    // InternalOltl.g:177:1: entryRuleSoftFormula returns [EObject current=null] : iv_ruleSoftFormula= ruleSoftFormula EOF ;
    public final EObject entryRuleSoftFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftFormula = null;


        try {
            // InternalOltl.g:177:52: (iv_ruleSoftFormula= ruleSoftFormula EOF )
            // InternalOltl.g:178:2: iv_ruleSoftFormula= ruleSoftFormula EOF
            {
             newCompositeNode(grammarAccess.getSoftFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftFormula=ruleSoftFormula();

            state._fsp--;

             current =iv_ruleSoftFormula; 
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
    // $ANTLR end "entryRuleSoftFormula"


    // $ANTLR start "ruleSoftFormula"
    // InternalOltl.g:184:1: ruleSoftFormula returns [EObject current=null] : ( ( (lv_softAll_0_0= ruleSoftAllTI ) ) | ( (lv_softAt_1_0= ruleSoftTI ) ) ) ;
    public final EObject ruleSoftFormula() throws RecognitionException {
        EObject current = null;

        EObject lv_softAll_0_0 = null;

        EObject lv_softAt_1_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:190:2: ( ( ( (lv_softAll_0_0= ruleSoftAllTI ) ) | ( (lv_softAt_1_0= ruleSoftTI ) ) ) )
            // InternalOltl.g:191:2: ( ( (lv_softAll_0_0= ruleSoftAllTI ) ) | ( (lv_softAt_1_0= ruleSoftTI ) ) )
            {
            // InternalOltl.g:191:2: ( ( (lv_softAll_0_0= ruleSoftAllTI ) ) | ( (lv_softAt_1_0= ruleSoftTI ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==17) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==25) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==20) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOltl.g:192:3: ( (lv_softAll_0_0= ruleSoftAllTI ) )
                    {
                    // InternalOltl.g:192:3: ( (lv_softAll_0_0= ruleSoftAllTI ) )
                    // InternalOltl.g:193:4: (lv_softAll_0_0= ruleSoftAllTI )
                    {
                    // InternalOltl.g:193:4: (lv_softAll_0_0= ruleSoftAllTI )
                    // InternalOltl.g:194:5: lv_softAll_0_0= ruleSoftAllTI
                    {

                    					newCompositeNode(grammarAccess.getSoftFormulaAccess().getSoftAllSoftAllTIParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_softAll_0_0=ruleSoftAllTI();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSoftFormulaRule());
                    					}
                    					set(
                    						current,
                    						"softAll",
                    						lv_softAll_0_0,
                    						"com.pourhashem.xtext.oltl.Oltl.SoftAllTI");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:212:3: ( (lv_softAt_1_0= ruleSoftTI ) )
                    {
                    // InternalOltl.g:212:3: ( (lv_softAt_1_0= ruleSoftTI ) )
                    // InternalOltl.g:213:4: (lv_softAt_1_0= ruleSoftTI )
                    {
                    // InternalOltl.g:213:4: (lv_softAt_1_0= ruleSoftTI )
                    // InternalOltl.g:214:5: lv_softAt_1_0= ruleSoftTI
                    {

                    					newCompositeNode(grammarAccess.getSoftFormulaAccess().getSoftAtSoftTIParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_softAt_1_0=ruleSoftTI();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSoftFormulaRule());
                    					}
                    					set(
                    						current,
                    						"softAt",
                    						lv_softAt_1_0,
                    						"com.pourhashem.xtext.oltl.Oltl.SoftTI");
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
    // $ANTLR end "ruleSoftFormula"


    // $ANTLR start "entryRuleSoftAllTI"
    // InternalOltl.g:235:1: entryRuleSoftAllTI returns [EObject current=null] : iv_ruleSoftAllTI= ruleSoftAllTI EOF ;
    public final EObject entryRuleSoftAllTI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftAllTI = null;


        try {
            // InternalOltl.g:235:50: (iv_ruleSoftAllTI= ruleSoftAllTI EOF )
            // InternalOltl.g:236:2: iv_ruleSoftAllTI= ruleSoftAllTI EOF
            {
             newCompositeNode(grammarAccess.getSoftAllTIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftAllTI=ruleSoftAllTI();

            state._fsp--;

             current =iv_ruleSoftAllTI; 
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
    // $ANTLR end "entryRuleSoftAllTI"


    // $ANTLR start "ruleSoftAllTI"
    // InternalOltl.g:242:1: ruleSoftAllTI returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'soft' ( (lv_ap_2_0= ruleAP ) ) ( (lv_id_3_0= RULE_ID ) )? ( (lv_weight_4_0= ruleWeight ) ) otherlv_5= ')' ) ;
    public final EObject ruleSoftAllTI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_3_0=null;
        Token otherlv_5=null;
        EObject lv_ap_2_0 = null;

        EObject lv_weight_4_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:248:2: ( (otherlv_0= '(' otherlv_1= 'soft' ( (lv_ap_2_0= ruleAP ) ) ( (lv_id_3_0= RULE_ID ) )? ( (lv_weight_4_0= ruleWeight ) ) otherlv_5= ')' ) )
            // InternalOltl.g:249:2: (otherlv_0= '(' otherlv_1= 'soft' ( (lv_ap_2_0= ruleAP ) ) ( (lv_id_3_0= RULE_ID ) )? ( (lv_weight_4_0= ruleWeight ) ) otherlv_5= ')' )
            {
            // InternalOltl.g:249:2: (otherlv_0= '(' otherlv_1= 'soft' ( (lv_ap_2_0= ruleAP ) ) ( (lv_id_3_0= RULE_ID ) )? ( (lv_weight_4_0= ruleWeight ) ) otherlv_5= ')' )
            // InternalOltl.g:250:3: otherlv_0= '(' otherlv_1= 'soft' ( (lv_ap_2_0= ruleAP ) ) ( (lv_id_3_0= RULE_ID ) )? ( (lv_weight_4_0= ruleWeight ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSoftAllTIAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSoftAllTIAccess().getSoftKeyword_1());
            		
            // InternalOltl.g:258:3: ( (lv_ap_2_0= ruleAP ) )
            // InternalOltl.g:259:4: (lv_ap_2_0= ruleAP )
            {
            // InternalOltl.g:259:4: (lv_ap_2_0= ruleAP )
            // InternalOltl.g:260:5: lv_ap_2_0= ruleAP
            {

            					newCompositeNode(grammarAccess.getSoftAllTIAccess().getApAPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_ap_2_0=ruleAP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftAllTIRule());
            					}
            					set(
            						current,
            						"ap",
            						lv_ap_2_0,
            						"com.pourhashem.xtext.oltl.Oltl.AP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOltl.g:277:3: ( (lv_id_3_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOltl.g:278:4: (lv_id_3_0= RULE_ID )
                    {
                    // InternalOltl.g:278:4: (lv_id_3_0= RULE_ID )
                    // InternalOltl.g:279:5: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    					newLeafNode(lv_id_3_0, grammarAccess.getSoftAllTIAccess().getIdIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSoftAllTIRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalOltl.g:295:3: ( (lv_weight_4_0= ruleWeight ) )
            // InternalOltl.g:296:4: (lv_weight_4_0= ruleWeight )
            {
            // InternalOltl.g:296:4: (lv_weight_4_0= ruleWeight )
            // InternalOltl.g:297:5: lv_weight_4_0= ruleWeight
            {

            					newCompositeNode(grammarAccess.getSoftAllTIAccess().getWeightWeightParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_weight_4_0=ruleWeight();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftAllTIRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_4_0,
            						"com.pourhashem.xtext.oltl.Oltl.Weight");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSoftAllTIAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSoftAllTI"


    // $ANTLR start "entryRuleSoftTI"
    // InternalOltl.g:322:1: entryRuleSoftTI returns [EObject current=null] : iv_ruleSoftTI= ruleSoftTI EOF ;
    public final EObject entryRuleSoftTI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftTI = null;


        try {
            // InternalOltl.g:322:47: (iv_ruleSoftTI= ruleSoftTI EOF )
            // InternalOltl.g:323:2: iv_ruleSoftTI= ruleSoftTI EOF
            {
             newCompositeNode(grammarAccess.getSoftTIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftTI=ruleSoftTI();

            state._fsp--;

             current =iv_ruleSoftTI; 
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
    // $ANTLR end "entryRuleSoftTI"


    // $ANTLR start "ruleSoftTI"
    // InternalOltl.g:329:1: ruleSoftTI returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'soft' otherlv_2= '(' otherlv_3= '@' ( (lv_ap_4_0= ruleAP ) ) ( (lv_ti_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_id_7_0= RULE_ID ) )? ( (lv_weight_8_0= ruleWeight ) ) otherlv_9= ')' ) ;
    public final EObject ruleSoftTI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ti_5_0=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_9=null;
        EObject lv_ap_4_0 = null;

        EObject lv_weight_8_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:335:2: ( (otherlv_0= '(' otherlv_1= 'soft' otherlv_2= '(' otherlv_3= '@' ( (lv_ap_4_0= ruleAP ) ) ( (lv_ti_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_id_7_0= RULE_ID ) )? ( (lv_weight_8_0= ruleWeight ) ) otherlv_9= ')' ) )
            // InternalOltl.g:336:2: (otherlv_0= '(' otherlv_1= 'soft' otherlv_2= '(' otherlv_3= '@' ( (lv_ap_4_0= ruleAP ) ) ( (lv_ti_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_id_7_0= RULE_ID ) )? ( (lv_weight_8_0= ruleWeight ) ) otherlv_9= ')' )
            {
            // InternalOltl.g:336:2: (otherlv_0= '(' otherlv_1= 'soft' otherlv_2= '(' otherlv_3= '@' ( (lv_ap_4_0= ruleAP ) ) ( (lv_ti_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_id_7_0= RULE_ID ) )? ( (lv_weight_8_0= ruleWeight ) ) otherlv_9= ')' )
            // InternalOltl.g:337:3: otherlv_0= '(' otherlv_1= 'soft' otherlv_2= '(' otherlv_3= '@' ( (lv_ap_4_0= ruleAP ) ) ( (lv_ti_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_id_7_0= RULE_ID ) )? ( (lv_weight_8_0= ruleWeight ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSoftTIAccess().getSoftKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSoftTIAccess().getCommercialAtKeyword_3());
            		
            // InternalOltl.g:353:3: ( (lv_ap_4_0= ruleAP ) )
            // InternalOltl.g:354:4: (lv_ap_4_0= ruleAP )
            {
            // InternalOltl.g:354:4: (lv_ap_4_0= ruleAP )
            // InternalOltl.g:355:5: lv_ap_4_0= ruleAP
            {

            					newCompositeNode(grammarAccess.getSoftTIAccess().getApAPParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_ap_4_0=ruleAP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftTIRule());
            					}
            					set(
            						current,
            						"ap",
            						lv_ap_4_0,
            						"com.pourhashem.xtext.oltl.Oltl.AP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOltl.g:372:3: ( (lv_ti_5_0= RULE_INT ) )
            // InternalOltl.g:373:4: (lv_ti_5_0= RULE_INT )
            {
            // InternalOltl.g:373:4: (lv_ti_5_0= RULE_INT )
            // InternalOltl.g:374:5: lv_ti_5_0= RULE_INT
            {
            lv_ti_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_ti_5_0, grammarAccess.getSoftTIAccess().getTiINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoftTIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ti",
            						lv_ti_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_6());
            		
            // InternalOltl.g:394:3: ( (lv_id_7_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOltl.g:395:4: (lv_id_7_0= RULE_ID )
                    {
                    // InternalOltl.g:395:4: (lv_id_7_0= RULE_ID )
                    // InternalOltl.g:396:5: lv_id_7_0= RULE_ID
                    {
                    lv_id_7_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    					newLeafNode(lv_id_7_0, grammarAccess.getSoftTIAccess().getIdIDTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSoftTIRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_7_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalOltl.g:412:3: ( (lv_weight_8_0= ruleWeight ) )
            // InternalOltl.g:413:4: (lv_weight_8_0= ruleWeight )
            {
            // InternalOltl.g:413:4: (lv_weight_8_0= ruleWeight )
            // InternalOltl.g:414:5: lv_weight_8_0= ruleWeight
            {

            					newCompositeNode(grammarAccess.getSoftTIAccess().getWeightWeightParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_weight_8_0=ruleWeight();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftTIRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_8_0,
            						"com.pourhashem.xtext.oltl.Oltl.Weight");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleSoftTI"


    // $ANTLR start "entryRuleWeight"
    // InternalOltl.g:439:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalOltl.g:439:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalOltl.g:440:2: iv_ruleWeight= ruleWeight EOF
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
    // InternalOltl.g:446:1: ruleWeight returns [EObject current=null] : ( ( (lv_wInt_0_0= ruleWInt ) ) | ( (lv_wFloat_1_0= ruleWFloat ) ) ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        EObject lv_wInt_0_0 = null;

        EObject lv_wFloat_1_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:452:2: ( ( ( (lv_wInt_0_0= ruleWInt ) ) | ( (lv_wFloat_1_0= ruleWFloat ) ) ) )
            // InternalOltl.g:453:2: ( ( (lv_wInt_0_0= ruleWInt ) ) | ( (lv_wFloat_1_0= ruleWFloat ) ) )
            {
            // InternalOltl.g:453:2: ( ( (lv_wInt_0_0= ruleWInt ) ) | ( (lv_wFloat_1_0= ruleWFloat ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==19) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

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
                    // InternalOltl.g:454:3: ( (lv_wInt_0_0= ruleWInt ) )
                    {
                    // InternalOltl.g:454:3: ( (lv_wInt_0_0= ruleWInt ) )
                    // InternalOltl.g:455:4: (lv_wInt_0_0= ruleWInt )
                    {
                    // InternalOltl.g:455:4: (lv_wInt_0_0= ruleWInt )
                    // InternalOltl.g:456:5: lv_wInt_0_0= ruleWInt
                    {

                    					newCompositeNode(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wInt_0_0=ruleWInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWeightRule());
                    					}
                    					set(
                    						current,
                    						"wInt",
                    						lv_wInt_0_0,
                    						"com.pourhashem.xtext.oltl.Oltl.WInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:474:3: ( (lv_wFloat_1_0= ruleWFloat ) )
                    {
                    // InternalOltl.g:474:3: ( (lv_wFloat_1_0= ruleWFloat ) )
                    // InternalOltl.g:475:4: (lv_wFloat_1_0= ruleWFloat )
                    {
                    // InternalOltl.g:475:4: (lv_wFloat_1_0= ruleWFloat )
                    // InternalOltl.g:476:5: lv_wFloat_1_0= ruleWFloat
                    {

                    					newCompositeNode(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wFloat_1_0=ruleWFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWeightRule());
                    					}
                    					set(
                    						current,
                    						"wFloat",
                    						lv_wFloat_1_0,
                    						"com.pourhashem.xtext.oltl.Oltl.WFloat");
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
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleWInt"
    // InternalOltl.g:497:1: entryRuleWInt returns [EObject current=null] : iv_ruleWInt= ruleWInt EOF ;
    public final EObject entryRuleWInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWInt = null;


        try {
            // InternalOltl.g:497:45: (iv_ruleWInt= ruleWInt EOF )
            // InternalOltl.g:498:2: iv_ruleWInt= ruleWInt EOF
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
    // InternalOltl.g:504:1: ruleWInt returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleWInt() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalOltl.g:510:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalOltl.g:511:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalOltl.g:511:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalOltl.g:512:3: (lv_int_0_0= RULE_INT )
            {
            // InternalOltl.g:512:3: (lv_int_0_0= RULE_INT )
            // InternalOltl.g:513:4: lv_int_0_0= RULE_INT
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
    // InternalOltl.g:532:1: entryRuleWFloat returns [EObject current=null] : iv_ruleWFloat= ruleWFloat EOF ;
    public final EObject entryRuleWFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWFloat = null;


        try {
            // InternalOltl.g:532:47: (iv_ruleWFloat= ruleWFloat EOF )
            // InternalOltl.g:533:2: iv_ruleWFloat= ruleWFloat EOF
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
    // InternalOltl.g:539:1: ruleWFloat returns [EObject current=null] : ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) ;
    public final EObject ruleWFloat() throws RecognitionException {
        EObject current = null;

        Token lv_int1_0_0=null;
        Token otherlv_1=null;
        Token lv_int2_2_0=null;


        	enterRule();

        try {
            // InternalOltl.g:545:2: ( ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) ) )
            // InternalOltl.g:546:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            {
            // InternalOltl.g:546:2: ( ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) ) )
            // InternalOltl.g:547:3: ( (lv_int1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_int2_2_0= RULE_INT ) )
            {
            // InternalOltl.g:547:3: ( (lv_int1_0_0= RULE_INT ) )
            // InternalOltl.g:548:4: (lv_int1_0_0= RULE_INT )
            {
            // InternalOltl.g:548:4: (lv_int1_0_0= RULE_INT )
            // InternalOltl.g:549:5: lv_int1_0_0= RULE_INT
            {
            lv_int1_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWFloatAccess().getFullStopKeyword_1());
            		
            // InternalOltl.g:569:3: ( (lv_int2_2_0= RULE_INT ) )
            // InternalOltl.g:570:4: (lv_int2_2_0= RULE_INT )
            {
            // InternalOltl.g:570:4: (lv_int2_2_0= RULE_INT )
            // InternalOltl.g:571:5: lv_int2_2_0= RULE_INT
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
    // InternalOltl.g:591:1: entryRuleTempFormula returns [EObject current=null] : iv_ruleTempFormula= ruleTempFormula EOF ;
    public final EObject entryRuleTempFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempFormula = null;


        try {
            // InternalOltl.g:591:52: (iv_ruleTempFormula= ruleTempFormula EOF )
            // InternalOltl.g:592:2: iv_ruleTempFormula= ruleTempFormula EOF
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
    // InternalOltl.g:598:1: ruleTempFormula returns [EObject current=null] : ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) ) ;
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
        EObject lv_ap_0_0 = null;

        EObject lv_fa_3_0 = null;

        EObject lv_fo_7_0 = null;

        EObject lv_fnot_11_0 = null;

        EObject lv_f1_15_0 = null;

        EObject lv_f2_16_0 = null;

        EObject lv_f_20_0 = null;



        	enterRule();

        try {
            // InternalOltl.g:604:2: ( ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) ) )
            // InternalOltl.g:605:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) )
            {
            // InternalOltl.g:605:2: ( ( (lv_ap_0_0= ruleAP ) ) | (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' ) | (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' ) | (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' ) | (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' ) )
            int alt10=6;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt10=3;
                    }
                    break;
                case RULE_OP2:
                    {
                    alt10=5;
                    }
                    break;
                case RULE_OPF:
                    {
                    alt10=6;
                    }
                    break;
                case 25:
                    {
                    alt10=1;
                    }
                    break;
                case 22:
                    {
                    alt10=2;
                    }
                    break;
                case 24:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOltl.g:606:3: ( (lv_ap_0_0= ruleAP ) )
                    {
                    // InternalOltl.g:606:3: ( (lv_ap_0_0= ruleAP ) )
                    // InternalOltl.g:607:4: (lv_ap_0_0= ruleAP )
                    {
                    // InternalOltl.g:607:4: (lv_ap_0_0= ruleAP )
                    // InternalOltl.g:608:5: lv_ap_0_0= ruleAP
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
                    // InternalOltl.g:626:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    {
                    // InternalOltl.g:626:3: (otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')' )
                    // InternalOltl.g:627:4: otherlv_1= '(' otherlv_2= '&&' ( (lv_fa_3_0= ruleTempFormula ) )+ otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1());
                    			
                    // InternalOltl.g:635:4: ( (lv_fa_3_0= ruleTempFormula ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOltl.g:636:5: (lv_fa_3_0= ruleTempFormula )
                    	    {
                    	    // InternalOltl.g:636:5: (lv_fa_3_0= ruleTempFormula )
                    	    // InternalOltl.g:637:6: lv_fa_3_0= ruleTempFormula
                    	    {

                    	    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFaTempFormulaParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOltl.g:660:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    {
                    // InternalOltl.g:660:3: (otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')' )
                    // InternalOltl.g:661:4: otherlv_5= '(' otherlv_6= '||' ( (lv_fo_7_0= ruleTempFormula ) )+ otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1());
                    			
                    // InternalOltl.g:669:4: ( (lv_fo_7_0= ruleTempFormula ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalOltl.g:670:5: (lv_fo_7_0= ruleTempFormula )
                    	    {
                    	    // InternalOltl.g:670:5: (lv_fo_7_0= ruleTempFormula )
                    	    // InternalOltl.g:671:6: lv_fo_7_0= ruleTempFormula
                    	    {

                    	    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFoTempFormulaParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOltl.g:694:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    {
                    // InternalOltl.g:694:3: (otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')' )
                    // InternalOltl.g:695:4: otherlv_9= '(' otherlv_10= '!!' ( (lv_fnot_11_0= ruleTempFormula ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1());
                    			
                    // InternalOltl.g:703:4: ( (lv_fnot_11_0= ruleTempFormula ) )
                    // InternalOltl.g:704:5: (lv_fnot_11_0= ruleTempFormula )
                    {
                    // InternalOltl.g:704:5: (lv_fnot_11_0= ruleTempFormula )
                    // InternalOltl.g:705:6: lv_fnot_11_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFnotTempFormulaParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOltl.g:728:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    {
                    // InternalOltl.g:728:3: (otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')' )
                    // InternalOltl.g:729:4: otherlv_13= '(' ( (lv_op2_14_0= RULE_OP2 ) ) ( (lv_f1_15_0= ruleTempFormula ) ) ( (lv_f2_16_0= ruleTempFormula ) ) otherlv_17= ')'
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalOltl.g:733:4: ( (lv_op2_14_0= RULE_OP2 ) )
                    // InternalOltl.g:734:5: (lv_op2_14_0= RULE_OP2 )
                    {
                    // InternalOltl.g:734:5: (lv_op2_14_0= RULE_OP2 )
                    // InternalOltl.g:735:6: lv_op2_14_0= RULE_OP2
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

                    // InternalOltl.g:751:4: ( (lv_f1_15_0= ruleTempFormula ) )
                    // InternalOltl.g:752:5: (lv_f1_15_0= ruleTempFormula )
                    {
                    // InternalOltl.g:752:5: (lv_f1_15_0= ruleTempFormula )
                    // InternalOltl.g:753:6: lv_f1_15_0= ruleTempFormula
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

                    // InternalOltl.g:770:4: ( (lv_f2_16_0= ruleTempFormula ) )
                    // InternalOltl.g:771:5: (lv_f2_16_0= ruleTempFormula )
                    {
                    // InternalOltl.g:771:5: (lv_f2_16_0= ruleTempFormula )
                    // InternalOltl.g:772:6: lv_f2_16_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getF2TempFormulaParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOltl.g:795:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    {
                    // InternalOltl.g:795:3: (otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')' )
                    // InternalOltl.g:796:4: otherlv_18= '(' ( (lv_opf_19_0= RULE_OPF ) ) ( (lv_f_20_0= ruleTempFormula ) ) otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,17,FOLLOW_19); 

                    				newLeafNode(otherlv_18, grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalOltl.g:800:4: ( (lv_opf_19_0= RULE_OPF ) )
                    // InternalOltl.g:801:5: (lv_opf_19_0= RULE_OPF )
                    {
                    // InternalOltl.g:801:5: (lv_opf_19_0= RULE_OPF )
                    // InternalOltl.g:802:6: lv_opf_19_0= RULE_OPF
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

                    // InternalOltl.g:818:4: ( (lv_f_20_0= ruleTempFormula ) )
                    // InternalOltl.g:819:5: (lv_f_20_0= ruleTempFormula )
                    {
                    // InternalOltl.g:819:5: (lv_f_20_0= ruleTempFormula )
                    // InternalOltl.g:820:6: lv_f_20_0= ruleTempFormula
                    {

                    						newCompositeNode(grammarAccess.getTempFormulaAccess().getFTempFormulaParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_21=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3());
                    			

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
    // InternalOltl.g:846:1: entryRuleAP returns [EObject current=null] : iv_ruleAP= ruleAP EOF ;
    public final EObject entryRuleAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAP = null;


        try {
            // InternalOltl.g:846:43: (iv_ruleAP= ruleAP EOF )
            // InternalOltl.g:847:2: iv_ruleAP= ruleAP EOF
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
    // InternalOltl.g:853:1: ruleAP returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleAP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOltl.g:859:2: ( (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalOltl.g:860:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalOltl.g:860:2: (otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalOltl.g:861:3: otherlv_0= '(' otherlv_1= '-' (otherlv_2= 'P' | otherlv_3= 'p' ) otherlv_4= '-' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAPAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAPAccess().getHyphenMinusKeyword_1());
            		
            // InternalOltl.g:869:3: (otherlv_2= 'P' | otherlv_3= 'p' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOltl.g:870:4: otherlv_2= 'P'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getAPAccess().getPKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOltl.g:875:4: otherlv_3= 'p'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getAPAccess().getPKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getAPAccess().getHyphenMinusKeyword_3());
            		
            // InternalOltl.g:884:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalOltl.g:885:4: (lv_name_5_0= RULE_ID )
            {
            // InternalOltl.g:885:4: (lv_name_5_0= RULE_ID )
            // InternalOltl.g:886:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_5_0, grammarAccess.getAPAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});

}