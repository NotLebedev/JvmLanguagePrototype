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
		T__0=1, T__1=2, WS=3, PUBLIC=4, PRIVATE=5, PROTECTED=6, STATIC=7, ABSTRACT=8, 
		SYNCHRONIZED=9, TRANSIENT=10, VOLATILE=11, FINAL=12, NATIVE=13, STRICTFP=14, 
		BOOLEAN=15, BYTE=16, CHAR=17, LONG=18, SHORT=19, INT=20, FLOAT=21, DOUBLE=22, 
		ID=23, STRINGCG=24, INTEGERCG=25, FLOATCG=26, CHARACTERCG=27, DOT=28, 
		SEMICOLON=29, EQUALS=30, COMMA=31, INEQUALITYOPEN=32, INEQUALITYCLOSE=33, 
		BRACEOPEN=34, BRACECLOSE=35, BRACKETOPEN=36, BRACKETCLOSE=37, MINUS=38, 
		SQUAREBRACKETOPEN=39, SQUAREBRACKETCLOSE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", 
		"SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", "NATIVE", "STRICTFP", 
		"BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", "FLOAT", "DOUBLE", 
		"LOWCHAR", "HIGHCHAR", "DIGIT", "ID", "STRINGCG", "INTEGERCG", "FLOATCG", 
		"CHARACTERCG", "DOT", "SEMICOLON", "EQUALS", "COMMA", "INEQUALITYOPEN", 
		"INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE", 
		"MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'new'", "'\n'", null, "'public'", "'private'", "'protected'", "'static'", 
		"'abstract'", "'synchronized'", "'transient'", "'volatile'", "'final'", 
		"'native'", "'strictfp'", "'boolean'", "'byte'", "'char'", "'long'", "'short'", 
		"'int'", "'float'", "'double'", null, null, null, null, null, "'.'", "';'", 
		"'='", "','", "'<'", "'>'", "'{'", "'}'", "'('", "')'", "'-'", "'\u005B'", 
		"'\u005D'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\5\33\u00f9\n\33\3\33\3\33\3\33\7\33\u00fe\n\33\f"+
		"\33\16\33\u0101\13\33\3\34\3\34\7\34\u0105\n\34\f\34\16\34\u0108\13\34"+
		"\3\34\3\34\3\35\5\35\u010d\n\35\3\35\6\35\u0110\n\35\r\35\16\35\u0111"+
		"\3\36\5\36\u0115\n\36\3\36\6\36\u0118\n\36\r\36\16\36\u0119\3\36\5\36"+
		"\u011d\n\36\3\36\7\36\u0120\n\36\f\36\16\36\u0123\13\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3\u0106\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61"+
		"\2\63\2\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*\3\2\4"+
		"\5\2\13\f\17\17\"\"\3\2\62;\2\u0149\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\tc\3\2\2\2\13j\3"+
		"\2\2\2\rr\3\2\2\2\17|\3\2\2\2\21\u0083\3\2\2\2\23\u008c\3\2\2\2\25\u0099"+
		"\3\2\2\2\27\u00a3\3\2\2\2\31\u00ac\3\2\2\2\33\u00b2\3\2\2\2\35\u00b9\3"+
		"\2\2\2\37\u00c2\3\2\2\2!\u00ca\3\2\2\2#\u00cf\3\2\2\2%\u00d4\3\2\2\2\'"+
		"\u00d9\3\2\2\2)\u00df\3\2\2\2+\u00e3\3\2\2\2-\u00e9\3\2\2\2/\u00f0\3\2"+
		"\2\2\61\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f8\3\2\2\2\67\u0102\3\2\2"+
		"\29\u010c\3\2\2\2;\u0114\3\2\2\2=\u0124\3\2\2\2?\u0128\3\2\2\2A\u012a"+
		"\3\2\2\2C\u012c\3\2\2\2E\u012e\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0134\3\2\2\2M\u0136\3\2\2\2O\u0138\3\2\2\2Q\u013a\3\2\2\2S\u013c\3\2"+
		"\2\2U\u013e\3\2\2\2W\u0140\3\2\2\2YZ\7p\2\2Z[\7g\2\2[\\\7y\2\2\\\4\3\2"+
		"\2\2]^\7\f\2\2^\6\3\2\2\2_`\t\2\2\2`a\3\2\2\2ab\b\4\2\2b\b\3\2\2\2cd\7"+
		"r\2\2de\7w\2\2ef\7d\2\2fg\7n\2\2gh\7k\2\2hi\7e\2\2i\n\3\2\2\2jk\7r\2\2"+
		"kl\7t\2\2lm\7k\2\2mn\7x\2\2no\7c\2\2op\7v\2\2pq\7g\2\2q\f\3\2\2\2rs\7"+
		"r\2\2st\7t\2\2tu\7q\2\2uv\7v\2\2vw\7g\2\2wx\7e\2\2xy\7v\2\2yz\7g\2\2z"+
		"{\7f\2\2{\16\3\2\2\2|}\7u\2\2}~\7v\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7e\2\2\u0082\20\3\2\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7d\2\2\u0085\u0086\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2"+
		"\u0088\u0089\7c\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\22\3\2"+
		"\2\2\u008c\u008d\7u\2\2\u008d\u008e\7{\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7e\2\2\u0090\u0091\7j\2\2\u0091\u0092\7t\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7p\2\2\u0094\u0095\7k\2\2\u0095\u0096\7|\2\2\u0096\u0097\7g\2\2"+
		"\u0097\u0098\7f\2\2\u0098\24\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b\7"+
		"t\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\u009e\7u\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7"+
		"k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\32"+
		"\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7g\2\2\u00b8\34\3\2\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2"+
		"\u00bd\u00be\7e\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7r\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7{\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0"+
		"\u00d1\7j\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3$\3\2\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7i\2\2"+
		"\u00d8&\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7q\2"+
		"\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7v\2\2\u00de(\3\2\2\2\u00df\u00e0\7"+
		"k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2*\3\2\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7w\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef.\3\2\2\2\u00f0\u00f1\4c|\2\u00f1\60\3\2\2\2\u00f2\u00f3\4C\\\2"+
		"\u00f3\62\3\2\2\2\u00f4\u00f5\4\62;\2\u00f5\64\3\2\2\2\u00f6\u00f9\5/"+
		"\30\2\u00f7\u00f9\5\61\31\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00ff\3\2\2\2\u00fa\u00fe\5/\30\2\u00fb\u00fe\5\61\31\2\u00fc\u00fe\5"+
		"\63\32\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\66\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u0106\7$\2\2\u0103\u0105\13\2\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7$\2\2\u010a8\3\2\2\2\u010b"+
		"\u010d\5S*\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2"+
		"\2\u010e\u0110\t\3\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112:\3\2\2\2\u0113\u0115\5S*\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\t\3\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u011d\5? \2\u011c\u011b\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122<\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0126\13\2\2\2\u0126\u0127"+
		"\7)\2\2\u0127>\3\2\2\2\u0128\u0129\7\60\2\2\u0129@\3\2\2\2\u012a\u012b"+
		"\7=\2\2\u012bB\3\2\2\2\u012c\u012d\7?\2\2\u012dD\3\2\2\2\u012e\u012f\7"+
		".\2\2\u012fF\3\2\2\2\u0130\u0131\7>\2\2\u0131H\3\2\2\2\u0132\u0133\7@"+
		"\2\2\u0133J\3\2\2\2\u0134\u0135\7}\2\2\u0135L\3\2\2\2\u0136\u0137\7\177"+
		"\2\2\u0137N\3\2\2\2\u0138\u0139\7*\2\2\u0139P\3\2\2\2\u013a\u013b\7+\2"+
		"\2\u013bR\3\2\2\2\u013c\u013d\7/\2\2\u013dT\3\2\2\2\u013e\u013f\7]\2\2"+
		"\u013fV\3\2\2\2\u0140\u0141\7_\2\2\u0141X\3\2\2\2\r\2\u00f8\u00fd\u00ff"+
		"\u0106\u010c\u0111\u0114\u0119\u011c\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}