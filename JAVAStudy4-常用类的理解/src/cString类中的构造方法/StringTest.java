package cString类中的构造方法;

public class StringTest {
	
	public static void main(String[] args) {
		
		//创建字符串对象最常用的一种方式
		String s1 = "hello world";
		//s1这个变量中保存的是一个内存地址
		//以下代码应该输出一个内存地址
		System.out.println(s1);//hello world  -->却输出了字符串，说明String类中重写了toString方法
		
		/*
		 * 常用构造方法（1）
		 */
		byte[] bs = {97,98,99};//97为a，98为b，99为c
		String s2 = new String(bs);//abc
		//输出某个类型的引用时，会自动调用该类中的toString方法，该方法未重写时与Object中的一样，即输出内存地址
		//其输出结果是字符串，如下，说明String已经重写了toString方法
		//输出字符串对象的话输出的是字符串本身，而不是地址
		System.out.println(s2);	
		
		/*
		 * 常用的构造方法（2）
		 * String(字节数组,要转换成字符串的数组元素的起始下标,要转换的长度)
		 *将byte数组的一部分转换成字符串
		 */
		String s3 = new String(bs, 1, 2);
		System.out.println(s3);//bc
		
		//将char数组全部转换成字符串
		char[] chars = {'我','是','中','国','人'};
		String s4 = new String(chars);
		System.out.println(s4);
		//将char数组部分转换成字符串
		System.out.println(new String(chars, 2, 3));
		
		/*
		 * 常用构造方法（3）
		 * 
		 */
		
	}

}
