class G {
	static {
		System.out.println("sib1");
		i = 30;
	}

	public static void main(String[] args) {
		System.out.println("main:" + i);
	}

	static {
		System.out.println("sib2");
	}
	static int i;
}
