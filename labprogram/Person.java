class AnyClass
{
    int i;
 
    AnyClass()
    {
        System.out.println("First Constructor");
    }
 
    AnyClass(int j)
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