package oaibuy.regex.vm;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Map;

/**
 * Created by biao.yu on 2016/3/30.
 */
@Getter
@Setter
public class VMThread {
    private VMInstruction currentInstruction;
    //slot -- string pointer
    private Map<Integer, Integer> saveMap ;
    private boolean isMatch;

    public VMThread(VMInstruction currentInstruction, Map<Integer, Integer> saveMap){
        this.currentInstruction=currentInstruction;
        this.saveMap = Maps.newHashMap();
        if(saveMap != null){
            this.saveMap.putAll(saveMap);
        }
    }
}
