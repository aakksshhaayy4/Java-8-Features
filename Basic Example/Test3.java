interface interf6
{
	public void add(int a, int b);
}

class Demo2 implements interf6
{
	public void add(int a, int b)
	{
		System.out.println("Sum is : "+(a+b));
	}
}

class Test3
{
	public static void main(String args[])
	{
		interf6 i = new Demo2();
		i.add(2,5);
	}
}