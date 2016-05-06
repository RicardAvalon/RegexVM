// Generated from C:/Users/biao.yu/IdeaProjects/regexvm/src/main/resources\Regex.g4 by ANTLR 4.5.1
package oaibuy.regex.antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ESCAPE=13, CHAR=14, NONBRACKET=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "ESCAPE", "CHAR", "NONBRACKET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'*?'", "'+?'", "'??'", "'*'", "'+'", "'?'", "'|'", "'['", 
		"']'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ESCAPE", "CHAR", "NONBRACKET"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RegexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Regex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16Q\n\16\3\17\3\17"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\4\7\2*-\60\60AA]_~~\3\2^_^\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7&\3\2\2\2\t)\3"+
		"\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\62\3\2\2\2\23\64\3\2\2"+
		"\2\25\66\3\2\2\2\278\3\2\2\2\31:\3\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3"+
		"\2\2\2!\"\7\60\2\2\"\4\3\2\2\2#$\7,\2\2$%\7A\2\2%\6\3\2\2\2&\'\7-\2\2"+
		"\'(\7A\2\2(\b\3\2\2\2)*\7A\2\2*+\7A\2\2+\n\3\2\2\2,-\7,\2\2-\f\3\2\2\2"+
		"./\7-\2\2/\16\3\2\2\2\60\61\7A\2\2\61\20\3\2\2\2\62\63\7~\2\2\63\22\3"+
		"\2\2\2\64\65\7]\2\2\65\24\3\2\2\2\66\67\7_\2\2\67\26\3\2\2\289\7*\2\2"+
		"9\30\3\2\2\2:;\7+\2\2;\32\3\2\2\2<=\7^\2\2=Q\7^\2\2>?\7^\2\2?Q\7~\2\2"+
		"@A\7^\2\2AQ\7,\2\2BC\7^\2\2CQ\7A\2\2DE\7^\2\2EQ\7-\2\2FG\7^\2\2GQ\7*\2"+
		"\2HI\7^\2\2IQ\7+\2\2JK\7^\2\2KQ\7\60\2\2LM\7^\2\2MQ\7]\2\2NO\7^\2\2OQ"+
		"\7_\2\2P<\3\2\2\2P>\3\2\2\2P@\3\2\2\2PB\3\2\2\2PD\3\2\2\2PF\3\2\2\2PH"+
		"\3\2\2\2PJ\3\2\2\2PL\3\2\2\2PN\3\2\2\2Q\34\3\2\2\2RS\n\2\2\2S\36\3\2\2"+
		"\2TU\n\3\2\2U \3\2\2\2\4\2P\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}