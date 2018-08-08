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
		T__0=1, WS=2, PUBLIC=3, PRIVATE=4, PROTECTED=5, STATIC=6, ABSTRACT=7, 
		SYNCHRONIZED=8, TRANSIENT=9, VOLATILE=10, FINAL=11, NATIVE=12, STRICTFP=13, 
		BOOLEAN=14, BYTE=15, CHAR=16, LONG=17, SHORT=18, INT=19, FLOAT=20, DOUBLE=21, 
		ID=22, STRINGCG=23, INTEGERCG=24, FLOATCG=25, CHARACTERCG=26, DOT=27, 
		SEMICOLON=28, EQUALS=29, COMMA=30, INEQUALITYOPEN=31, INEQUALITYCLOSE=32, 
		BRACEOPEN=33, BRACECLOSE=34, BRACKETOPEN=35, BRACKETCLOSE=36, MINUS=37, 
		SQUAREBRACKETOPEN=38, SQUAREBRACKETCLOSE=39;
	public static final int
		RULE_code = 0, RULE_methodCode = 1, RULE_expression = 2, RULE_variableDeclaration = 3, 
		RULE_type = 4, RULE_arrayModifier = 5, RULE_variableAssignment = 6, RULE_assignment = 7, 
		RULE_value = 8, RULE_objectInstantiation = 9, RULE_literalCG = 10, RULE_className = 11, 
		RULE_classAccess = 12, RULE_methodInv = 13, RULE_pathNoEndDot = 14, RULE_eol = 15, 
		RULE_publicAM = 16, RULE_privateAM = 17, RULE_protectedAM = 18, RULE_staticAM = 19, 
		RULE_abstractAM = 20, RULE_synchronizedAM = 21, RULE_transientAM = 22, 
		RULE_volatileAM = 23, RULE_finalAM = 24, RULE_nativeAM = 25, RULE_strrictfpAM = 26, 
		RULE_booleanT = 27, RULE_byteT = 28, RULE_charT = 29, RULE_longT = 30, 
		RULE_shortT = 31, RULE_intT = 32, RULE_floatT = 33, RULE_doubleT = 34, 
		RULE_id = 35, RULE_path = 36, RULE_stringCG = 37, RULE_integerCG = 38, 
		RULE_floatCG = 39, RULE_characterCG = 40, RULE_dotS = 41, RULE_semicolonS = 42, 
		RULE_equalsS = 43, RULE_commaS = 44, RULE_inequalityOpenS = 45, RULE_inequalityCloseS = 46, 
		RULE_braceopenS = 47, RULE_brcecloseS = 48, RULE_bracketOpenS = 49, RULE_bracketCloseS = 50, 
		RULE_squareBracketOpen = 51, RULE_squareBracketClose = 52;
	public static final String[] ruleNames = {
		"code", "methodCode", "expression", "variableDeclaration", "type", "arrayModifier", 
		"variableAssignment", "assignment", "value", "objectInstantiation", "literalCG", 
		"className", "classAccess", "methodInv", "pathNoEndDot", "eol", "publicAM", 
		"privateAM", "protectedAM", "staticAM", "abstractAM", "synchronizedAM", 
		"transientAM", "volatileAM", "finalAM", "nativeAM", "strrictfpAM", "booleanT", 
		"byteT", "charT", "longT", "shortT", "intT", "floatT", "doubleT", "id", 
		"path", "stringCG", "integerCG", "floatCG", "characterCG", "dotS", "semicolonS", 
		"equalsS", "commaS", "inequalityOpenS", "inequalityCloseS", "braceopenS", 
		"brcecloseS", "bracketOpenS", "bracketCloseS", "squareBracketOpen", "squareBracketClose"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'new'", null, "'public'", "'private'", "'protected'", "'static'", 
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
			setState(106);
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << LONG) | (1L << SHORT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << ID))) != 0)) {
				{
				{
				setState(108);
				expression();
				setState(109);
				eol();
				}
				}
				setState(115);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
			setState(121);
			type();
			setState(122);
			id();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(123);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(126);
				booleanT();
				}
				break;
			case BYTE:
				{
				setState(127);
				byteT();
				}
				break;
			case CHAR:
				{
				setState(128);
				charT();
				}
				break;
			case LONG:
				{
				setState(129);
				longT();
				}
				break;
			case SHORT:
				{
				setState(130);
				shortT();
				}
				break;
			case INT:
				{
				setState(131);
				intT();
				}
				break;
			case FLOAT:
				{
				setState(132);
				floatT();
				}
				break;
			case DOUBLE:
				{
				setState(133);
				doubleT();
				}
				break;
			case ID:
				{
				setState(134);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUAREBRACKETOPEN) {
				{
				{
				setState(137);
				arrayModifier();
				}
				}
				setState(142);
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
			setState(143);
			squareBracketOpen();
			setState(144);
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
			setState(146);
			id();
			setState(147);
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
			setState(149);
			equalsS();
			setState(150);
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
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				literalCG();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				classAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				objectInstantiation();
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

	public static class ObjectInstantiationContext extends ParserRuleContext {
		public PathNoEndDotContext pathNoEndDot() {
			return getRuleContext(PathNoEndDotContext.class,0);
		}
		public BracketOpenSContext bracketOpenS() {
			return getRuleContext(BracketOpenSContext.class,0);
		}
		public BracketCloseSContext bracketCloseS() {
			return getRuleContext(BracketCloseSContext.class,0);
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
		enterRule(_localctx, 18, RULE_objectInstantiation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__0);
			setState(159);
			pathNoEndDot();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUAREBRACKETOPEN) {
				{
				{
				setState(160);
				arrayModifier();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			bracketOpenS();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					value();
					setState(168);
					commaS();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << FLOATCG) | (1L << CHARACTERCG))) != 0)) {
				{
				setState(175);
				value();
				}
			}

			setState(178);
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
		enterRule(_localctx, 20, RULE_literalCG);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCG:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				stringCG();
				}
				break;
			case INTEGERCG:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				integerCG();
				}
				break;
			case FLOATCG:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				floatCG();
				}
				break;
			case CHARACTERCG:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
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
		enterRule(_localctx, 22, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			path();
			setState(187);
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
		public MethodInvContext methodInv() {
			return getRuleContext(MethodInvContext.class,0);
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
		enterRule(_localctx, 24, RULE_classAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(189);
				pathNoEndDot();
				}
				break;
			case 2:
				{
				setState(190);
				methodInv();
				}
				break;
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(193);
				dotS();
				setState(194);
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
		enterRule(_localctx, 26, RULE_methodInv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			id();
			setState(199);
			bracketOpenS();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					value();
					setState(201);
					commaS();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << STRINGCG) | (1L << INTEGERCG) | (1L << FLOATCG) | (1L << CHARACTERCG))) != 0)) {
				{
				setState(208);
				value();
				}
			}

			setState(211);
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
		enterRule(_localctx, 28, RULE_pathNoEndDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(213);
				path();
				}
				break;
			}
			setState(216);
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
		enterRule(_localctx, 30, RULE_eol);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
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
		enterRule(_localctx, 32, RULE_publicAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 34, RULE_privateAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 36, RULE_protectedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 38, RULE_staticAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 40, RULE_abstractAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 42, RULE_synchronizedAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		enterRule(_localctx, 44, RULE_transientAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 46, RULE_volatileAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 48, RULE_finalAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 50, RULE_nativeAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 52, RULE_strrictfpAM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 54, RULE_booleanT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 56, RULE_byteT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 58, RULE_charT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 60, RULE_longT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 62, RULE_shortT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 64, RULE_intT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 66, RULE_floatT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 68, RULE_doubleT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 70, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 72, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(262);
					id();
					setState(263);
					match(DOT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 74, RULE_stringCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 76, RULE_integerCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 78, RULE_floatCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 80, RULE_characterCG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 82, RULE_dotS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 84, RULE_semicolonS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 86, RULE_equalsS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 88, RULE_commaS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 90, RULE_inequalityOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 92, RULE_inequalityCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 94, RULE_braceopenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 96, RULE_brcecloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 98, RULE_bracketOpenS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 100, RULE_bracketCloseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 102, RULE_squareBracketOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 104, RULE_squareBracketClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3"+
		"\4\3\4\3\4\5\4z\n\4\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u008a\n\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3"+
		"\13\7\13\u00a4\n\13\f\13\16\13\u00a7\13\13\3\13\3\13\3\13\3\13\7\13\u00ad"+
		"\n\13\f\13\16\13\u00b0\13\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\r\3\16\3\16\5\16\u00c2\n\16\3\16\3\16\3"+
		"\16\5\16\u00c7\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ce\n\17\f\17\16\17"+
		"\u00d1\13\17\3\17\5\17\u00d4\n\17\3\17\3\17\3\20\5\20\u00d9\n\20\3\20"+
		"\3\20\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\6&\u010c\n&\r&\16&\u010d\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2\2\u0117\2l\3\2\2"+
		"\2\4s\3\2\2\2\6y\3\2\2\2\b{\3\2\2\2\n\u0089\3\2\2\2\f\u0091\3\2\2\2\16"+
		"\u0094\3\2\2\2\20\u0097\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2\2\2\26\u00ba"+
		"\3\2\2\2\30\u00bc\3\2\2\2\32\u00c1\3\2\2\2\34\u00c8\3\2\2\2\36\u00d8\3"+
		"\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00e4\3\2\2\2(\u00e6"+
		"\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2"+
		"\62\u00f0\3\2\2\2\64\u00f2\3\2\2\2\66\u00f4\3\2\2\28\u00f6\3\2\2\2:\u00f8"+
		"\3\2\2\2<\u00fa\3\2\2\2>\u00fc\3\2\2\2@\u00fe\3\2\2\2B\u0100\3\2\2\2D"+
		"\u0102\3\2\2\2F\u0104\3\2\2\2H\u0106\3\2\2\2J\u010b\3\2\2\2L\u010f\3\2"+
		"\2\2N\u0111\3\2\2\2P\u0113\3\2\2\2R\u0115\3\2\2\2T\u0117\3\2\2\2V\u0119"+
		"\3\2\2\2X\u011b\3\2\2\2Z\u011d\3\2\2\2\\\u011f\3\2\2\2^\u0121\3\2\2\2"+
		"`\u0123\3\2\2\2b\u0125\3\2\2\2d\u0127\3\2\2\2f\u0129\3\2\2\2h\u012b\3"+
		"\2\2\2j\u012d\3\2\2\2lm\5\4\3\2m\3\3\2\2\2no\5\6\4\2op\5 \21\2pr\3\2\2"+
		"\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\5\3\2\2\2us\3\2\2\2vz\5\b"+
		"\5\2wz\5\16\b\2xz\5\32\16\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\7\3\2\2\2{"+
		"|\5\n\6\2|~\5H%\2}\177\5\20\t\2~}\3\2\2\2~\177\3\2\2\2\177\t\3\2\2\2\u0080"+
		"\u008a\58\35\2\u0081\u008a\5:\36\2\u0082\u008a\5<\37\2\u0083\u008a\5>"+
		" \2\u0084\u008a\5@!\2\u0085\u008a\5B\"\2\u0086\u008a\5D#\2\u0087\u008a"+
		"\5F$\2\u0088\u008a\5\30\r\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089"+
		"\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2"+
		"\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008e\3\2\2\2\u008b\u008d\5\f\7\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\13\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0092\5h\65\2\u0092\u0093\5j\66\2\u0093\r\3\2\2\2\u0094"+
		"\u0095\5H%\2\u0095\u0096\5\20\t\2\u0096\17\3\2\2\2\u0097\u0098\5X-\2\u0098"+
		"\u0099\5\22\n\2\u0099\21\3\2\2\2\u009a\u009f\5\26\f\2\u009b\u009f\5H%"+
		"\2\u009c\u009f\5\32\16\2\u009d\u009f\5\24\13\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\23\3\2\2"+
		"\2\u00a0\u00a1\7\3\2\2\u00a1\u00a5\5\36\20\2\u00a2\u00a4\5\f\7\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ae\5d\63\2\u00a9"+
		"\u00aa\5\22\n\2\u00aa\u00ab\5Z.\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b1\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5f\64\2\u00b5"+
		"\25\3\2\2\2\u00b6\u00bb\5L\'\2\u00b7\u00bb\5N(\2\u00b8\u00bb\5P)\2\u00b9"+
		"\u00bb\5R*\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\5J&\2\u00bd\u00be"+
		"\5H%\2\u00be\31\3\2\2\2\u00bf\u00c2\5\36\20\2\u00c0\u00c2\5\34\17\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c4\5T"+
		"+\2\u00c4\u00c5\5\32\16\2\u00c5\u00c7\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\5H%\2\u00c9\u00cf\5d\63\2"+
		"\u00ca\u00cb\5\22\n\2\u00cb\u00cc\5Z.\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\22\n\2\u00d3\u00d2\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5f\64\2\u00d6"+
		"\35\3\2\2\2\u00d7\u00d9\5J&\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\5H%\2\u00db\37\3\2\2\2\u00dc\u00df\5"+
		"V,\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"!\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7\6\2\2\u00e3"+
		"%\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7"+
		")\3\2\2\2\u00e8\u00e9\7\t\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb"+
		"-\3\2\2\2\u00ec\u00ed\7\13\2\2\u00ed/\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef"+
		"\61\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1\63\3\2\2\2\u00f2\u00f3\7\16\2\2"+
		"\u00f3\65\3\2\2\2\u00f4\u00f5\7\17\2\2\u00f5\67\3\2\2\2\u00f6\u00f7\7"+
		"\20\2\2\u00f79\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9;\3\2\2\2\u00fa\u00fb"+
		"\7\22\2\2\u00fb=\3\2\2\2\u00fc\u00fd\7\23\2\2\u00fd?\3\2\2\2\u00fe\u00ff"+
		"\7\24\2\2\u00ffA\3\2\2\2\u0100\u0101\7\25\2\2\u0101C\3\2\2\2\u0102\u0103"+
		"\7\26\2\2\u0103E\3\2\2\2\u0104\u0105\7\27\2\2\u0105G\3\2\2\2\u0106\u0107"+
		"\7\30\2\2\u0107I\3\2\2\2\u0108\u0109\5H%\2\u0109\u010a\7\35\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010eK\3\2\2\2\u010f\u0110\7\31\2\2\u0110M\3"+
		"\2\2\2\u0111\u0112\7\32\2\2\u0112O\3\2\2\2\u0113\u0114\7\33\2\2\u0114"+
		"Q\3\2\2\2\u0115\u0116\7\34\2\2\u0116S\3\2\2\2\u0117\u0118\7\35\2\2\u0118"+
		"U\3\2\2\2\u0119\u011a\7\36\2\2\u011aW\3\2\2\2\u011b\u011c\7\37\2\2\u011c"+
		"Y\3\2\2\2\u011d\u011e\7 \2\2\u011e[\3\2\2\2\u011f\u0120\7!\2\2\u0120]"+
		"\3\2\2\2\u0121\u0122\7\"\2\2\u0122_\3\2\2\2\u0123\u0124\7#\2\2\u0124a"+
		"\3\2\2\2\u0125\u0126\7$\2\2\u0126c\3\2\2\2\u0127\u0128\7%\2\2\u0128e\3"+
		"\2\2\2\u0129\u012a\7&\2\2\u012ag\3\2\2\2\u012b\u012c\7(\2\2\u012ci\3\2"+
		"\2\2\u012d\u012e\7)\2\2\u012ek\3\2\2\2\23sy~\u0089\u008e\u009e\u00a5\u00ae"+
		"\u00b2\u00ba\u00c1\u00c6\u00cf\u00d3\u00d8\u00de\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}