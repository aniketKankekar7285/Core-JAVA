class Circle1{
    public int radius;

    public Circle1()
    {
        radius=0;
    }

    public Circle1(int r)
    {
        radius=r;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimetre(){
        return Math.PI*radius*2;
    }


}

class Cylinder1 extends Circle1{
    private int height;

    public double getVolume()
    {
          return getArea()*height;
    }
}
public class InheritanceExample {
}
