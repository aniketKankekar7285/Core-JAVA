public class Rectangle {
    public int length;
    public int breadth;

    public int getArea()
    {
        return length*breadth;
    }

    public int getPerimetre()
    {
        return 2*length*breadth;
    }

    public boolean issquare()
    {
        return length==breadth;
    }
}

class RectangleTest {

    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;

        System.out.println("Area of rectangle is:   "+r.getArea());
        System.out.println("Perimetre of rectangle is    "+r.getPerimetre());
        System.out.println("is Rectangle is square:  "+r.issquare());
        return;
    }
}
