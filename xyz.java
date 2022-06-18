 class xyz extends Thread
{ 
 	public void run()
		{
		 for (int i=0;i<10;i++)
			{
			System.out.println("I="+i);
			}
		}
		
public static void main(String []args) throws Exception
	{
		xyz t1=new xyz();
		xyz1 t2=new xyz1();
		xyz2 t3=new xyz2();
		t1.start();
		
			 Thread.sleep(5000);
		
		t2.start();
		
			 Thread.sleep(5000);
		
		t3.start();
		
		
		
	}


}
 class xyz1 extends Thread
{ 
 	public void run()
		{
		 for (int m=10;m<20;m++)
			{
			System.out.println("M="+m);
			}
		}
}
class xyz2 extends Thread
{ 
 	public void run()
		{
		 for (int p=20;p<30;p++)
			{
			System.out.println("P="+p);
			}
		}
}