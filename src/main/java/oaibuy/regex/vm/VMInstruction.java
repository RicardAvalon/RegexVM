package oaibuy.regex.vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by biao.yu on 2016/3/30.
 */
@Getter
@Setter
@AllArgsConstructor
public class VMInstruction {
    private Type type;
    private String charSet;
    private VMInstruction split1;
    private VMInstruction split2;
    private VMInstruction jmp;
    private VMInstruction next;
    private Integer saveSlot;

    public enum Type{
        CHAR_SET,
        SPLIT,
        JMP,
        MATCH,
        SAVE,
        LABEL,
        ANY_CHAR
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append("inst").append(" ");
        sb.append(this.type);
        switch(this.type) {
            case CHAR_SET:
                sb.append(" \"").append(this.charSet).append("\"");
                break;
            case SAVE:
                sb.append(saveSlot);
                break;
        }
        sb.append(">");
        return sb.toString();
    }
}
