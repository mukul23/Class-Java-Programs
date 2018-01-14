class Person
{
     String FirstName;
     String LastName;
 
     Person(String fName, String lName)
     {
              FirstName = fName;
              LastName = lName;
      }


class Student extends Person
{
     int id;
     String standard;
     String instructor;
 
     Student(String fName, String lName, int nId, String stnd, String instr)
     {
          super(fName,lName);
          id = nId;
          standard = stnd;
          instructor = instr;         
      }
}


class SuperKeywordForConstructorDemo
{
       public static void main(String args[])
       {
               Student sObj = new Student("Jacob","Smith",1,"1 - B","Roma");
 
               System.out.println("Student :");
               System.out.println("First Name : " + sObj.FirstName);
               System.out.println("Last Name : " + sObj.LastName);
               System.out.println("ID : " + sObj.id);
               System.out.println("Standard : " + sObj.standard);
               System.out.println("Instructor : " + sObj.instructor);
        }
}
 }