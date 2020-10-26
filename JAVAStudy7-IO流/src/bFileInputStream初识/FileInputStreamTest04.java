package bFileInputStream��ʶ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream�г��õķ�����
 * 
 * 			1��int available(); ����������ʣ��û�ж������ֽ�����
 * 			2��long skip(long n); ���������ֽڲ���
 */

public class FileInputStreamTest04 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test01");
			
			byte[] bytes = new byte[fis.available()];//���ַ�ʽ���ʺ�̫���ļ�����Ϊbyte���鲻��̫��
			
			//�ļ��ֽ���
			System.out.println("�ļ��ֽ�������"+fis.available());//5
			
			//�ȶ�һ���ֽ�,Ȼ���ȡʣ���ֽ���
			//System.out.println(fis.read());
			//System.out.println("ʣ��δ���ļ��ֽ�����"+fis.available());//4
			
			//�÷������ô����ø÷�����ȡ�ļ��ֽ���������Ӧ���ȵ�byte���飬ֱ�Ӷ�ȡ�����ֽڣ�����Ҫѭ����
//			fis.read(bytes);
//			//ת�����ַ������
//			System.out.println(new String(bytes));
//			System.out.println("ʣ��δ���ļ��ֽ�����"+fis.available());//0
			
			//skip���������ֽڲ������Ժ�Ҳ���õ�
			fis.skip(3);
			System.out.println(fis.read());//109  'm'
			
			
			
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
