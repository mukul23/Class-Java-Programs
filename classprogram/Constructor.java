import java.io.*;
import java.util.Scanner;
class Customer
{
	private String cName ;
	private byte cAge;
	private long cAccNo;
	private char cGender;
	private float cBal;

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


public class Constructor
{
	public static void main(String[] args) throws IOException
	{
		Customer obj = new Customer();
		System.out.println("\n\n----Menu-----\n\n");
		System.out.println("1.Enter the details\n");
		System.out.println("2.Display the data\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice\n");
		String input = scanner.nextLine();
		System.out.println("input = " + input);


		obj.read();
		obj.disp();
	}
		
	}



