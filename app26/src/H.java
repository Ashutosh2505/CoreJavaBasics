class H {
	public static void main(String[] args) {
		System.out.println("main begin");
		test(10);
		System.out.println("main end:");
	}

	static void test(int i) {
		System.out.println("test begin:" + i);
		int i = 20;
		System.out.println("test end:" + i);
	}
}
