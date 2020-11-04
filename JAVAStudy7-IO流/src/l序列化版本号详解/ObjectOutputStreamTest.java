package l���л��汾�����;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * �����л��汾�ŵ����á�
 * 			1��ʮ��ǰ��Student��ʵ����Serializable�ӿڣ����б��룬����.class�ļ�ʱJVMĬ�ϸ�����һ�����а汾�ţ���Student�������������л��������л��ܽ��У�
 * 			ʮ�����������ĸı䣬��Ҫ�Ķ�Student���еĴ��룬�������ѧ���ĵ�ַ��绰�ֶΣ����±��������µ�.class�ļ���JVM��Ĭ�ϸ�
 * 			��һ���µ����л��汾�ţ�����ʱ��û�н������л���ֻ�ǽ��з����л�ʱ�����������쳣��
 * 			java.io.InvalidClassException: l���л��汾�����.Student; 
 * 			local class incompatible: stream classdesc serialVersionUID = -532431968437790278,
 * 			local class serialVersionUID = -3367965350685223874
 * 			��˼�ǵ�ǰ���е����л��汾��stream classdesc serialVersionUID = -532431968437790278���������±�����
 * 			�뱾�ص����л��汾��local class serialVersionUID = -3367965350685223874����ʮ��ǰ���л�����Student�İ汾�Ų�һ�£�û�������л�
 * 			
 * 			2��java�����������������Ǹ������������Ǹ��������л��汾�ţ���Ȼǰ����ʵ����Serializable�ӿڣ�
 * 			��ʱ������д����ͬһ������д��������ͬ�������࣬������ʵ����Serializable�ӿڱ����JVMĬ�ϸ�������һ�����л��汾�ţ�
 * 			JVM�͸������ǵ����л��汾������������
 * 
 * 			3����java������Զ������ṩ���л��汾�ţ�ʹ�ô����ں����޷��޸ģ������㡣���Կ����Լ��ֶ��ṩ��������л��汾��
 * 			�ο���ʵ����Serializable�ӿڵ�String�࣬ArrayList�����࣬��Ϊ��JDK�汾�ĸ����У���Щ��Ҳ����´��룬����SUN��˾
 * 			���������ֶ��ṩһ�����л��汾��
 * 			
 */

public class ObjectOutputStreamTest {
	
	public static void main(String[] args) {
		
		//����һ��student����
		Student s = new Student(10, "�ǽ���ʱ��");
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("src\\l���л��汾�����\\student"));
			
			oos.writeObject(s);
			
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
