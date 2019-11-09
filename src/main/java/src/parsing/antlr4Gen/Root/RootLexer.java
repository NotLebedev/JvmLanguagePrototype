// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
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
		PLUS=43, ASTERISK=44, SLASH=45, INCREMENT=46, DECREMENT=47, PERCENT=48, 
		INVERT=49, RSHIFT=50, RSHIFTSHIFT=51, LSHIFT=52, BITAND=53, BITXOR=54, 
		BITOR=55, LESS_EQUAL=56, MORE_EQUAL=57, EQUAL=58, NOT_EQUAL=59;
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
			"PERCENT", "INVERT", "RSHIFT", "RSHIFTSHIFT", "LSHIFT", "BITAND", "BITXOR", 
			"BITOR", "LESS_EQUAL", "MORE_EQUAL", "EQUAL", "NOT_EQUAL"
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
			"'--'", "'%'", "'~'", "'>>'", "'>>>'", "'<<'", "'&'", "'^'", "'|'", "'<= '", 
			"'>='", "'=='", "'!='"
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
			"SLASH", "INCREMENT", "DECREMENT", "PERCENT", "INVERT", "RSHIFT", "RSHIFTSHIFT", 
			"LSHIFT", "BITAND", "BITXOR", "BITOR", "LESS_EQUAL", "MORE_EQUAL", "EQUAL", 
			"NOT_EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\5\34\u0136\n\34\3\34\3\34\3\34\7\34\u013b\n\34\f\34\16"+
		"\34\u013e\13\34\3\35\3\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35\3\35"+
		"\3\35\3\36\5\36\u014a\n\36\3\36\6\36\u014d\n\36\r\36\16\36\u014e\3\37"+
		"\3\37\3\37\3 \5 \u0155\n \3 \6 \u0158\n \r \16 \u0159\3 \5 \u015d\n \3"+
		" \7 \u0160\n \f \16 \u0163\13 \3 \3 \5 \u0167\n \3 \5 \u016a\n \3 \6 "+
		"\u016d\n \r \16 \u016e\3 \5 \u0172\n \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3<"+
		"\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\4\u0085\u0143\2@\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E!G\"I#K$M"+
		"%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\3\2"+
		"\7\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\4\2NNnn\4\2HHhh\2\u01cb\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u0098\3\2\2\2\t\u009c\3\2\2\2\13\u00a0\3\2\2\2\r\u00a7\3\2"+
		"\2\2\17\u00af\3\2\2\2\21\u00b9\3\2\2\2\23\u00c0\3\2\2\2\25\u00c9\3\2\2"+
		"\2\27\u00d6\3\2\2\2\31\u00e0\3\2\2\2\33\u00e9\3\2\2\2\35\u00ef\3\2\2\2"+
		"\37\u00f6\3\2\2\2!\u00ff\3\2\2\2#\u0107\3\2\2\2%\u010c\3\2\2\2\'\u0111"+
		"\3\2\2\2)\u0116\3\2\2\2+\u011c\3\2\2\2-\u0120\3\2\2\2/\u0126\3\2\2\2\61"+
		"\u012d\3\2\2\2\63\u012f\3\2\2\2\65\u0131\3\2\2\2\67\u0135\3\2\2\29\u013f"+
		"\3\2\2\2;\u0149\3\2\2\2=\u0150\3\2\2\2?\u0171\3\2\2\2A\u0173\3\2\2\2C"+
		"\u0177\3\2\2\2E\u0179\3\2\2\2G\u017b\3\2\2\2I\u017d\3\2\2\2K\u017f\3\2"+
		"\2\2M\u0181\3\2\2\2O\u0183\3\2\2\2Q\u0185\3\2\2\2S\u0187\3\2\2\2U\u0189"+
		"\3\2\2\2W\u018b\3\2\2\2Y\u018d\3\2\2\2[\u018f\3\2\2\2]\u0191\3\2\2\2_"+
		"\u0193\3\2\2\2a\u0195\3\2\2\2c\u0197\3\2\2\2e\u019a\3\2\2\2g\u019d\3\2"+
		"\2\2i\u019f\3\2\2\2k\u01a1\3\2\2\2m\u01a4\3\2\2\2o\u01a8\3\2\2\2q\u01ab"+
		"\3\2\2\2s\u01ad\3\2\2\2u\u01af\3\2\2\2w\u01b1\3\2\2\2y\u01b5\3\2\2\2{"+
		"\u01b8\3\2\2\2}\u01bb\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7,\2\2\u0081"+
		"\u0085\3\2\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7,\2\2\u0089\u008a\7\61\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\2\2\2\u008c\4\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f"+
		"\7\61\2\2\u008f\u0093\3\2\2\2\u0090\u0092\n\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\b\3\2\2\u0097\6\3\2\2\2\u0098"+
		"\u0099\t\3\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\4\2\2\u009b\b\3\2\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009e\7g\2\2\u009e\u009f\7y\2\2\u009f\n\3\2"+
		"\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4"+
		"\7n\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7e\2\2\u00a6\f\3\2\2\2\u00a7\u00a8"+
		"\7r\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7x\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\16\3\2\2\2\u00af"+
		"\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2"+
		"\u00b3\u00b4\7g\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7f\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7e\2\2\u00bf\22\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2"+
		"\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\24\3\2\2\2\u00c9\u00ca\7"+
		"u\2\2\u00ca\u00cb\7{\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce"+
		"\7j\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7|\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7f\2\2"+
		"\u00d5\26\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7"+
		"c\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\30\3\2\2\2\u00e0\u00e1"+
		"\7x\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\32\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7"+
		"p\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\34\3\2\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7x\2\2\u00f4\u00f5\7g\2\2\u00f5\36\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7e\2\2"+
		"\u00fb\u00fc\7v\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7r\2\2\u00fe \3\2\2"+
		"\2\u00ff\u0100\7d\2\2\u0100\u0101\7q\2\2\u0101\u0102\7q\2\2\u0102\u0103"+
		"\7n\2\2\u0103\u0104\7g\2\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106"+
		"\"\3\2\2\2\u0107\u0108\7d\2\2\u0108\u0109\7{\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7g\2\2\u010b$\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7j\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7t\2\2\u0110&\3\2\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115(\3\2\2\2\u0116"+
		"\u0117\7u\2\2\u0117\u0118\7j\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2"+
		"\u011a\u011b\7v\2\2\u011b*\3\2\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2"+
		"\2\u011e\u011f\7v\2\2\u011f,\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7"+
		"n\2\2\u0122\u0123\7q\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125."+
		"\3\2\2\2\u0126\u0127\7f\2\2\u0127\u0128\7q\2\2\u0128\u0129\7w\2\2\u0129"+
		"\u012a\7d\2\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2\u012c\60\3\2\2\2\u012d"+
		"\u012e\4c|\2\u012e\62\3\2\2\2\u012f\u0130\4C\\\2\u0130\64\3\2\2\2\u0131"+
		"\u0132\4\62;\2\u0132\66\3\2\2\2\u0133\u0136\5\61\31\2\u0134\u0136\5\63"+
		"\32\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u013c\3\2\2\2\u0137"+
		"\u013b\5\61\31\2\u0138\u013b\5\63\32\2\u0139\u013b\5\65\33\2\u013a\u0137"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d8\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0143\7$\2\2\u0140\u0142\13\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7$\2\2\u0147:\3\2\2\2\u0148\u014a\5W,\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\t\4"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f<\3\2\2\2\u0150\u0151\5;\36\2\u0151\u0152\t\5\2\2"+
		"\u0152>\3\2\2\2\u0153\u0155\5W,\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0158\t\4\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2"+
		"\2\2\u015b\u015d\5C\"\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0161\3\2\2\2\u015e\u0160\t\4\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0167\t\6\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0165\3\2\2\2\u0167\u0172\3\2\2\2\u0168\u016a\5W,\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\t\4\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\t\6\2\2\u0171\u0154\3\2\2\2\u0171"+
		"\u0169\3\2\2\2\u0172@\3\2\2\2\u0173\u0174\7)\2\2\u0174\u0175\13\2\2\2"+
		"\u0175\u0176\7)\2\2\u0176B\3\2\2\2\u0177\u0178\7\60\2\2\u0178D\3\2\2\2"+
		"\u0179\u017a\7=\2\2\u017aF\3\2\2\2\u017b\u017c\7?\2\2\u017cH\3\2\2\2\u017d"+
		"\u017e\7.\2\2\u017eJ\3\2\2\2\u017f\u0180\7>\2\2\u0180L\3\2\2\2\u0181\u0182"+
		"\7@\2\2\u0182N\3\2\2\2\u0183\u0184\7}\2\2\u0184P\3\2\2\2\u0185\u0186\7"+
		"\177\2\2\u0186R\3\2\2\2\u0187\u0188\7*\2\2\u0188T\3\2\2\2\u0189\u018a"+
		"\7+\2\2\u018aV\3\2\2\2\u018b\u018c\7/\2\2\u018cX\3\2\2\2\u018d\u018e\7"+
		"]\2\2\u018eZ\3\2\2\2\u018f\u0190\7_\2\2\u0190\\\3\2\2\2\u0191\u0192\7"+
		"-\2\2\u0192^\3\2\2\2\u0193\u0194\7,\2\2\u0194`\3\2\2\2\u0195\u0196\7\61"+
		"\2\2\u0196b\3\2\2\2\u0197\u0198\7-\2\2\u0198\u0199\7-\2\2\u0199d\3\2\2"+
		"\2\u019a\u019b\7/\2\2\u019b\u019c\7/\2\2\u019cf\3\2\2\2\u019d\u019e\7"+
		"\'\2\2\u019eh\3\2\2\2\u019f\u01a0\7\u0080\2\2\u01a0j\3\2\2\2\u01a1\u01a2"+
		"\7@\2\2\u01a2\u01a3\7@\2\2\u01a3l\3\2\2\2\u01a4\u01a5\7@\2\2\u01a5\u01a6"+
		"\7@\2\2\u01a6\u01a7\7@\2\2\u01a7n\3\2\2\2\u01a8\u01a9\7>\2\2\u01a9\u01aa"+
		"\7>\2\2\u01aap\3\2\2\2\u01ab\u01ac\7(\2\2\u01acr\3\2\2\2\u01ad\u01ae\7"+
		"`\2\2\u01aet\3\2\2\2\u01af\u01b0\7~\2\2\u01b0v\3\2\2\2\u01b1\u01b2\7>"+
		"\2\2\u01b2\u01b3\7?\2\2\u01b3\u01b4\7\"\2\2\u01b4x\3\2\2\2\u01b5\u01b6"+
		"\7@\2\2\u01b6\u01b7\7?\2\2\u01b7z\3\2\2\2\u01b8\u01b9\7?\2\2\u01b9\u01ba"+
		"\7?\2\2\u01ba|\3\2\2\2\u01bb\u01bc\7#\2\2\u01bc\u01bd\7?\2\2\u01bd~\3"+
		"\2\2\2\23\2\u0085\u0093\u0135\u013a\u013c\u0143\u0149\u014e\u0154\u0159"+
		"\u015c\u0161\u0166\u0169\u016e\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}