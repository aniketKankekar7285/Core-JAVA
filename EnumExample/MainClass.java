package EnumExample;

public class MainClass {
    public static void main(String args[]){
        for (EnumSample enumSample: EnumSample.values()){
            System.out.println(enumSample.ordinal());
        }
        System.out.println(EnumSample.valueOf("MONDAY"));

        CustomEnum customEnum=CustomEnum.getNameFromVal(0);
        System.out.println(customEnum.getComment());
    }
}
