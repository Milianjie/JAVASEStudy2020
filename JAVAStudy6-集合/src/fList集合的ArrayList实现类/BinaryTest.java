package fList集合的ArrayList实现类;

/*
 * java中的位运算符：>>
 */

public class BinaryTest {
	
	public static void main(String[] args) {
		
		//10 >> 1  10的二进制右移一位
		//10 >> 2  10的二进制右移两位
		//10的二进制是：00001010
		//10的二进制右移1位：00000101 -->5
		System.out.println(10 >> 1);//5 -- 右移一位就是除以2
		
		//10的二进制是：00001010
		//10的二进制右移2位：00000010 -->2
		System.out.println(10 >> 2);//2 
		
		
		//10的二进制是：00001010
		//10的二进制左移1位：00010100 -->20
		System.out.println(10 << 1);//20 -- 左移一位就是乘以2
		
		//10的二进制是：00001010
		//10的二进制左移2位：00101000 -->2^5 + 2^3 = 40
		System.out.println(10 << 2);//20 -- 左移一位就是乘以4
		
	}

}
