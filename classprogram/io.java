import java.io.*;

class Customer
{
	private String cName ;
	private byte cAge;
	private long cAccNo;
	private char cGender;

	private short cMinBal;
	private long cid;

	public void read() throws IOException
	{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the customer name");
		cName = br.readLine();

		System.out.println("Enter the customer age");
		cAge = Byte.parseByte(br.readLine());

		System.out.println("Enter the account no");
		cAccNo = Long.parseLong(br.readLine());

		System.out.println("Enter the minimum balance");
		cMinBal = Short.parseShort(br.readLine());

		System.out.println("Enter the balance amount");
		cBal = Float.parseFloat(br.readLine());

		System.out.println("Enter the customer Gender");
		cGender = (char)br.read();

	}

	public void disp()
	{
		System.out.println("Customer name = " + cName);
		System.out.println("Customer age = " + cAge);
		System.out.println("Customer Account Number = " + cAccNo);
		System.out.println("Gender is="+cGender);
	}

	}

public class Datatype
{
	public static void main(String[] args) 
	{
		Customer obj = new Customer();

		System.out.println("\n----Menu-------\n\n");
		obj.read();
		obj.disp();
	}
		
}



