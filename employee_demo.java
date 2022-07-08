import java.sql.Date;

public class employee_demo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.getdata(10,"Smith",2000,"2000-12-09");
        e.printdata();
    }
    
}
class Employee{
    private int ssn;
    private String ename;
    private int esalary;
    private String dob;
    void getdata(int ssn,String ename,int esalary,String dob){
        this.ssn=ssn;
        this.ename=ename;
        this.esalary=esalary;
        this.dob=dob;
    }
    void printdata(){
        System.out.println(ssn+"\n"+ename+"\n"+esalary+"\n"+dob);
    }


    }

