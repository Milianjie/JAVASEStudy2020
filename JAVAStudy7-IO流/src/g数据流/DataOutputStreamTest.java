package g������;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		java.io.DataOutputStream:����ר�����������Ĺ��캯��Ҫ��һ��OutputStream���������Ȼ����Ҳ��
 * 
 * 		�����������ͬ���ݵ�����һ��д���ļ���
 * 		����ļ��Ͳ�����ͨ�ı��ĵ��ˣ��ü��±��򲻿��ġ�ֻ�ܴ����������������ж�ȡ�����Ҷ�ȡ��˳��Ҫ���ļ�д���˳��һ��
 */
public class DataOutputStreamTest {
	
		public static void main(String[] args) {
			
			DataOutputStream outputStream = null;
			
			try {
				
				//��������ר�������������װ���������Ĺ��캯���п���newһ���ڵ�����������FileOutputStream
				outputStream = new DataOutputStream(new FileOutputStream("data"));
				
				//�������ݱ���
				byte t = 97;
				short s = 200;
				int i = 100;
				long l = 100L;
				double d = 3.14;
				boolean sex = true;
				char c = 'A';
				float f = 3.0F;
				
				//д���ļ�
				outputStream.writeByte(t);
				outputStream.writeShort(s);
				outputStream.writeInt(i);
				outputStream.writeLong(l);
				outputStream.writeFloat(f);
				outputStream.writeDouble(d);
				outputStream.writeBoolean(sex);
				outputStream.writeChar(c);
				
				//ˢ�������
				outputStream.flush();
				
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}finally {
				if (outputStream != null) {
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}

}
