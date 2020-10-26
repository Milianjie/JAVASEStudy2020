package bFileInputStream��ʶ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	��java.io.FileInputStream��
 * 		1���ļ��ֽ������������ܵģ��κ����͵��ļ������Բ������������ȡ
 * 		2���������ֽڵķ�ʽ���������Ĳ�������ɶ��Ĳ�������Ӳ��-�ڴ棩
 */

public class FileInputStreamTest01 {
	
	public static void main(String[] args) {
		
		//��fis������try������棬�����ֽ��ļ�����������ʹ�÷�Χ
		FileInputStream fis = null;//�˴���fis����һ��Ҫ��ʼ��Ϊnull����Ϊ���������ʧ�ܣ�fis��ȻΪnull�������if���ź��ж�ִ�У���Ȼ����
		
		
		//�ļ�·��E:\JAVAStudy\javaSE\test01 ��idea��eclipse���Զ���\��Ϊ\\,��Ϊjava�е�б��\��ʾת�壬\\�������ܱ�ʾ��б�ܱ���
		//main������һ�㶼��try/catch�쳣������throws
		try {
			
			//�����ֽ��ļ�����������
			fis = new FileInputStream("E:\\JAVAStudy\\javaSE\\IO\\test01");
			//��������������·����������д�����������������Ǿ���·��
			//fis = new FileInputStream("E:/JAVAStudy/javaSE/test01");
			
			//��ʼ��ȡ�ļ���һ��һ����
			//test01�д����abcd  �ڵ�һ�ε���read()����ǰ��һָ��ָ��a��ǰ�棬��һ�ε���read�������������ֽ�����ȡ�ģ�ָ���ƶ�һ���ֽڣ�
			//ָ��a���ڶ��ε���read����ָ���������ƶ�һ���ֽڣ�Ȼ��ָ��b����ȻJava��һ���ַ�����'a'����'��'��ռ�����ֽڣ������ļ��Ǵ���windowsϵͳ�е�
			//Windows��һ��һ���ַ�ռһ���ֽڣ�һ�������ַ��Ż�ռ�����ֽ�.����ָ���ƶ�һ���ֽھͻ�ָ��b������пո�Ļ�Ҳ�ᱻ��ȡ���ո�Ҳ���ַ�
			//��ָ���ʱ�ͻ᷵��-1
			//���ص��Ƕ������ַ���ASCII�룬������int����
//			int readdata = fis.read();
//			System.out.println(readdata);//97
//			
//			readdata = fis.read();
//			System.out.println(readdata);//98
//			
//			readdata = fis.read();
//			System.out.println(readdata);//99
//			
//			readdata = fis.read();
//			System.out.println(readdata);//-1
//			
			/*
			 * ʹ��ѭ����ȡ�ļ�,�Ժ�ʹ�����ѭ����ȡ�ļ�
			 */
			int readdata ;
			while ((readdata = fis.read()) != -1) {
				System.out.println(readdata);
			}

			
		} catch (FileNotFoundException e) {//���췽��FileInputStream()�׳��ı���ʱ�쳣
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {//read()�����׳��ı���ʱ�쳣
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
