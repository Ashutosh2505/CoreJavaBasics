class W 
{
	W()
	{
		System.out.println(1);
	}

	W(int i)
	{
		this();
		System.out.println(2);
	}
	
	{
		System.out.println(3);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();
		System.out.println("----------");
		W w2 = new W(10);
		System.out.println("main end");
	}
}