import java.io.*;

class Global
{
    public static void mainMenu()
    {
        System.out.println("THE MATH CLASS METHODS");
        System.out.println("-----------------------------");
        System.out.println("1.  READ Strings");
        System.out.println("2.  String in lowercase letters");
        System.out.println("3.  String in uppercase letters");
        System.out.println("4.  Lenght of String");
        System.out.println("5.  Starting letter");
        System.out.println("6.  Making a SubString");
        System.out.println("7.  Concate your First and Last name");
        System.out.println("8.  Char at index");
        System.out.println("9.  Hashcode of the String");
        System.out.println("10. Check for empty String");
        System.out.println("11. Checking for Equality");
        System.out.println("12. EXIT");
        System.out.println("=============================");
        System.out.print("Your Choice: ");
    }
}

class _StringImplementation
{
    String string1;
    String string2;
    
    public void getData() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Your First name: ");
        string1 = br.readLine();
        
        System.out.print("Enter Your Last name: ");
        string2 = br.readLine();
    }
    
    //1
    public void lowercase()
    {
        System.out.println("Your First name in lowercase letters: " + string1.toLowerCase());
        System.out.println("Your Last name in lowercase letters: " + string2.toLowerCase());
    }
    
    //2
    public void uppercase()
    {
        System.out.println("Your First name in uppercase letters: " + string1.toUpperCase());
        System.out.println("Your Last name in uppercase letters: " + string2.toUpperCase());
    }
    
    //3
    public void lenght()
    {
        System.out.println("Lenght of your First name: " + string1.length());
        System.out.println("Lenght of your Last name: " + string2.length());
    }
    
    //4
    public void startingchar() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a Char: ");
        String ch = br.readLine();
        
        System.out.println("Does your name starts with "+ch+ ": " + string1.startsWith(ch));
    }
    
    //5
    public void substring() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i, j;
        System.out.println("Lenght of your First name: " + string1.length());
        
        System.out.print("Enter the Starting point of the SubString: ");
        i = Integer.parseInt(br.readLine());
        
        System.out.print("Enter the Ending point of the SubString: ");
        j = Integer.parseInt(br.readLine());
        
        System.out.println("Substring of your name: " + string1.substring(i-1,j-1));
    }
    
    //6
    public void concat()
    {
        System.out.println("Concatination of your First and Last name: " + string1.concat(" "+string2));
    }
    
    //7
    public void charat() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i;
        System.out.println("Lenght of your First name: " + string1.length());
        System.out.print("Enter the index number: ");
        i = Integer.parseInt(br.readLine());
        
        System.out.println("Character at index "+i+ " is: " +string1.charAt(i-1));
    }
    
    //8
    public void hash()
    {
        System.out.println("Hash code of " + string1 + " is =  " + string1.hashCode());
        System.out.println("Hash code of " + string2 + " is =  " + string2.hashCode());
    }
    
    //9
    public void empty()
    {
        System.out.println("is your First name empty? = " + string1.isEmpty());
        System.out.println("is your Last name empty? = " + string2.isEmpty());
    }
    
    //10
    public void equal()
    {
        System.out.println("Your first name is equal to your last name = " +string1.equalsIgnoreCase(string2));
    }
}

public class _String
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int switchElement = 0;
        boolean loop = true;
        
        _StringImplementation string = new _StringImplementation();
        
        while(loop)
        {
            new java.util.Scanner(System.in).nextLine();
            //new scan.nextLine();
            for (int i = 0; i < 7; i++)
                System.out.println("\n");
            
            Global.mainMenu();
            switchElement = Integer.parseInt(br.readLine());
            switch (switchElement)
            {
                case 1:
                    string.getData();
                    System.out.println("Read method performed successfully...");
                    break;
                    
                    
                case 2:
                    string.lowercase();
                    break;
                    
                case 3:
                    string.uppercase();
                    break;
                    
                case 4:
                    string.lenght();
                    break;
                    
                case 5:
                    string.startingchar();
                    break;
                    
                case 6:
                    string.substring();
                    break;
                    
                case 7:
                    string.concat();
                    break;
                    
                case 8:
                    string.charat();
                    break;
                    
                case 9:
                    string.hash();
                    break;
                    
                case 10:
                    string.empty();
                    break;
                    
                case 11:
                    string.equal();
                    break;
                    
                case 12:
                    loop = false;
                    break;
                    
                default:
                    System.out.println("Wrong chooice...");
                    break;
            }
        }
    }
}

//String str = new String("Hello");
//str.concat("World");