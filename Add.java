class Big
	{
	
	int a=10;
	 int b=20;
	int c= a+b;
	
	 Void add()
		{

			System.out.println("addition="+c);
		}
	}
class Small extends Big
	{
		
		int a=10;
	 	int b=20;
		int c= a+b;
			
	
	 super.add()
		{

			System.out.println(" answer of addition="super.(+c));
		}

	}
class Add
		{

			public static void main(String[]args)
				{
					Small obj=new Small();
					obj.add();
				}
		}