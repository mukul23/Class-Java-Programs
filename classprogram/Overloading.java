class Overload{

	String s;
	int a;
	String name = "Hello";
	int b;
	float g;
	int c;
	int d;

	void overload(String g){
		g = s;
		System.out.println(g);

	} 

	void overload(String f, int num)
	{
		f = s;
		num = a ;
		System.out.println(f+" "+ num);
	}

	// void overload(String s1){
	// 	s1 = name;
	// 	System.out.println(s1);
	// }

	void overload(int a , int b)
	{
		System.out.println("sum is" + " " + a+b);
	}

	void overload(int a, int b, int c, int d)
	{
		System.out.println("sum is "+ " "+a+b+c+d);
	}


}

class Overloading{
	public static void main(String[] args) {
		Overload obj = new Overload();

		obj.overload("ssjfu");
		obj.overload("fh",3);
		obj.overload(5,3);
	}
}
