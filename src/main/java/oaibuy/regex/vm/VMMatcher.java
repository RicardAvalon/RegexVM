package oaibuy.regex.vm;

import java.util.Map;

/**
 * Created by biao.yu on 2016/4/9.
 */

public class VMMatcher {
    private VMCode vmCode;
    private String input;
    private VMThread matchedThread;

    VMMatcher(VMCode vmCode, String input){
        this.vmCode = vmCode;
        this.input = input;
    }

    public boolean matches(){
        VM vm = new VM(vmCode, input);
        boolean result = vm.run();
        if(result){
            matchedThread = vm.getMatchedThread();

            System.out.println(matchedThread.getSaveMap());
        }
        return result;
    }

    public String group(){
        return group(0);
    }

    public String group(int i){
        if(matchedThread == null){
            throw new IllegalStateException("No match found");
        }
        Map<Integer, Integer> saveMap = matchedThread.getSaveMap();
        Integer start = saveMap.get(2*i);
        Integer end = saveMap.get(2*i+1);
        if(start!=null && end!=null){
            return input.substring(start, end);
        }else{
            throw new IndexOutOfBoundsException("No group " + i);
        }

    }
}
