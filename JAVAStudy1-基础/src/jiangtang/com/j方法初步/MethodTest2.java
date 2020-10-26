package jiangtang.com.j方法初步;

/*
 *       定义方法的语法：
 *       
 *           [方法的修饰符列表] 方法返回值类型 方法名(方法的形式参数列表){
 *                  java语句；
 *           }
 *           
 *           1.[方法的修饰符列表]是可选项。现在暂时先写成public static
 *           2.方法的返回值类型，可以是java语言中的任何一种数据类型(基本和引用数据类型)
 *           3.如果该方法执行结束之后，没有任何返回值，定义方法时，返回值类型写：void
 *           4.方法名只要是合法标识符即可
 *           5.方法的形式参数列表，可以有参数，也可以没有参数，如果有多个参数用逗号隔开
 *           
 *            public static void m1(){}
 *            public static  修饰符
 *            void  该方法执行后没有返回值
 *            m1   就是方法名
 *            没有形式参数
 *            
 *            public static int m2(int a,boolean b){}
 *            public static  修饰符
 *            int  该方法执行后返回值为int型
 *            m2   就是方法名
 *            int a,boolean b 是形式参数列表
 *            
 *            6.如果一个方法的返回值类型不是void,那么在方法体中必须使用return
 *            来返回数据，return语句一旦执行，则方法结束
 */


public class MethodTest2 {
	
	public static void main(String[] args){
		   
		//方法调用
		MethodTest2.println("新年好呀，新年好呀，我们大家新年好");
		
	}

	//定义方法
	//方法的形式参数列表中起决定性作用的是参数的类型
	//参数的名字(局部变量的名字)是随意的只要是合法标识符
	public static void println(String mge){
		System.out.println(mge);
	}
}

