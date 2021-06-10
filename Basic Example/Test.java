interface interf4
{
	public void m1();
}

class Demo implements interf4
{
	public void m1()
	{
		System.out.println("Hello Guys !");
	}
}

class Test
{
	public static void main(String args[])
	{
		interf4 i = new Demo();
		i.m1();
	}
}