package cFileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		���ļ��ֽ������������д��
 * 		���ڴ浽Ӳ��
 */

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		
		try {
			//��new�����ʱ�����췽���е�·����д����û�д������ļ����Զ�����
			
			//�����淽ʽnew��������������ڽ������е��ֽ�д���ļ���ʱ�����ԭ�ļ��е����ݣ�Ҫ����ʹ��
			fos1 = new FileOutputStream("test03");
			
			
			//����new��������������ǲ�������ļ���ԭ�е��ֽڶ�д��ȥ�ģ���һ��׷��д��ķ�ʽ
			fos2 = new FileOutputStream("test04",true);
			
			
			//����һ��byte����
			byte[] bytes = {97,98,99,100,101,102,103,104,105};
			
			
			//��׷�����������һ����д�����ֽڽ��ļ�
			fos1.write(bytes);//�ļ�����abcdefghi --��д�ڶ�����Ȼ��abcdefghi�������������󲢲���׷��д���
			//�������е��ֽ�һ����д��
			//fos1.write(bytes, 0, 2);
			
			
			//׷�����������һ����д�����ֽڽ��ļ�
			fos2.write(bytes);//�ļ�����abcdefghi --��д�ڶ�����Ȼ��abcdefghiabcdefghi����������������׷��д���
			//�������е��ֽ�һ����д��
			//fos2.write(bytes, 0, 2);
			
			
			//���Ҫˢ�������
			fos1.flush();
			fos2.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {					//�ֿ�try����õ�
			if (fos1 != null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (fos2 != null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
