package i包装类的自动装箱和拆箱;

public class IntegerTest02 {
	
	public static void main(String[] args) {
		
		//分析以下程序
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);//false
		
		/*
		 * 上下程序输出不一样，为什么？
		 * 	Java中为了提高程序的执行效率，将[-128-127]之间所有的包装对象提前创建好放到了方法区中
		 * 	的整数型常量池中了，当用到该区间的整数时直接从常量池中取出，就不需要new对象了。整数型常量池中的每一个整数
		 * 对象都有自己内存地址，并且唯一，就跟字符串常量池中的一样
		 */

		//127在整数常量池中，所以x和y所存第地址是一样的
		//类加载阶段执行将这256个对象创出来放进去
		//池，cache，缓存机制；就是已经准备好了的已经放在那存在了的意思，用的时候拿来就能用了
		Integer x = 127;
		Integer y = 127;
		System.out.println(x == y);//true
		
	}

}
