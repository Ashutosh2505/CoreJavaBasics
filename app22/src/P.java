class P 
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			int j = 40;
			System.out.println("loop body:" + i);
			i++;
		}
		System.out.println("main end:" + i + ", " + j);
	}
}