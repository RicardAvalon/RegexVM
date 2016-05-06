package oaibuy.regex.vm;

import lombok.Getter;
import oaibuy.regex.antlr.gen.RegexLexer;
import oaibuy.regex.antlr.gen.RegexParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by biao.yu on 2016/4/9.
 */

@Getter
public class VMPattern {
    private String regex;
    private VMCode vmCode;

    private VMPattern(String regex, VMCode vmCode){
        this.regex=regex;
        this.vmCode=vmCode;
    }

    public static VMPattern compile(String regex){
        ANTLRInputStream input=new ANTLRInputStream(regex);
        RegexLexer lexer=new RegexLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        RegexParser parser=new RegexParser(tokens);
        ParseTree tree=parser.init();
        VMCode vmCode=new ParseTree2VMCode().visit(tree);
        return new VMPattern(regex, vmCode);
    }

    public VMMatcher matcher(String input){
        return new VMMatcher(this.vmCode, input);
    }
}
