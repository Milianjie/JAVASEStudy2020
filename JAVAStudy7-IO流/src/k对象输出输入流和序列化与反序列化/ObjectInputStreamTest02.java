package k������������������л��뷴���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.User;

/*
 * �����л�����
 * 
 */

public class ObjectInputStreamTest02 {
	
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("user"));
			
//			Object object = ois.readObject();
//			//���ص���һ�����϶���
//			System.out.println(object instanceof List);//true
			//�Ϳ���ʹ��ǿת
			List<User> users = (List<User>)ois.readObject();
			//ѭ���ü���
			for (User user : users) {
				System.out.println(user);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
