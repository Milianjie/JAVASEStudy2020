package jiangtang.com.a������������;

public class VarTest {
	
	static String b = "ws116dMM";//����main�����Ǿ�̬������Ҫ���ʱ���b��b�����Ǿ�̬����
	
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
