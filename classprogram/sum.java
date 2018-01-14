class Sum{

	int a,b,c;
	float d ,e,f ;
	double g;

	void sum(int a1,int a2)
	{
		a = a1;
		b = a2;

		System.out.println("The sum of 2 ints is " + a+b);
	}

	void sum(int a1,int a2,int a3)
	{
		a = a1;
		b = a2;
		c = a3;

		System.out.println("The sum of 3 ints is " + a+b+c);
	}

	
}

public static void main(String[] args) {
	Sum obj  = new Sum();

	obj.sum(2,4);
	obj.sum(2,4,7);
	obj.sum(2,4,8);
}