abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("A-test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1");
	}
}
class C extends B
{
	void test3()
	{
		System.out.println("C-test3");
	}
}
class I 
{
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
