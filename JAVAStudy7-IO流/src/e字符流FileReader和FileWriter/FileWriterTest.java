package e�ַ���FileReader��FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	FileWriter���ļ��ַ��������д
 * 		ֻ��д��ͨ�ı�
 */

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {
			
			writer = new FileWriter("�ҵ���������",true);//�Զ�׷���ַ������
			
			char[] chars = {'	','	','	','	','	','	','	','	','	','	','	','	','	',
			'��','��','��','��','��','��','\n'};
			
			writer.write(chars);
			for (int i = 0; i < chars.length; i++) {
				writer.write("                                                              ����һ��Java����ʦ                                                                                            \n ");
				
			}
			//ˢ��
			writer.flush();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
