package hInteger的构造方法;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//在idea中Integer出现说明该类过时了
		//所以JDK版本9及以后不建议使用该类
		Integer x = new Integer(133);//将数字133转换成Integer包装类型
		
		Integer y = new Integer("133");//将String类型的数字133装换成Integer包装类型
		
		System.out.println(x+"\n"+y);
		
		//同样的，其他包装类类似
		Double m = new Double(133);//将数字133转换成Integer包装类型
		
		Double n = new Double("133.0");//将String类型的数字133装换成Integer包装类型
		
		System.out.println(m+"\n"+n);
		
		/*
		 * 包装类中有几个常量，是其对应的基本数据类型的最大值和最小值等
		 */
		//通过访问包类的常量获取最大值最小值
		System.out.println("int类型最大值："+Integer.MAX_VALUE);
		System.out.println("int类型最小值："+Integer.MIN_VALUE);
		System.out.println("byte类型最大值："+Byte.MAX_VALUE);
		System.out.println("byte类型最小值："+Byte.MIN_VALUE);
		
		
		
		
	}

}
