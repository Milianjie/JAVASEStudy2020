/*
 *   如何调用不在同一个包中的类：import
 *   
 *      1.import语句可以引入其他类
 *      2.import语句只能出现在package语句之下，
 *        class定义的语句之上
 *        
 *      3.java.lang;软件包下所有类不需要手动导入，系统自动导入，如Object类
 *      
 *      4.
 */
package s包package详解1;


import java.util.Date;

import s包package详解2.User;

public class Test01 {
	
	//入口
	public static void main(String[] args){
		
		//在没有引入import语句，很麻烦
		s包package详解2.User u = new User();
		System.out.println(u);//com.bjpowernode.javase.day05.User@663d0426
		
		//引入import语句，直接用User创对象
		User u1 = new User();
		System.out.println(u1);//com.bjpowernode.javase.day05.User@2fdb8f3a
		
		Object o = new Object();
		System.out.println(o);//java.lang.Object@5bf6b81c
		
		Date t = new Date();//输出的是字符串，就是说Date类中重写了toString方法
		System.out.println(t);//Wed Sep 25 18:16:54 CST 2019
	}

}
