import java.io.*;
import java.util.Scanner;
class Customer
{
private String  custName;
private byte custAge;
private long accNo;
private char gender;
private float bal;
private String phoneNum;
private double netBal;
private long custId;
static long scustId;
/*static
{
	int a=10;
	int b=20;
	int c=a+b;
	scustId=100;
	System.out.println(c);
	System.out.println(scustId);
}*/
public static void show()
{
	System.out.println("Last Employee ID="+scustId);
	//System.out.println("Name="+custName);
		
//System.out.println("Employee Name="+custName);

}
public Customer()
{
	scustId++;
	custId=scustId;
}
public void read() throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the customer name");
	custName=br.readLine();
    System.out.println("Enter the customer age");
	custAge=Byte.parseByte(br.readLine());
	System.out.println("Enter the customer account number");
	accNo=Long.parseLong(br.readLine());
    System.out.println("Enter the customer Gender");
	gender=(char)br.read();
	System.out.println("Enter the Balance Amount");
	bal=scan.nextFloat();
	System.out.println("Enter the Net Balance Amount");
	netBal=scan.nextDouble();
	

}
public void disp()
{
	//String cname=new String(name);
System.out.println("Customer Name ="+custName);
System.out.println("Customer Age ="+custAge);
System.out.println("Customer Account Number ="+accNo);
System.out.println("Customer Gender="+gender);

System.out.println("Customer Balance="+bal);
System.out.println("Customer Net Balance="+netBal);
System.out.println("Customer Id="+custId);


}

}

public class Static
{

public static void main(String args[]) throws IOException
{
   Customer obj[] =new Customer[2];
  Scanner scan=new Scanner(System.in);
	boolean loop=true;
	byte ch;
	while(loop)
	{
		
		System.out.println("1. Read data to the customer object");
		System.out.println("2 Display Customer object");
		System.out.println("3. static method");
		
		System.out.println("4. Exit");
		
		System.out.println("Enter your Choice");
		ch=scan.nextByte();
		switch(ch)
		{
			case 1: 
			for(int i=0;i<2;i++)
			{   obj[i]=new Customer();
			       obj[i].read();
				   
			}
			break;
		    case 2: 
			         for(int i=0;i<2;i++)
					 {
						 
                   obj[i].disp();
                   }
				   System.in.read();
				  
				   break;
			case 3:
                   Customer.show();
				   break;	

				   
             case 4: 
                   loop=false;			 
		}
		
	}
	
}

}