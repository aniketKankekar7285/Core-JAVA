package Inheritance;
class Rectangle{
    int length;
    int breadth;
    int x=10;
    public Rectangle(){
        System.out.println("x: "+x);
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x=10;
    Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    void Display(){
        System.out.println("x:"+super.x);
    }
    int volume(){
        return length*breadth*height;
    }
}


public class UsingSuperKeyword {
    public static void main(String args[]){
        Cuboid c=new Cuboid(10,20,30);
        System.out.println("volume: "+c.volume());
    }
}
