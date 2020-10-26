package jiangtang.com.c数据类型详解;

/*
关于Java语言中的整型数据
    byte      1byte(8bit)   -128~127
    short     2byte
    int       4byte
    long      8byte
    有三种表示方法：
    十进制
    八进制  以0开头
    十六进制    以0x开头
    */
public class DataTypeTest{
	
	public static void main(String[] args){
		
		//十进制
		int i1=10;
		
		//八进制
		int i2=010;
		
		//十六进制
		int i3=0x10;
		
		System.out.println(i1);//结果为10
		System.out.println(i2);//结果为8
		System.out.println(i3);//结果为16
         //java中给出未知类型数值默认为int类型，若给出的字面值大于int的取值范围，还没赋值就会报错，所以要看数值大小
		//将一个int类型100字面值赋值给定义为int类型的i4
		int i4=100;
		
		//将一个int类型的123字面值赋值给long类型的l1
		//因为int类型容量小于long类型的
		//以下程序存在类型转换，只不过叫‘自动类型转换’
		long l1=123;
		
		//由于123后有一个L，所以上来就看成是long类型的数据
		//所以以下程序没有类型转换，只有普通的赋值运算
		long l2=123L;
		
		long a=155464656466L;
				
	}
}

 class DataTypeTest02{
	
	public static void main(String[] args){
		
		long l1=1000L;
		//将long类型转换成int类型，不能自动转换
		//即不能有‘int i1=l1；’
		
		//若想要转换，就需要强制类型转换
		//加强制类型转换符
		//以下程序虽然编译通过了，但是撤销在运行阶段可能损失精度，所以要谨慎
		int i1=(int)l1;//大容量向小容量转换，需强制转换类型
		
		//记忆一个规则：如果所赋的整数值没有超出被赋值所定义类型byte或short亦或char的取值范围，可以直接将这个整数赋值给所定义类型的变量，也就不必强制转换*********
	}
}