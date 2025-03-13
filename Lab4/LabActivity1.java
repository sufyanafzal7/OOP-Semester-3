package Lab4;

class ObjrctPass{
    private int value;

    public ObjrctPass(){
        value = 0;
    }

    public ObjrctPass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incrementValue(ObjrctPass OP){
        OP.value++;
    }

    
}


public class LabActivity1 {
    public static void main(String[] args) {

        ObjrctPass OP1 = new ObjrctPass(2);
        System.out.println(OP1.getValue());
        OP1.incrementValue(OP1);
        System.out.println(OP1.getValue());
        
    }
}
