class constructor{
    double l,b,h;


    constructor(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    constructor(double l)
    {
        this.l=b=h=l;   
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
}
    public class constructor_demo {
    
    public static void main(String[] args) {
        constructor cuboid=new constructor(10,20,10);
        constructor cube=new constructor(10);
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
    

