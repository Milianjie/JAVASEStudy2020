package l���л��汾�����;

import java.io.Serializable;

public class Student  implements Serializable{
	
		
		//JVM����Serializable�ӿڱ�ʵ�ֺ󣬾��Զ�����һ�����л��汾��
		//����û���ֶ�д������JVM��Ĭ���ṩһ�����л��汾��
		//ʵ����Serializable�ӿڵ��࣬���鶼�ֶ��ṩһ�����л��汾�ţ�ʹ���Ժ����Ķ���֤��ͬһ����
		private static final long serialVersionUID = 16020520009L;//�Ժ����������ô�ģ���ֻ�ø����л��汾��
		
		private int num;
		
		private String name;
		
		//ʮ����������Ҫ����˵�ַ�ֶ�
		private String addr;
		
		private int age;
		

		public Student() {
			super();
		}

		public Student(int num, String name) {
			super();
			this.num = num;
			this.name = name;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		//��дtoString����
		@Override
		public String toString() {
			return "Student [num=" + num + ", name=" + name + "]";
		}
		
		


}
