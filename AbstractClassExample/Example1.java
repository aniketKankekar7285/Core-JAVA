package AbstractClassExample;
abstract class Super{
    Super(){
        System.out.println("Super");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    abstract void meth2();
}

class sub extends Super{
    void meth2(){
        System.out.println("Meth2 calling");
    }
}
public class Example1 {
    public static void main(String args[]){
        Super sp=new sub();
        sp.meth2();
        sp.meth1();
    }
}
