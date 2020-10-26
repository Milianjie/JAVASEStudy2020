package kInteger常用方法;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		/*
		 * 重要方法
		 * static int parseInt(String s)
		 * 静态方法，传参String，返回int类型
		 * 就比如在网页文本框中输入的100实际上是"100".要传到后台存储到数据库中的必须是100数字，此时
		 * java程序需要将字符串"100"转换成100数字
		 */
		//当然字符串只能是数字的字符串，不然会报数字格式化异常NumberFormatException
		//要想语句遇到异常能继续执行下面的代码，就捕获异常
		try {
				int getValue = Integer.parseInt("123456");//String -->转换  int
				System.out.println(getValue+1222);//124678
				int getValue2 = Integer.parseInt("zhkjh");//String -->转换  int
				System.out.println(getValue+1222);//124678
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获到异常"+e);//捕获到异常java.lang.NumberFormatException: For input string: "zhkjh"
		}
		int getValue = Integer.parseInt("123456");//String -->转换  int
		System.out.println(getValue+1222);//124678
		
		//同样的，其他包装类中也有该方法
		double retValue = Double.parseDouble("3.125");
		System.out.println(retValue+1000);
		
		//--------------------以下方法仅需了解------------------------------------------------
		/*
		 * static String toBinaryString(int i) 
		 * 静态的：将十进制转换成二进制的字符串
		 */
		System.out.println(Integer.toBinaryString(56));//111000
		
		/*
		 * static String toHexString(int i)
		 *  以十六进制无符号整数形式返回 int 参数的字符串表示形式。
		 *  16进制：1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,10,11,12,13,14,15,16,17,18,19,1a 
		 *  满16进1
		 */
		System.out.println(Integer.toHexString(26));//1a
		
		/*
		 * static String toOctalString(long i) 
		 *  以八进制无符号整数形式返回 long 参数的字符串表示形式。 
		 */
		System.out.println(Integer.toOctalString(8));//10
		
		//Object中的toString方法如下
		/*
		 public String toString() {
        		return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	 }
		 */
		//hashCode方法将地址转换成int，toHexString再将其转成16进制以字符串返回
		Object a = new Object();
		System.out.println(a);//java.lang.Object@7dc5e7b4
		
	}

}
