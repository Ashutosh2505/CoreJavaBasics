class P 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("loop body begin for " + i);
			if(i == 5 || i == 9)
			{
				System.out.println("if-block");
				continue;
			}
			System.out.println("loop body end for " + i);
		}
		System.out.println("main end");
	}
}

/*
	continue
	
	break
	
	return

	throw

*/







