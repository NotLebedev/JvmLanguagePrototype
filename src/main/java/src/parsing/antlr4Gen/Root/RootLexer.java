// Generated from C:/Users/Tema/IdeaProjects/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
package src.parsing.antlr4Gen.Root;
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
		PLUS=43, ASTERISK=44, SLASH=45;
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
			"SQUAREBRACKETCLOSE", "PLUS", "ASTERISK", "SLASH"
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
			"'('", "')'", "'-'", "'\u005B'", "'\u005D'", "'+'", "'*'", "'/'"
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
			"SLASH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\7\2h\n\2\f"+
		"\2\16\2k\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3v\n\3\f\3\16\3y\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\5\34\u011a\n\34\3\34\3\34\3\34\7\34\u011f\n"+
		"\34\f\34\16\34\u0122\13\34\3\35\3\35\7\35\u0126\n\35\f\35\16\35\u0129"+
		"\13\35\3\35\3\35\3\36\5\36\u012e\n\36\3\36\6\36\u0131\n\36\r\36\16\36"+
		"\u0132\3\37\3\37\3\37\3 \5 \u0139\n \3 \6 \u013c\n \r \16 \u013d\3 \5"+
		" \u0141\n \3 \7 \u0144\n \f \16 \u0147\13 \3 \3 \5 \u014b\n \3!\3!\3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\4i\u0127\2\62\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E"+
		"!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/\3\2\7\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\3\2\62;\4\2NNnn\4\2HHhh\2\u017a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3"+
		"c\3\2\2\2\5q\3\2\2\2\7|\3\2\2\2\t\u0080\3\2\2\2\13\u0084\3\2\2\2\r\u008b"+
		"\3\2\2\2\17\u0093\3\2\2\2\21\u009d\3\2\2\2\23\u00a4\3\2\2\2\25\u00ad\3"+
		"\2\2\2\27\u00ba\3\2\2\2\31\u00c4\3\2\2\2\33\u00cd\3\2\2\2\35\u00d3\3\2"+
		"\2\2\37\u00da\3\2\2\2!\u00e3\3\2\2\2#\u00eb\3\2\2\2%\u00f0\3\2\2\2\'\u00f5"+
		"\3\2\2\2)\u00fa\3\2\2\2+\u0100\3\2\2\2-\u0104\3\2\2\2/\u010a\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0113\3\2\2\2\65\u0115\3\2\2\2\67\u0119\3\2\2\29\u0123"+
		"\3\2\2\2;\u012d\3\2\2\2=\u0134\3\2\2\2?\u0138\3\2\2\2A\u014c\3\2\2\2C"+
		"\u0150\3\2\2\2E\u0152\3\2\2\2G\u0154\3\2\2\2I\u0156\3\2\2\2K\u0158\3\2"+
		"\2\2M\u015a\3\2\2\2O\u015c\3\2\2\2Q\u015e\3\2\2\2S\u0160\3\2\2\2U\u0162"+
		"\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2[\u0168\3\2\2\2]\u016a\3\2\2\2_"+
		"\u016c\3\2\2\2a\u016e\3\2\2\2cd\7\61\2\2de\7,\2\2ei\3\2\2\2fh\13\2\2\2"+
		"gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7,\2\2"+
		"mn\7\61\2\2no\3\2\2\2op\b\2\2\2p\4\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2"+
		"\2\2tv\n\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2"+
		"\2\2z{\b\3\2\2{\6\3\2\2\2|}\t\3\2\2}~\3\2\2\2~\177\b\4\2\2\177\b\3\2\2"+
		"\2\u0080\u0081\7p\2\2\u0081\u0082\7g\2\2\u0082\u0083\7y\2\2\u0083\n\3"+
		"\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7w\2\2\u0086\u0087\7d\2\2\u0087"+
		"\u0088\7n\2\2\u0088\u0089\7k\2\2\u0089\u008a\7e\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7x\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092\16\3\2"+
		"\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t\2\2\u0095\u0096\7q\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7e\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7f\2\2\u009c\20\3\2\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2"+
		"\u00a2\u00a3\7e\2\2\u00a3\22\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7"+
		"d\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\24\3\2\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7{\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7e\2\2\u00b1"+
		"\u00b2\7j\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\u00b6\7k\2\2\u00b6\u00b7\7|\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7f\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\30\3\2\2\2\u00c4"+
		"\u00c5\7x\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\34\3\2\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7x\2\2\u00d8\u00d9\7g\2\2\u00d9\36\3\2\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7e\2\2"+
		"\u00df\u00e0\7v\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7r\2\2\u00e2 \3\2\2"+
		"\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\"\3\2\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7{\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7j\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7i\2\2\u00f9(\3\2\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2"+
		"\u00fe\u00ff\7v\2\2\u00ff*\3\2\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2"+
		"\2\u0102\u0103\7v\2\2\u0103,\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106\7"+
		"n\2\2\u0106\u0107\7q\2\2\u0107\u0108\7c\2\2\u0108\u0109\7v\2\2\u0109."+
		"\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7q\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7d\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110\60\3\2\2\2\u0111"+
		"\u0112\4c|\2\u0112\62\3\2\2\2\u0113\u0114\4C\\\2\u0114\64\3\2\2\2\u0115"+
		"\u0116\4\62;\2\u0116\66\3\2\2\2\u0117\u011a\5\61\31\2\u0118\u011a\5\63"+
		"\32\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u0120\3\2\2\2\u011b"+
		"\u011f\5\61\31\2\u011c\u011f\5\63\32\2\u011d\u011f\5\65\33\2\u011e\u011b"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u01218\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0127\7$\2\2\u0124\u0126\13\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7$\2\2\u012b:\3\2\2\2\u012c\u012e\5W,\2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\t\4"+
		"\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133<\3\2\2\2\u0134\u0135\5;\36\2\u0135\u0136\t\5\2\2"+
		"\u0136>\3\2\2\2\u0137\u0139\5W,\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u013c\t\4\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u0141\5C\"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0145\3\2\2\2\u0142\u0144\t\4\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u014a\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u014b\t\6\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u0149\3\2\2\2\u014b@\3\2\2\2\u014c\u014d\7)\2\2\u014d\u014e"+
		"\13\2\2\2\u014e\u014f\7)\2\2\u014fB\3\2\2\2\u0150\u0151\7\60\2\2\u0151"+
		"D\3\2\2\2\u0152\u0153\7=\2\2\u0153F\3\2\2\2\u0154\u0155\7?\2\2\u0155H"+
		"\3\2\2\2\u0156\u0157\7.\2\2\u0157J\3\2\2\2\u0158\u0159\7>\2\2\u0159L\3"+
		"\2\2\2\u015a\u015b\7@\2\2\u015bN\3\2\2\2\u015c\u015d\7}\2\2\u015dP\3\2"+
		"\2\2\u015e\u015f\7\177\2\2\u015fR\3\2\2\2\u0160\u0161\7*\2\2\u0161T\3"+
		"\2\2\2\u0162\u0163\7+\2\2\u0163V\3\2\2\2\u0164\u0165\7/\2\2\u0165X\3\2"+
		"\2\2\u0166\u0167\7]\2\2\u0167Z\3\2\2\2\u0168\u0169\7_\2\2\u0169\\\3\2"+
		"\2\2\u016a\u016b\7-\2\2\u016b^\3\2\2\2\u016c\u016d\7,\2\2\u016d`\3\2\2"+
		"\2\u016e\u016f\7\61\2\2\u016fb\3\2\2\2\20\2iw\u0119\u011e\u0120\u0127"+
		"\u012d\u0132\u0138\u013d\u0140\u0145\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}