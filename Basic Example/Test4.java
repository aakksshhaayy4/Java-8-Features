interface interf6
{
	public void add(int a, int b);
}


class Test4
{
	public static void main(String args[])
	{
		interf6 i = (a,b)->System.out.println("Sum is : "+(a+b));
		i.add(254,511);
	}
}