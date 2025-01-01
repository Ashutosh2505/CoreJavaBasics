class M7 
{
	static C test()
	{
		return new C();
	}
	public static void main(String[] args) 
	{
		Object o1 = test();
		A a1 = test();
		B b1 = test();
		C c1 = test();
	//	D d1 = test();
		System.out.println("done");
	}
}
