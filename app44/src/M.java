class A {
	static void test(int i, int j) {
		System.out.println("A-test");
	}
}

class M extends A {
	static void test(int p, int q) {
		System.out.println("I-test");
	}

	public static void main(String[] args) {
		K obj = new K();
		obj.test(23, 40);
		System.out.println("done");
	}
}