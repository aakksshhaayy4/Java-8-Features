import java.util.*;

class TestingComparatorWithLambdaExpression
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
		Comparator<Integer> c = (i1,i2) -> (i1<i2) ? -1 : (i1>i2) ? 1 : 0; // lambda Expression used here
		Collections.sort(al, c);
		System.out.println(al);
	}
}
	

