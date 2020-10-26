package cColection��contains����;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 		contains����Դ����removeԴ�������
 * 			�������ַ���������ʱ�ײ㶼����ü��ϴ洢�Ķ�����������е�equals����
 * 			����洢�Ķ������û����д��equals����������������������ʱ�޷�����ʹ��
 * 		
 * 		���ۣ������һ�������е����ͣ�һ��Ҫ��дequals���� ! ! !
 * 			   һ������Աһ��Ҫ������дequals������ϰ��
 */

public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//�������϶���
		Collection c = new ArrayList();
		
		//���������û�����
		User u1 = new User("lisiguang",20);
		User u2 = new User("lisiguang",20);
		
		//���������Ԫ��
		c.add(u1);
		
		//�жϼ������Ƿ����u2
		
		//����User����δ��д��equals������contains�ײ��ø���������equals�����ȽϾ��ǱȽ��ڴ��ַ�����Ϊfalse
		//System.out.println(c.contains(u2));//false
		
		//��дUser���е�equals����������contains
		System.out.println(c.contains(u2));//true
		
	}

}

class User{
	
	private String name;
	private int age;
	
	public User() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public User(String name,int age) {
		// TODO �Զ����ɵĹ��캯�����
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO �Զ����ɵķ������
		if (null == obj || !(obj instanceof User)) {
			return false;
		}
		
			User user =(User) obj;
		
		if (this == obj) {
			return true;
		}
		User u = (User)obj;
		return u.name.equals(name) && u.age==age;
	}
	
}
