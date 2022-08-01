import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class User
{
    String name;
    User(String name){
        this.name=name;
    }
    
    class Account{
        int acc_no;
        Double Balance;
        Account(int acc_no,Double Balance){
            this.acc_no=acc_no;
            this.Balance=Balance;
        }
    }
    Account[] a=new Account[2];
    void deposit(double amount,int a_no){
        int found=0,k=-1;
        for(int i=0;i<2;i++)
        if(a[i].acc_no==a_no){
            a[i].Balance+=amount;
            found=1;
            k=i;
            break;
        }
        if(found==1)
        {
            System.out.println("Balance updated");
            display(a[k].acc_no);
        }
        else
        {
            System.out.println("Account Number does not exists");
        }
        void withdrawal(Double amount,int acc_no)throws LessBalanceException
        {
            int k=-1;
            int found=0;
            for(int i=0;i<2;i++)
            {
                k=i;
                found=1;
                break;
            }
            if(found==1)
            {
                if((a[k].Balance<500)||(a[k].Balance<amount))
                throw new LessBalanceException(amount);
                else
                    a[k].Balance=amount;
                }
                    
                    }
                }
            }
            void create_account()
            {
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<2;i++){
                    System.out.println("Enter Account Number");
                    int acc_no=sc.nextInt();
                    System.out.println("Enter Balance");
                    Double Bal=sc.nextDouble();
                    a[i]=new Account(acc_no, Bal);
                }
            }
            void display()
            {
                int k=-1,found=0;
                for(int i=0;i<2;i++)
                if(a[i].acc_no==acc_no){
                    k=i;
                    found=1;
                    break;

                }
                if(found==1)
                {
                    System.out.println("--------Account Details-----");
                    System.out.println(name+"\t"+a[k].acc_no+"\t"+a[k].Balance);
                    System.out.println("------------")
                }
                
                

            }
        
        
public class account_demo {
    public static void main(Strig args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Create account with minimum balance 500");
        System.out.println("Ente user name");
        String name=sc.nextInt();
        int acc_no;
        User u=new User(name);
        u.create_account();
        System.out.println("Account created successfully");
        Boolean opt=true;
        while(opt)
        {
            System.out.println("------------");
            System.out.println("1.Balance Enquiry 2.Deposit 3.Withdrawal");
            System.out.println("-----------");
            System.out.println("Enter your choice")
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter account details");
                System.out.println("Enter account number");
                acc_no=sc.nextInt();
                u.display(acc_no);
                break;
                case 2:System.out.println("Enter account no");
                acc_no=sc.nextInt();
                System.out.println("Enter amount to deposit");
                Double amt=sc.nextInt();
                u.deposit(amt, acc_no);
                break;
                case 3:
                try{

System.out.println("Enter account number");
acc_no=sc.nextInt();
System.out.println("Enter amount to withdraw");
Double amount=sc.nextDouble();
u.withdrawal(amount, acc_no);
                }
                catch(LessBalanceException e){}
                break;
            }
        }
    }
}


                }
               
            }
        }
       

        }
    }
    

