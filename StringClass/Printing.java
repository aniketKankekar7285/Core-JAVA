class Printing{
    public static void main( String args[]){
        int x=10;
        int y=20;
        System.out.println(x+y);
        System.out.println("aniket"+x+y);
        System.out.println("Sum of two numbers is:  "+(x+y));

        System.out.printf("sum of %d and %d is %d",x,y,(x+y));


        int z=100;
        float b=20.9f;
        char c='Q';

        System.out.printf("%d %f %c",z,b,c);

        System.out.println("******************");

        //argument index

        int w=23;
        float k=54.6f;
        char j='k';
        System.out.printf("%3$c  %2$f  %1$d",w,k,j);


        //width

        int d=10;
        System.out.printf("%5d",d);

    }
}