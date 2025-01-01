interface A
{
	void test1();
	void test2();
}
class B implements A
{
	public void test1()
	{
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
}
class N 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
