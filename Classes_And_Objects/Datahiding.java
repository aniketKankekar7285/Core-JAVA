public class Datahiding {
   private int rollNumber;
   private String name;


   int getRollNumber()
   {
       return rollNumber;
   }
   void setRollNumber(int n)
   {
       rollNumber=n;
   }

   void setName(String s)
   {
       name=s;
   }

   String getName()
   {
       return name;
   }
}



class helper{
    public static void main(String args[])
    {
          Datahiding d=new Datahiding();
          d.setName("Aniket");
          d.setRollNumber(101);

          System.out.println(d.getName());
          System.out.println(d.getRollNumber());
    }

}
