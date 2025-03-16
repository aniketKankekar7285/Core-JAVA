package SingletonDesign;

//Eager Initialisation
public class DBConnection1 {
    private static DBConnection1 dbConnection=new DBConnection1();
    private DBConnection1(){

    }
    public static DBConnection1 getInstance(){
        return dbConnection;
    }
}
