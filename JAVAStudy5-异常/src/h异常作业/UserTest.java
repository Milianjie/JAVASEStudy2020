package h异常作业;

import java.util.Scanner;

public class UserTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String inputName = scanner.next();
		
		System.out.println("请输入注册密码：");
		String inputPassword = scanner.next();
		
		UserService userService = new UserService();
		
		try {
			userService.registter(inputName, inputPassword);
		} catch (IllegalUserNameException e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("已注册用户账户\n"+"用户名："+userService.userName+"\n用户密码："+userService.passWord);
	}

}
