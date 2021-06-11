import java.util.*;

class MyComparator implements Comparator<Integer> 
{
	public int compare(Integer i1, Integer i2)
	{
		return (i1<i2) ? -1 : (i1>i2) ? 1 : 0; //ternary Operator
	}
}

class TestingComparatorWithTernaryOperator
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(95);
		al.add(65);
		al.add(70);
		al.add(40);
		al.add(25);
		al.add(0);
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
	}
}
	

