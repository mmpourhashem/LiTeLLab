/*
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalLiTeLLabParser;
import org.xtext.example.mydsl.services.LiTeLLabGrammarAccess;

public class LiTeLLabParser extends AbstractAntlrParser {

	@Inject
	private LiTeLLabGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLiTeLLabParser createParser(XtextTokenStream stream) {
		return new InternalLiTeLLabParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LiTeLLabGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LiTeLLabGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
