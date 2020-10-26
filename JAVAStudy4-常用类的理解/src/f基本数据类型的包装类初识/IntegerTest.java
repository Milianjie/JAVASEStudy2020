package f基本数据类型的包装类初识;

/*
 * 		1、Java中为8种基本数据类型准备了8种对应的包装类。8种包装类属于引用数据类型，父类是Object
 * 		2、实际的应用开发中不需要自己建这8中包装类，SUN公司已经帮我们写好了
 * 
 * 		八种基本数据类型类型所对应的包装类
 * 		基本数据类型					包装类型
 * ------------------------------------------
 * 		byte						java.lang.Byte(父类Number)
 * 		short						java.lang.Short(父类Number)
 * 		int							java.lang.Integer(父类Number)
 * 		float						java.lang.Float(父类Number)
 * 		double						java.lang.Double(父类Number)
 * 		boolean						java.lang.Boolean(父类Object)
 * 		char						java.lang.Character(父类Object)
 * 八种包装类中重点代表是java.lang.Integer，其他的与其类似，照葫芦画瓢
 */

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//有时候调用doSome方法的时候需要传一个数字进去
		//数字属于基本数据类型，而doSome()中的参数类型属于引用数据类型Object
		//那么看起来doSome()方法是无法接收基本数据类型的，如何解决呢？可以传一个该数字对应的一个包装类进去
		doSome(100);
		
		//自己定义了一个MyInt类，现在把100经过构造方法包装成对象
		MyInt myInt = new MyInt(100);
		//doSome()按道理不能传一个100数字进去，把100包装，传一个100对应的包装类
		
		doSome(myInt);//f基本数据类型的包装类初识.MyInt@1edf1c96--由于100的包装类MyInt中的toString方法没有重写，所以输出该对象的地址
					//100--重写toString后可输出100
		
	}
	
	public static void doSome(Object obj) {
		// TODO 自动生成的方法存根
		
		System.out.println(obj);

	}

}
