package iservice;

/*
 * 用户业务类
 */

public class UserService {
	
	/**
	 * 用户登录方法
	 * @param name 用户名
	 * @param password 密码
	 * @return	true表示登录成功，false表示登录失败
	 */
	public boolean login(String name,String password) {
		
		if ("abcdef".equals(name) && "123456".equals(password)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 用户退出方法
	 * @return
	 */
	public String logout(String i,int a) {
		
		return "用户退出成功!";
		
	}
	
}
