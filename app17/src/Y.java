class Y 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j;
		/*
			10000 statements		
		
		*/
		j = 10;
		switch(i)
		{
			case 4:
				System.out.println("from case 4");
				break;
			case j:
				System.out.println("from case 10");
				break;
		}
		System.out.println("end");
	}
}