class H {
    static int i;

    static {
        System.out.println("A-sib");
    }
}

class A {
    static {
        System.out.println("H-sib");
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        System.out.println(H.i);
        System.out.println("-----");
        System.out.println(H.i);
        System.out.println("-----");
        H.i = 45;
        System.out.println(H.i);
        System.out.println("-----");
        System.out.println("main end");
    }
}
