class A {
	A(int i) {
		System.out.println("A(int)");
	}
}

class R extends A {
	R(int i) {
		System.out.println("R(int)");
	}

	public static void main(String[] args) {
		A a1 = new A(90);
		System.out.println("---------------");
		R r1 = new R(90);
	}
}
