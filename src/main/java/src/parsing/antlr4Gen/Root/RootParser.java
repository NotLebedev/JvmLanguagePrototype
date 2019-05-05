package src.parsing.antlr4Gen.Root;// Generated from C:/Users/Tema.leog-PC/IdeaProjects/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
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
		PLUS=43, ASTERISK=44, SLASH=45, INCREMENT=46, DECREMENT=47, PERCENT=48;
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
		RULE_semicolonS = 50, RULE_equalsS = 51, RULE_commaS = 52, RULE_inequalityOpenS = 53, 
		RULE_inequalityCloseS = 54, RULE_braceopenS = 55, RULE_brcecloseS = 56, 
		RULE_bracketOpenS = 57, RULE_bracketCloseS = 58, RULE_squareBracketOpen = 59, 
		RULE_squareBracketClose = 60, RULE_plusS = 61, RULE_minusS = 62, RULE_asteriskS = 63, 
		RULE_slashS = 64, RULE_incrementS = 65, RULE_decrementS = 66, RULE_percentS = 67;
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
			"commaS", "inequalityOpenS", "inequalityCloseS", "braceopenS", "brcecloseS", 
			"bracketOpenS", "bracketCloseS", "squareBracketOpen", "squareBracketClose", 
			"plusS", "minusS", "asteriskS", "slashS", "incrementS", "decrementS", 
			"percentS"
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
			setState(136);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << LONG) | (1L << SHORT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) {
				{
				{
				setState(138);
				expression();
				setState(139);
				eol();
				}
				}
				setState(145);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
			setState(151);
			declarationType();
			setState(152);
			id();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(153);
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				booleanT();
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				byteT();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				charT();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				longT();
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				shortT();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				intT();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				floatT();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				doubleT();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
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
			setState(167);
			arrayType();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUAREBRACKETOPEN) {
				{
				{
				setState(168);
				arrayModifier();
				}
				}
				setState(173);
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
			setState(174);
			squareBracketOpen();
			setState(175);
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
			setState(177);
			squareBracketOpen();
			setState(178);
			value(0);
			setState(179);
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
			setState(181);
			value(0);
			setState(182);
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
			setState(184);
			equalsS();
			setState(185);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new LITERALContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				literalCG();
				}
				break;
			case 2:
				{
				_localctx = new METHOD_INVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				methodInv();
				}
				break;
			case 3:
				{
				_localctx = new ID_LABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				id();
				}
				break;
			case 4:
				{
				_localctx = new OBJECT_INSTANTIATIONContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				objectInstantiation();
				}
				break;
			case 5:
				{
				_localctx = new CAST_LABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				cast();
				}
				break;
			case 6:
				{
				_localctx = new PARENTHESISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				bracketOpenS();
				setState(194);
				value(0);
				setState(195);
				bracketCloseS();
				}
				break;
			case 7:
				{
				_localctx = new PRE_INCREMENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				preIncrement();
				}
				break;
			case 8:
				{
				_localctx = new PRE_DECREMENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				preDecrement();
				}
				break;
			case 9:
				{
				_localctx = new UNARY_PLUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				unaryPlus();
				}
				break;
			case 10:
				{
				_localctx = new UNARY_MINUSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				unaryMinus();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ACCESSContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(203);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(204);
						dotS();
						setState(205);
						value(11);
						}
						break;
					case 2:
						{
						_localctx = new MULTIPLICATIVE_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASTERISK:
							{
							setState(208);
							asteriskS();
							}
							break;
						case SLASH:
							{
							setState(209);
							slashS();
							}
							break;
						case PERCENT:
							{
							setState(210);
							percentS();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(213);
						value(3);
						}
						break;
					case 3:
						{
						_localctx = new ADDITIVE_OPContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(215);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(216);
							plusS();
							}
							break;
						case MINUS:
							{
							setState(217);
							minusS();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(220);
						value(2);
						}
						break;
					case 4:
						{
						_localctx = new ARRAY_ACCESSContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						arrayIndex();
						}
						break;
					case 5:
						{
						_localctx = new POST_INCREMENTContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
						incrementS();
						}
						break;
					case 6:
						{
						_localctx = new POST_DECREMENTContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227);
						decrementS();
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(233);
			incrementS();
			setState(234);
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
			setState(236);
			decrementS();
			setState(237);
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
			setState(239);
			plusS();
			setState(240);
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
			setState(242);
			minusS();
			setState(243);
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
			setState(245);
			bracketOpenS();
			setState(246);
			declarationType();
			setState(247);
			bracketCloseS();
			setState(248);
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
			setState(250);
			newKW();
			setState(251);
			arrayType();
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREBRACKETOPEN:
				{
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252);
						arrayIndex();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						arrayModifier();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case BRACKETOPEN:
				{
				setState(263);
				bracketOpenS();
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						value(0);
						setState(265);
						commaS();
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) {
					{
					setState(272);
					value(0);
					}
				}

				setState(275);
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCG:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				stringCG();
				}
				break;
			case INTEGERCG:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				integerCG();
				}
				break;
			case LONGCG:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				longCG();
				}
				break;
			case FLOATCG:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				floatCG();
				}
				break;
			case CHARACTERCG:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
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
			setState(286);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(288);
				path();
				}
				break;
			case 2:
				{
				setState(289);
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
			setState(292);
			id();
			setState(293);
			bracketOpenS();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					value(0);
					setState(295);
					commaS();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << LONGCG) | (1L << FLOATCG) | (1L << CHARACTERCG) | (1L << BRACKETOPEN) | (1L << MINUS) | (1L << PLUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) {
				{
				setState(302);
				value(0);
				}
			}

			setState(305);
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
			setState(307);
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
			setState(309);
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
			setState(311);
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
			setState(313);
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
			setState(315);
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
			setState(317);
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
			setState(319);
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
			setState(321);
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
			setState(323);
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
			setState(325);
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
			setState(327);
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
			setState(329);
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
			setState(331);
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
			setState(333);
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
			setState(335);
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
			setState(337);
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
			setState(339);
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
			setState(341);
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
			setState(343);
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
			setState(345);
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
			setState(347);
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
			setState(349);
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
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					id();
					setState(352);
					match(DOT);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(359);
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
			setState(361);
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
			setState(363);
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
			setState(365);
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
			setState(367);
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
			setState(369);
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
			setState(371);
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
			setState(373);
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
			setState(375);
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
			setState(377);
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

	public static class InequalityOpenSContext extends ParserRuleContext {
		public TerminalNode INEQUALITYOPEN() { return getToken(RootParser.INEQUALITYOPEN, 0); }
		public InequalityOpenSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityOpenS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitInequalityOpenS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InequalityOpenSContext inequalityOpenS() throws RecognitionException {
		InequalityOpenSContext _localctx = new InequalityOpenSContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inequalityOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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

	public static class InequalityCloseSContext extends ParserRuleContext {
		public TerminalNode INEQUALITYCLOSE() { return getToken(RootParser.INEQUALITYCLOSE, 0); }
		public InequalityCloseSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityCloseS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitInequalityCloseS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InequalityCloseSContext inequalityCloseS() throws RecognitionException {
		InequalityCloseSContext _localctx = new InequalityCloseSContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_inequalityCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
			setState(383);
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
			setState(385);
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
			setState(387);
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
			setState(389);
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
			setState(391);
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
			setState(393);
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
			setState(395);
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
			setState(397);
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
			setState(399);
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
			setState(401);
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
			setState(403);
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
			setState(405);
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
			setState(407);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u019c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3\7"+
		"\3\u0090\n\3\f\3\16\3\u0093\13\3\3\4\3\4\3\4\5\4\u0098\n\4\3\5\3\5\3\5"+
		"\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\7\3"+
		"\7\7\7\u00ac\n\7\f\7\16\7\u00af\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00cc\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e7"+
		"\n\f\f\f\16\f\u00ea\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\6\22\u0100\n\22\r\22"+
		"\16\22\u0101\3\22\7\22\u0105\n\22\f\22\16\22\u0108\13\22\3\22\3\22\3\22"+
		"\3\22\7\22\u010e\n\22\f\22\16\22\u0111\13\22\3\22\5\22\u0114\n\22\3\22"+
		"\3\22\5\22\u0118\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3"+
		"\24\3\25\3\25\5\25\u0125\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u012c\n\26"+
		"\f\26\16\26\u012f\13\26\3\26\5\26\u0132\n\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3-\7-\u0165\n-\f-\16-\u0168\13-\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\2\3\26F\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\2\2\2\u0183\2\u008a\3\2\2\2\4\u0091\3\2\2\2\6"+
		"\u0097\3\2\2\2\b\u0099\3\2\2\2\n\u00a7\3\2\2\2\f\u00a9\3\2\2\2\16\u00b0"+
		"\3\2\2\2\20\u00b3\3\2\2\2\22\u00b7\3\2\2\2\24\u00ba\3\2\2\2\26\u00cb\3"+
		"\2\2\2\30\u00eb\3\2\2\2\32\u00ee\3\2\2\2\34\u00f1\3\2\2\2\36\u00f4\3\2"+
		"\2\2 \u00f7\3\2\2\2\"\u00fc\3\2\2\2$\u011e\3\2\2\2&\u0120\3\2\2\2(\u0124"+
		"\3\2\2\2*\u0126\3\2\2\2,\u0135\3\2\2\2.\u0137\3\2\2\2\60\u0139\3\2\2\2"+
		"\62\u013b\3\2\2\2\64\u013d\3\2\2\2\66\u013f\3\2\2\28\u0141\3\2\2\2:\u0143"+
		"\3\2\2\2<\u0145\3\2\2\2>\u0147\3\2\2\2@\u0149\3\2\2\2B\u014b\3\2\2\2D"+
		"\u014d\3\2\2\2F\u014f\3\2\2\2H\u0151\3\2\2\2J\u0153\3\2\2\2L\u0155\3\2"+
		"\2\2N\u0157\3\2\2\2P\u0159\3\2\2\2R\u015b\3\2\2\2T\u015d\3\2\2\2V\u015f"+
		"\3\2\2\2X\u0166\3\2\2\2Z\u016b\3\2\2\2\\\u016d\3\2\2\2^\u016f\3\2\2\2"+
		"`\u0171\3\2\2\2b\u0173\3\2\2\2d\u0175\3\2\2\2f\u0177\3\2\2\2h\u0179\3"+
		"\2\2\2j\u017b\3\2\2\2l\u017d\3\2\2\2n\u017f\3\2\2\2p\u0181\3\2\2\2r\u0183"+
		"\3\2\2\2t\u0185\3\2\2\2v\u0187\3\2\2\2x\u0189\3\2\2\2z\u018b\3\2\2\2|"+
		"\u018d\3\2\2\2~\u018f\3\2\2\2\u0080\u0191\3\2\2\2\u0082\u0193\3\2\2\2"+
		"\u0084\u0195\3\2\2\2\u0086\u0197\3\2\2\2\u0088\u0199\3\2\2\2\u008a\u008b"+
		"\5\4\3\2\u008b\3\3\2\2\2\u008c\u008d\5\6\4\2\u008d\u008e\5,\27\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\5\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098"+
		"\5\b\5\2\u0095\u0098\5\22\n\2\u0096\u0098\5\26\f\2\u0097\u0094\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\7\3\2\2\2\u0099\u009a\5"+
		"\f\7\2\u009a\u009c\5V,\2\u009b\u009d\5\24\13\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\t\3\2\2\2\u009e\u00a8\5F$\2\u009f\u00a8\5H%\2\u00a0"+
		"\u00a8\5J&\2\u00a1\u00a8\5L\'\2\u00a2\u00a8\5N(\2\u00a3\u00a8\5P)\2\u00a4"+
		"\u00a8\5R*\2\u00a5\u00a8\5T+\2\u00a6\u00a8\5&\24\2\u00a7\u009e\3\2\2\2"+
		"\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2"+
		"\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\13\3\2\2\2\u00a9\u00ad\5\n\6\2\u00aa\u00ac\5\16\b"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\r\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5x=\2\u00b1\u00b2"+
		"\5z>\2\u00b2\17\3\2\2\2\u00b3\u00b4\5x=\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6"+
		"\5z>\2\u00b6\21\3\2\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\5\24\13\2\u00b9"+
		"\23\3\2\2\2\u00ba\u00bb\5h\65\2\u00bb\u00bc\5\26\f\2\u00bc\25\3\2\2\2"+
		"\u00bd\u00be\b\f\1\2\u00be\u00cc\5$\23\2\u00bf\u00cc\5*\26\2\u00c0\u00cc"+
		"\5V,\2\u00c1\u00cc\5\"\22\2\u00c2\u00cc\5 \21\2\u00c3\u00c4\5t;\2\u00c4"+
		"\u00c5\5\26\f\2\u00c5\u00c6\5v<\2\u00c6\u00cc\3\2\2\2\u00c7\u00cc\5\30"+
		"\r\2\u00c8\u00cc\5\32\16\2\u00c9\u00cc\5\34\17\2\u00ca\u00cc\5\36\20\2"+
		"\u00cb\u00bd\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c1"+
		"\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00e8\3\2"+
		"\2\2\u00cd\u00ce\f\f\2\2\u00ce\u00cf\5d\63\2\u00cf\u00d0\5\26\f\r\u00d0"+
		"\u00e7\3\2\2\2\u00d1\u00d5\f\4\2\2\u00d2\u00d6\5\u0080A\2\u00d3\u00d6"+
		"\5\u0082B\2\u00d4\u00d6\5\u0088E\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\26\f\5\u00d8"+
		"\u00e7\3\2\2\2\u00d9\u00dc\f\3\2\2\u00da\u00dd\5|?\2\u00db\u00dd\5~@\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\5\26\f\4\u00df\u00e7\3\2\2\2\u00e0\u00e1\f\13\2\2\u00e1\u00e7\5\20\t"+
		"\2\u00e2\u00e3\f\n\2\2\u00e3\u00e7\5\u0084C\2\u00e4\u00e5\f\t\2\2\u00e5"+
		"\u00e7\5\u0086D\2\u00e6\u00cd\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d9"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\27\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\u0084C\2\u00ec\u00ed\5\26\f\2\u00ed"+
		"\31\3\2\2\2\u00ee\u00ef\5\u0086D\2\u00ef\u00f0\5\26\f\2\u00f0\33\3\2\2"+
		"\2\u00f1\u00f2\5|?\2\u00f2\u00f3\5\26\f\2\u00f3\35\3\2\2\2\u00f4\u00f5"+
		"\5~@\2\u00f5\u00f6\5\26\f\2\u00f6\37\3\2\2\2\u00f7\u00f8\5t;\2\u00f8\u00f9"+
		"\5\f\7\2\u00f9\u00fa\5v<\2\u00fa\u00fb\5\26\f\2\u00fb!\3\2\2\2\u00fc\u00fd"+
		"\5.\30\2\u00fd\u0117\5\n\6\2\u00fe\u0100\5\20\t\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0105\5\16\b\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0118\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010f\5t;\2\u010a\u010b\5\26\f\2\u010b\u010c\5j\66\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0114\5\26\f\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0116\5v<\2\u0116\u0118\3\2\2\2\u0117\u00ff\3\2\2\2\u0117"+
		"\u0109\3\2\2\2\u0118#\3\2\2\2\u0119\u011f\5Z.\2\u011a\u011f\5\\/\2\u011b"+
		"\u011f\5^\60\2\u011c\u011f\5`\61\2\u011d\u011f\5b\62\2\u011e\u0119\3\2"+
		"\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f%\3\2\2\2\u0120\u0121\5X-\2\u0121\'\3\2\2\2\u0122"+
		"\u0125\5X-\2\u0123\u0125\5*\26\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2"+
		"\2\u0125)\3\2\2\2\u0126\u0127\5V,\2\u0127\u012d\5t;\2\u0128\u0129\5\26"+
		"\f\2\u0129\u012a\5j\66\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0132\5\26\f\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\5v<\2\u0134+\3\2\2\2\u0135"+
		"\u0136\5f\64\2\u0136-\3\2\2\2\u0137\u0138\7\6\2\2\u0138/\3\2\2\2\u0139"+
		"\u013a\7\7\2\2\u013a\61\3\2\2\2\u013b\u013c\7\b\2\2\u013c\63\3\2\2\2\u013d"+
		"\u013e\7\t\2\2\u013e\65\3\2\2\2\u013f\u0140\7\n\2\2\u0140\67\3\2\2\2\u0141"+
		"\u0142\7\13\2\2\u01429\3\2\2\2\u0143\u0144\7\f\2\2\u0144;\3\2\2\2\u0145"+
		"\u0146\7\r\2\2\u0146=\3\2\2\2\u0147\u0148\7\16\2\2\u0148?\3\2\2\2\u0149"+
		"\u014a\7\17\2\2\u014aA\3\2\2\2\u014b\u014c\7\20\2\2\u014cC\3\2\2\2\u014d"+
		"\u014e\7\21\2\2\u014eE\3\2\2\2\u014f\u0150\7\22\2\2\u0150G\3\2\2\2\u0151"+
		"\u0152\7\23\2\2\u0152I\3\2\2\2\u0153\u0154\7\24\2\2\u0154K\3\2\2\2\u0155"+
		"\u0156\7\25\2\2\u0156M\3\2\2\2\u0157\u0158\7\26\2\2\u0158O\3\2\2\2\u0159"+
		"\u015a\7\27\2\2\u015aQ\3\2\2\2\u015b\u015c\7\30\2\2\u015cS\3\2\2\2\u015d"+
		"\u015e\7\31\2\2\u015eU\3\2\2\2\u015f\u0160\7\32\2\2\u0160W\3\2\2\2\u0161"+
		"\u0162\5V,\2\u0162\u0163\7 \2\2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2"+
		"\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\5V,\2\u016aY\3\2\2\2\u016b\u016c"+
		"\7\33\2\2\u016c[\3\2\2\2\u016d\u016e\7\34\2\2\u016e]\3\2\2\2\u016f\u0170"+
		"\7\35\2\2\u0170_\3\2\2\2\u0171\u0172\7\36\2\2\u0172a\3\2\2\2\u0173\u0174"+
		"\7\37\2\2\u0174c\3\2\2\2\u0175\u0176\7 \2\2\u0176e\3\2\2\2\u0177\u0178"+
		"\7!\2\2\u0178g\3\2\2\2\u0179\u017a\7\"\2\2\u017ai\3\2\2\2\u017b\u017c"+
		"\7#\2\2\u017ck\3\2\2\2\u017d\u017e\7$\2\2\u017em\3\2\2\2\u017f\u0180\7"+
		"%\2\2\u0180o\3\2\2\2\u0181\u0182\7&\2\2\u0182q\3\2\2\2\u0183\u0184\7\'"+
		"\2\2\u0184s\3\2\2\2\u0185\u0186\7(\2\2\u0186u\3\2\2\2\u0187\u0188\7)\2"+
		"\2\u0188w\3\2\2\2\u0189\u018a\7+\2\2\u018ay\3\2\2\2\u018b\u018c\7,\2\2"+
		"\u018c{\3\2\2\2\u018d\u018e\7-\2\2\u018e}\3\2\2\2\u018f\u0190\7*\2\2\u0190"+
		"\177\3\2\2\2\u0191\u0192\7.\2\2\u0192\u0081\3\2\2\2\u0193\u0194\7/\2\2"+
		"\u0194\u0083\3\2\2\2\u0195\u0196\7\60\2\2\u0196\u0085\3\2\2\2\u0197\u0198"+
		"\7\61\2\2\u0198\u0087\3\2\2\2\u0199\u019a\7\62\2\2\u019a\u0089\3\2\2\2"+
		"\26\u0091\u0097\u009c\u00a7\u00ad\u00cb\u00d5\u00dc\u00e6\u00e8\u0101"+
		"\u0106\u010f\u0113\u0117\u011e\u0124\u012d\u0131\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}