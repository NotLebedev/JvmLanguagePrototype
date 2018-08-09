// Generated from E:/Work/JvmLanguagePrototype/src/main/antlr4\Root.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link RootParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RootParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#arrayModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayModifier(RootParser.ArrayModifierContext ctx);
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
	 * Visit a parse tree produced by {@link RootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RootParser.ValueContext ctx);
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
	 * Visit a parse tree produced by {@link RootParser#inequalityOpenS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityOpenS(RootParser.InequalityOpenSContext ctx);
	/**
	 * Visit a parse tree produced by {@link RootParser#inequalityCloseS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityCloseS(RootParser.InequalityCloseSContext ctx);
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
}