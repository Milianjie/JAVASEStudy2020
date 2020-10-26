package cmain方法中的String数组args案例;

/**
 *                利用main方法中的Strong[] args在程序入口设置访问权限
 *             				需求为：用户需要输入用户名和密码
 * @author 钟荣杰
 *
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//Object aObject =  new Object();
		//System.out.println(aObject.toString());//java.lang.Object@ee7d9f1
		if (args.length!=2) {
			System.out.println("系统无法访问!!!\n请输入用户名和密码!\n例如:zhangsan 123");
			return;
		}
		
		//程序执行到此处说明已提供用户名和密码
		//接下来判断用户名与密码是否正确
		//取出用户名
		String name = args[0];
		//取出密码
		String password = args[1];
		
		//判断两个字符串是否相等用String中的equals方法
		//为了避免空指针异常，我们可以把变量放到括号里
		//if (name.equals("admin")&&password.equals("123")) {
		if ("admin".equals(name)&&"123".equals(password)) {
			System.out.println("尊敬的"+name+"用户，您已成功登录!\n欢迎使用本系统!\n现在请开始您的骚操作....");
		}else {
			System.out.println("登录失败!\n用户名或密码错误!");
			return;
		}
		
		
	}

}
