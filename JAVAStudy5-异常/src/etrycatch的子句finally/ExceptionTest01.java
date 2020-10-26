package etrycatch���Ӿ�finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 		����try..catch����е��Ӿ�finally��
 * 			1��finally�еĴ��������ִ�еģ�������һ����ִ�еģ���ʹtry�е��������쳣finally�е��������ִ��
 * 			2��finally���ͨ��ʹ������Щ�����
 */

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;//����λ�÷ŵ�try�����棬finally�в�����
		
		try {
			//����һ������������
			 fis = new FileInputStream("E:\\1.AlexNet\\vocapp.py");
			//��ʼ���ļ�
			
			//
			String s = null;
			s.toString();//�����һ���ᷢ����ָ���쳣,�����쳣��������Ͳ���ִ��
			System.out.println("���ţƤŶ");
			
			//��ʹ�������Ҫ�ر�������Ϊ��ռ����Դ
			//���������ʹ��������쳣����Ҳ����ر�
			//Ȼ���ر��������⣬����û���رգ���ô���أ����Խ���ŵ�finally�Ӿ���
			//fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("finally�е����ִ���ˣ�������");
			//���Ĺرշ�������Ƚϱ���
			//����Ĵ���һ����ִ��
			//��ʹtry�г����쳣Ҳ��ִ�в���
			try {
				//����try�����new���ɶ���fis�ͻ���null�������Ͳ���Ҫ�ر������Ӹ��������
				if (fis!=null) {
					fis.close();
				}
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		
	}

}
