// Generated from C:/Users/biao.yu/IdeaProjects/regexvm/src/main/resources\Regex.g4 by ANTLR 4.5.1
package oaibuy.regex.antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegexParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(RegexParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charSet}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSet(RegexParser.CharSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(RegexParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionStarNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionStarNonGreedy(RegexParser.RepetitionStarNonGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionQuestionMarkGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionQuestionMarkGreedy(RegexParser.RepetitionQuestionMarkGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionStarGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionStarGreedy(RegexParser.RepetitionStarGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code capturingGroup}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturingGroup(RegexParser.CapturingGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionPlusGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionPlusGreedy(RegexParser.RepetitionPlusGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionPlusNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionPlusNonGreedy(RegexParser.RepetitionPlusNonGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(RegexParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(RegexParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(RegexParser.AlternationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repetitionQuestionMarkNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitionQuestionMarkNonGreedy(RegexParser.RepetitionQuestionMarkNonGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escape}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(RegexParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(RegexParser.SetContext ctx);
}