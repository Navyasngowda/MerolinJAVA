class constructor{
    double l,b,h;
}
public class constructor_demo {
    double l;
    double b;
    double h;
    constructor_demo(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    constructor_demo(double l)
    {
        l=b=h=l;   
    }
    double volume(){
        return l*b*h;
    }
    void print()
    {
        System.out.println("Method overloading");

    }
    void print(double volume)
    {
        System.out.println("Volume of box is"+volume);

    }
    
    
    public static void main(String[] args) {
        constructor_demo cuboid=new constructor_demo(10,20,10);
        constructor_demo cube=new constructor_demo(10);
        double v1;
        double v2;
        v1= cuboid.volume();
        v2=cube.volume();
        cuboid.print();
        cube.print();
        cuboid.print(v1);
        cube.print(v2);


        
    }
}
    

