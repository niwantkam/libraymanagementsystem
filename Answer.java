class One
	{
	
	public void add()
		{
			int a=10;		
			int b=20;
			int c=a+b;
			System.out.println("addition="+c);
		}
	public void sub()
			{
			int a=10;		
			int b=20;
			int c=a-b;
			System.out.println("subtraction="+c);
			}
	}
class Seconde extends One
	{
		public void mul()
		{
			int a=10;		
			int b=20;
			int c=a*b;
			System.out.println("multiplication="+c);
		}
	}
class Three extends Seconde
	{
		
		public void div()
		{
			int a=1000;		
			int b=20;
			int c=a/b;
			System.out.println("divion="+c);
		}
	}
class Answer
{

	public static void main(String[]args)
	{
		Three obj=new Three();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
