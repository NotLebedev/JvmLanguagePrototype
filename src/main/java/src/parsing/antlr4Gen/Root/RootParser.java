// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7
package src.parsing.antlr4Gen.Root;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RootParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PUBLIC=2, PRIVATE=3, PROTECTED=4, STATIC=5, ABSTRACT=6, SYNCHRONIZED=7, 
		TRANSIENT=8, VOLATILE=9, FINAL=10, NATIVE=11, STRICTFP=12, BOOLEAN=13, 
		BYTE=14, CHAR=15, LONG=16, SHORT=17, INT=18, FLOAT=19, DOUBLE=20, ID=21, 
		PATH=22, STRINGCG=23, INTEGERCG=24, FLOATCG=25, CHARACTERCG=26, DOT=27, 
		SEMICOLON=28, EQUALS=29, COMMA=30, INEQUALITYOPEN=31, INEQUALITYCLOSE=32, 
		BRACEOPEN=33, BRACECLOSE=34, BRACKETOPEN=35, BRACKETCLOSE=36, MINUS=37, 
		SQUAREBRACKETOPEN=38, SQUAREBRACKETCLOSE=39;
	public static final int
		RULE_code = 0, RULE_methodCode = 1, RULE_expression = 2, RULE_variableDeclaration = 3, 
		RULE_type = 4, RULE_arrayModifier = 5, RULE_variableAssignment = 6, RULE_assignment = 7, 
		RULE_value = 8, RULE_literalCG = 9, RULE_className = 10, RULE_classAccess = 11, 
		RULE_methodInv = 12, RULE_pathNoEndDot = 13, RULE_eol = 14, RULE_publicAM = 15, 
		RULE_privateAM = 16, RULE_protectedAM = 17, RULE_staticAM = 18, RULE_abstractAM = 19, 
		RULE_synchronizedAM = 20, RULE_transientAM = 21, RULE_volatileAM = 22, 
		RULE_finalAM = 23, RULE_nativeAM = 24, RULE_strrictfpAM = 25, RULE_booleanT = 26, 
		RULE_byteT = 27, RULE_charT = 28, RULE_longT = 29, RULE_shortT = 30, RULE_intT = 31, 
		RULE_floatT = 32, RULE_doubleT = 33, RULE_id = 34, RULE_path = 35, RULE_stringCG = 36, 
		RULE_integerCG = 37, RULE_floatCG = 38, RULE_characterCG = 39, RULE_dotS = 40, 
		RULE_semicolonS = 41, RULE_equalsS = 42, RULE_commaS = 43, RULE_inequalityOpenS = 44, 
		RULE_inequalityCloseS = 45, RULE_braceopenS = 46, RULE_brcecloseS = 47, 
		RULE_bracketOpenS = 48, RULE_bracketCloseS = 49, RULE_squareBracketOpen = 50, 
		RULE_squareBracketClose = 51;
	public static final String[] ruleNames = {
		"code", "methodCode", "expression", "variableDeclaration", "type", "arrayModifier", 
		"variableAssignment", "assignment", "value", "literalCG", "className", 
		"classAccess", "methodInv", "pathNoEndDot", "eol", "publicAM", "privateAM", 
		"protectedAM", "staticAM", "abstractAM", "synchronizedAM", "transientAM", 
		"volatileAM", "finalAM", "nativeAM", "strrictfpAM", "booleanT", "byteT", 
		"charT", "longT", "shortT", "intT", "floatT", "doubleT", "id", "path", 
		"stringCG", "integerCG", "floatCG", "characterCG", "dotS", "semicolonS", 
		"equalsS", "commaS", "inequalityOpenS", "inequalityCloseS", "braceopenS", 
		"brcecloseS", "bracketOpenS", "bracketCloseS", "squareBracketOpen", "squareBracketClose"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'public'", "'private'", "'protected'", "'static'", "'abstract'", 
		"'synchronized'", "'transient'", "'volatile'", "'final'", "'native'", 
		"'strictfp'", "'boolean'", "'byte'", "'char'", "'long'", "'short'", "'int'", 
		"'float'", "'double'", null, null, null, null, null, null, "'.'", "';'", 
		"'='", "','", "'<'", "'>'", "'{'", "'}'", "'('", "')'", "'-'", "'\u005B'", 
		"'\u005D'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", "SYNCHRONIZED", 
		"TRANSIENT", "VOLATILE", "FINAL", "NATIVE", "STRICTFP", "BOOLEAN", "BYTE", 
		"CHAR", "LONG", "SHORT", "INT", "FLOAT", "DOUBLE", "ID", "PATH", "STRINGCG", 
		"INTEGERCG", "FLOATCG", "CHARACTERCG", "DOT", "SEMICOLON", "EQUALS", "COMMA", 
		"INEQUALITYOPEN", "INEQUALITYCLOSE", "BRACEOPEN", "BRACECLOSE", "BRACKETOPEN", 
		"BRACKETCLOSE", "MINUS", "SQUAREBRACKETOPEN", "SQUAREBRACKETCLOSE"
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
			setState(104);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << LONG) | (1L << SHORT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << ID) | (1L << PATH))) != 0)) {
				{
				{
				setState(106);
				expression();
				setState(107);
				eol();
				}
				}
				setState(113);
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
		public ClassAccessContext classAccess() {
			return getRuleContext(ClassAccessContext.class,0);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				classAccess();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(119);
			type();
			setState(120);
			id();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(121);
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

	public static class TypeContext extends ParserRuleContext {
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
		public List<ArrayModifierContext> arrayModifier() {
			return getRuleContexts(ArrayModifierContext.class);
		}
		public ArrayModifierContext arrayModifier(int i) {
			return getRuleContext(ArrayModifierContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(124);
				booleanT();
				}
				break;
			case BYTE:
				{
				setState(125);
				byteT();
				}
				break;
			case CHAR:
				{
				setState(126);
				charT();
				}
				break;
			case LONG:
				{
				setState(127);
				longT();
				}
				break;
			case SHORT:
				{
				setState(128);
				shortT();
				}
				break;
			case INT:
				{
				setState(129);
				intT();
				}
				break;
			case FLOAT:
				{
				setState(130);
				floatT();
				}
				break;
			case DOUBLE:
				{
				setState(131);
				doubleT();
				}
				break;
			case PATH:
				{
				setState(132);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUAREBRACKETOPEN) {
				{
				{
				setState(135);
				arrayModifier();
				}
				}
				setState(140);
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
		enterRule(_localctx, 10, RULE_arrayModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			squareBracketOpen();
			setState(142);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 12, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			id();
			setState(145);
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
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			equalsS();
			setState(148);
			value();
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
		public LiteralCGContext literalCG() {
			return getRuleContext(LiteralCGContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ClassAccessContext classAccess() {
			return getRuleContext(ClassAccessContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				literalCG();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				classAccess();
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

	public static class LiteralCGContext extends ParserRuleContext {
		public StringCGContext stringCG() {
			return getRuleContext(StringCGContext.class,0);
		}
		public IntegerCGContext integerCG() {
			return getRuleContext(IntegerCGContext.class,0);
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
		enterRule(_localctx, 18, RULE_literalCG);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCG:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				stringCG();
				}
				break;
			case INTEGERCG:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				integerCG();
				}
				break;
			case FLOATCG:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				floatCG();
				}
				break;
			case CHARACTERCG:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 20, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			path();
			setState(162);
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

	public static class ClassAccessContext extends ParserRuleContext {
		public PathNoEndDotContext pathNoEndDot() {
			return getRuleContext(PathNoEndDotContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<MethodInvContext> methodInv() {
			return getRuleContexts(MethodInvContext.class);
		}
		public MethodInvContext methodInv(int i) {
			return getRuleContext(MethodInvContext.class,i);
		}
		public DotSContext dotS() {
			return getRuleContext(DotSContext.class,0);
		}
		public ClassAccessContext classAccess() {
			return getRuleContext(ClassAccessContext.class,0);
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
		enterRule(_localctx, 22, RULE_classAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(164);
				pathNoEndDot();
				}
				break;
			case 2:
				{
				setState(165);
				path();
				}
				break;
			case 3:
				{
				setState(166);
				methodInv();
				}
				break;
			}
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(169);
				methodInv();
				}
				break;
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(172);
				dotS();
				setState(173);
				classAccess();
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
		enterRule(_localctx, 24, RULE_methodInv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			id();
			setState(178);
			bracketOpenS();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					value();
					setState(180);
					commaS();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << PATH) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << FLOATCG) | (1L << CHARACTERCG))) != 0)) {
				{
				setState(187);
				value();
				}
			}

			setState(190);
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

	public static class PathNoEndDotContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathNoEndDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathNoEndDot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RootVisitor ) return ((RootVisitor<? extends T>)visitor).visitPathNoEndDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNoEndDotContext pathNoEndDot() throws RecognitionException {
		PathNoEndDotContext _localctx = new PathNoEndDotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pathNoEndDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATH) {
				{
				setState(192);
				path();
				}
			}

			setState(195);
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
		enterRule(_localctx, 28, RULE_eol);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				semicolonS();
				}
				break;
			case EOF:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case LONG:
			case SHORT:
			case INT:
			case FLOAT:
			case DOUBLE:
			case ID:
			case PATH:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 30, RULE_publicAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 32, RULE_privateAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 34, RULE_protectedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 36, RULE_staticAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 38, RULE_abstractAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		enterRule(_localctx, 40, RULE_synchronizedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 42, RULE_transientAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 44, RULE_volatileAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 46, RULE_finalAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 48, RULE_nativeAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 50, RULE_strrictfpAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 52, RULE_booleanT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 54, RULE_byteT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 56, RULE_charT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 58, RULE_longT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		enterRule(_localctx, 60, RULE_shortT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 62, RULE_intT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 64, RULE_floatT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 66, RULE_doubleT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 68, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public TerminalNode PATH() { return getToken(RootParser.PATH, 0); }
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
		enterRule(_localctx, 70, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PATH);
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
		enterRule(_localctx, 72, RULE_stringCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 74, RULE_integerCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 76, RULE_floatCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 78, RULE_characterCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 80, RULE_dotS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 82, RULE_semicolonS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 84, RULE_equalsS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 86, RULE_commaS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 88, RULE_inequalityOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 90, RULE_inequalityCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 92, RULE_braceopenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 94, RULE_brcecloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 96, RULE_bracketOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 98, RULE_bracketCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 100, RULE_squareBracketOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 102, RULE_squareBracketClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4\3\4"+
		"\5\4x\n\4\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0088\n\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00aa\n\r\3\r\5\r\u00ad\n\r\3\r\3\r"+
		"\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00b9\n\16\f\16\16\16"+
		"\u00bc\13\16\3\16\5\16\u00bf\n\16\3\16\3\16\3\17\5\17\u00c4\n\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\2\2"+
		"\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfh\2\2\2\u00fb\2j\3\2\2\2\4q\3\2\2\2\6w\3\2\2\2\by\3"+
		"\2\2\2\n\u0087\3\2\2\2\f\u008f\3\2\2\2\16\u0092\3\2\2\2\20\u0095\3\2\2"+
		"\2\22\u009b\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a9\3\2\2\2"+
		"\32\u00b3\3\2\2\2\34\u00c3\3\2\2\2\36\u00c9\3\2\2\2 \u00cb\3\2\2\2\"\u00cd"+
		"\3\2\2\2$\u00cf\3\2\2\2&\u00d1\3\2\2\2(\u00d3\3\2\2\2*\u00d5\3\2\2\2,"+
		"\u00d7\3\2\2\2.\u00d9\3\2\2\2\60\u00db\3\2\2\2\62\u00dd\3\2\2\2\64\u00df"+
		"\3\2\2\2\66\u00e1\3\2\2\28\u00e3\3\2\2\2:\u00e5\3\2\2\2<\u00e7\3\2\2\2"+
		">\u00e9\3\2\2\2@\u00eb\3\2\2\2B\u00ed\3\2\2\2D\u00ef\3\2\2\2F\u00f1\3"+
		"\2\2\2H\u00f3\3\2\2\2J\u00f5\3\2\2\2L\u00f7\3\2\2\2N\u00f9\3\2\2\2P\u00fb"+
		"\3\2\2\2R\u00fd\3\2\2\2T\u00ff\3\2\2\2V\u0101\3\2\2\2X\u0103\3\2\2\2Z"+
		"\u0105\3\2\2\2\\\u0107\3\2\2\2^\u0109\3\2\2\2`\u010b\3\2\2\2b\u010d\3"+
		"\2\2\2d\u010f\3\2\2\2f\u0111\3\2\2\2h\u0113\3\2\2\2jk\5\4\3\2k\3\3\2\2"+
		"\2lm\5\6\4\2mn\5\36\20\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r\5\3\2\2\2sq\3\2\2\2tx\5\b\5\2ux\5\16\b\2vx\5\30\r\2wt\3\2\2\2wu"+
		"\3\2\2\2wv\3\2\2\2x\7\3\2\2\2yz\5\n\6\2z|\5F$\2{}\5\20\t\2|{\3\2\2\2|"+
		"}\3\2\2\2}\t\3\2\2\2~\u0088\5\66\34\2\177\u0088\58\35\2\u0080\u0088\5"+
		":\36\2\u0081\u0088\5<\37\2\u0082\u0088\5> \2\u0083\u0088\5@!\2\u0084\u0088"+
		"\5B\"\2\u0085\u0088\5D#\2\u0086\u0088\5\26\f\2\u0087~\3\2\2\2\u0087\177"+
		"\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\13\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0090\5f\64\2\u0090\u0091\5h\65\2\u0091\r"+
		"\3\2\2\2\u0092\u0093\5F$\2\u0093\u0094\5\20\t\2\u0094\17\3\2\2\2\u0095"+
		"\u0096\5V,\2\u0096\u0097\5\22\n\2\u0097\21\3\2\2\2\u0098\u009c\5\24\13"+
		"\2\u0099\u009c\5F$\2\u009a\u009c\5\30\r\2\u009b\u0098\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\23\3\2\2\2\u009d\u00a2\5J&\2\u009e"+
		"\u00a2\5L\'\2\u009f\u00a2\5N(\2\u00a0\u00a2\5P)\2\u00a1\u009d\3\2\2\2"+
		"\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25"+
		"\3\2\2\2\u00a3\u00a4\5H%\2\u00a4\u00a5\5F$\2\u00a5\27\3\2\2\2\u00a6\u00aa"+
		"\5\34\17\2\u00a7\u00aa\5H%\2\u00a8\u00aa\5\32\16\2\u00a9\u00a6\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad"+
		"\5\32\16\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2"+
		"\u00ae\u00af\5R*\2\u00af\u00b0\5\30\r\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\5F$\2\u00b4"+
		"\u00ba\5b\62\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\5X-\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5\22"+
		"\n\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\5d\63\2\u00c1\33\3\2\2\2\u00c2\u00c4\5H%\2\u00c3\u00c2\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5F$\2\u00c6\35\3"+
		"\2\2\2\u00c7\u00ca\5T+\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\7\4\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00ce\7\5\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0%\3\2\2\2\u00d1"+
		"\u00d2\7\7\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4)\3\2\2\2\u00d5"+
		"\u00d6\7\t\2\2\u00d6+\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8-\3\2\2\2\u00d9"+
		"\u00da\7\13\2\2\u00da/\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\61\3\2\2\2\u00dd"+
		"\u00de\7\r\2\2\u00de\63\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0\65\3\2\2\2"+
		"\u00e1\u00e2\7\17\2\2\u00e2\67\3\2\2\2\u00e3\u00e4\7\20\2\2\u00e49\3\2"+
		"\2\2\u00e5\u00e6\7\21\2\2\u00e6;\3\2\2\2\u00e7\u00e8\7\22\2\2\u00e8=\3"+
		"\2\2\2\u00e9\u00ea\7\23\2\2\u00ea?\3\2\2\2\u00eb\u00ec\7\24\2\2\u00ec"+
		"A\3\2\2\2\u00ed\u00ee\7\25\2\2\u00eeC\3\2\2\2\u00ef\u00f0\7\26\2\2\u00f0"+
		"E\3\2\2\2\u00f1\u00f2\7\27\2\2\u00f2G\3\2\2\2\u00f3\u00f4\7\30\2\2\u00f4"+
		"I\3\2\2\2\u00f5\u00f6\7\31\2\2\u00f6K\3\2\2\2\u00f7\u00f8\7\32\2\2\u00f8"+
		"M\3\2\2\2\u00f9\u00fa\7\33\2\2\u00faO\3\2\2\2\u00fb\u00fc\7\34\2\2\u00fc"+
		"Q\3\2\2\2\u00fd\u00fe\7\35\2\2\u00feS\3\2\2\2\u00ff\u0100\7\36\2\2\u0100"+
		"U\3\2\2\2\u0101\u0102\7\37\2\2\u0102W\3\2\2\2\u0103\u0104\7 \2\2\u0104"+
		"Y\3\2\2\2\u0105\u0106\7!\2\2\u0106[\3\2\2\2\u0107\u0108\7\"\2\2\u0108"+
		"]\3\2\2\2\u0109\u010a\7#\2\2\u010a_\3\2\2\2\u010b\u010c\7$\2\2\u010ca"+
		"\3\2\2\2\u010d\u010e\7%\2\2\u010ec\3\2\2\2\u010f\u0110\7&\2\2\u0110e\3"+
		"\2\2\2\u0111\u0112\7(\2\2\u0112g\3\2\2\2\u0113\u0114\7)\2\2\u0114i\3\2"+
		"\2\2\20qw|\u0087\u008c\u009b\u00a1\u00a9\u00ac\u00b1\u00ba\u00be\u00c3"+
		"\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}