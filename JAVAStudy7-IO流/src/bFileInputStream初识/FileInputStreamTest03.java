package bFileInputStream��ʶ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	�����հ��������
 */

public class FileInputStreamTest03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/aIO�������/IO���ıʼ�");
			
			//��ȡ�ı��ĳ��ȣ����ļ���������Ӣ�ģ���Ҫһ���Զ�ȡȫ���ֽڲ��ܱ������룬�����ȡ���ļ��ĳ�����byte����ĳ���
			File file = new File("src/aIO�������/IO���ıʼ�");//���ص���long���͵ģ�byte������ֻ������int���ͳ���
			System.out.println(file.length());//3794
			//������FileInputStream�е�available()������ȡδ��ȡ���ֽ��������ҷ��ص���int���͵�
			System.out.println(fis.available());//3794
			
			//����byte����
			byte[] bytes = new byte[(int) file.length()];
			
			//���ļ��е��ֽ�һ�ζ�ȡ10���浽byte�����У���whileѭ��
//			int readdata ;
//			while ((readdata = fis.read(bytes)) != -1) {
//				
//				//�������ٸ�����ת�����ٸ�����������ļ��е���ʽ����������û������
//			System.out.print(new String(bytes, 0, readdata));//���������Щ������,�����ȡ���ļ�ȫ��Ӣ�ģ������ö��ٸ�һ�����û����
//											//���ȫ�����ģ�Ӧ����2���ֽ�һ��������������롣�����Ӣ��ϣ��Ǿ͵�ȫ���ֽ�һ���ȡ�����Ų����룬
										//һ�ζ������Ͳ���Ҫѭ����,���߲����ַ�������FileReader������char���鵱��
//			}
			//һ���Զ�ȡ
			fis.read(bytes);
			System.out.println(new String(bytes));
			
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
		}
		
	}

}
