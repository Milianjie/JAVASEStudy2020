package q枚举类enum;

/*
 * 		以下java程序没有使用枚举类，分析其在设计上有什么缺陷?
 * 		
 * 			缺陷在于：方法的返回值类型上，该需求返回int不恰当
 * 					因为最后的结果只是成功与失败，那么最好使用boolean类型，布尔类型的true和false正好表示两种不同的状态
 * 					int类型的话如果程序员写错其他的数值，在编译和运行是不会报错的，这样可能偏离了需求
 * 			追求的是：尽量在编译阶段将所有错误找出来
 * 
 * 			思考：以下方法中的结果只有两种，使用布尔类型返回，很实用。
 * 				然而在以后的开发过程中可能方法的结果包括3种、4种等甚至更多的结果，
 * 				这些可能出现的结果都是能够数清楚的，可以一枚一枚列举出来的，这时布尔类型就无法
 * 				满足需求了，因而我们就要用java中的枚举类型。
 */

public class EnumTest01 {
	
	public static void main(String[] args) {
		
		int retValue1 = divide(10, 5);
		System.out.println(retValue1);
		
		System.out.println("==========================");

		int retValue2 = divide(10, 0);
		System.out.println(retValue2);
		
	}
	
	/**
	 * (需求)设计者说：以下程序计算俩个int类型数据的商，计算成功返回1，计算失败返回0
	 * @param a	int类型数据
	 * @param b	int类型数据
	 * @return	计算成功返回1，计算失败返回0
	 */
	public static int divide(int a,int b) {
		
		try {
			
			int c = a/b;
			//执行到这表示代码没有发生异常，执行成功
			System.out.println(a+"/"+b+"="+c);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			//执行到这表示发生异常，执行失败
			System.out.println("捕获到异常："+e);
			return 0;
		}
		
	}

}
