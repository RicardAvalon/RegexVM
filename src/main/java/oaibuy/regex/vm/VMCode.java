package oaibuy.regex.vm;

import lombok.Getter;

/**
 * Created by biao.yu on 2016/3/30.
 */
@Getter
public class VMCode {
    private VMInstruction firstInstruction;
    private VMInstruction endInstruction;

    public VMCode(VMInstruction firstInstruction, VMInstruction endInstruction){
        this.firstInstruction=firstInstruction;
        this.endInstruction=endInstruction;
    }

    /**
     *  e1 e2		     codes for e1
     *                   codes for e2
     */
    public static VMCode buildConcatenate(VMCode code1, VMCode code2){
        code1.endInstruction.setNext(code2.firstInstruction);
        return new VMCode(code1.firstInstruction, code2.endInstruction);
    }

    /**
     *  e1|e2		     split L1, L2
     *                   L1:
     *                       codes for e1
     *                       jmp L3
     *                   L2:
     *                       codes for e2
     *                   L3:
     */
    public static VMCode buildAlternation(VMCode code1, VMCode code2){
        VMInstruction l1=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, code1.firstInstruction, null);
        VMInstruction l2=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, code2.firstInstruction, null);
        VMInstruction l3=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, null, null);
        VMInstruction split = new VMInstruction(VMInstruction.Type.SPLIT, null, l1, l2, null, l1, null);
        VMInstruction jmp = new VMInstruction(VMInstruction.Type.JMP, null, null, null, l3, l2, null);
        code1.endInstruction.setNext(jmp);
        code2.endInstruction.setNext(l3);
        return new VMCode(split, l3);
    }

    /**
     *  a		        char a
     */
    public static VMCode buildCharSet(String charSet){
        VMInstruction newInstruction=new VMInstruction(VMInstruction.Type.CHAR_SET, charSet, null, null, null, null, null);
        return new VMCode(newInstruction, newInstruction);
    }

    /**
     *  e?		  greedy:                          non-greedy:
     *                  split L1, L2                          split L2, L1
     *                  L1:                                   L1:
     *                      codes for e                       codes for e
     *                  L2:                                   L2:
     */
    public static VMCode buildQuestionMark(VMCode code, boolean isGreedy){
        VMInstruction l1=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, code.firstInstruction, null);
        VMInstruction l2=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, null, null);
        VMInstruction split;
        if(isGreedy){
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l1, l2, null, l1, null);
        }else{
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l2, l1, null, l1, null);
        }
        code.endInstruction.setNext(l2);
        return new VMCode(split, l2);
    }

    /**
     *  e+		  greedy:                       non-greedy:
     *                  L1:                                L1:
     *                     codes for e                       codes for e
     *                  split L1, L2                       split L2, L1
     *                  L2:                                L2:
     */
    public static VMCode buildPlus(VMCode code, boolean isGreedy){
        System.out.println("What the Fuck!!??");
        VMInstruction l1=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, code.firstInstruction, null);
        VMInstruction l2=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, null, null);
        VMInstruction split;
        if(isGreedy){
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l1, l2, null, l2, null);
        }else{
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l2, l1, null, l2, null);
        }
        code.endInstruction.setNext(split);
        return new VMCode(l1, l2);
    }

    /**
     *  e*		  greedy:                       non-greedy:
     *                  L1:                                L1:
     *                      split L2, L3                        split L3, L2
     *                  L2:                                L2:
     *                      codes for e                         codes for e
     *                      jmp L1                              jmp L1
     *                  L3:                                L3:
     */
    public static VMCode buildStar(VMCode code, boolean isGreedy){
        VMInstruction l2=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, code.firstInstruction, null);
        VMInstruction l3=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, null, null);
        VMInstruction split;
        if(isGreedy){
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l2, l3, null, l2, null);
        }else{
            split = new VMInstruction(VMInstruction.Type.SPLIT, null, l3, l2, null, l2, null);
        }
        VMInstruction l1=new VMInstruction(VMInstruction.Type.LABEL, null, null, null, null, split, null);
        VMInstruction jmp = new VMInstruction(VMInstruction.Type.JMP, null, null, null, l1, l3, null);
        code.endInstruction.setNext(jmp);
        return new VMCode(l1, l3);
    }

    public static VMCode buildMatch(VMCode code){
        VMInstruction match = new VMInstruction(VMInstruction.Type.MATCH, null, null, null, null, null, null);
        code.endInstruction.setNext(match);
        return new VMCode(code.firstInstruction, match);
    }

    public static VMCode buildAnyChar(){
        VMInstruction instruction = new VMInstruction(VMInstruction.Type.ANY_CHAR, null, null, null, null, null, null);
        return new VMCode(instruction, instruction);
    }


    public static VMCode buildGroup(VMCode code, int group){
        VMInstruction saveStart = new VMInstruction(VMInstruction.Type.SAVE, null, null, null, null, code.firstInstruction, group*2);
        VMInstruction saveEnd = new VMInstruction(VMInstruction.Type.SAVE, null, null, null, null, null, group*2+1);
        code.endInstruction.setNext(saveEnd);
        return new VMCode(saveStart, saveEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        VMInstruction inst = firstInstruction;
        while (inst != null){
            sb.append(inst.toString()).append("\n");
            inst = inst.getNext();
        }
        return sb.toString();
    }
}
