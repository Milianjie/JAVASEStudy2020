package f���л��������ַ���BufferedWriter��BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader:
 * 			���л��������ַ�������
 * 			ʹ���������ʱ����Ҫ�Լ�����char���飬���Ƶ�BufferInputStream�Ͳ���Ҫ�Զ���byte���顣�Դ�����
 * 
 */

public class BufferedReaderTest {
	
	public static void main(String[] args) {
		
		BufferedReader bReader = null;
		
		
		//BufferedReader�������������췽������һ�����췽���еĲ�����(Reader in)Reader��BufferedReader���࣬���໹��һ������InputStreamReader��
		//InputStreamReader������һ������ΪFileReader�������ַ�������������˵�ù��췽����Ҫ����in������Reader����Ķ�����������ʹ�õ���FileReader�Ķ���
		//��һ�����췽���в�����(Reader in, int sz) ,ͨ��Դ����Կ����ײ��ǵ�һ�����췽����Reader���󴫽�ȥ����this���������һ��
		//���췽��������Reader����Ķ��󴫸��ڶ������췽����in��sz���ڲ��ùܡ�
		//��ΪBufferedReader�����ж���һ����Ա����Reader in;���ڵڶ������췽���ڲ�ʵ���˽��������in��ֵ����Ա����in�����߾��Ǹ�����close����
		//�е���in.close(),����˵����ֻ��Ҫ������bReader.close(),��Ӧ�Ľڵ���Ҳ�͹ر���
		
		
		FileReader reader;
		try {
			//����newһ���ַ�����������
			//��һ�����Ĺ��췽����Ҫһ������ʱ���ĸ�������������reader��Ϊ���ڵ���
			//���ⲿ�����װ�����������Ϊ����װ��������˵������
			//��ǰ����FileReader�ǽڵ�����BufferedReader�Ǵ�����
			reader = new FileReader("src/aIO�������/IO���ıʼ�");
			
			bReader = new BufferedReader(reader);
			
			//readerLine()��������ȡһ���ַ������ص���String
			//String sReader = bReader.readLine();
			//System.out.println(sReader);
			
			//��Ϊ�÷��������ȡ�����ַ��ź󷵻�null����������ѭ��
		   String sReader = null;
		   while ((sReader = bReader.readLine()) != null) {
			   
			System.out.println(sReader);//��һ���ı��е��ǲ������Ļ��з�
			
		}
		   
		   //�÷����ȽϷ��㣬��Ч��û��ֱ�Ӷ�ȡ�ĸߣ���Ϊ���˸���װ��
			
			//�������ֽڵ�����װ����ֻ��Ҫ�ر��������������������ܵײ��Զ��ر�
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	

}
