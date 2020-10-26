/*
 *  关于java语言中如何比较两个字符串是否相等  
 *  
 *     在java中比较两个字符串是否一致不能用"=="
 *     只能调用String类的equals方法
 */
package rObject类;

public class Test03 {
	
	public static void main(String[] args){
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);//false
		
		//String已经重写了Object中的equals方法，比较的是内容
		System.out.println(s1.equals(s2));//true
	}

}
