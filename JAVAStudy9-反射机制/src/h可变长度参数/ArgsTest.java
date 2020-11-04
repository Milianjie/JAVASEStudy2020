package h可变长度参数;

/*
 * 【可变长度参数】
 * 		定义语法：int... args
 * 				类名... 变量名（也可以认为是一个数组名，但要注意的是三个点）
 * 
 * 		1、可变长度参数要求参数个数：0~N个
 * 		2、可变长度参数只能定义在参数列表最后一个位置，也说明只能定义一个
 * 		3、可变长度参数可以看成是一个数组，所以有长度，也可以传个数组进去，但没必要这么干
 * 		
 */

public class ArgsTest {
	
	public static void main(String[] args) {
		
		m1();//不跟参数
		m1(10);//跟2个
		m1(10,20);//3个
		//m1("ada");//出错
		
		m2(1);
		m2(1, "zx","ad");
		
		m3("zhongrongjie","piaochulong","piaoxiaomin","linyuner");
		
	}
	
	public static void m1(int... args) {
		System.out.println("m1方法执行了");
	}
	
//	public static void m2(int... args,String...strings) {
//		System.out.println("m2方法执行了");
//	}
	public static void m2(int args,String... strings) {
		System.out.println("m2方法执行了");
	}
	
	public static void m3(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

}
