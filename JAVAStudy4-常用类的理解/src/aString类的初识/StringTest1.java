package aString类的初识;

/*
 * 关于java JDK中内置的一个类：java.lang.String
 * 			1、String表示的是字符串类型，是引用数据类型，不是基本数据类型
 * 			2、java中用""括起来的都是String对象。如："abc","def","hellow world"这三个都是String对象
 * 			3、java中规定，双引号括起来的字符串是不可改变的，如"abc","def"这些都是直接存到方法区的字符串常量池
 *			中的，就是说当你定义一个String类型的变量并赋值为"abc"时，另外想定义一个String类型变量赋值为"abc"+"xv"
 *			时，在字符串常量池中的字符串"abc"是不会改变的，但是可以被拿去与新创建的String对象"xv"拼接，然后底
 *			层创建一个新的String对象，即字符串"abcxv"。
 *
 *		SUN公司将字符串放进字符串常量池中原因是：字符串在实际开发中使用太频繁，不能每一次使用都在底层创建String对象
 *		放在方法区字符串常量池中即可随调随用，执行显效率高。
 *
 */

public class StringTest1 {
	
	public static void main(String[] args) {
		//以下两行代码在底层是创建了三个String对象的，都在字符串常量池中
		String s1 = "abc";
		String s2 = "abc"+"zrj";//并不是"abc"变成"abczrj","abc"只是被拿过来拼接而已
		
		//分析：用new方式创建的字符串对象，以下代码中的"xy"是哪来的
		//首先一定要记得凡是双引号括起来的字符串都在字符串常量池中有一份
		//然后是"new出来的"对象一定会在堆内存中开辟内存空间
		//所以在字符串常量池中有字符串"xy",堆中new出一个String对象，该对象保存了"xy"的内存地址，栈
		//中的String类型变量s3存储堆中String对象的内存地址
		String s3 = new String("xy");//
		
	}

}
