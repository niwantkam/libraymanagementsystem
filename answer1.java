class employee 
{
	 int empid;
 	String name;
	String address;
	
	
	employee(int empid,String name,String address)
	{
	 	this.empid=empid;
		this.name=name;
		this.address=address;
	}
	void show()
	{
	System.out.println(empid+" " +name+" "+address);
	}
}
class answer1
	{
		public static void main(String[]args)
		{
	

		employee obj=new employee(101,"omkar","cybage");
		obj.show();
		
		}
	}