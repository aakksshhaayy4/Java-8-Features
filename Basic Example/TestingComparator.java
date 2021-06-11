import java.util.*;

class MyComparator implements Comparator<Integer> 
{
	public int compare(Integer i1, Integer i2)
	{
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else {
			return 0;
		}
	}
}

class TestingComparator
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
	

