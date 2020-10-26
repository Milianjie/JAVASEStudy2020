package eStringBuffer进行字符串拼接;

/*
 * 		在使用+进行字符串拼接时，会创建一些多余的字符串对象，造成方法区的字符串常量池的内存浪费
 * 		如果需要进行大量的字符串拼接时，建议使用JDK中自带的:
 * 					java.lang.StringBuffer 或
 * 					java.lang.StringBuilder
 * 
 * 		优化StringBuffer的性能:在创建StringBuffer的时候给定一个初始化容量
 * 							   以减少底层的扩容次数，自己预估给一个大一点的初始化容量
 */

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		//final修饰的引用变量一旦被赋值不可再指向其他，数组是引用类型
		
		//创建一个StringBuffer对象，而底层中该类的构造方法调用super(16)的是其父类AbstractStringBuilder的构造方法
		//其父类的构造方法是创建一个容量capacity=16的char(或者是byte)数组，创建什么类型看JDK版本而定
		//就是说下面创建对象就是创建一个容量默认为16的非private final修饰的char[]-->value
		StringBuffer stringBuffer = new StringBuffer();//默认16
		
		//拼接字符串统一使用append()方法，append是追加的意思
		//就是说，char数组容量是16，要拼接字符串容量不够用，就需要用append()方法，该方法底层调用父类的append方法
		//父类的append有确保容量方法，该方法就调用数组拷贝方法Arrays.copyOf()，所以可以自动扩容，拷贝完数组后之前的数组就被垃圾回收器回收了
		stringBuffer.append('a');
		stringBuffer.append(true);
		stringBuffer.append(3.14);
		stringBuffer.append(100);
		stringBuffer.append("柏德汉");
		System.out.println(stringBuffer);//atrue3.14100柏德汉
		//因为追加的字符串放进的是char数组中，不占用字符串常量池，而且该数组比String中用final修饰的数组存字符对象
		//赋值后依然可以改变，所以用其进行字符串的拼接，final修饰的引用一旦被赋值不可再指向其他，数组是引用类型
		
		//指定初始化容量的StringBuffer对象(字符串缓冲区对象)
		StringBuffer stringBuffer2 = new StringBuffer(100);
		
	}

}
