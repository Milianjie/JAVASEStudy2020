package bString字符串存储原理;

import java.awt.print.Printable;

public class StringTest {
	
	public static void main(String[] args) {
		
		//垃圾回收器是不会释放字符串常量池中的对象的
		String s1 = "hello";
		String s2 = "hello";//"hello"是存储在字符串常量池中，这个"hello"对象不会新建
		System.out.println(s1 == s1);//true
		
		//思考？由于字符串对象保存在字符串常量池中，同一个字符串唯一，所以内存地址唯一，是不是比较两个字符串就不需要比较其中的内容了呢
		String x = new String("xy");
		String y = new String("xy");
		System.out.println(x == y);//false-->比较的是x与y保存的String对象的引用地址
		//通过以上输出字符串比较用==不保险，要用String中重写的equals方法
		System.out.println(x.equals(y));//true-->比较的是这两个String对象中保存的指向字符串对象"xy"的内存地址
		
		String k = new String("test");
		//字符串后面加 . 是因为"test"是一个字符串对象，只要是对象都能调用方法，所以可以加.
		//如：String s = "kkk";--->我们可以发现可以s与"kkk"是等价的，s可以s.  那么"kkk"也可以
		System.out.println("test".equals(k));//建议使用这种方式
		System.out.println(k.equals("test"));//不建议使用这种方式，k可能为null，报异常
		
		
	}

}
