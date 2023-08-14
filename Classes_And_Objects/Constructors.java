import java.awt.*;

public class Constructors {
    private int length;
    private int breadth;

    public Constructors(int l, int b) {
        length=l;
        breadth=b;
    }

    public Constructors()
    {
        length=1;
        breadth=1;
    }



    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }


}

class Helper{
    public static void main(String args[])
    {
        Constructors c=new Constructors(10,20);
        System.out.println("length of object: "+c.getLength()+"  breadth of object: "+c.getBreadth());

    }
}
