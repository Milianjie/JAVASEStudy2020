package jiangtang.com.b变量的分类;

/*
 * 根据出现的位置可以将变量分为两种
 * 局部变量：在方法体中声明的变量，包括形式参数列表
 * 成员变量：在类体中，方法体之外声明的变量统称成员变量
 */

public class VarTest {
	
	    //成员变量
		int i=10;
		
		//成员变量
		int m;//此时m被系统默认赋值为0
		
		public void m1(int m){//m也是局部变量
			int k=1;
		}

		public void m2(){
			System.out.println(m);//m值为0
		}
		public static void main(String[] args){
			VarTest vt=new VarTest();
			vt.m2();
			
		}

}
