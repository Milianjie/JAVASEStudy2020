package bFileInputStream��ʶ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ����FileInputStreamTest01�ж�ȡӲ���е��ļ���һ���ֽ�һ���ֽڵģ��ڴ���Ӳ�̽���̫Ƶ������̫��
 * 
 * read()�������������أ����ǿ��Բ����޲ε�read�������������вε�read����
 * 
 * 	int read(byte[] b)
 * 		һ������ȡb.length���ֽ�
 * 		�����ڴ���Ӳ�̵Ľ��������ִ��Ч��
 * 		��byte[]���鵱�ж�
 */

public class FileInputStreamTest02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		//����ڹ��췽����ֱ����д�ļ����Ļ������ļ��������IDEA���̵ĸ�����eclipse����ĿĿ¼��
		//��ΪIDEA��eclipseĬ�ϵľ���·���ǵ�IDEA���̵ĸ�����eclipse����Ŀ��·��
		//����ļ��浽����·�������·���Ļ���·��Ҫ�����浽�ĸ����ļ����Ͱ���
		try {
			fis1 = new FileInputStream("test01");
			
			//����test02�浽�˱���Ŀ�е�src�ļ��е�bFileInputStream��ʶ���£������ȡ�ļ�����
			//���ǽ���·����Ҫ�к��ֻ�ո�������ѧϰ�����Ժ���
			//fis2 = new FileInputStream("test02");//java.io.FileNotFoundException: test02 (ϵͳ�Ҳ���ָ�����ļ���)
			//��ȷд��
			fis2 = new FileInputStream("src/aIO�������/IO���ıʼ�");
			
			
			//��ʼ��ȡ�ļ�������byte���飬һ�ζ�ȡ����ֽڡ�����ȡ������.length�����ֽ�
			byte[] bytes = new byte[3];
			
			
			//�÷����ķ���ֵ�ǣ���ȡ�����ֽڵ������������ֽڱ���
			int readCount = fis1.read(bytes);//��һ�ζ�ȡ����3���ֽڣ�test01�й������
			System.out.println(readCount);//3
			//��byte����ת�����ַ���
			//System.out.println(new String(bytes));//abc
			//Ӧ���Ƕ�ȡ�˶��ٸ���ת�����ٸ���������ȫ��ת��
			System.out.println(new String(bytes, 0, readCount));
			
			
			readCount = fis1.read(bytes);//�ڶ���ֻ�ܶ�ȡ��������ֽ�,��byte�����ǰ�������±�0��1��Ԫ�ظ��ǵ����±�2��û�ж����ֽڸ����������Ի����ϴζ������ֽ�
			System.out.println(readCount);//2
			//��byte����ת�����ַ���
			//System.out.println(new String(bytes));//mnc
			//Ӧ���Ƕ�ȡ�˶��ٸ���ת�����ٸ���������ȫ��ת��
			System.out.println(new String(bytes, 0, readCount));
			
			
			readCount = fis1.read(bytes);//������û���ֽڿ��Զ��˷���-1��byte�����л�����һ�ζ������ֽ�
			System.out.println(readCount);//-1
			//��byte����ת�����ַ���
			//System.out.println(new String(bytes));//mnc
			//Ӧ���Ƕ�ȡ�˶��ٸ���ת�����ٸ���������ȫ��ת��
			//System.out.println(new String(bytes, 0, readCount));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
			
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (fis1 != null) {
				try {
					fis1.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (fis2 != null) {
				try {
					fis2.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
