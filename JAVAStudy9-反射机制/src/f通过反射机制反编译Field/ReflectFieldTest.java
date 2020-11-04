package fͨ��������Ʒ�����Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * ͨ������java.lang.reflect.Field�еķ���������.class�ļ����ֶ�/����
 */

public class ReflectFieldTest {
	
	public static void main(String[] args) {
		
		//�����ַ���ƴ�Ӷ���
		StringBuilder s = new StringBuilder();
		
		//��ȡClass����
		Class class1 = null;
		try {
			 class1 = Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//��ȡStudent�ֽ����ļ���Field
		Field[] fields = class1.getDeclaredFields();
		//��Ҫƴ�ӳ�һ�����ģ�͡�����:
		/*
		 * public class Student {}
		 */
		//�������
		//s.append("public class Student { ");
		//����public class �Լ�Student�����Ի�ȡ
		s.append(Modifier.toString(class1.getModifiers())+" class "+class1.getSimpleName()+" {\n");
		
		//�м����Բ���ͨ������Field����ƴ��
		for (Field field : fields) {
			
			s.append("\t");
			s.append(Modifier.toString(field.getModifiers()));
			s.append(" ");
			s.append(field.getType().getSimpleName());
			s.append(" ");
			s.append(field.getName());
			s.append(";\n");
		}
		
		s.append("\n}");
		
		System.out.println(s);
		
	}

}
