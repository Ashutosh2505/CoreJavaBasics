class S 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("loop body begin for " + i);
			if(i == 5)
			{
				break;
				System.out.println("if-block");
			}
			System.out.println("loop body end for " + i);
		}
		System.out.println("main end");
	}
}
