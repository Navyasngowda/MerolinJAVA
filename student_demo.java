public class student_demo {
    public static void main(String[] args) {
        Student s=new Student();
        s.getdata(10,"Smith");
        s.printdata();
    
       
    
       
    }

    
}
class Student
{
    private int USN;
    private String Name;
    void getdata(int U,String N)
    {
        this.USN=U;
        this.Name=N;
        

    }
    void printdata()
    {
        System.out.println(Name+"\t"+USN);
    }
}

