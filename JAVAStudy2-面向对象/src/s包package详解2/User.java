/*
 *   软件包机制：
 *       
 *       1.为了解决类名冲突问题，再类名前加命名空间(包机制)
 *       2.在java中使用package语句定义包.(单包、复包)
 *       3.package语句只能出现在.java源文件的第一行
 *       4.package的定义格式通常采用公司域名倒叙方式
 *         例如：com.bjpowernode.oa.system;
 *       以上包的含义：
 *       bjpowernode公司开发oa项目，system是项目中的一个模块。
 *       package定义的全格式：公司域名倒叙.项目名.模块名;
 *       
 *       5.完整的类名是带有包名的
 *       6.带有package语句的java源文件在命令窗口中须这样编译:
 *          javac -d 生成路径 java源文件路径
 *          
 *       7.运行
 *         java com.bjpowernode.javase.day05.User
 */
package s包package详解2;

public class User {
	 
	public static void main(String[] args){
		
		System.out.println("User's main method excuted!");
	}

}
