import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String args[]){
        GenericClass<String> gc=new GenericClass<>();
        gc.setValue("Aniket");
        System.out.println(gc.getValue());
        BoundedGenerics<Integer> bg=new BoundedGenerics<>();
        bg.setValue(69);
        System.out.println(bg.getValue());

        List<Vehicle> vehicleList=new ArrayList<>();
        List<Bus> busList=new ArrayList<>();
        Print p=new Print();
        p.setValue(busList);
    }

}
