class Z11 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(false)
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(3);
			if(false)
			{
				System.out.println(4);
			}
			else if(true)
			{
				System.out.println(6);
			}
			else
			{
				System.out.println(66);
			}
			System.out.println(8);
		}
		System.out.println(9);
	}
}
