abstract class Vehical
	{
		abstract public void show();
		abstract public void display();

	}
 abstract class car extends Vehical
	{

	 public void show()
		{
		 System.out.println("car is baleno");
		}
	
	}

class bus extends car
	{

	 public void display()
		{
		 System.out.println("123456789");
		}
	
	}
class Test 		
	
	{
		public static void main(String[] args)

			{	
	bus obj=new bus();
			obj.show();
			obj.display();
			}

	}