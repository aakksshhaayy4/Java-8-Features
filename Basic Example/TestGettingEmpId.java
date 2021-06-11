class Employee
{
	int eno;
	String ename;

	Employee(int eno, String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}

	public String toString()
	{
		return ename+" : "+eno;
	}
}

class  TestGettingEmpId
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(7855545,"Akshay");	
		System.out.println(e.toString());
	}
}
