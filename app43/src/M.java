interface A {
	void test1();

	void test2();
}

class B implements A {
	public void test1() {
		System.out.println("test1");
	}

	// public void test2() {
	// System.out.println("test2");
	// }
}

class M {
	public static void main(String[] args) {
		B b = new B();
		// b.test1(); // Calls the test1 method
		// b.test2(); // Calls the test2 method
		System.out.println("done");
	}
}
