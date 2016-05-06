// Generated from C:/Users/biao.yu/IdeaProjects/regexvm/src/main/resources\Regex.g4 by ANTLR 4.5.1
package oaibuy.regex.antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexParser}.
 */
public interface RegexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(RegexParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(RegexParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSet}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCharSet(RegexParser.CharSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSet}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCharSet(RegexParser.CharSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDot(RegexParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDot(RegexParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionStarNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionStarNonGreedy(RegexParser.RepetitionStarNonGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionStarNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionStarNonGreedy(RegexParser.RepetitionStarNonGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionQuestionMarkGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionQuestionMarkGreedy(RegexParser.RepetitionQuestionMarkGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionQuestionMarkGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionQuestionMarkGreedy(RegexParser.RepetitionQuestionMarkGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionStarGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionStarGreedy(RegexParser.RepetitionStarGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionStarGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionStarGreedy(RegexParser.RepetitionStarGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capturingGroup}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCapturingGroup(RegexParser.CapturingGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capturingGroup}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCapturingGroup(RegexParser.CapturingGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionPlusGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionPlusGreedy(RegexParser.RepetitionPlusGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionPlusGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionPlusGreedy(RegexParser.RepetitionPlusGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionPlusNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionPlusNonGreedy(RegexParser.RepetitionPlusNonGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionPlusNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionPlusNonGreedy(RegexParser.RepetitionPlusNonGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(RegexParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(RegexParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(RegexParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(RegexParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(RegexParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(RegexParser.AlternationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetitionQuestionMarkNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionQuestionMarkNonGreedy(RegexParser.RepetitionQuestionMarkNonGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetitionQuestionMarkNonGreedy}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionQuestionMarkNonGreedy(RegexParser.RepetitionQuestionMarkNonGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escape}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEscape(RegexParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escape}
	 * labeled alternative in {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEscape(RegexParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(RegexParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(RegexParser.SetContext ctx);
}