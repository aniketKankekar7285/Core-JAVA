class Circle{
    public double radius;

    public double getArea(){
         return 3.1428* radius*radius;
    }

    public double getPerimetre()
    {
         return 2*3.1428*radius;
    }

}


class circleTest{
    public static void main(String args[]){
         Circle c=new Circle();
         c.radius=7;
         System.out.println("Area:  "+c.getArea());
         System.out.println("Perimetre: "+c.getPerimetre());
         return;
    }
}
