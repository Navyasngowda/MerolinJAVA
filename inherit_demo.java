import javax.swing.text.Style;

class shape{
    double width;
    double height;
    double length;
    double breadth;
    shape(){
        width=20;
        height=20;
        length=10;
        breadth=10;
    }
    
    void print_sup(){
        System.out.println("I am super class,shape");
    }
}
class triangle extends shape{
    String s;
    double area(){
        return height*width/2;
    }
    void show_demo(){
        System.out.println("subclass");
    }
   
    }
    class rectangle extends shape{
        String s;
        double area(){
            return length*breadth;
        }
        void show_demo(){
            System.out.println("subclass");
        }
       
        }
        
        
       
    
    
    
    
    
   





public class inherit_demo {
    public static void main(String[] args){
        triangle t1=new triangle();
        rectangle r1=new rectangle();
        t1.print_sup();
        r1.print_sub();
        

        System.out.println("area="+t1.area());
        System.out.println("area=+"r1.area());
        
    }
    
}
