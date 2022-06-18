class A
	{
	 void add()
		{

		int a=10;
		int b=20;
		int c;
		c=a+b;
	        System.out.println(c);
		}

	 void add( int x, int y)
		{
		int c;
		c=x+y;
		System.out.println(c);
		}
 	void add( int x, double y)
		{

		double c;
		c=x+y;
		System.out.println(c);
		}

public static void main(String[]args)
	{
	 A obj= new A();
	obj.add();
	obj.add(100,200);
	obj.add(300,15.30);
	}
}



