class student1
{
	 private String stdName;
	private int rollno;
	private char div;

	 public void setName( String sName)
	{
	  stdName=sName;
	}

	public void setRollno( int sRollno)
	{
	 rollno=sRollno;

	}
	public void setDiv( char sDiv)
	{
	   div =sDiv;
	}
	public String getName()
	{
	return stdName;
	}
	public int getRollno()
	{
	return rollno;
	}
	public char getDiv()
	{
	return div;
	}

}

class studentinfo
	{
 public static void main(String[] args)
   {
	student1 ss=new student1();
	ss.setName("omkar");
	ss.setRollno(28);
	ss.setDiv('A');

  	System.out.println(ss.getName());
	System.out.println(ss.getRollno());
	System.out.println(ss.getDiv());
    }

}