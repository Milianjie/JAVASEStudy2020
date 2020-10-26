package jiangtang.com.a变量的作用域;

public class VarTest {
	
	static String b = "ws116dMM";//由于main方法是静态方法，要访问变量b，b必须是静态变量
	
	public void m() {
		
		int a = 10;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		VarTest m1 = new VarTest();
		m1.m();
		System.out.println(b);
		
		int j;
		for(j=0;j<10;j++) {
			System.out.println(j);//j=1~9
		}
		System.out.println(j);//j=10
	}

}
