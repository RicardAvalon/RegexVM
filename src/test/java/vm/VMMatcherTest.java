package vm;

import oaibuy.regex.vm.VMMatcher;
import oaibuy.regex.vm.VMPattern;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by biao.yu on 2016/5/4.
 */
public class VMMatcherTest{
    @Test
    public void testChar(){
        VMPattern vmPattern = VMPattern.compile("a");
        VMMatcher vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "a");

        vmMatcher=vmPattern.matcher("b");
        Assert.assertFalse(vmMatcher.matches());
    }

    @Test
    public void testAnyChar(){
        VMPattern vmPattern = VMPattern.compile(".");
        VMMatcher vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "a");
    }

    @Test
    public void testEscape(){
        VMPattern vmPattern = VMPattern.compile("\\.");
        VMMatcher vmMatcher=vmPattern.matcher("a");
        Assert.assertFalse(vmMatcher.matches());

        vmMatcher=vmPattern.matcher(".");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), ".");
    }

    @Test
    public void testRepetitionStar(){
        VMPattern vmPattern = VMPattern.compile("a*");
        VMMatcher vmMatcher=vmPattern.matcher("");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "");

        vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "a");

        vmMatcher=vmPattern.matcher("aaa");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "aaa");
    }

    @Test
    public void testRepetitionPlus(){
        VMPattern vmPattern = VMPattern.compile("a+");
        VMMatcher vmMatcher=vmPattern.matcher("");
        Assert.assertFalse(vmMatcher.matches());

        vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "a");

        vmMatcher=vmPattern.matcher("aaa");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "aaa");
    }

    @Test
    public void testRepetitionQuestionMark(){
        VMPattern vmPattern = VMPattern.compile("a?");
        VMMatcher vmMatcher=vmPattern.matcher("");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "");

        vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "a");

        vmMatcher=vmPattern.matcher("aa");
        Assert.assertFalse(vmMatcher.matches());
    }

    @Test
    public void  testConcatenation(){
        VMPattern vmPattern = VMPattern.compile("ab");
        VMMatcher vmMatcher=vmPattern.matcher("a");
        Assert.assertFalse(vmMatcher.matches());

        vmMatcher=vmPattern.matcher("b");
        Assert.assertFalse(vmMatcher.matches());

        vmMatcher=vmPattern.matcher("ab");
        Assert.assertTrue(vmMatcher.matches());
        Assert.assertEquals(vmMatcher.group(), "ab");
    }

    @Test
    public void  testAlternation(){
        VMPattern vmPattern = VMPattern.compile("a|b");
        VMMatcher vmMatcher=vmPattern.matcher("a");
        Assert.assertTrue(vmMatcher.matches());

        vmMatcher=vmPattern.matcher("b");
        Assert.assertTrue(vmMatcher.matches());

        vmMatcher=vmPattern.matcher("ab");
        Assert.assertFalse(vmMatcher.matches());
    }
}
