class A
{
	void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class N extends A
{
	int test(int p, int q)
	{
		System.out.println("I-test");
		return 30;
	}
	
	public static void main(String[] args) 
	{
		N obj = new N();
		obj.test(23, 40);
		System.out.println("done");
	}
}