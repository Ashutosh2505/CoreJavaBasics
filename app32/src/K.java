class K {
	public static void main(String[] args) {
		String s1 = "abcdefabcdef";
		// 0123456789
		int i = s1.indexOf("def");
		int j = s1.indexOf("dem");
		System.out.println(i);
		System.out.println(j);
		int k = s1.indexOf("abc", 7);
		int m = s1.indexOf("cde", 9);
		System.out.println(k);
		System.out.println(m);
	}
}
