package g������;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 		DataInputStream�������ֽ���������
 * 		
 * 		DataOutputStreamд���ļ�ֻ����DataInputStream����ȡ��ͬʱ����֪��д��ȥ��˳��
 */

public class DataInputStreamTest {
	
	public static void main(String[] args) {
		
		DataInputStream inputStream = null;
		
		try {
			//�����ֽ������������������췽����һ���ֽ��ļ�����������
			inputStream = new DataInputStream(new FileInputStream("data"));
			
			//��
			byte b = inputStream.readByte();
			short s = inputStream.readShort();
			int i = inputStream.readInt();
			long l = inputStream.readLong();
			float f = inputStream.readFloat();
			double d = inputStream.readDouble();
			boolean sex = inputStream.readBoolean();
			char c = inputStream.readChar();
			
			//�ڶ�ȡ��ʱ�򣬶�int����ʱ����û�м�Int������ֱ��int i = inputStream.read();
			//ʹ�ú���󲿷����ݶ����γ�����
			System.out.println("b = "+b);
			System.out.println("s = "+s);
			System.out.println("i = "+i+1000);
			System.out.println("l = "+l);
			System.out.println("f = "+f);
			System.out.println("d = "+d);
			System.out.println(sex?"��":"Ů");
			System.out.println("c = "+c);
			
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

}
