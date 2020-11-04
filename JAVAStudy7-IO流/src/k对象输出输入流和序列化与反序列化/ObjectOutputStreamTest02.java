package k������������������л��뷴���л�;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bean.User;

/*
 * 	���л�����һ�������л��������
 * 			�����ǽ�����Ž������У����������л�
 * �Լ���transient�ؼ��֡�
 * 					�����������е�ĳ���ֶβ��������л��������ڶ�������и��ֶ�ǰ�����transient�ؼ���
 * 					��ʾ���ֶ�������ģ������������л�ʱ���ֶβ��ᱻ���л���
 * 			Ч�����Ƿ����л����ÿ������������ֶ�û�д�������ʱ������ֵ������ϵͳ����Ĭ��ֵ0����null
 * 			ԭ����Ƿ����л�ʱ��Ҫnew�������ڸ��ֶ�û�б����л�����Ĭ�ϸ�ֵ
 */

public class ObjectOutputStreamTest02 {
	
	public static void main(String[] args) {
		
		//����ArrayList����
		ArrayList<User> list = new ArrayList<>();
		
		//������list���Ԫ�أ������Ƕ���
		list.add(new User(10, "����"));
		list.add(new User(20, "л����"));
		list.add(new User(40, "�ֱ���"));
		list.add(new User(26, "����"));
		list.add(new User(1062, "�ܰ���"));
		
		ObjectOutputStream oos =null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("user"));
			
			//�����Ͻ������л����Ϳ�һ�����л����������
			//��Ҫע����ǲ����Ǽ����ж������Ҫʵ��Serializable�ӿڣ�������ҲҪʵ�֣���Դ�뷢���Ѿ�ʵ����
			oos.writeObject(list);
			
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
