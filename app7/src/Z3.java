class Z3 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++		+	i	+	i++		+	i	+	i++		+	i		+	
			//	0			1		1			2		2			3				=		9
				++i		+	i	+	++i		+	i	+	i++		+	i++		+	
			//	4			4		5			5		5			6				=		29
				i--		+	i	+	i--		+	i	+	i--		+	--i		+	
			//	7			6		6			5		5			3				=		32
				i++		+	i++		+	i--		+	i--		+	i--		+	i;	
			//	3			4			5			4			3			2		=		21
		System.out.println(i);	//	2
		System.out.println(j);	//	91
	}
}