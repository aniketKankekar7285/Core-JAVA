public class Cylinder {
    public double radius;
    public double height;

    public double getSurfaceArea(){
       return (2*3.1428*radius*radius)+ (2*3.1428*radius *height);
    }

    public double getVolume()
    {
        return (3.1428* radius*radius)* height;
    }

}



class CylinderTest{

    public static void main(String args[])
    {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println("Surface area of cyliner is: "+c.getSurfaceArea());
        System.out.println("Volume of cylinder is:  "+c.getVolume());
    }
}
