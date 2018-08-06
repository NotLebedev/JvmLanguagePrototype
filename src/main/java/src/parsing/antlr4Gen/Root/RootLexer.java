// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7
package src.parsing.antlr4Gen.Root;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RootLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, PUBLIC=3, PRIVATE=4, PROTECTED=5, STATIC=6, ABSTRACT=7, 
		SYNCHRONIZED=8, TRANSIENT=9, VOLATILE=10, FINAL=11, NATIVE=12, STRICTFP=13, 
		BOOLEAN=14, BYTE=15, CHAR=16, LONG=17, SHORT=18, INT=19, FLOAT=20, DOUBLE=21, 
		ID=22, STRINGCG=23, INTEGERCG=24, FLOATCG=25, CHARACTERCG=26, DOT=27, 
		SEMICOLON=28, EQUALS=29, COMMA=30, INEQUALITYOPEN=31, INEQUALITYCLOSE=32, 
		BRACEOPEN=33, BRACECLOSE=34, BRACKETOPEN=35, BRACKETCLOSE=36, MINUS=37, 
		SQUAREBRACKETOPEN=38, SQUAREBRACKETCLOSE=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", 
		"SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", "NATIVE", "STRICTFP", 
		"BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", "FLOAT", "DOUBLE", 
		"LOWCHAR", "HIGHCHAR", "DIGIT", "ID", "STRINGCG", "INTEGERCG", "FLOATCG", 
		"CHARACTERCG", "DOT", "SEMICOLON", "EQUALS", "COMMA", "INEQUALITYOPEN", 
		"INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE", 
		"MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", null, "'public'", "'private'", "'protected'", "'static'", 
		"'abstract'", "'synchronized'", "'transient'", "'volatile'", "'final'", 
		"'native'", "'strictfp'", "'boolean'", "'byte'", "'char'", "'long'", "'short'", 
		"'int'", "'float'", "'double'", null, null, null, null, null, "'.'", "';'", 
		"'='", "','", "'<'", "'>'", "'{'", "'}'", "'('", "')'", "'-'", "'\u005B'", 
		"'\u005D'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", 
		"SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", "NATIVE", "STRICTFP", 
		"BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", "FLOAT", "DOUBLE", 
		"ID", "STRINGCG", "INTEGERCG", "FLOATCG", "CHARACTERCG", "DOT", "SEMICOLON", 
		"EQUALS", "COMMA", "INEQUALITYOPEN", "INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", 
		"BRACKETOPEN", "BRACKETCLOSE", "MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE"
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


	public RootLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Root.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00f3"+
		"\n\32\3\32\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\33\3\33"+
		"\7\33\u00ff\n\33\f\33\16\33\u0102\13\33\3\33\3\33\3\34\5\34\u0107\n\34"+
		"\3\34\6\34\u010a\n\34\r\34\16\34\u010b\3\35\5\35\u010f\n\35\3\35\6\35"+
		"\u0112\n\35\r\35\16\35\u0113\3\35\5\35\u0117\n\35\3\35\7\35\u011a\n\35"+
		"\f\35\16\35\u011d\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3\u0100\2"+
		",\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\30\65\31\67\329\33;\34="+
		"\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)\3\2\4\5\2\13\f\17\17\"\"\3\2\62;\2\u0143"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7]"+
		"\3\2\2\2\td\3\2\2\2\13l\3\2\2\2\rv\3\2\2\2\17}\3\2\2\2\21\u0086\3\2\2"+
		"\2\23\u0093\3\2\2\2\25\u009d\3\2\2\2\27\u00a6\3\2\2\2\31\u00ac\3\2\2\2"+
		"\33\u00b3\3\2\2\2\35\u00bc\3\2\2\2\37\u00c4\3\2\2\2!\u00c9\3\2\2\2#\u00ce"+
		"\3\2\2\2%\u00d3\3\2\2\2\'\u00d9\3\2\2\2)\u00dd\3\2\2\2+\u00e3\3\2\2\2"+
		"-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2\63\u00f2\3\2\2\2\65\u00fc"+
		"\3\2\2\2\67\u0106\3\2\2\29\u010e\3\2\2\2;\u011e\3\2\2\2=\u0122\3\2\2\2"+
		"?\u0124\3\2\2\2A\u0126\3\2\2\2C\u0128\3\2\2\2E\u012a\3\2\2\2G\u012c\3"+
		"\2\2\2I\u012e\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2\2\2Q\u0136"+
		"\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2\2\2WX\7\f\2\2X\4\3\2\2\2YZ\t\2\2\2"+
		"Z[\3\2\2\2[\\\b\3\2\2\\\6\3\2\2\2]^\7r\2\2^_\7w\2\2_`\7d\2\2`a\7n\2\2"+
		"ab\7k\2\2bc\7e\2\2c\b\3\2\2\2de\7r\2\2ef\7t\2\2fg\7k\2\2gh\7x\2\2hi\7"+
		"c\2\2ij\7v\2\2jk\7g\2\2k\n\3\2\2\2lm\7r\2\2mn\7t\2\2no\7q\2\2op\7v\2\2"+
		"pq\7g\2\2qr\7e\2\2rs\7v\2\2st\7g\2\2tu\7f\2\2u\f\3\2\2\2vw\7u\2\2wx\7"+
		"v\2\2xy\7c\2\2yz\7v\2\2z{\7k\2\2{|\7e\2\2|\16\3\2\2\2}~\7c\2\2~\177\7"+
		"d\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7e\2\2\u0084\u0085\7v\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7{\2\2\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7j\2\2\u008b\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7k\2\2\u008f\u0090\7|\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7f\2\2\u0092\22\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7p\2\2\u0097\u0098\7u\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\24\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7r\2\2\u00bb\34\3\2"+
		"\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\36\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7j\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7t\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7i\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2"+
		"\u00d7\u00d8\7v\2\2\u00d8&\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2"+
		"\2\u00db\u00dc\7v\2\2\u00dc(\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7"+
		"n\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2*"+
		"\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7d\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9,\3\2\2\2\u00ea"+
		"\u00eb\4c|\2\u00eb.\3\2\2\2\u00ec\u00ed\4C\\\2\u00ed\60\3\2\2\2\u00ee"+
		"\u00ef\4\62;\2\u00ef\62\3\2\2\2\u00f0\u00f3\5-\27\2\u00f1\u00f3\5/\30"+
		"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f8"+
		"\5-\27\2\u00f5\u00f8\5/\30\2\u00f6\u00f8\5\61\31\2\u00f7\u00f4\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\64\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u0100\7$\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104\66\3\2\2\2\u0105\u0107\5Q)\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\t\3"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c8\3\2\2\2\u010d\u010f\5Q)\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0112\t\3\2\2\u0111\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0117\5=\37\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u011b\3\2\2\2\u0118\u011a\t\3\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c:\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011e\u011f\7)\2\2\u011f\u0120\13\2\2\2\u0120\u0121"+
		"\7)\2\2\u0121<\3\2\2\2\u0122\u0123\7\60\2\2\u0123>\3\2\2\2\u0124\u0125"+
		"\7=\2\2\u0125@\3\2\2\2\u0126\u0127\7?\2\2\u0127B\3\2\2\2\u0128\u0129\7"+
		".\2\2\u0129D\3\2\2\2\u012a\u012b\7>\2\2\u012bF\3\2\2\2\u012c\u012d\7@"+
		"\2\2\u012dH\3\2\2\2\u012e\u012f\7}\2\2\u012fJ\3\2\2\2\u0130\u0131\7\177"+
		"\2\2\u0131L\3\2\2\2\u0132\u0133\7*\2\2\u0133N\3\2\2\2\u0134\u0135\7+\2"+
		"\2\u0135P\3\2\2\2\u0136\u0137\7/\2\2\u0137R\3\2\2\2\u0138\u0139\7]\2\2"+
		"\u0139T\3\2\2\2\u013a\u013b\7_\2\2\u013bV\3\2\2\2\r\2\u00f2\u00f7\u00f9"+
		"\u0100\u0106\u010b\u010e\u0113\u0116\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}