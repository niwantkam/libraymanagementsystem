
interface A
	{
	 public abstract void show();
	}
 interface B 
	{

	 public  abstract void show();
		
	}
class C implements B,A
	{
		 public void dispaly()
		{
		System.out.println("amol shingane");
		}
		 public void show()
		{
		System.out.println("omkar kadam");
		}
	}
class Z
	{
	 public static void main(String[]args)
		{
		C obj=new C();
		obj.show();
		obj.dispaly();
		}
	}