class Demo
{
 	int id;
	int marks;
	String name;
	public void show()
	{
	 System.out.println("enter id, marks ,name");	
	}
}
class Result extends Demo
{
     public void display()
	{ 	id=1;
		marks=100;
		name="omkar";
	  System.out.println( id+" " +marks+" "+name);
	}
	
	public static void main(String[]args)
		{

		Result obj=new Result();
		obj.show();
		obj.display();
		}
}