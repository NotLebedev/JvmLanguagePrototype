// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
package src.parsing.antlr4Gen.Root;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RootParser extends Parser {
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
	public static final int
		RULE_code = 0, RULE_methodCode = 1, RULE_expression = 2, RULE_variableDeclaration = 3, 
		RULE_arrayType = 4, RULE_declarationType = 5, RULE_arrayModifier = 6, 
		RULE_arrayIndex = 7, RULE_variableAssignment = 8, RULE_assignment = 9, 
		RULE_value = 10, RULE_preIncrement = 11, RULE_preDecrement = 12, RULE_unaryPlus = 13, 
		RULE_unaryMinus = 14, RULE_cast = 15, RULE_objectInstantiation = 16, RULE_literalCG = 17, 
		RULE_className = 18, RULE_classAccess = 19, RULE_methodInv = 20, RULE_eol = 21, 
		RULE_newKW = 22, RULE_publicAM = 23, RULE_privateAM = 24, RULE_protectedAM = 25, 
		RULE_staticAM = 26, RULE_abstractAM = 27, RULE_synchronizedAM = 28, RULE_transientAM = 29, 
		RULE_volatileAM = 30, RULE_finalAM = 31, RULE_nativeAM = 32, RULE_strrictfpAM = 33, 
		RULE_booleanT = 34, RULE_byteT = 35, RULE_charT = 36, RULE_longT = 37, 
		RULE_shortT = 38, RULE_intT = 39, RULE_floatT = 40, RULE_doubleT = 41, 
		RULE_id = 42, RULE_path = 43, RULE_stringCG = 44, RULE_integerCG = 45, 
		RULE_longCG = 46, RULE_floatCG = 47, RULE_characterCG = 48, RULE_dotS = 49, 
		RULE_semicolonS = 50, RULE_equalsS = 51, RULE_commaS = 52, RULE_less = 53, 
		RULE_more = 54, RULE_braceopenS = 55, RULE_brcecloseS = 56, RULE_bracketOpenS = 57, 
		RULE_bracketCloseS = 58, RULE_squareBracketOpen = 59, RULE_squareBracketClose = 60, 
		RULE_plusS = 61, RULE_minusS = 62, RULE_asteriskS = 63, RULE_slashS = 64, 
		RULE_incrementS = 65, RULE_decrementS = 66, RULE_percentS = 67, RULE_invertS = 68, 
		RULE_rightShiftArithmetic = 69, RULE_rightShiftLogical = 70, RULE_leftShift = 71, 
		RULE_bitAnd = 72, RULE_bitXor = 73, RULE_bitOr = 74, RULE_lessEqual = 75, 
		RULE_moreEqual = 76, RULE_equal = 77, RULE_notEqual = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "methodCode", "expression", "variableDeclaration", "arrayType", 
			"declarationType", "arrayModifier", "arrayIndex", "variableAssignment", 
			"assignment", "value", "preIncrement", "preDecrement", "unaryPlus", "unaryMinus", 
			"cast", "objectInstantiation", "literalCG", "className", "classAccess", 
			"methodInv", "eol", "newKW", "publicAM", "privateAM", "protectedAM", 
			"staticAM", "abstractAM", "synchronizedAM", "transientAM", "volatileAM", 
			"finalAM", "nativeAM", "strrictfpAM", "booleanT", "byteT", "charT", "longT", 
			"shortT", "intT", "floatT", "doubleT", "id", "path", "stringCG", "integerCG", 
			"longCG", "floatCG", "characterCG", "dotS", "semicolonS", "equalsS", 
			"commaS", "less", "more", "braceopenS", "brcecloseS", "bracketOpenS", 
			"bracketCloseS", "squareBracketOpen", "squareBracketClose", "plusS", 
			"minusS", "asteriskS", "slashS", "incrementS", "decrementS", "percentS", 
			"invertS", "rightShiftArithmetic", "rightShiftLogical", "leftShift", 
			"bitAnd", "bitXor", "bitOr", "lessEqual", "moreEqual", "equal", "notEqual"
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

	@Override
	public String getGrammarFileName() { return "Root.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RootParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public MethodCodeContext methodCode() {
			return getRuleContext(MethodCodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			methodCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCodeContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public MethodCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMethodCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCodeContext methodCode() throws RecognitionException {
		MethodCodeContext _localctx = new MethodCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << LONG) | (1L << SHORT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << INVERT))) != 0)) {
				{
				{
				setState(160);
				expression();
				setState(161);
				eol();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				value(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DeclarationTypeContext declarationType() {
			return getRuleContext(DeclarationTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			declarationType();
			setState(174);
			id();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(175);
				assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public BooleanTContext booleanT() {
			return getRuleContext(BooleanTContext.class,0);
		}
		public ByteTContext byteT() {
			return getRuleContext(ByteTContext.class,0);
		}
		public CharTContext charT() {
			return getRuleContext(CharTContext.class,0);
		}
		public LongTContext longT() {
			return getRuleContext(LongTContext.class,0);
		}
		public ShortTContext shortT() {
			return getRuleContext(ShortTContext.class,0);
		}
		public IntTContext intT() {
			return getRuleContext(IntTContext.class,0);
		}
		public FloatTContext floatT() {
			return getRuleContext(FloatTContext.class,0);
		}
		public DoubleTContext doubleT() {
			return getRuleContext(DoubleTContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayType);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				booleanT();
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				byteT();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				charT();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				longT();
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				shortT();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				intT();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				floatT();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				doubleT();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public List<ArrayModifierContext> arrayModifier() {
			return getRuleContexts(ArrayModifierContext.class);
		}
		public ArrayModifierContext arrayModifier(int i) {
			return getRuleContext(ArrayModifierContext.class,i);
		}
		public DeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitDeclarationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeContext declarationType() throws RecognitionException {
		DeclarationTypeContext _localctx = new DeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			arrayType();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUAREBRACKETOPEN) {
				{
				{
				setState(190);
				arrayModifier();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayModifierContext extends ParserRuleContext {
		public SquareBracketOpenContext squareBracketOpen() {
			return getRuleContext(SquareBracketOpenContext.class,0);
		}
		public SquareBracketCloseContext squareBracketClose() {
			return getRuleContext(SquareBracketCloseContext.class,0);
		}
		public ArrayModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitArrayModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayModifierContext arrayModifier() throws RecognitionException {
		ArrayModifierContext _localctx = new ArrayModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			squareBracketOpen();
			setState(197);
			squareBracketClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexContext extends ParserRuleContext {
		public SquareBracketOpenContext squareBracketOpen() {
			return getRuleContext(SquareBracketOpenContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SquareBracketCloseContext squareBracketClose() {
			return getRuleContext(SquareBracketCloseContext.class,0);
		}
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			squareBracketOpen();
			setState(200);
			value(0);
			setState(201);
			squareBracketClose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			value(0);
			setState(204);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public EqualsSContext equalsS() {
			return getRuleContext(EqualsSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			equalsS();
			setState(207);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LITERALContext extends ValueContext {
		public LiteralCGContext literalCG() {
			return getRuleContext(LiteralCGContext.class,0);
		}
		public LITERALContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLITERAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDITIVE_OPContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PlusSContext plusS() {
			return getRuleContext(PlusSContext.class,0);
		}
		public MinusSContext minusS() {
			return getRuleContext(MinusSContext.class,0);
		}
		public ADDITIVE_OPContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitADDITIVE_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BITWISE_ORContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BitOrContext bitOr() {
			return getRuleContext(BitOrContext.class,0);
		}
		public BITWISE_ORContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBITWISE_OR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SHIFT_OPContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public RightShiftArithmeticContext rightShiftArithmetic() {
			return getRuleContext(RightShiftArithmeticContext.class,0);
		}
		public RightShiftLogicalContext rightShiftLogical() {
			return getRuleContext(RightShiftLogicalContext.class,0);
		}
		public LeftShiftContext leftShift() {
			return getRuleContext(LeftShiftContext.class,0);
		}
		public SHIFT_OPContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSHIFT_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BITWISE_ANDContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BitAndContext bitAnd() {
			return getRuleContext(BitAndContext.class,0);
		}
		public BITWISE_ANDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBITWISE_AND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PRE_DECREMENTContext extends ValueContext {
		public PreDecrementContext preDecrement() {
			return getRuleContext(PreDecrementContext.class,0);
		}
		public PRE_DECREMENTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPRE_DECREMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UNARY_PLUSContext extends ValueContext {
		public UnaryPlusContext unaryPlus() {
			return getRuleContext(UnaryPlusContext.class,0);
		}
		public UNARY_PLUSContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitUNARY_PLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BITWISE_XORContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BitXorContext bitXor() {
			return getRuleContext(BitXorContext.class,0);
		}
		public BITWISE_XORContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBITWISE_XOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PRE_INCREMENTContext extends ValueContext {
		public PreIncrementContext preIncrement() {
			return getRuleContext(PreIncrementContext.class,0);
		}
		public PRE_INCREMENTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPRE_INCREMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POST_INCREMENTContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IncrementSContext incrementS() {
			return getRuleContext(IncrementSContext.class,0);
		}
		public POST_INCREMENTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPOST_INCREMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OBJECT_INSTANTIATIONContext extends ValueContext {
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
		}
		public OBJECT_INSTANTIATIONContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitOBJECT_INSTANTIATION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class INVERTContext extends ValueContext {
		public InvertSContext invertS() {
			return getRuleContext(InvertSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public INVERTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitINVERT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POST_DECREMENTContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DecrementSContext decrementS() {
			return getRuleContext(DecrementSContext.class,0);
		}
		public POST_DECREMENTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPOST_DECREMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RELATIONAL_OPContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public LessEqualContext lessEqual() {
			return getRuleContext(LessEqualContext.class,0);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public MoreEqualContext moreEqual() {
			return getRuleContext(MoreEqualContext.class,0);
		}
		public RELATIONAL_OPContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitRELATIONAL_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class METHOD_INVContext extends ValueContext {
		public MethodInvContext methodInv() {
			return getRuleContext(MethodInvContext.class,0);
		}
		public METHOD_INVContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMETHOD_INV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UNARY_MINUSContext extends ValueContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public UNARY_MINUSContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitUNARY_MINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ID_LABELContext extends ValueContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ID_LABELContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitID_LABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENTHESISContext extends ValueContext {
		public BracketOpenSContext bracketOpenS() {
			return getRuleContext(BracketOpenSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BracketCloseSContext bracketCloseS() {
			return getRuleContext(BracketCloseSContext.class,0);
		}
		public PARENTHESISContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPARENTHESIS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CAST_LABELContext extends ValueContext {
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public CAST_LABELContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCAST_LABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULTIPLICATIVE_OPContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AsteriskSContext asteriskS() {
			return getRuleContext(AsteriskSContext.class,0);
		}
		public SlashSContext slashS() {
			return getRuleContext(SlashSContext.class,0);
		}
		public PercentSContext percentS() {
			return getRuleContext(PercentSContext.class,0);
		}
		public MULTIPLICATIVE_OPContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMULTIPLICATIVE_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQUALITY_OPContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public NotEqualContext notEqual() {
			return getRuleContext(NotEqualContext.class,0);
		}
		public EQUALITY_OPContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitEQUALITY_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ACCESSContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DotSContext dotS() {
			return getRuleContext(DotSContext.class,0);
		}
		public ACCESSContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitACCESS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARRAY_ACCESSContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public ARRAY_ACCESSContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitARRAY_ACCESS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new LITERALContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				literalCG();
				}
				break;
			case 2:
				{
				_localctx = new METHOD_INVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				methodInv();
				}
				break;
			case 3:
				{
				_localctx = new ID_LABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				id();
				}
				break;
			case 4:
				{
				_localctx = new OBJECT_INSTANTIATIONContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				objectInstantiation();
				}
				break;
			case 5:
				{
				_localctx = new CAST_LABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				cast();
				}
				break;
			case 6:
				{
				_localctx = new PARENTHESISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				bracketOpenS();
				setState(216);
				value(0);
				setState(217);
				bracketCloseS();
				}
				break;
			case 7:
				{
				_localctx = new PRE_INCREMENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				preIncrement();
				}
				break;
			case 8:
				{
				_localctx = new PRE_DECREMENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				preDecrement();
				}
				break;
			case 9:
				{
				_localctx = new UNARY_PLUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				unaryPlus();
				}
				break;
			case 10:
				{
				_localctx = new UNARY_MINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				unaryMinus();
				}
				break;
			case 11:
				{
				_localctx = new INVERTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				invertS();
				setState(224);
				value(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ACCESSContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(228);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(229);
						dotS();
						setState(230);
						value(18);
						}
						break;
					case 2:
						{
						_localctx = new MULTIPLICATIVE_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(232);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(236);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASTERISK:
							{
							setState(233);
							asteriskS();
							}
							break;
						case SLASH:
							{
							setState(234);
							slashS();
							}
							break;
						case PERCENT:
							{
							setState(235);
							percentS();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(238);
						value(9);
						}
						break;
					case 3:
						{
						_localctx = new ADDITIVE_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(240);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(241);
							plusS();
							}
							break;
						case MINUS:
							{
							setState(242);
							minusS();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(245);
						value(8);
						}
						break;
					case 4:
						{
						_localctx = new SHIFT_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(247);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(251);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case RSHIFT:
							{
							setState(248);
							rightShiftArithmetic();
							}
							break;
						case RSHIFTSHIFT:
							{
							setState(249);
							rightShiftLogical();
							}
							break;
						case LSHIFT:
							{
							setState(250);
							leftShift();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(253);
						value(7);
						}
						break;
					case 5:
						{
						_localctx = new RELATIONAL_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(255);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(260);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INEQUALITYOPEN:
							{
							setState(256);
							less();
							}
							break;
						case LESS_EQUAL:
							{
							setState(257);
							lessEqual();
							}
							break;
						case INEQUALITYCLOSE:
							{
							setState(258);
							more();
							}
							break;
						case MORE_EQUAL:
							{
							setState(259);
							moreEqual();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(262);
						value(6);
						}
						break;
					case 6:
						{
						_localctx = new EQUALITY_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(267);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(265);
							equal();
							}
							break;
						case NOT_EQUAL:
							{
							setState(266);
							notEqual();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(269);
						value(5);
						}
						break;
					case 7:
						{
						_localctx = new BITWISE_ANDContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						bitAnd();
						setState(273);
						value(4);
						}
						break;
					case 8:
						{
						_localctx = new BITWISE_XORContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						bitXor();
						setState(277);
						value(3);
						}
						break;
					case 9:
						{
						_localctx = new BITWISE_ORContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(279);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(280);
						bitOr();
						setState(281);
						value(2);
						}
						break;
					case 10:
						{
						_localctx = new ARRAY_ACCESSContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(283);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(284);
						arrayIndex();
						}
						break;
					case 11:
						{
						_localctx = new POST_INCREMENTContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(285);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(286);
						incrementS();
						}
						break;
					case 12:
						{
						_localctx = new POST_DECREMENTContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(287);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(288);
						decrementS();
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PreIncrementContext extends ParserRuleContext {
		public IncrementSContext incrementS() {
			return getRuleContext(IncrementSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PreIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementContext preIncrement() throws RecognitionException {
		PreIncrementContext _localctx = new PreIncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_preIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			incrementS();
			setState(295);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementContext extends ParserRuleContext {
		public DecrementSContext decrementS() {
			return getRuleContext(DecrementSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PreDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementContext preDecrement() throws RecognitionException {
		PreDecrementContext _localctx = new PreDecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_preDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			decrementS();
			setState(298);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPlusContext extends ParserRuleContext {
		public PlusSContext plusS() {
			return getRuleContext(PlusSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnaryPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPlus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPlusContext unaryPlus() throws RecognitionException {
		UnaryPlusContext _localctx = new UnaryPlusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			plusS();
			setState(301);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryMinusContext extends ParserRuleContext {
		public MinusSContext minusS() {
			return getRuleContext(MinusSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			minusS();
			setState(304);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public BracketOpenSContext bracketOpenS() {
			return getRuleContext(BracketOpenSContext.class,0);
		}
		public DeclarationTypeContext declarationType() {
			return getRuleContext(DeclarationTypeContext.class,0);
		}
		public BracketCloseSContext bracketCloseS() {
			return getRuleContext(BracketCloseSContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			bracketOpenS();
			setState(307);
			declarationType();
			setState(308);
			bracketCloseS();
			setState(309);
			value(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectInstantiationContext extends ParserRuleContext {
		public NewKWContext newKW() {
			return getRuleContext(NewKWContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public BracketOpenSContext bracketOpenS() {
			return getRuleContext(BracketOpenSContext.class,0);
		}
		public BracketCloseSContext bracketCloseS() {
			return getRuleContext(BracketCloseSContext.class,0);
		}
		public List<ArrayIndexContext> arrayIndex() {
			return getRuleContexts(ArrayIndexContext.class);
		}
		public ArrayIndexContext arrayIndex(int i) {
			return getRuleContext(ArrayIndexContext.class,i);
		}
		public List<ArrayModifierContext> arrayModifier() {
			return getRuleContexts(ArrayModifierContext.class);
		}
		public ArrayModifierContext arrayModifier(int i) {
			return getRuleContext(ArrayModifierContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CommaSContext> commaS() {
			return getRuleContexts(CommaSContext.class);
		}
		public CommaSContext commaS(int i) {
			return getRuleContext(CommaSContext.class,i);
		}
		public ObjectInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInstantiation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitObjectInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInstantiationContext objectInstantiation() throws RecognitionException {
		ObjectInstantiationContext _localctx = new ObjectInstantiationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_objectInstantiation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			newKW();
			setState(312);
			arrayType();
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREBRACKETOPEN:
				{
				setState(314); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(313);
						arrayIndex();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(316); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						arrayModifier();
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case BRACKETOPEN:
				{
				setState(324);
				bracketOpenS();
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						value(0);
						setState(326);
						commaS();
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << INVERT))) != 0)) {
					{
					setState(333);
					value(0);
					}
				}

				setState(336);
				bracketCloseS();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralCGContext extends ParserRuleContext {
		public StringCGContext stringCG() {
			return getRuleContext(StringCGContext.class,0);
		}
		public IntegerCGContext integerCG() {
			return getRuleContext(IntegerCGContext.class,0);
		}
		public LongCGContext longCG() {
			return getRuleContext(LongCGContext.class,0);
		}
		public FloatCGContext floatCG() {
			return getRuleContext(FloatCGContext.class,0);
		}
		public CharacterCGContext characterCG() {
			return getRuleContext(CharacterCGContext.class,0);
		}
		public LiteralCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLiteralCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralCGContext literalCG() throws RecognitionException {
		LiteralCGContext _localctx = new LiteralCGContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literalCG);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCG:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				stringCG();
				}
				break;
			case INTEGERCG:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				integerCG();
				}
				break;
			case LONGCG:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				longCG();
				}
				break;
			case FLOATCG:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				floatCG();
				}
				break;
			case CHARACTERCG:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				characterCG();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassAccessContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public MethodInvContext methodInv() {
			return getRuleContext(MethodInvContext.class,0);
		}
		public ClassAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitClassAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAccessContext classAccess() throws RecognitionException {
		ClassAccessContext _localctx = new ClassAccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(349);
				path();
				}
				break;
			case 2:
				{
				setState(350);
				methodInv();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BracketOpenSContext bracketOpenS() {
			return getRuleContext(BracketOpenSContext.class,0);
		}
		public BracketCloseSContext bracketCloseS() {
			return getRuleContext(BracketCloseSContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<CommaSContext> commaS() {
			return getRuleContexts(CommaSContext.class);
		}
		public CommaSContext commaS(int i) {
			return getRuleContext(CommaSContext.class,i);
		}
		public MethodInvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMethodInv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvContext methodInv() throws RecognitionException {
		MethodInvContext _localctx = new MethodInvContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodInv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			id();
			setState(354);
			bracketOpenS();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					value(0);
					setState(356);
					commaS();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << INVERT))) != 0)) {
				{
				setState(363);
				value(0);
				}
			}

			setState(366);
			bracketCloseS();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public SemicolonSContext semicolonS() {
			return getRuleContext(SemicolonSContext.class,0);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			semicolonS();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewKWContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(RootParser.NEW, 0); }
		public NewKWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newKW; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitNewKW(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewKWContext newKW() throws RecognitionException {
		NewKWContext _localctx = new NewKWContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newKW);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(NEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicAMContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(RootParser.PUBLIC, 0); }
		public PublicAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPublicAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicAMContext publicAM() throws RecognitionException {
		PublicAMContext _localctx = new PublicAMContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_publicAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(PUBLIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateAMContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(RootParser.PRIVATE, 0); }
		public PrivateAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPrivateAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateAMContext privateAM() throws RecognitionException {
		PrivateAMContext _localctx = new PrivateAMContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_privateAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(PRIVATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtectedAMContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(RootParser.PROTECTED, 0); }
		public ProtectedAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protectedAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitProtectedAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtectedAMContext protectedAM() throws RecognitionException {
		ProtectedAMContext _localctx = new ProtectedAMContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_protectedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(PROTECTED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAMContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(RootParser.STATIC, 0); }
		public StaticAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitStaticAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAMContext staticAM() throws RecognitionException {
		StaticAMContext _localctx = new StaticAMContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_staticAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractAMContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RootParser.ABSTRACT, 0); }
		public AbstractAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitAbstractAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractAMContext abstractAM() throws RecognitionException {
		AbstractAMContext _localctx = new AbstractAMContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_abstractAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ABSTRACT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedAMContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(RootParser.SYNCHRONIZED, 0); }
		public SynchronizedAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSynchronizedAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedAMContext synchronizedAM() throws RecognitionException {
		SynchronizedAMContext _localctx = new SynchronizedAMContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_synchronizedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(SYNCHRONIZED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransientAMContext extends ParserRuleContext {
		public TerminalNode TRANSIENT() { return getToken(RootParser.TRANSIENT, 0); }
		public TransientAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transientAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitTransientAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransientAMContext transientAM() throws RecognitionException {
		TransientAMContext _localctx = new TransientAMContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_transientAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(TRANSIENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VolatileAMContext extends ParserRuleContext {
		public TerminalNode VOLATILE() { return getToken(RootParser.VOLATILE, 0); }
		public VolatileAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volatileAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitVolatileAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolatileAMContext volatileAM() throws RecognitionException {
		VolatileAMContext _localctx = new VolatileAMContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_volatileAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(VOLATILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalAMContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(RootParser.FINAL, 0); }
		public FinalAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitFinalAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalAMContext finalAM() throws RecognitionException {
		FinalAMContext _localctx = new FinalAMContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finalAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeAMContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(RootParser.NATIVE, 0); }
		public NativeAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitNativeAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeAMContext nativeAM() throws RecognitionException {
		NativeAMContext _localctx = new NativeAMContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nativeAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(NATIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrrictfpAMContext extends ParserRuleContext {
		public TerminalNode STRICTFP() { return getToken(RootParser.STRICTFP, 0); }
		public StrrictfpAMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strrictfpAM; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitStrrictfpAM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrrictfpAMContext strrictfpAM() throws RecognitionException {
		StrrictfpAMContext _localctx = new StrrictfpAMContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_strrictfpAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(STRICTFP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(RootParser.BOOLEAN, 0); }
		public BooleanTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBooleanT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTContext booleanT() throws RecognitionException {
		BooleanTContext _localctx = new BooleanTContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booleanT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByteTContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(RootParser.BYTE, 0); }
		public ByteTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitByteT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteTContext byteT() throws RecognitionException {
		ByteTContext _localctx = new ByteTContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_byteT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(BYTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharTContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(RootParser.CHAR, 0); }
		public CharTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCharT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharTContext charT() throws RecognitionException {
		CharTContext _localctx = new CharTContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_charT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongTContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(RootParser.LONG, 0); }
		public LongTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLongT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongTContext longT() throws RecognitionException {
		LongTContext _localctx = new LongTContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_longT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortTContext extends ParserRuleContext {
		public TerminalNode SHORT() { return getToken(RootParser.SHORT, 0); }
		public ShortTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitShortT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortTContext shortT() throws RecognitionException {
		ShortTContext _localctx = new ShortTContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shortT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(SHORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntTContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RootParser.INT, 0); }
		public IntTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitIntT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTContext intT() throws RecognitionException {
		IntTContext _localctx = new IntTContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_intT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatTContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RootParser.FLOAT, 0); }
		public FloatTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitFloatT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTContext floatT() throws RecognitionException {
		FloatTContext _localctx = new FloatTContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_floatT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleTContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(RootParser.DOUBLE, 0); }
		public DoubleTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitDoubleT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleTContext doubleT() throws RecognitionException {
		DoubleTContext _localctx = new DoubleTContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_doubleT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RootParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RootParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RootParser.DOT, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					id();
					setState(413);
					match(DOT);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(420);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringCGContext extends ParserRuleContext {
		public TerminalNode STRINGCG() { return getToken(RootParser.STRINGCG, 0); }
		public StringCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitStringCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringCGContext stringCG() throws RecognitionException {
		StringCGContext _localctx = new StringCGContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_stringCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(STRINGCG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerCGContext extends ParserRuleContext {
		public TerminalNode INTEGERCG() { return getToken(RootParser.INTEGERCG, 0); }
		public IntegerCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitIntegerCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerCGContext integerCG() throws RecognitionException {
		IntegerCGContext _localctx = new IntegerCGContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_integerCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(INTEGERCG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongCGContext extends ParserRuleContext {
		public TerminalNode LONGCG() { return getToken(RootParser.LONGCG, 0); }
		public LongCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLongCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongCGContext longCG() throws RecognitionException {
		LongCGContext _localctx = new LongCGContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_longCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LONGCG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatCGContext extends ParserRuleContext {
		public TerminalNode FLOATCG() { return getToken(RootParser.FLOATCG, 0); }
		public FloatCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitFloatCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatCGContext floatCG() throws RecognitionException {
		FloatCGContext _localctx = new FloatCGContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_floatCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(FLOATCG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterCGContext extends ParserRuleContext {
		public TerminalNode CHARACTERCG() { return getToken(RootParser.CHARACTERCG, 0); }
		public CharacterCGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterCG; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCharacterCG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterCGContext characterCG() throws RecognitionException {
		CharacterCGContext _localctx = new CharacterCGContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_characterCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CHARACTERCG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotSContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RootParser.DOT, 0); }
		public DotSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitDotS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotSContext dotS() throws RecognitionException {
		DotSContext _localctx = new DotSContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dotS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonSContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RootParser.SEMICOLON, 0); }
		public SemicolonSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSemicolonS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonSContext semicolonS() throws RecognitionException {
		SemicolonSContext _localctx = new SemicolonSContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_semicolonS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsSContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RootParser.EQUALS, 0); }
		public EqualsSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitEqualsS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsSContext equalsS() throws RecognitionException {
		EqualsSContext _localctx = new EqualsSContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_equalsS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(EQUALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaSContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(RootParser.COMMA, 0); }
		public CommaSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitCommaS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaSContext commaS() throws RecognitionException {
		CommaSContext _localctx = new CommaSContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_commaS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessContext extends ParserRuleContext {
		public TerminalNode INEQUALITYOPEN() { return getToken(RootParser.INEQUALITYOPEN, 0); }
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(INEQUALITYOPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreContext extends ParserRuleContext {
		public TerminalNode INEQUALITYCLOSE() { return getToken(RootParser.INEQUALITYCLOSE, 0); }
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(INEQUALITYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceopenSContext extends ParserRuleContext {
		public TerminalNode BRACEOPEN() { return getToken(RootParser.BRACEOPEN, 0); }
		public BraceopenSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceopenS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBraceopenS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceopenSContext braceopenS() throws RecognitionException {
		BraceopenSContext _localctx = new BraceopenSContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_braceopenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(BRACEOPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrcecloseSContext extends ParserRuleContext {
		public TerminalNode BRACECLOSE() { return getToken(RootParser.BRACECLOSE, 0); }
		public BrcecloseSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brcecloseS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBrcecloseS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrcecloseSContext brcecloseS() throws RecognitionException {
		BrcecloseSContext _localctx = new BrcecloseSContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_brcecloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(BRACECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketOpenSContext extends ParserRuleContext {
		public TerminalNode BRACKETOPEN() { return getToken(RootParser.BRACKETOPEN, 0); }
		public BracketOpenSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketOpenS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBracketOpenS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketOpenSContext bracketOpenS() throws RecognitionException {
		BracketOpenSContext _localctx = new BracketOpenSContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bracketOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(BRACKETOPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketCloseSContext extends ParserRuleContext {
		public TerminalNode BRACKETCLOSE() { return getToken(RootParser.BRACKETCLOSE, 0); }
		public BracketCloseSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketCloseS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBracketCloseS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketCloseSContext bracketCloseS() throws RecognitionException {
		BracketCloseSContext _localctx = new BracketCloseSContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bracketCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(BRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquareBracketOpenContext extends ParserRuleContext {
		public TerminalNode SQUAREBRACKETOPEN() { return getToken(RootParser.SQUAREBRACKETOPEN, 0); }
		public SquareBracketOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareBracketOpen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSquareBracketOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareBracketOpenContext squareBracketOpen() throws RecognitionException {
		SquareBracketOpenContext _localctx = new SquareBracketOpenContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_squareBracketOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(SQUAREBRACKETOPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquareBracketCloseContext extends ParserRuleContext {
		public TerminalNode SQUAREBRACKETCLOSE() { return getToken(RootParser.SQUAREBRACKETCLOSE, 0); }
		public SquareBracketCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareBracketClose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSquareBracketClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareBracketCloseContext squareBracketClose() throws RecognitionException {
		SquareBracketCloseContext _localctx = new SquareBracketCloseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_squareBracketClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(SQUAREBRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusSContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RootParser.PLUS, 0); }
		public PlusSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPlusS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusSContext plusS() throws RecognitionException {
		PlusSContext _localctx = new PlusSContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_plusS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusSContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(RootParser.MINUS, 0); }
		public MinusSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMinusS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusSContext minusS() throws RecognitionException {
		MinusSContext _localctx = new MinusSContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_minusS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsteriskSContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(RootParser.ASTERISK, 0); }
		public AsteriskSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitAsteriskS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsteriskSContext asteriskS() throws RecognitionException {
		AsteriskSContext _localctx = new AsteriskSContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_asteriskS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ASTERISK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlashSContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(RootParser.SLASH, 0); }
		public SlashSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slashS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitSlashS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashSContext slashS() throws RecognitionException {
		SlashSContext _localctx = new SlashSContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_slashS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(SLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementSContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(RootParser.INCREMENT, 0); }
		public IncrementSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitIncrementS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementSContext incrementS() throws RecognitionException {
		IncrementSContext _localctx = new IncrementSContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_incrementS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementSContext extends ParserRuleContext {
		public TerminalNode DECREMENT() { return getToken(RootParser.DECREMENT, 0); }
		public DecrementSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitDecrementS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementSContext decrementS() throws RecognitionException {
		DecrementSContext _localctx = new DecrementSContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_decrementS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(DECREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentSContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(RootParser.PERCENT, 0); }
		public PercentSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPercentS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentSContext percentS() throws RecognitionException {
		PercentSContext _localctx = new PercentSContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_percentS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(PERCENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvertSContext extends ParserRuleContext {
		public TerminalNode INVERT() { return getToken(RootParser.INVERT, 0); }
		public InvertSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invertS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitInvertS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvertSContext invertS() throws RecognitionException {
		InvertSContext _localctx = new InvertSContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_invertS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(INVERT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftArithmeticContext extends ParserRuleContext {
		public TerminalNode RSHIFT() { return getToken(RootParser.RSHIFT, 0); }
		public RightShiftArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftArithmetic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitRightShiftArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightShiftArithmeticContext rightShiftArithmetic() throws RecognitionException {
		RightShiftArithmeticContext _localctx = new RightShiftArithmeticContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rightShiftArithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(RSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftLogicalContext extends ParserRuleContext {
		public TerminalNode RSHIFTSHIFT() { return getToken(RootParser.RSHIFTSHIFT, 0); }
		public RightShiftLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftLogical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitRightShiftLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightShiftLogicalContext rightShiftLogical() throws RecognitionException {
		RightShiftLogicalContext _localctx = new RightShiftLogicalContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_rightShiftLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(RSHIFTSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftShiftContext extends ParserRuleContext {
		public TerminalNode LSHIFT() { return getToken(RootParser.LSHIFT, 0); }
		public LeftShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftShift; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLeftShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftShiftContext leftShift() throws RecognitionException {
		LeftShiftContext _localctx = new LeftShiftContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_leftShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitAndContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(RootParser.BITAND, 0); }
		public BitAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitAndContext bitAnd() throws RecognitionException {
		BitAndContext _localctx = new BitAndContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bitAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(BITAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitXorContext extends ParserRuleContext {
		public TerminalNode BITXOR() { return getToken(RootParser.BITXOR, 0); }
		public BitXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitXor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitXorContext bitXor() throws RecognitionException {
		BitXorContext _localctx = new BitXorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_bitXor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(BITXOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitOrContext extends ParserRuleContext {
		public TerminalNode BITOR() { return getToken(RootParser.BITOR, 0); }
		public BitOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitBitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOrContext bitOr() throws RecognitionException {
		BitOrContext _localctx = new BitOrContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_bitOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(BITOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessEqualContext extends ParserRuleContext {
		public TerminalNode LESS_EQUAL() { return getToken(RootParser.LESS_EQUAL, 0); }
		public LessEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessEqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessEqualContext lessEqual() throws RecognitionException {
		LessEqualContext _localctx = new LessEqualContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_lessEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LESS_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreEqualContext extends ParserRuleContext {
		public TerminalNode MORE_EQUAL() { return getToken(RootParser.MORE_EQUAL, 0); }
		public MoreEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreEqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitMoreEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreEqualContext moreEqual() throws RecognitionException {
		MoreEqualContext _localctx = new MoreEqualContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_moreEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(MORE_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RootParser.EQUAL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotEqualContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL() { return getToken(RootParser.NOT_EQUAL, 0); }
		public NotEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualContext notEqual() throws RecognitionException {
		NotEqualContext _localctx = new NotEqualContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_notEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(NOT_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\3\7\3"+
		"\u00a6\n\3\f\3\16\3\u00a9\13\3\3\4\3\4\3\4\5\4\u00ae\n\4\3\5\3\5\3\5\5"+
		"\5\u00b3\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00be\n\6\3\7\3\7"+
		"\7\7\u00c2\n\7\f\7\16\7\u00c5\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ef"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0107\n\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u010e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0124\n\f\f\f\16\f\u0127\13\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\6\22\u013d\n\22\r\22\16\22\u013e\3\22\7\22\u0142\n\22\f\22"+
		"\16\22\u0145\13\22\3\22\3\22\3\22\3\22\7\22\u014b\n\22\f\22\16\22\u014e"+
		"\13\22\3\22\5\22\u0151\n\22\3\22\3\22\5\22\u0155\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u015c\n\23\3\24\3\24\3\25\3\25\5\25\u0162\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0169\n\26\f\26\16\26\u016c\13\26\3\26\5\26\u016f"+
		"\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\7-\u01a2\n-"+
		"\f-\16-\u01a5\13-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\2\3\26Q\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\2\2\u01d8\2\u00a0\3"+
		"\2\2\2\4\u00a7\3\2\2\2\6\u00ad\3\2\2\2\b\u00af\3\2\2\2\n\u00bd\3\2\2\2"+
		"\f\u00bf\3\2\2\2\16\u00c6\3\2\2\2\20\u00c9\3\2\2\2\22\u00cd\3\2\2\2\24"+
		"\u00d0\3\2\2\2\26\u00e4\3\2\2\2\30\u0128\3\2\2\2\32\u012b\3\2\2\2\34\u012e"+
		"\3\2\2\2\36\u0131\3\2\2\2 \u0134\3\2\2\2\"\u0139\3\2\2\2$\u015b\3\2\2"+
		"\2&\u015d\3\2\2\2(\u0161\3\2\2\2*\u0163\3\2\2\2,\u0172\3\2\2\2.\u0174"+
		"\3\2\2\2\60\u0176\3\2\2\2\62\u0178\3\2\2\2\64\u017a\3\2\2\2\66\u017c\3"+
		"\2\2\28\u017e\3\2\2\2:\u0180\3\2\2\2<\u0182\3\2\2\2>\u0184\3\2\2\2@\u0186"+
		"\3\2\2\2B\u0188\3\2\2\2D\u018a\3\2\2\2F\u018c\3\2\2\2H\u018e\3\2\2\2J"+
		"\u0190\3\2\2\2L\u0192\3\2\2\2N\u0194\3\2\2\2P\u0196\3\2\2\2R\u0198\3\2"+
		"\2\2T\u019a\3\2\2\2V\u019c\3\2\2\2X\u01a3\3\2\2\2Z\u01a8\3\2\2\2\\\u01aa"+
		"\3\2\2\2^\u01ac\3\2\2\2`\u01ae\3\2\2\2b\u01b0\3\2\2\2d\u01b2\3\2\2\2f"+
		"\u01b4\3\2\2\2h\u01b6\3\2\2\2j\u01b8\3\2\2\2l\u01ba\3\2\2\2n\u01bc\3\2"+
		"\2\2p\u01be\3\2\2\2r\u01c0\3\2\2\2t\u01c2\3\2\2\2v\u01c4\3\2\2\2x\u01c6"+
		"\3\2\2\2z\u01c8\3\2\2\2|\u01ca\3\2\2\2~\u01cc\3\2\2\2\u0080\u01ce\3\2"+
		"\2\2\u0082\u01d0\3\2\2\2\u0084\u01d2\3\2\2\2\u0086\u01d4\3\2\2\2\u0088"+
		"\u01d6\3\2\2\2\u008a\u01d8\3\2\2\2\u008c\u01da\3\2\2\2\u008e\u01dc\3\2"+
		"\2\2\u0090\u01de\3\2\2\2\u0092\u01e0\3\2\2\2\u0094\u01e2\3\2\2\2\u0096"+
		"\u01e4\3\2\2\2\u0098\u01e6\3\2\2\2\u009a\u01e8\3\2\2\2\u009c\u01ea\3\2"+
		"\2\2\u009e\u01ec\3\2\2\2\u00a0\u00a1\5\4\3\2\u00a1\3\3\2\2\2\u00a2\u00a3"+
		"\5\6\4\2\u00a3\u00a4\5,\27\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\5\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00ae\5\b\5\2\u00ab\u00ae\5\22\n\2\u00ac\u00ae"+
		"\5\26\f\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\7\3\2\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b2\5V,\2\u00b1\u00b3\5\24"+
		"\13\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\t\3\2\2\2\u00b4\u00be"+
		"\5F$\2\u00b5\u00be\5H%\2\u00b6\u00be\5J&\2\u00b7\u00be\5L\'\2\u00b8\u00be"+
		"\5N(\2\u00b9\u00be\5P)\2\u00ba\u00be\5R*\2\u00bb\u00be\5T+\2\u00bc\u00be"+
		"\5&\24\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\13\3\2\2\2\u00bf\u00c3"+
		"\5\n\6\2\u00c0\u00c2\5\16\b\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\r\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c6\u00c7\5x=\2\u00c7\u00c8\5z>\2\u00c8\17\3\2\2\2\u00c9\u00ca"+
		"\5x=\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\5z>\2\u00cc\21\3\2\2\2\u00cd\u00ce"+
		"\5\26\f\2\u00ce\u00cf\5\24\13\2\u00cf\23\3\2\2\2\u00d0\u00d1\5h\65\2\u00d1"+
		"\u00d2\5\26\f\2\u00d2\25\3\2\2\2\u00d3\u00d4\b\f\1\2\u00d4\u00e5\5$\23"+
		"\2\u00d5\u00e5\5*\26\2\u00d6\u00e5\5V,\2\u00d7\u00e5\5\"\22\2\u00d8\u00e5"+
		"\5 \21\2\u00d9\u00da\5t;\2\u00da\u00db\5\26\f\2\u00db\u00dc\5v<\2\u00dc"+
		"\u00e5\3\2\2\2\u00dd\u00e5\5\30\r\2\u00de\u00e5\5\32\16\2\u00df\u00e5"+
		"\5\34\17\2\u00e0\u00e5\5\36\20\2\u00e1\u00e2\5\u008aF\2\u00e2\u00e3\5"+
		"\26\f\13\u00e3\u00e5\3\2\2\2\u00e4\u00d3\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4"+
		"\u00d6\3\2\2\2\u00e4\u00d7\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00d9\3\2"+
		"\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u0125\3\2\2\2\u00e6\u00e7\f\23"+
		"\2\2\u00e7\u00e8\5d\63\2\u00e8\u00e9\5\26\f\24\u00e9\u0124\3\2\2\2\u00ea"+
		"\u00ee\f\n\2\2\u00eb\u00ef\5\u0080A\2\u00ec\u00ef\5\u0082B\2\u00ed\u00ef"+
		"\5\u0088E\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\26\f\13\u00f1\u0124\3\2\2\2\u00f2"+
		"\u00f5\f\t\2\2\u00f3\u00f6\5|?\2\u00f4\u00f6\5~@\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5\26\f\n\u00f8\u0124"+
		"\3\2\2\2\u00f9\u00fd\f\b\2\2\u00fa\u00fe\5\u008cG\2\u00fb\u00fe\5\u008e"+
		"H\2\u00fc\u00fe\5\u0090I\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\5\26\f\t\u0100\u0124\3"+
		"\2\2\2\u0101\u0106\f\7\2\2\u0102\u0107\5l\67\2\u0103\u0107\5\u0098M\2"+
		"\u0104\u0107\5n8\2\u0105\u0107\5\u009aN\2\u0106\u0102\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\5\26\f\b\u0109\u0124\3\2\2\2\u010a\u010d\f\6\2\2\u010b\u010e\5"+
		"\u009cO\2\u010c\u010e\5\u009eP\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\5\26\f\7\u0110\u0124\3\2\2\2\u0111"+
		"\u0112\f\5\2\2\u0112\u0113\5\u0092J\2\u0113\u0114\5\26\f\6\u0114\u0124"+
		"\3\2\2\2\u0115\u0116\f\4\2\2\u0116\u0117\5\u0094K\2\u0117\u0118\5\26\f"+
		"\5\u0118\u0124\3\2\2\2\u0119\u011a\f\3\2\2\u011a\u011b\5\u0096L\2\u011b"+
		"\u011c\5\26\f\4\u011c\u0124\3\2\2\2\u011d\u011e\f\22\2\2\u011e\u0124\5"+
		"\20\t\2\u011f\u0120\f\21\2\2\u0120\u0124\5\u0084C\2\u0121\u0122\f\20\2"+
		"\2\u0122\u0124\5\u0086D\2\u0123\u00e6\3\2\2\2\u0123\u00ea\3\2\2\2\u0123"+
		"\u00f2\3\2\2\2\u0123\u00f9\3\2\2\2\u0123\u0101\3\2\2\2\u0123\u010a\3\2"+
		"\2\2\u0123\u0111\3\2\2\2\u0123\u0115\3\2\2\2\u0123\u0119\3\2\2\2\u0123"+
		"\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\27\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0129\5\u0084C\2\u0129\u012a\5\26\f\2\u012a\31\3\2\2\2"+
		"\u012b\u012c\5\u0086D\2\u012c\u012d\5\26\f\2\u012d\33\3\2\2\2\u012e\u012f"+
		"\5|?\2\u012f\u0130\5\26\f\2\u0130\35\3\2\2\2\u0131\u0132\5~@\2\u0132\u0133"+
		"\5\26\f\2\u0133\37\3\2\2\2\u0134\u0135\5t;\2\u0135\u0136\5\f\7\2\u0136"+
		"\u0137\5v<\2\u0137\u0138\5\26\f\2\u0138!\3\2\2\2\u0139\u013a\5.\30\2\u013a"+
		"\u0154\5\n\6\2\u013b\u013d\5\20\t\2\u013c\u013b\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\5\16\b\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3"+
		"\2\2\2\u0143\u0144\3\2\2\2\u0144\u0155\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u014c\5t;\2\u0147\u0148\5\26\f\2\u0148\u0149\5j\66\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\5\26"+
		"\f\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\5v<\2\u0153\u0155\3\2\2\2\u0154\u013c\3\2\2\2\u0154\u0146\3\2\2"+
		"\2\u0155#\3\2\2\2\u0156\u015c\5Z.\2\u0157\u015c\5\\/\2\u0158\u015c\5^"+
		"\60\2\u0159\u015c\5`\61\2\u015a\u015c\5b\62\2\u015b\u0156\3\2\2\2\u015b"+
		"\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2"+
		"\2\2\u015c%\3\2\2\2\u015d\u015e\5X-\2\u015e\'\3\2\2\2\u015f\u0162\5X-"+
		"\2\u0160\u0162\5*\26\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162)"+
		"\3\2\2\2\u0163\u0164\5V,\2\u0164\u016a\5t;\2\u0165\u0166\5\26\f\2\u0166"+
		"\u0167\5j\66\2\u0167\u0169\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016f\5\26\f\2\u016e\u016d\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5v<\2\u0171+\3\2\2\2\u0172\u0173"+
		"\5f\64\2\u0173-\3\2\2\2\u0174\u0175\7\6\2\2\u0175/\3\2\2\2\u0176\u0177"+
		"\7\7\2\2\u0177\61\3\2\2\2\u0178\u0179\7\b\2\2\u0179\63\3\2\2\2\u017a\u017b"+
		"\7\t\2\2\u017b\65\3\2\2\2\u017c\u017d\7\n\2\2\u017d\67\3\2\2\2\u017e\u017f"+
		"\7\13\2\2\u017f9\3\2\2\2\u0180\u0181\7\f\2\2\u0181;\3\2\2\2\u0182\u0183"+
		"\7\r\2\2\u0183=\3\2\2\2\u0184\u0185\7\16\2\2\u0185?\3\2\2\2\u0186\u0187"+
		"\7\17\2\2\u0187A\3\2\2\2\u0188\u0189\7\20\2\2\u0189C\3\2\2\2\u018a\u018b"+
		"\7\21\2\2\u018bE\3\2\2\2\u018c\u018d\7\22\2\2\u018dG\3\2\2\2\u018e\u018f"+
		"\7\23\2\2\u018fI\3\2\2\2\u0190\u0191\7\24\2\2\u0191K\3\2\2\2\u0192\u0193"+
		"\7\25\2\2\u0193M\3\2\2\2\u0194\u0195\7\26\2\2\u0195O\3\2\2\2\u0196\u0197"+
		"\7\27\2\2\u0197Q\3\2\2\2\u0198\u0199\7\30\2\2\u0199S\3\2\2\2\u019a\u019b"+
		"\7\31\2\2\u019bU\3\2\2\2\u019c\u019d\7\32\2\2\u019dW\3\2\2\2\u019e\u019f"+
		"\5V,\2\u019f\u01a0\7 \2\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\5V,\2\u01a7Y\3\2\2\2\u01a8\u01a9"+
		"\7\33\2\2\u01a9[\3\2\2\2\u01aa\u01ab\7\34\2\2\u01ab]\3\2\2\2\u01ac\u01ad"+
		"\7\35\2\2\u01ad_\3\2\2\2\u01ae\u01af\7\36\2\2\u01afa\3\2\2\2\u01b0\u01b1"+
		"\7\37\2\2\u01b1c\3\2\2\2\u01b2\u01b3\7 \2\2\u01b3e\3\2\2\2\u01b4\u01b5"+
		"\7!\2\2\u01b5g\3\2\2\2\u01b6\u01b7\7\"\2\2\u01b7i\3\2\2\2\u01b8\u01b9"+
		"\7#\2\2\u01b9k\3\2\2\2\u01ba\u01bb\7$\2\2\u01bbm\3\2\2\2\u01bc\u01bd\7"+
		"%\2\2\u01bdo\3\2\2\2\u01be\u01bf\7&\2\2\u01bfq\3\2\2\2\u01c0\u01c1\7\'"+
		"\2\2\u01c1s\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3u\3\2\2\2\u01c4\u01c5\7)\2"+
		"\2\u01c5w\3\2\2\2\u01c6\u01c7\7+\2\2\u01c7y\3\2\2\2\u01c8\u01c9\7,\2\2"+
		"\u01c9{\3\2\2\2\u01ca\u01cb\7-\2\2\u01cb}\3\2\2\2\u01cc\u01cd\7*\2\2\u01cd"+
		"\177\3\2\2\2\u01ce\u01cf\7.\2\2\u01cf\u0081\3\2\2\2\u01d0\u01d1\7/\2\2"+
		"\u01d1\u0083\3\2\2\2\u01d2\u01d3\7\60\2\2\u01d3\u0085\3\2\2\2\u01d4\u01d5"+
		"\7\61\2\2\u01d5\u0087\3\2\2\2\u01d6\u01d7\7\62\2\2\u01d7\u0089\3\2\2\2"+
		"\u01d8\u01d9\7\63\2\2\u01d9\u008b\3\2\2\2\u01da\u01db\7\64\2\2\u01db\u008d"+
		"\3\2\2\2\u01dc\u01dd\7\65\2\2\u01dd\u008f\3\2\2\2\u01de\u01df\7\66\2\2"+
		"\u01df\u0091\3\2\2\2\u01e0\u01e1\7\67\2\2\u01e1\u0093\3\2\2\2\u01e2\u01e3"+
		"\78\2\2\u01e3\u0095\3\2\2\2\u01e4\u01e5\79\2\2\u01e5\u0097\3\2\2\2\u01e6"+
		"\u01e7\7:\2\2\u01e7\u0099\3\2\2\2\u01e8\u01e9\7;\2\2\u01e9\u009b\3\2\2"+
		"\2\u01ea\u01eb\7<\2\2\u01eb\u009d\3\2\2\2\u01ec\u01ed\7=\2\2\u01ed\u009f"+
		"\3\2\2\2\31\u00a7\u00ad\u00b2\u00bd\u00c3\u00e4\u00ee\u00f5\u00fd\u0106"+
		"\u010d\u0123\u0125\u013e\u0143\u014c\u0150\u0154\u015b\u0161\u016a\u016e"+
		"\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}