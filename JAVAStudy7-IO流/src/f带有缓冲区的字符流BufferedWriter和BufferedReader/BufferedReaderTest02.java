package f���л��������ַ���BufferedWriter��BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 	InputStreamReader���ֽ�ת�ַ�������ת����
 */

public class BufferedReaderTest02 {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try {
			
//			//�������ֽ�������
//			FileInputStream in = new FileInputStream("src/aIO�������/IO���ıʼ�");//�����temp��˵��in�ǽڵ���
//			
//			//�����ֽ�������ֱ����Ϊ�����Ž������ַ������ֽں��ַ��ǲ�ͬ�ģ���ʱ��Ҫһ��ת����
//			//����һ���ֽ�ת�ַ�������ת����
//			InputStreamReader temp = new InputStreamReader(in);//�����in��˵��temp�ǰ�װ�����������reader��˵��temp���ǽڵ�����
//			
//			//�ַ�����������
//			 reader = new BufferedReader(temp);//�����temp��˵��reader�ǰ�װ��
			
			 //�����ɺϲ�
			 reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/aIO�������/IO���ıʼ�")));
			
		} catch (FileNotFoundException e) {
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
