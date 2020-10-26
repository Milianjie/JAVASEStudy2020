package d�ļ��Ŀ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��ʹ��FileInputStream��FileOutputStream����ļ��Ŀ�����
 * 		��⣺�����Ĺ���Ӧ��һ�߶�һ��д��
 * 		ʹ��������ֽ��������ļ������ܵģ���Ϊ�ֽ�������д�������ֽ�byteΪ��λ�ģ�����˵���ĺ�д����8��λ��bit���Ķ�������ʽ
 * 		�����е��ļ��ڻ����ж����Զ����Ƶ���ʽ���ڵģ��������ļ���С��λ���ֽڣ�1024byte=1KB��1024KB=1MB��1024MB=1GB...
 * 		���������������ʹ���κ����͵��ļ�
 */

public class CopyTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("F:\\www\\SAR.docx");
			
			fos = new FileOutputStream("D:\\SAR.docx");
			
			//����byte�����С������ÿһ�ο����Ĵ�С
			byte[] bytes = new byte[1024*1024];//1024byte =1kB;1kB * 1024 = 1MB -->ÿ�ο���1MB
			
			//����洢ÿ�ζ��������ֽ���
			int readCount = 0;
			
			//ѭ������ȡһ���֣�д��һ����
			while ((readCount = fis.read(bytes)) != -1) {
				
				fos.write(bytes,0,readCount);
				
			}
			
			//���Ҫˢ��
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
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
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
