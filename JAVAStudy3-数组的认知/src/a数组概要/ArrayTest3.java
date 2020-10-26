package a数组概要;

/*
 * 方法中的数组参数
 */

public class ArrayTest3 {
	
	public static void main(String args[]) {
		
		//创建int类型数组传参
		int[] a = {1,2,3};
		m1(a);
		System.out.println("==============================>");
		
		//直接传递静态数组时语法如下
		//Error-->m1({45,46,89});
		m1(new int[] {78,56,84});
		System.out.println("==============================>");
		
		//创建动态初始化String类型数组
		String[] strings = new String[4];
		m2(strings);
		System.out.println("==============================>");
		
		//或者直接传动态数组
		m2(new String[3]);
		
	}
	//传参数为int类型数组
	public static void m1(int[] array1) {
		
		for (int i = 0; i < array1.length; i++) {
			
		System.out.println(array1[i]);

		}
		
	}
	
	//传参为String类型数组
	public static void m2(String[] array1) {
		
		for (int i = 0; i < array1.length; i++) {
			
		System.out.println(array1[i]);
			
		}
		
	}

}
