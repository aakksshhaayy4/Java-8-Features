interface interf5
{
	public void m1();
}

class Test2
{
	public static void main(String args[])
	{
		interf4 i = () -> System.out.println("Hello Guys...This program is Executes By ising Lambda Expression");
		i.m1();
	}
}