package iservice;

/*
 * �û�ҵ����
 */

public class UserService {
	
	/**
	 * �û���¼����
	 * @param name �û���
	 * @param password ����
	 * @return	true��ʾ��¼�ɹ���false��ʾ��¼ʧ��
	 */
	public boolean login(String name,String password) {
		
		if ("abcdef".equals(name) && "123456".equals(password)) {
			return true;
		}
		return false;
	}
	
	/**
	 * �û��˳�����
	 * @return
	 */
	public String logout(String i,int a) {
		
		return "�û��˳��ɹ�!";
		
	}
	
}
