package h异常作业;

/*
 * 		编写程序模拟用户注册
 * 			1、程序开始执行时，提示用户输入"用户名"和"密码"信息
 * 			2、输入信息后，java程序模拟用户注册
 * 			3、注册时要求求用户名长度在[6-14]之间，小于或大于该长度都表示异常
 * 
 * 注意：完成注册的方法放入单独的一个类中，异常类自定义即可
 * 		class UserService{
 * 		public void register(String name,String password){
 * 			//在这个方法中完成注册
 * 		}
 * }
 * 
 * 		编写main方法，在main方法中接收用户输入信息，在main方法中调用UserService中的register方法完成注册
 */

public class UserService {
	
	 String userName;
	 String passWord;
	
	public void registter(String name,String password) throws IllegalUserNameException {
		
		//建议将name==null放在其他条件的最前面，因为如果name为null，而name==null却放在后面
		//name.length()<6||name.length()>14这两个条件放前面就会报空指针异常，后面的代码就
		//全部都不会执行了,连自己写的异常也发生不了
		if (name == null||name.length()<6||name.length()>14) {
			throw new IllegalUserNameException("用户名不合法，请重新输入");
		}
		this.userName = name;
		this.passWord = password;
		
	}

}
