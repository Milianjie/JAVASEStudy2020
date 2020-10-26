package o数字类的理解;

import java.math.BigDecimal;

/*
 * 		1、BigDecimal 属于大数据，精度极高。其不属于基本数据类型，属于Java对象(引用数据类型)
 * 		   这是SUN提供的一个类，用于财务软件当中
 * 		2、财务软件中double是不够用的，必须用java.math.BigDecimal
 * 
 * 		
 */

public class BigDecimalTest {
	
	public static void main(String[] args) {
		//这不是普通的100，而是精度极高的100
		BigDecimal v1 = new BigDecimal(100);
		
		BigDecimal v2 = new BigDecimal(200);
		
		//求和不能v1+v2，因为v1和v2是引用
		BigDecimal v3 = v1.add(v2);//调用方法进行加减乘除
		System.out.println(v3);//300   BigDecimal类中已重写toString
		
	}

}
