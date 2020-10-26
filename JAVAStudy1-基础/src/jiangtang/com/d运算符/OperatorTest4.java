package jiangtang.com.d运算符;

/*
 *      关于字符串连接运算符
 *          + 运算符可以：
 *          1.做加法运算；(+两边都是数字类型，做加法运算)
 *          2.做字符串连接(+两边只要有一边是字符串类型，一定做字符串连接)
 */



public class OperatorTest4 {
	
	public static void main(String[] args){
		
		//字符串连接
		System.out.println("PI="+3.14);//"PI=3.14"运算结果是字符串类型
		
		int a=10;
		int b=12;
		System.out.println("a+b=" + (a+b));//a+b=22
		System.out.println("a+b=" + a + b);//a+b=1012
		
		System.out.println(a + "+" + b + "=" + (a+b));//10+12=22
		
		String c="sds\n"+"asdas";
		System.out.println(c);
	}

}
