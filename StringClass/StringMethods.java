public class StringMethods {
    public static void main(String args[]){
        String str =new String("I love JAVA");
        System.out.println(str.length());

        String str2=str.toUpperCase();
        System.out.println(str2);


        String str3=str.toLowerCase();
        System.out.println(str3);


        String str4=new String("      Aniket  K     ");
        String str5=str4.trim();
        System.out.println(str5);

        String str6=new String("netbeans");
        String str7=str6.substring(2,6);
        System.out.println(str7);


    }


}
