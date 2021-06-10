@FunctionalInterface
interface interf2
{
	public void m1();
}

@FunctionalInterface
interface interf3 extends interf2
{
	public void m1();
}

/*
interface interf3 extends interf2
{
}
*/