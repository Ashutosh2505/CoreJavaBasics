class A {
	static void test() {
		System.out.println("test");
	}
}

class F {
	public static void main(String[] args) {
		test(); // Call the test method with class name A
		System.out.println("done");
	}
}
