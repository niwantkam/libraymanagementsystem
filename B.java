class A
    {
	 int a;
	 int b;
	 int c;
 	void add()
	{
	 a=100;
	b=200;
	c=a+b;
	System.out.println("adiition="+c);
	}
     }
class B extends A
   {
    void ans()
	{ a=300;
	b=400;
	c=a+b;
	System.out.println("adiition="+c);
	}
  
public static void main(String[]args)
	{
	    B obj= new B();
	    obj.add();
	   obj.ans();
	   
	}
    }