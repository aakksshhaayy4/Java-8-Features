@FunctionalInterface
interface Interf1
{
	public void m1(); //abstract method
	default void m2(){
		//default method
	}
	public static void m3(){
		//static method
	}
} 
