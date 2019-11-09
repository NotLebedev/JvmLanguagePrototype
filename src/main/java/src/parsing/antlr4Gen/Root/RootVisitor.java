// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7.2
package src.parsing.antlr4Gen.Root;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RootParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RootVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RootParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(RootParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#methodCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCode(RootParser.MethodCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RootParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(RootParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(RootParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#declarationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationType(RootParser.DeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#arrayModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayModifier(RootParser.ArrayModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(RootParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(RootParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RootParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LITERAL}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLITERAL(RootParser.LITERALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDITIVE_OP}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDITIVE_OP(RootParser.ADDITIVE_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BITWISE_OR}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBITWISE_OR(RootParser.BITWISE_ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SHIFT_OP}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSHIFT_OP(RootParser.SHIFT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BITWISE_AND}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBITWISE_AND(RootParser.BITWISE_ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE_DECREMENT}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE_DECREMENT(RootParser.PRE_DECREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNARY_PLUS}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNARY_PLUS(RootParser.UNARY_PLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BITWISE_XOR}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBITWISE_XOR(RootParser.BITWISE_XORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE_INCREMENT}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE_INCREMENT(RootParser.PRE_INCREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POST_INCREMENT}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOST_INCREMENT(RootParser.POST_INCREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OBJECT_INSTANTIATION}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOBJECT_INSTANTIATION(RootParser.OBJECT_INSTANTIATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INVERT}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINVERT(RootParser.INVERTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POST_DECREMENT}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOST_DECREMENT(RootParser.POST_DECREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RELATIONAL_OP}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRELATIONAL_OP(RootParser.RELATIONAL_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD_INV}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD_INV(RootParser.METHOD_INVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNARY_MINUS}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNARY_MINUS(RootParser.UNARY_MINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_LABEL}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_LABEL(RootParser.ID_LABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTHESIS}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTHESIS(RootParser.PARENTHESISContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CAST_LABEL}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAST_LABEL(RootParser.CAST_LABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLICATIVE_OP}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLICATIVE_OP(RootParser.MULTIPLICATIVE_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQUALITY_OP}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQUALITY_OP(RootParser.EQUALITY_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACCESS}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACCESS(RootParser.ACCESSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_ACCESS}
	 * labeled alternative in {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_ACCESS(RootParser.ARRAY_ACCESSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#preIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrement(RootParser.PreIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#preDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrement(RootParser.PreDecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#unaryPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(RootParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(RootParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(RootParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#objectInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiation(RootParser.ObjectInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#literalCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralCG(RootParser.LiteralCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(RootParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#classAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAccess(RootParser.ClassAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#methodInv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInv(RootParser.MethodInvContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(RootParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#newKW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewKW(RootParser.NewKWContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#publicAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicAM(RootParser.PublicAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#privateAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateAM(RootParser.PrivateAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#protectedAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedAM(RootParser.ProtectedAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#staticAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAM(RootParser.StaticAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#abstractAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractAM(RootParser.AbstractAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#synchronizedAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedAM(RootParser.SynchronizedAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#transientAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransientAM(RootParser.TransientAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#volatileAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVolatileAM(RootParser.VolatileAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#finalAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalAM(RootParser.FinalAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#nativeAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeAM(RootParser.NativeAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#strrictfpAM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrrictfpAM(RootParser.StrrictfpAMContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#booleanT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanT(RootParser.BooleanTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#byteT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteT(RootParser.ByteTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#charT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharT(RootParser.CharTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#longT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongT(RootParser.LongTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#shortT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortT(RootParser.ShortTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#intT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntT(RootParser.IntTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#floatT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatT(RootParser.FloatTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#doubleT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleT(RootParser.DoubleTContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RootParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(RootParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#stringCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCG(RootParser.StringCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#integerCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerCG(RootParser.IntegerCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#longCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongCG(RootParser.LongCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#floatCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatCG(RootParser.FloatCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#characterCG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterCG(RootParser.CharacterCGContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#dotS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotS(RootParser.DotSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#semicolonS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonS(RootParser.SemicolonSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#equalsS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsS(RootParser.EqualsSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#commaS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaS(RootParser.CommaSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(RootParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore(RootParser.MoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#braceopenS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceopenS(RootParser.BraceopenSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#brcecloseS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrcecloseS(RootParser.BrcecloseSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#bracketOpenS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketOpenS(RootParser.BracketOpenSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#bracketCloseS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketCloseS(RootParser.BracketCloseSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#squareBracketOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareBracketOpen(RootParser.SquareBracketOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#squareBracketClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareBracketClose(RootParser.SquareBracketCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#plusS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusS(RootParser.PlusSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#minusS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusS(RootParser.MinusSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#asteriskS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskS(RootParser.AsteriskSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#slashS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashS(RootParser.SlashSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#incrementS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementS(RootParser.IncrementSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#decrementS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementS(RootParser.DecrementSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#percentS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentS(RootParser.PercentSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#invertS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvertS(RootParser.InvertSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#rightShiftArithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftArithmetic(RootParser.RightShiftArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#rightShiftLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftLogical(RootParser.RightShiftLogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#leftShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShift(RootParser.LeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#bitAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(RootParser.BitAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#bitXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXor(RootParser.BitXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#bitOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(RootParser.BitOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#lessEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(RootParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#moreEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreEqual(RootParser.MoreEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(RootParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#notEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(RootParser.NotEqualContext ctx);
}