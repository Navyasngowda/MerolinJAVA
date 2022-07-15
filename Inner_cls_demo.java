class Outer
{
    int outer_x=100;
    class inner{
        int inner_y=200;
        void imethod()
        {
            System.out.println("Accessing from inner class");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        
        }
    }
    void display()
    {
        inner ob1=new inner();
        System.out.println("The value of inner class variable"+ob1.inner_y);
        System.out.println("The value of inner class variable is"+outer_x);

    }
}

public class Inner_cls_demo {
    public static void main(String[] args) {
        Outer obname=new Outer();
        obname.display();
        Outer.inner obj2=obname.new inner();
        obj2.imethod();
    }
    
}
