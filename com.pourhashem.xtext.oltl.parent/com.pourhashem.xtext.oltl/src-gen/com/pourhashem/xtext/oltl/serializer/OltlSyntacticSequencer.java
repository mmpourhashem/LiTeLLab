/*
 * generated by Xtext 2.10.0
 */
package com.pourhashem.xtext.oltl.serializer;

import com.google.inject.Inject;
import com.pourhashem.xtext.oltl.services.OltlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class OltlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OltlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AP_PKeyword_2_0_or_PKeyword_2_1;
	protected AbstractElementAlias match_Model_SoftFormulaeKeyword_5_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OltlGrammarAccess) access;
		match_AP_PKeyword_2_0_or_PKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAPAccess().getPKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAPAccess().getPKeyword_2_1()));
		match_Model_SoftFormulaeKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getModelAccess().getSoftFormulaeKeyword_5_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AP_PKeyword_2_0_or_PKeyword_2_1.equals(syntax))
				emit_AP_PKeyword_2_0_or_PKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Model_SoftFormulaeKeyword_5_0_q.equals(syntax))
				emit_Model_SoftFormulaeKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'P' | 'p'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' '-' (ambiguity) '-' name=ID
	 */
	protected void emit_AP_PKeyword_2_0_or_PKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'SoftFormulae:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     tempFormula=TempFormula (ambiguity) (rule end)
	 */
	protected void emit_Model_SoftFormulaeKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
