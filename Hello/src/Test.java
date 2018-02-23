class Test0
{
	void m1(long l)
	{
		System.out.println("long m1 called");
	}
	void m1(Integer i) //Wrapper, not the original int
	{
		System.out.println("Integer m1 called");
	}
	void m1(int ...ivar)
	{
		System.out.println("varargs m1 called");
	}
}
public class Test {
	public static void main(String[] args)
	{
		Test0  t = new Test0();
		t.m1(5);
	}
}