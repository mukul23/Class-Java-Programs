class Keyword
{
    int i;
 
    Keyword()
    {
        System.out.println("First Constructor");
    }
 
    Keyword(int j)
    {
        this();    //calling statement to First Constructor
        System.out.println("Second Constructor");
    }
 
    void methodOne()
    {
        System.out.println("From method one");
    }
 
    void methodTwo()
    {
        System.out.println(this.i);  //Accessing same class field
        this.methodOne();      //Accessing same class method
    }
}