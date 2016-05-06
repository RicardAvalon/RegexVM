package oaibuy.regex.vm;

import oaibuy.regex.antlr.gen.RegexBaseVisitor;
import oaibuy.regex.antlr.gen.RegexParser;

/**
 * Created by biao.yu on 2016/4/9.
 */
public class ParseTree2VMCode extends RegexBaseVisitor<VMCode> {

    int capturingGroup = 0;

    @Override
    public VMCode visitInit(RegexParser.InitContext ctx) {
        VMCode code=visit(ctx.expr());
        return VMCode.buildMatch(code);
    }

    @Override
    public VMCode visitAlternation(RegexParser.AlternationContext ctx) {
        VMCode code1=visit(ctx.expr(0));
        VMCode code2=visit(ctx.expr(1));
        return VMCode.buildAlternation(code1, code2);
    }

    @Override
    public VMCode visitConcatenation(RegexParser.ConcatenationContext ctx) {
        VMCode code1=visit(ctx.expr(0));
        VMCode code2=visit(ctx.expr(1));
        return VMCode.buildConcatenate(code1, code2);
    }

    @Override
    public VMCode visitDot(RegexParser.DotContext ctx) {
        return VMCode.buildAnyChar();
    }


    @Override
    public VMCode visitEscape(RegexParser.EscapeContext ctx) {
        String literal=ctx.ESCAPE().getText();
        return VMCode.buildCharSet(literal.substring(1));
    }

    @Override
    public VMCode visitChar(RegexParser.CharContext ctx) {
        String literal=ctx.CHAR().getText();
        return VMCode.buildCharSet(literal);
    }

    @Override
    public VMCode visitCharSet(RegexParser.CharSetContext ctx) {
        String literal=ctx.set().getText();
        //todo literal = handleRange(literal);
        return VMCode.buildCharSet(literal);
    }

    @Override
    public VMCode visitRepetitionQuestionMarkGreedy(RegexParser.RepetitionQuestionMarkGreedyContext ctx) {
        return VMCode.buildQuestionMark(visit(ctx.expr()), true);
    }

    @Override
    public VMCode visitRepetitionPlusGreedy(RegexParser.RepetitionPlusGreedyContext ctx) {
        return VMCode.buildPlus(visit(ctx.expr()), true);
    }

    @Override
    public VMCode visitRepetitionStarGreedy(RegexParser.RepetitionStarGreedyContext ctx) {
        return VMCode.buildStar(visit(ctx.expr()), true);
    }

    @Override
    public VMCode visitRepetitionQuestionMarkNonGreedy(RegexParser.RepetitionQuestionMarkNonGreedyContext ctx) {
        return VMCode.buildQuestionMark(visit(ctx.expr()), false);
    }

    @Override
    public VMCode visitRepetitionPlusNonGreedy(RegexParser.RepetitionPlusNonGreedyContext ctx) {
        return VMCode.buildPlus(visit(ctx.expr()), false);
    }

    @Override
    public VMCode visitRepetitionStarNonGreedy(RegexParser.RepetitionStarNonGreedyContext ctx) {
        return VMCode.buildStar(visit(ctx.expr()), false);
    }

    @Override
    public VMCode visitCapturingGroup(RegexParser.CapturingGroupContext ctx) {
        capturingGroup++;
        int group = capturingGroup;
        return VMCode.buildGroup(visit(ctx.expr()), group);
    }
}
