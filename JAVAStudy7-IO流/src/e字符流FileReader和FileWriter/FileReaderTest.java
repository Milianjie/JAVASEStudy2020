package e�ַ���FileReader��FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	�ֽ�������FileReader��ֻ�ܶ�ȡ���ı��ļ�
 * 		
 */

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
			
		try {
			
			reader = new FileReader("src/aIO�������/IO���ıʼ�");
			
			//����char����
			char[] chars = new char[2];//һ�ζ������ַ�
			
			int readCount = 0;//ÿ�ζ�ȡ��char������ַ���
			
			while ((readCount = reader.read(chars)) != -1) {
				
				//��ȡ���ٸ��ַ�����ת�����ַ������
				String string = new String(chars, 0, readCount);
				System.out.print(string);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (reader != null) {
				
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
