package h�쳣��ҵ;

import java.util.Scanner;

public class UserTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String inputName = scanner.next();
		
		System.out.println("������ע�����룺");
		String inputPassword = scanner.next();
		
		UserService userService = new UserService();
		
		try {
			userService.registter(inputName, inputPassword);
		} catch (IllegalUserNameException e) {
			// TODO �Զ����ɵ� catch ��
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("��ע���û��˻�\n"+"�û�����"+userService.userName+"\n�û����룺"+userService.passWord);
	}

}
