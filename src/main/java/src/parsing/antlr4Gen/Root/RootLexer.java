// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7
package src.parsing.antlr4Gen.Root;
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
		SQUAREBRACKETOPEN=38, SQUAREBRACKETCLOSE=39, PLUS=40, ASTERISK=41, SLASH=42;
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
		"MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE", "PLUS", "ASTERISK", 
		"SLASH"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'new'", null, "'public'", "'private'", "'protected'", "'static'", 
		"'abstract'", "'synchronized'", "'transient'", "'volatile'", "'final'", 
		"'native'", "'strictfp'", "'boolean'", "'byte'", "'char'", "'long'", "'short'", 
		"'int'", "'float'", "'double'", null, null, null, null, null, "'.'", "';'", 
		"'='", "','", "'<'", "'>'", "'{'", "'}'", "'('", "')'", "'-'", "'\u005B'", 
		"'\u005D'", "'+'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", 
		"SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", "NATIVE", "STRICTFP", 
		"BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", "FLOAT", "DOUBLE", 
		"ID", "STRINGCG", "INTEGERCG", "FLOATCG", "CHARACTERCG", "DOT", "SEMICOLON", 
		"EQUALS", "COMMA", "INEQUALITYOPEN", "INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", 
		"BRACKETOPEN", "BRACKETCLOSE", "MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE", 
		"PLUS", "ASTERISK", "SLASH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\5\32\u00fb\n\32\3\32\3\32\3\32\7\32\u0100\n\32\f\32"+
		"\16\32\u0103\13\32\3\33\3\33\7\33\u0107\n\33\f\33\16\33\u010a\13\33\3"+
		"\33\3\33\3\34\5\34\u010f\n\34\3\34\6\34\u0112\n\34\r\34\16\34\u0113\3"+
		"\35\5\35\u0117\n\35\3\35\6\35\u011a\n\35\r\35\16\35\u011b\3\35\5\35\u011f"+
		"\n\35\3\35\7\35\u0122\n\35\f\35\16\35\u0125\13\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3\u0108\2/\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\61\2\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q"+
		"\'S(U)W*Y+[,\3\2\4\5\2\13\f\17\17\"\"\3\2\62;\2\u0151\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2"+
		"\2\5a\3\2\2\2\7e\3\2\2\2\tl\3\2\2\2\13t\3\2\2\2\r~\3\2\2\2\17\u0085\3"+
		"\2\2\2\21\u008e\3\2\2\2\23\u009b\3\2\2\2\25\u00a5\3\2\2\2\27\u00ae\3\2"+
		"\2\2\31\u00b4\3\2\2\2\33\u00bb\3\2\2\2\35\u00c4\3\2\2\2\37\u00cc\3\2\2"+
		"\2!\u00d1\3\2\2\2#\u00d6\3\2\2\2%\u00db\3\2\2\2\'\u00e1\3\2\2\2)\u00e5"+
		"\3\2\2\2+\u00eb\3\2\2\2-\u00f2\3\2\2\2/\u00f4\3\2\2\2\61\u00f6\3\2\2\2"+
		"\63\u00fa\3\2\2\2\65\u0104\3\2\2\2\67\u010e\3\2\2\29\u0116\3\2\2\2;\u0126"+
		"\3\2\2\2=\u012a\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0130\3\2\2\2E"+
		"\u0132\3\2\2\2G\u0134\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2\2\2M\u013a\3\2"+
		"\2\2O\u013c\3\2\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142\3\2\2\2W\u0144"+
		"\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2\2\2]^\7p\2\2^_\7g\2\2_`\7y\2\2`\4\3"+
		"\2\2\2ab\t\2\2\2bc\3\2\2\2cd\b\3\2\2d\6\3\2\2\2ef\7r\2\2fg\7w\2\2gh\7"+
		"d\2\2hi\7n\2\2ij\7k\2\2jk\7e\2\2k\b\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2"+
		"op\7x\2\2pq\7c\2\2qr\7v\2\2rs\7g\2\2s\n\3\2\2\2tu\7r\2\2uv\7t\2\2vw\7"+
		"q\2\2wx\7v\2\2xy\7g\2\2yz\7e\2\2z{\7v\2\2{|\7g\2\2|}\7f\2\2}\f\3\2\2\2"+
		"~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7e\2\2\u0084\16\3\2\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7d\2\2\u0087\u0088\7u\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d\20\3\2"+
		"\2\2\u008e\u008f\7u\2\2\u008f\u0090\7{\2\2\u0090\u0091\7p\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7j\2\2\u0093\u0094\7t\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7k\2\2\u0097\u0098\7|\2\2\u0098\u0099\7g\2\2"+
		"\u0099\u009a\7f\2\2\u009a\22\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7"+
		"t\2\2\u009d\u009e\7c\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\24\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7"+
		"k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\30"+
		"\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\32\3\2\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2"+
		"\u00bf\u00c0\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3"+
		"\7r\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7{\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7e\2\2\u00d2"+
		"\u00d3\7j\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5\"\3\2\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7i\2\2"+
		"\u00da$\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7q\2"+
		"\2\u00de\u00df\7t\2\2\u00df\u00e0\7v\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7"+
		"k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4(\3\2\2\2\u00e5\u00e6"+
		"\7h\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7w\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1,\3\2\2\2\u00f2\u00f3\4c|\2\u00f3.\3\2\2\2\u00f4\u00f5\4C\\\2\u00f5"+
		"\60\3\2\2\2\u00f6\u00f7\4\62;\2\u00f7\62\3\2\2\2\u00f8\u00fb\5-\27\2\u00f9"+
		"\u00fb\5/\30\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u0101\3\2"+
		"\2\2\u00fc\u0100\5-\27\2\u00fd\u0100\5/\30\2\u00fe\u0100\5\61\31\2\u00ff"+
		"\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\64\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0108\7$\2\2\u0105\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7$\2\2\u010c\66\3\2\2\2\u010d\u010f"+
		"\5Q)\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0112\t\3\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u01148\3\2\2\2\u0115\u0117\5Q)\2\u0116\u0115"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\t\3\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5=\37\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u0122\t\3\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		":\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7)\2\2\u0127\u0128\13\2\2\2"+
		"\u0128\u0129\7)\2\2\u0129<\3\2\2\2\u012a\u012b\7\60\2\2\u012b>\3\2\2\2"+
		"\u012c\u012d\7=\2\2\u012d@\3\2\2\2\u012e\u012f\7?\2\2\u012fB\3\2\2\2\u0130"+
		"\u0131\7.\2\2\u0131D\3\2\2\2\u0132\u0133\7>\2\2\u0133F\3\2\2\2\u0134\u0135"+
		"\7@\2\2\u0135H\3\2\2\2\u0136\u0137\7}\2\2\u0137J\3\2\2\2\u0138\u0139\7"+
		"\177\2\2\u0139L\3\2\2\2\u013a\u013b\7*\2\2\u013bN\3\2\2\2\u013c\u013d"+
		"\7+\2\2\u013dP\3\2\2\2\u013e\u013f\7/\2\2\u013fR\3\2\2\2\u0140\u0141\7"+
		"]\2\2\u0141T\3\2\2\2\u0142\u0143\7_\2\2\u0143V\3\2\2\2\u0144\u0145\7-"+
		"\2\2\u0145X\3\2\2\2\u0146\u0147\7,\2\2\u0147Z\3\2\2\2\u0148\u0149\7\61"+
		"\2\2\u0149\\\3\2\2\2\r\2\u00fa\u00ff\u0101\u0108\u010e\u0113\u0116\u011b"+
		"\u011e\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}