
/*
 *    this关键字：
 *              1.this是什么？
 *              this是一个引用类型
 *              在对中的每一个Java对象上都有this
 *              this保存内存地址指向自身
 *              
 *              2.this能用在什么地方
 *              第一：this可以应用在成员方法中
 *              
 *              第二：this可以应用在构造方法中
 *              语法：this(实参)
 *                    通过一个构造方法去调用另一个构造方法
 *                    this(实参);语句必须出现在构造方法的第一行
 *                    作用：使代码得到更简便的重用
 */
package gthis关键字;

public class ThisTest01 {
	
	public static void main(String[] args){
		
		//创建MyDate类对象
		MyDate u1 =new MyDate();
		System.out.println(u1.year+"年"+u1.month+"月"+u1.day+"日");
		
		MyDate u2 =new MyDate(2019,9,18);
		System.out.println(u2.year+"年"+u2.month+"月"+u2.day+"日");
	}

}

class MyDate{
	
	//属性
	int year;
	int month;
	int day;
	
	//构造方法
	
	//需求：在创建日期对象的时候，默认日期是1997-1-1
	MyDate(){//无参数的构造方法尽量也写出来
		this(1997,1,1);
	}
	
	MyDate(int _year,int _month,int _day){
		year=_year;
		month=_month;
		day=_day;
	}
}
