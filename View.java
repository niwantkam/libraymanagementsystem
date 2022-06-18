class College
	{
		void show()
		{
			System.out.println("JSPM NTC");
		}
		void  location()
		{
		   	System.out.println("PUNE");
		}
	}
class Student extends College
	{
		void name()
		{
			System.out.println("OMKAR MOHAN KADAM");			
		}
		void dept()
		{
			System.out.println("CIVIL");			
		}
	}
class Exam extends Student
	{ 
		void ccat()
		{
			System.out.println("KARAD");			
		}
	
		void 	result()
		{
			System.out.println("PASSED");			
		}
	}
class View
	{

		public static void main(String[]args)
			{
			Exam obj=new Exam();
			obj.show();
			obj.location();
			obj.name();
			obj.dept();
			obj.ccat();
			obj.result();


			}
	}
