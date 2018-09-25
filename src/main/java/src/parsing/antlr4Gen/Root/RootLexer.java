// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7
package src.parsing.antlr4Gen.Root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RootLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, COMMENT = 2, LINE_COMMENT = 3, WS = 4, PUBLIC = 5, PRIVATE = 6, PROTECTED = 7,
            STATIC = 8, ABSTRACT = 9, SYNCHRONIZED = 10, TRANSIENT = 11, VOLATILE = 12, FINAL = 13,
            NATIVE = 14, STRICTFP = 15, BOOLEAN = 16, BYTE = 17, CHAR = 18, LONG = 19, SHORT = 20,
            INT = 21, FLOAT = 22, DOUBLE = 23, ID = 24, STRINGCG = 25, INTEGERCG = 26, FLOATCG = 27,
            CHARACTERCG = 28, DOT = 29, SEMICOLON = 30, EQUALS = 31, COMMA = 32, INEQUALITYOPEN = 33,
            INEQUALITYCLOSE = 34, BRACEOPEN = 35, BRACECLOSE = 36, BRACKETOPEN = 37, BRACKETCLOSE = 38,
            MINUS = 39, SQUAREBRACKETOPEN = 40, SQUAREBRACKETCLOSE = 41, PLUS = 42, ASTERISK = 43,
            SLASH = 44;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "COMMENT", "LINE_COMMENT", "WS", "PUBLIC", "PRIVATE", "PROTECTED",
            "STATIC", "ABSTRACT", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL",
            "NATIVE", "STRICTFP", "BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT",
            "FLOAT", "DOUBLE", "LOWCHAR", "HIGHCHAR", "DIGIT", "ID", "STRINGCG", "INTEGERCG",
            "FLOATCG", "CHARACTERCG", "DOT", "SEMICOLON", "EQUALS", "COMMA", "INEQUALITYOPEN",
            "INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE",
            "MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE", "PLUS", "ASTERISK",
            "SLASH"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'new'", null, null, null, "'public'", "'private'", "'protected'",
            "'static'", "'abstract'", "'synchronized'", "'transient'", "'volatile'",
            "'final'", "'native'", "'strictfp'", "'boolean'", "'byte'", "'char'",
            "'long'", "'short'", "'int'", "'float'", "'double'", null, null, null,
            null, null, "'.'", "';'", "'='", "','", "'<'", "'>'", "'{'", "'}'", "'('",
            "')'", "'-'", "'\u005B'", "'\u005D'", "'+'", "'*'", "'/'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, "COMMENT", "LINE_COMMENT", "WS", "PUBLIC", "PRIVATE", "PROTECTED",
            "STATIC", "ABSTRACT", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", "FINAL",
            "NATIVE", "STRICTFP", "BOOLEAN", "BYTE", "CHAR", "LONG", "SHORT", "INT",
            "FLOAT", "DOUBLE", "ID", "STRINGCG", "INTEGERCG", "FLOATCG", "CHARACTERCG",
            "DOT", "SEMICOLON", "EQUALS", "COMMA", "INEQUALITYOPEN", "INEQUALITYCLOSE",
            "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", "BRACKETCLOSE", "MINUS", "SQUAREBRACKETOPEN",
            "SQUAREBRACKETCLOSE", "PLUS", "ASTERISK", "SLASH"
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
            if(tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if(tokenNames[i] == null) {
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Root.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0167\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3j" +
                    "\n\3\f\3\16\3m\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4x\n\4\f\4\16" +
                    "\4{\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22" +
                    "\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24" +
                    "\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33" +
                    "\3\33\3\34\3\34\5\34\u0118\n\34\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16" +
                    "\34\u0120\13\34\3\35\3\35\7\35\u0124\n\35\f\35\16\35\u0127\13\35\3\35" +
                    "\3\35\3\36\5\36\u012c\n\36\3\36\6\36\u012f\n\36\r\36\16\36\u0130\3\37" +
                    "\5\37\u0134\n\37\3\37\6\37\u0137\n\37\r\37\16\37\u0138\3\37\5\37\u013c" +
                    "\n\37\3\37\7\37\u013f\n\37\f\37\16\37\u0142\13\37\3 \3 \3 \3 \3!\3!\3" +
                    "\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3" +
                    "-\3-\3.\3.\3/\3/\3\60\3\60\4k\u0125\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t" +
                    "\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27" +
                    "-\30/\31\61\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(" +
                    "U)W*Y+[,]-_.\3\2\5\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\2\u0170\2" +
                    "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2" +
                    "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2" +
                    "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2" +
                    "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2" +
                    "\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2" +
                    "C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3" +
                    "\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2" +
                    "\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5e\3\2\2\2\7s\3\2\2\2\t~\3\2\2\2\13" +
                    "\u0082\3\2\2\2\r\u0089\3\2\2\2\17\u0091\3\2\2\2\21\u009b\3\2\2\2\23\u00a2" +
                    "\3\2\2\2\25\u00ab\3\2\2\2\27\u00b8\3\2\2\2\31\u00c2\3\2\2\2\33\u00cb\3" +
                    "\2\2\2\35\u00d1\3\2\2\2\37\u00d8\3\2\2\2!\u00e1\3\2\2\2#\u00e9\3\2\2\2" +
                    "%\u00ee\3\2\2\2\'\u00f3\3\2\2\2)\u00f8\3\2\2\2+\u00fe\3\2\2\2-\u0102\3" +
                    "\2\2\2/\u0108\3\2\2\2\61\u010f\3\2\2\2\63\u0111\3\2\2\2\65\u0113\3\2\2" +
                    "\2\67\u0117\3\2\2\29\u0121\3\2\2\2;\u012b\3\2\2\2=\u0133\3\2\2\2?\u0143" +
                    "\3\2\2\2A\u0147\3\2\2\2C\u0149\3\2\2\2E\u014b\3\2\2\2G\u014d\3\2\2\2I" +
                    "\u014f\3\2\2\2K\u0151\3\2\2\2M\u0153\3\2\2\2O\u0155\3\2\2\2Q\u0157\3\2" +
                    "\2\2S\u0159\3\2\2\2U\u015b\3\2\2\2W\u015d\3\2\2\2Y\u015f\3\2\2\2[\u0161" +
                    "\3\2\2\2]\u0163\3\2\2\2_\u0165\3\2\2\2ab\7p\2\2bc\7g\2\2cd\7y\2\2d\4\3" +
                    "\2\2\2ef\7\61\2\2fg\7,\2\2gk\3\2\2\2hj\13\2\2\2ih\3\2\2\2jm\3\2\2\2kl" +
                    "\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7,\2\2op\7\61\2\2pq\3\2\2\2q" +
                    "r\b\3\2\2r\6\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\2\2\2wv\3\2\2" +
                    "\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\4\2\2}\b\3\2" +
                    "\2\2~\177\t\3\2\2\177\u0080\3\2\2\2\u0080\u0081\b\5\2\2\u0081\n\3\2\2" +
                    "\2\u0082\u0083\7r\2\2\u0083\u0084\7w\2\2\u0084\u0085\7d\2\2\u0085\u0086" +
                    "\7n\2\2\u0086\u0087\7k\2\2\u0087\u0088\7e\2\2\u0088\f\3\2\2\2\u0089\u008a" +
                    "\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7x\2\2\u008d" +
                    "\u008e\7c\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\16\3\2\2\2\u0091" +
                    "\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7q\2\2\u0094\u0095\7v\2\2" +
                    "\u0095\u0096\7g\2\2\u0096\u0097\7e\2\2\u0097\u0098\7v\2\2\u0098\u0099" +
                    "\7g\2\2\u0099\u009a\7f\2\2\u009a\20\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d" +
                    "\7v\2\2\u009d\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0" +
                    "\u00a1\7e\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7d\2\2\u00a4" +
                    "\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7c\2\2" +
                    "\u00a8\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7" +
                    "u\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7e\2\2\u00af\u00b0" +
                    "\7j\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2\u00b3" +
                    "\u00b4\7k\2\2\u00b4\u00b5\7|\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7f\2\2" +
                    "\u00b7\26\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7" +
                    "c\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2\u00be\u00bf" +
                    "\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\30\3\2\2\2\u00c2\u00c3" +
                    "\7x\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7c\2\2\u00c6" +
                    "\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2" +
                    "\u00ca\32\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7" +
                    "p\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\34\3\2\2\2\u00d1\u00d2" +
                    "\7p\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5" +
                    "\u00d6\7x\2\2\u00d6\u00d7\7g\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9" +
                    "\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7e\2\2" +
                    "\u00dd\u00de\7v\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7r\2\2\u00e0 \3\2\2" +
                    "\2\u00e1\u00e2\7d\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5" +
                    "\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8" +
                    "\"\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7{\2\2\u00eb\u00ec\7v\2\2\u00ec" +
                    "\u00ed\7g\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7j\2\2\u00f0" +
                    "\u00f1\7c\2\2\u00f1\u00f2\7t\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4" +
                    "\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7(\3\2\2\2\u00f8" +
                    "\u00f9\7u\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7t\2\2" +
                    "\u00fc\u00fd\7v\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2" +
                    "\2\u0100\u0101\7v\2\2\u0101,\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7" +
                    "n\2\2\u0104\u0105\7q\2\2\u0105\u0106\7c\2\2\u0106\u0107\7v\2\2\u0107." +
                    "\3\2\2\2\u0108\u0109\7f\2\2\u0109\u010a\7q\2\2\u010a\u010b\7w\2\2\u010b" +
                    "\u010c\7d\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\60\3\2\2\2\u010f" +
                    "\u0110\4c|\2\u0110\62\3\2\2\2\u0111\u0112\4C\\\2\u0112\64\3\2\2\2\u0113" +
                    "\u0114\4\62;\2\u0114\66\3\2\2\2\u0115\u0118\5\61\31\2\u0116\u0118\5\63" +
                    "\32\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011e\3\2\2\2\u0119" +
                    "\u011d\5\61\31\2\u011a\u011d\5\63\32\2\u011b\u011d\5\65\33\2\u011c\u0119" +
                    "\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e" +
                    "\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f8\3\2\2\2\u0120\u011e\3\2\2\2" +
                    "\u0121\u0125\7$\2\2\u0122\u0124\13\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127" +
                    "\3\2\2\2\u0125\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\3\2\2\2\u0127" +
                    "\u0125\3\2\2\2\u0128\u0129\7$\2\2\u0129:\3\2\2\2\u012a\u012c\5U+\2\u012b" +
                    "\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\t\4" +
                    "\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130" +
                    "\u0131\3\2\2\2\u0131<\3\2\2\2\u0132\u0134\5U+\2\u0133\u0132\3\2\2\2\u0133" +
                    "\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\t\4\2\2\u0136\u0135\3\2" +
                    "\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139" +
                    "\u013b\3\2\2\2\u013a\u013c\5A!\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2" +
                    "\2\u013c\u0140\3\2\2\2\u013d\u013f\t\4\2\2\u013e\u013d\3\2\2\2\u013f\u0142" +
                    "\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141>\3\2\2\2\u0142" +
                    "\u0140\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145\13\2\2\2\u0145\u0146\7)" +
                    "\2\2\u0146@\3\2\2\2\u0147\u0148\7\60\2\2\u0148B\3\2\2\2\u0149\u014a\7" +
                    "=\2\2\u014aD\3\2\2\2\u014b\u014c\7?\2\2\u014cF\3\2\2\2\u014d\u014e\7." +
                    "\2\2\u014eH\3\2\2\2\u014f\u0150\7>\2\2\u0150J\3\2\2\2\u0151\u0152\7@\2" +
                    "\2\u0152L\3\2\2\2\u0153\u0154\7}\2\2\u0154N\3\2\2\2\u0155\u0156\7\177" +
                    "\2\2\u0156P\3\2\2\2\u0157\u0158\7*\2\2\u0158R\3\2\2\2\u0159\u015a\7+\2" +
                    "\2\u015aT\3\2\2\2\u015b\u015c\7/\2\2\u015cV\3\2\2\2\u015d\u015e\7]\2\2" +
                    "\u015eX\3\2\2\2\u015f\u0160\7_\2\2\u0160Z\3\2\2\2\u0161\u0162\7-\2\2\u0162" +
                    "\\\3\2\2\2\u0163\u0164\7,\2\2\u0164^\3\2\2\2\u0165\u0166\7\61\2\2\u0166" +
                    "`\3\2\2\2\17\2ky\u0117\u011c\u011e\u0125\u012b\u0130\u0133\u0138\u013b" +
                    "\u0140\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}