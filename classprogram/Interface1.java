//import Account.BankAc;
import Account.Deposit;
import Account.withdraw;
import java.io.*;

abstract class Account
{
	final String bankName="SBI";
	String custName;
	private int accno;
	private float balance;
	Account()
	{
		custName="";
		accno=-1;
	}
	Account(String custName)
	{
		this.custName=custName;
		
	}
	Account(String custName, int accno)
	{
		this(custName); // constructor chaining
		this.accno=accno;
		
	}
	
	public void read()
	{
		InputStreamReader isr=new       						InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try
		{
		System.out.println("\nEnter the Customer Name");
		custName=br.readLine();
		System.out.println("\n Enter the Account Number");
		accno=Integer.parseInt(br.readLine());
		System.out.println("\nEnter the Balance");
		balance=Float.parseFloat(br.readLine());
		  }
	   catch(Exception e)
		   {
		   System.out.println(e.toString());
		   }

	}
	public void disp()
	{
		System.out.println("ACustomer Name ="+custName);
		System.out.println("Account Number ="+accno);
		System.out.println("Balance Amount ="+balance);

	}

	public float getBalance()
	{
	
	return balance;
	}
	public void setBalance(float b)
	{
	balance=b;
	}

}



class SavingAccount extends Account implements withdraw,Deposit
{
	private float minbal;
	
	public void read()
	 {
    	   InputStreamReader isr=new 					InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(isr);
    	   try
			{
			super.read();
			System.out.println("Enter the minimum 				balance");
			minbal=Float.parseFloat(br.readLine());
			}
			catch(Exception e)
		   {
		   System.out.println(e.toString());
		   }
  	 }
		  
	

	public void disp() 
	{
	super.disp();
	//accesss specifiers
	System.out.println("Minimum balance : "+minbal);
	

	}
	public void withdraw1() 
	{ int amt;
	    
try
{
InputStreamReader isr=new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(isr);
    	   
		System.out.println("Enter the amount to withdraw: ");
		amt=Integer.parseInt(br.readLine());
		
		//float b=getBalance();
		if(getBalance()-amt>minbal)
		{
		
		setBalance(getBalance()-amt);

		
		}
		else
		{
			System.out.println("Sorry ! Amount exceeds minimum balance");
	
        }
}
catch(Exception e)
{
}
	

	}
	
}
public class Interface1
{
	public static void main(String [] args)
	{
	SavingAccount ac=new SavingAccount();
	ac.read();
	ac.disp();
	ac.withdraw1();
	ac.disp();

  }
}