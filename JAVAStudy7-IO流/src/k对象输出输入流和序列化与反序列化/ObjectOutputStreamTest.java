package k������������������л��뷴���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 		�������ļ��ж���д����������Ӳ�����ڴ�֮��
 * 		��ô���ڶ������ڴ���Ӳ��������ôʵ�ֽ������أ�
 * 	���л����ڴ��еĶ���Ҫ�浽Ӳ���ļ��У���Ҫ���ö����֣������л�Serialize��������ֳ�һ��һ�������ŵĶ�����Ȼ�󱣴�浽Ӳ���ļ���
 * 	�����л���Ӳ��������ֵĶ������»ָ����ڴ��У��з����л�DeSerialize����ʱ������Ž���ֵĶ������װ��ԭ���Ķ��󣬴����ڴ���
 * 
 * ��ʵ�����л��뷴���л����¡�Ҫ����Ҫ���л��Ķ���һ����ʵ��Serializable�ӿڣ��ýӿ��Ǳ�־�Խӿڣ����沢û�з�����
 * 							  ʵ�ָýӿ�ֻ����������ڱ�����ʱ��JVM����Դ�����������Student��ʵ��������ӿ�ʹ��
 * 							  �������Կ����л���java����������ýӿں��Ϊ������Զ�����һ�����л��汾�š�
 */


public class ObjectOutputStreamTest {
	
	public static void main(String[] args) {
		
		//����Student����
		Student student = new Student(1004,"zhanshan");
		
		ObjectOutputStream ooStream = null;
		ObjectInputStream oiStream = null;
		
		try {
			//���л�
			ooStream = new ObjectOutputStream(new FileOutputStream("student"));//��Ҫ�ڵ���
			ooStream.writeObject(student);
			//������ﻹ�����л��ڶ�������ᱨ�����������л������Ҫ�Ž����ϣ����л�����
			
			
			//�����л�
			oiStream = new ObjectInputStream(new FileInputStream("student"));
			//���ص���һ��ѧ������
			Object obj = oiStream.readObject();
			System.out.println(obj);//���Ե���Student���toString����
	
			ooStream.flush();
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
			if (ooStream != null) {
				try {
					ooStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (oiStream != null) {
				try {
					oiStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}

class Student implements Serializable{
	
	//JVM����Serializable�ӿڱ�ʵ�ֺ󣬾��Զ�����һ�����л��汾��
	//����û���ֶ�д������JVM��Ĭ���ṩһ�����л��汾��
	
	private int num;
	
	private String name;

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