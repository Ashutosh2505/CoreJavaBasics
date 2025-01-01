class A {
	A() {
		super(); // Implicitly calls the constructor of Object (root class)
		System.out.println("A()");
	}

	A(int i) {
		this(); // Calls the no-argument constructor of A
		System.out.println("A(int)");
	}
}

class B extends A {
	B() {
		this(90); // Calls B(int)
		System.out.println("B()");
	}

	B(int i) {
		super(20); // Calls A(int)
		System.out.println("B(int)");
	}
}

class C extends B {
	C() {
		super(10); // Calls B(int)
		System.out.println("C()");
	}

	C(int i) {
		System.out.println("C(int)");
	}
}

class P {
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A(); // Calls A()
		System.out.println("-------------");
		B b1 = new B(); // Calls B() -> B(int) -> A(int) -> A()
		System.out.println("-------------");
		C c1 = new C(); // Calls C() -> B(int) -> A(int) -> A()
		System.out.println("-------------");
		A a2 = new A(10); // Calls A(int) -> A()
		System.out.println("-------------");
		B b2 = new B(20); // Calls B(int) -> A(int) -> A()
		System.out.println("-------------");
		C c2 = new C(30); // Calls C(int)
		System.out.println("-------------");
		System.out.println("main end");
	}
}
