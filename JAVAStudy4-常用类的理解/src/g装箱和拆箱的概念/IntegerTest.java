package g装箱和拆箱的概念;

/*
 * 			八种包装类型中有里有六个是数字对应的包装类，他们的父类都是Number，研究Number中公共的方法：
 * 			可以发现Number类是一个抽象类，无法被实例化
 * 			byte byteValue() 以 byte 形式返回指定的数值。 
 * 			abstract  double doubleValue() 以 double 形式返回指定的数值。 
 * 			abstract  float floatValue() 以 float 形式返回指定的数值。 
 * 			abstract  int intValue()  以 int 形式返回指定的数值。 
 *			abstract  long longValue() 以 long 形式返回指定的数值。 
 *			short shortValue() 以 short 形式返回指定的数值。 
 *		这些方法所有的子类包装类都有，这些方法负责拆箱
 *
 */

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//利用Integer包装类的构造方法将123从基本数据类型向引用数据类型
		Integer integer = new Integer(123);//基本数据类型-->引用数据类型(称之为装箱)
		
		//引用数据类型 -->基本数据类型(称之为拆箱)
		float f = integer.floatValue();//floatValue方法是Integer重写其父类Number中将引用数值转换为float类型
		System.out.println(f);//123.0
		
		int i = integer.intValue();//返回int、short、byte、long、float、double类型字段的方法都有
		System.out.println(i);//123
		
	}

}
