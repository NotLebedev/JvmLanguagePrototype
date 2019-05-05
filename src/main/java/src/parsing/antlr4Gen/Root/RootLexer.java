package src.parsing.antlr4Gen.Root;// Generated from C:/Users/Tema.leog-PC/IdeaProjects/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RootLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, NEW=4, PUBLIC=5, PRIVATE=6, PROTECTED=7, 
		STATIC=8, ABSTRACT=9, SYNCHRONIZED=10, TRANSIENT=11, VOLATILE=12, FINAL=13, 
		NATIVE=14, STRICTFP=15, BOOLEAN=16, BYTE=17, CHAR=18, LONG=19, SHORT=20, 
		INT=21, FLOAT=22, DOUBLE=23, ID=24, STRINGCG=25, INTEGERCG=26, LONGCG=27, 
		FLOATCG=28, CHARACTERCG=29, DOT=30, SEMICOLON=31, EQUALS=32, COMMA=33, 
		INEQUALITYOPEN=34, INEQUALITYCLOSE=35, BRACEOPEN=36, BRACECLOSE=37, BRACKETOPEN=38, 
		BRACKETCLOSE=39, MINUS=40, SQUAREBRACKETOPEN=41, SQUAREBRACKETCLOSE=42, 
		PLUS=43, ASTERISK=44, SLASH=45, INCREMENT=46, DECREMENT=47, PERCENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LINE_COMMENT", "WS", "NEW", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "ABSTRACT", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", 
			"NATIVE", "STRICTFP", "BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", 
			"FLOAT", "DOUBLE", "LOWCHAR", "HIGHCHAR", "DIGIT", "ID", "STRINGCG", 
			"INTEGERCG", "LONGCG", "FLOATCG", "CHARACTERCG", "DOT", "SEMICOLON", 
			"EQUALS", "COMMA", "INEQUALITYOPEN", "INEQUALITYCLOSE", "BRACEOPEN", 
			"BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE", "MINUS", "SQUAREBRACKETOPEN", 
			"SQUAREBRACKETCLOSE", "PLUS", "ASTERISK", "SLASH", "INCREMENT", "DECREMENT", 
			"PERCENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'new'", "'public'", "'private'", "'protected'", 
			"'static'", "'abstract'", "'synchronized'", "'transient'", "'volatile'", 
			"'final'", "'native'", "'strictfp'", "'boolean'", "'byte'", "'char'", 
			"'long'", "'short'", "'int'", "'float'", "'double'", null, null, null, 
			null, null, null, "'.'", "';'", "'='", "','", "'<'", "'>'", "'{'", "'}'", 
			"'('", "')'", "'-'", "'\u005B'", "'\u005D'", "'+'", "'*'", "'/'", "'++'", 
			"'--'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "NEW", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "ABSTRACT", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL", 
			"NATIVE", "STRICTFP", "BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT", 
			"FLOAT", "DOUBLE", "ID", "STRINGCG", "INTEGERCG", "LONGCG", "FLOATCG", 
			"CHARACTERCG", "DOT", "SEMICOLON", "EQUALS", "COMMA", "INEQUALITYOPEN", 
			"INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE", 
			"MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE", "PLUS", "ASTERISK", 
			"SLASH", "INCREMENT", "DECREMENT", "PERCENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34"+
		"\u0120\n\34\3\34\3\34\3\34\7\34\u0125\n\34\f\34\16\34\u0128\13\34\3\35"+
		"\3\35\7\35\u012c\n\35\f\35\16\35\u012f\13\35\3\35\3\35\3\36\5\36\u0134"+
		"\n\36\3\36\6\36\u0137\n\36\r\36\16\36\u0138\3\37\3\37\3\37\3 \5 \u013f"+
		"\n \3 \6 \u0142\n \r \16 \u0143\3 \5 \u0147\n \3 \7 \u014a\n \f \16 \u014d"+
		"\13 \3 \3 \5 \u0151\n \3 \5 \u0154\n \3 \6 \u0157\n \r \16 \u0158\3 \5"+
		" \u015c\n \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\4o\u012d\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q"+
		"\'S(U)W*Y+[,]-_.a/c\60e\61g\62\3\2\7\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\3\2\62;\4\2NNnn\4\2HHhh\2\u0196\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5w\3\2\2\2\7\u0082\3\2\2\2"+
		"\t\u0086\3\2\2\2\13\u008a\3\2\2\2\r\u0091\3\2\2\2\17\u0099\3\2\2\2\21"+
		"\u00a3\3\2\2\2\23\u00aa\3\2\2\2\25\u00b3\3\2\2\2\27\u00c0\3\2\2\2\31\u00ca"+
		"\3\2\2\2\33\u00d3\3\2\2\2\35\u00d9\3\2\2\2\37\u00e0\3\2\2\2!\u00e9\3\2"+
		"\2\2#\u00f1\3\2\2\2%\u00f6\3\2\2\2\'\u00fb\3\2\2\2)\u0100\3\2\2\2+\u0106"+
		"\3\2\2\2-\u010a\3\2\2\2/\u0110\3\2\2\2\61\u0117\3\2\2\2\63\u0119\3\2\2"+
		"\2\65\u011b\3\2\2\2\67\u011f\3\2\2\29\u0129\3\2\2\2;\u0133\3\2\2\2=\u013a"+
		"\3\2\2\2?\u015b\3\2\2\2A\u015d\3\2\2\2C\u0161\3\2\2\2E\u0163\3\2\2\2G"+
		"\u0165\3\2\2\2I\u0167\3\2\2\2K\u0169\3\2\2\2M\u016b\3\2\2\2O\u016d\3\2"+
		"\2\2Q\u016f\3\2\2\2S\u0171\3\2\2\2U\u0173\3\2\2\2W\u0175\3\2\2\2Y\u0177"+
		"\3\2\2\2[\u0179\3\2\2\2]\u017b\3\2\2\2_\u017d\3\2\2\2a\u017f\3\2\2\2c"+
		"\u0181\3\2\2\2e\u0184\3\2\2\2g\u0187\3\2\2\2ij\7\61\2\2jk\7,\2\2ko\3\2"+
		"\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3"+
		"\2\2\2rs\7,\2\2st\7\61\2\2tu\3\2\2\2uv\b\2\2\2v\4\3\2\2\2wx\7\61\2\2x"+
		"y\7\61\2\2y}\3\2\2\2z|\n\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\3\2\2\u0081\6\3\2\2\2\u0082"+
		"\u0083\t\3\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\4\2\2\u0085\b\3\2\2\2"+
		"\u0086\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088\u0089\7y\2\2\u0089\n\3\2"+
		"\2\2\u008a\u008b\7r\2\2\u008b\u008c\7w\2\2\u008c\u008d\7d\2\2\u008d\u008e"+
		"\7n\2\2\u008e\u008f\7k\2\2\u008f\u0090\7e\2\2\u0090\f\3\2\2\2\u0091\u0092"+
		"\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7x\2\2\u0095"+
		"\u0096\7c\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c\7q\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7g\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7f\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7e\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7d\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7e\2\2\u00b1\u00b2\7v\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7"+
		"u\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8"+
		"\7j\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7|\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7f\2\2"+
		"\u00bf\26\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7"+
		"c\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\30\3\2\2\2\u00ca\u00cb"+
		"\7x\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2\32\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7"+
		"p\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\34\3\2\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7x\2\2\u00de\u00df\7g\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7e\2\2"+
		"\u00e5\u00e6\7v\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7r\2\2\u00e8 \3\2\2"+
		"\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\"\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7{\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7j\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7t\2\2\u00fa&\3\2\2\2\u00fb\u00fc\7n\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7i\2\2\u00ff(\3\2\2\2\u0100"+
		"\u0101\7u\2\2\u0101\u0102\7j\2\2\u0102\u0103\7q\2\2\u0103\u0104\7t\2\2"+
		"\u0104\u0105\7v\2\2\u0105*\3\2\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2"+
		"\2\u0108\u0109\7v\2\2\u0109,\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7"+
		"n\2\2\u010c\u010d\7q\2\2\u010d\u010e\7c\2\2\u010e\u010f\7v\2\2\u010f."+
		"\3\2\2\2\u0110\u0111\7f\2\2\u0111\u0112\7q\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2\u0116\60\3\2\2\2\u0117"+
		"\u0118\4c|\2\u0118\62\3\2\2\2\u0119\u011a\4C\\\2\u011a\64\3\2\2\2\u011b"+
		"\u011c\4\62;\2\u011c\66\3\2\2\2\u011d\u0120\5\61\31\2\u011e\u0120\5\63"+
		"\32\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0126\3\2\2\2\u0121"+
		"\u0125\5\61\31\2\u0122\u0125\5\63\32\2\u0123\u0125\5\65\33\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u01278\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012d\7$\2\2\u012a\u012c\13\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\7$\2\2\u0131:\3\2\2\2\u0132\u0134\5W,\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\t\4"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139<\3\2\2\2\u013a\u013b\5;\36\2\u013b\u013c\t\5\2\2"+
		"\u013c>\3\2\2\2\u013d\u013f\5W,\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u0142\t\4\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0147\5C\"\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u014b\3\2\2\2\u0148\u014a\t\4\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\t\6\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u014f\3\2\2\2\u0151\u015c\3\2\2\2\u0152\u0154\5W,\2\u0153\u0152"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\t\4\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015c\t\6\2\2\u015b\u013e\3\2\2\2\u015b"+
		"\u0153\3\2\2\2\u015c@\3\2\2\2\u015d\u015e\7)\2\2\u015e\u015f\13\2\2\2"+
		"\u015f\u0160\7)\2\2\u0160B\3\2\2\2\u0161\u0162\7\60\2\2\u0162D\3\2\2\2"+
		"\u0163\u0164\7=\2\2\u0164F\3\2\2\2\u0165\u0166\7?\2\2\u0166H\3\2\2\2\u0167"+
		"\u0168\7.\2\2\u0168J\3\2\2\2\u0169\u016a\7>\2\2\u016aL\3\2\2\2\u016b\u016c"+
		"\7@\2\2\u016cN\3\2\2\2\u016d\u016e\7}\2\2\u016eP\3\2\2\2\u016f\u0170\7"+
		"\177\2\2\u0170R\3\2\2\2\u0171\u0172\7*\2\2\u0172T\3\2\2\2\u0173\u0174"+
		"\7+\2\2\u0174V\3\2\2\2\u0175\u0176\7/\2\2\u0176X\3\2\2\2\u0177\u0178\7"+
		"]\2\2\u0178Z\3\2\2\2\u0179\u017a\7_\2\2\u017a\\\3\2\2\2\u017b\u017c\7"+
		"-\2\2\u017c^\3\2\2\2\u017d\u017e\7,\2\2\u017e`\3\2\2\2\u017f\u0180\7\61"+
		"\2\2\u0180b\3\2\2\2\u0181\u0182\7-\2\2\u0182\u0183\7-\2\2\u0183d\3\2\2"+
		"\2\u0184\u0185\7/\2\2\u0185\u0186\7/\2\2\u0186f\3\2\2\2\u0187\u0188\7"+
		"\'\2\2\u0188h\3\2\2\2\23\2o}\u011f\u0124\u0126\u012d\u0133\u0138\u013e"+
		"\u0143\u0146\u014b\u0150\u0153\u0158\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}