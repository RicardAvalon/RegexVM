package oaibuy.regex.vm;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by biao.yu on 2016/3/30.
 */
@Getter
public class VM {
    private String input;
    private int sp;
    private List<VMThread> vmThreads;
    private VMThread matchedThread;

    public VM(VMCode vmCode, String input){
        this.input=input;
        vmThreads=Lists.newArrayList();
        vmThreads.add(new VMThread(vmCode.getFirstInstruction(), null));
    }

    public boolean run(){
        while (!vmThreads.isEmpty()){
            if(scan()){
                return true;
            }
        }
        return false;
    }

    private boolean scan(){
        for(int i=0;i<vmThreads.size();i++){
            VMThread thread= vmThreads.get(i);
            while (thread.getCurrentInstruction()!=null){
                if (VMInstruction.Type.CHAR_SET.equals(thread.getCurrentInstruction().getType())){
                    if(sp<input.length() && thread.getCurrentInstruction().getCharSet().contains(Character.toString(input.charAt(sp)))){
                        thread.setCurrentInstruction(thread.getCurrentInstruction().getNext());
                    }else{
                        vmThreads.remove(thread);
                        i--;
                    }
                    break;
                }else if(VMInstruction.Type.ANY_CHAR.equals(thread.getCurrentInstruction().getType())){
                    if(sp<input.length()){
                        thread.setCurrentInstruction(thread.getCurrentInstruction().getNext());
                    }else{
                        vmThreads.remove(thread);
                        i--;
                    }
                    break;
                }else if(VMInstruction.Type.SPLIT.equals(thread.getCurrentInstruction().getType())){
                    vmThreads.add(new VMThread(thread.getCurrentInstruction().getSplit2(), thread.getSaveMap()));
                    thread.setCurrentInstruction(thread.getCurrentInstruction().getSplit1());
                }else if(VMInstruction.Type.JMP.equals(thread.getCurrentInstruction().getType())){
                    thread.setCurrentInstruction(thread.getCurrentInstruction().getJmp());
                }else if(VMInstruction.Type.LABEL.equals(thread.getCurrentInstruction().getType())){
                    thread.setCurrentInstruction(thread.getCurrentInstruction().getNext());
                }else if(VMInstruction.Type.SAVE.equals(thread.getCurrentInstruction().getType())){
                    thread.getSaveMap().put(thread.getCurrentInstruction().getSaveSlot(), sp);
                    thread.setCurrentInstruction(thread.getCurrentInstruction().getNext());
                }else if(VMInstruction.Type.MATCH.equals(thread.getCurrentInstruction().getType())){
                    if(sp==input.length()){
                        thread.getSaveMap().put(0, 0);
                        thread.getSaveMap().put(1, sp);
                        this.matchedThread=thread;
                        return true;
                    }else {
                        vmThreads.remove(thread);
                        i--;
                        break;
                    }
                }
            }
        }
        sp++;
        return false;
    }
}
