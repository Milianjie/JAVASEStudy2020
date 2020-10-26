package jiangtang.com.公共类与非公共类;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("A is a public class");
	}

}

class B {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		System.out.println("B is a class");
	}
}