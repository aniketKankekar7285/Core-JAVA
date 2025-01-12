package StaticAndFinal;

public class Singletonclass {
    private int a;
    private int b;
    private String name;

    private static Singletonclass singletonclass=null;

    private Singletonclass(){
       a=10;
       b=20;
       name="aniket";
    }
    public static Singletonclass getInstance(){
        if(singletonclass == null){
            singletonclass=new Singletonclass();
        }
        return singletonclass;
    }
}
