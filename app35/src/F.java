class F 
{
	F()
	{
		this(90);
		System.out.println("F()");
	}
	F(int i)
	{
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("------------------");
		F f2 = new F(23);
		System.out.println("------------------");
		F f3 = new F();
		System.out.println("------------------");
		F f4 = new F(34);
		System.out.println("------------------");
	}
}