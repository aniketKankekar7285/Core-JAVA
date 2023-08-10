public class StringObjects {
    public static void main(String args[]){
        String str1=" JAVA programming";

        String str2=new String("JAVA Programming");

        char arr[]={'h','e','l','l','o'};

        String str3= new String(arr);

        byte arr2[]={23,34,66,67};
        String str4=new String(arr2);


        System.out.println(str1);

        System.out.println(str2);

        System.out.println(str3);

        System.out.println(str4);

        /*String pool and String objects*/
        String str5="java";
        String str6="java";
        String str7=new String("java");
        System.out.println(str5==str6);
        System.out.println(str6==str7);

    }

}
