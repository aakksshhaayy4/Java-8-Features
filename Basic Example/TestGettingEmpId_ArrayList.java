import java.util.*;

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

class  TestGettingEmpId_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(475855, "Akshay"));
		al.add(new Employee(548648, "Pavan"));
		al.add(new Employee(154785, "Soham"));
		al.add(new Employee(877558, "Shradha"));
		al.add(new Employee(458798, "Pooja"));
		al.add(new Employee(218794, "Shruti"));
		al.add(new Employee(548797, "Harish"));
		al.add(new Employee(465464, "Akshuu"));

		System.out.println(al);
	}
}
