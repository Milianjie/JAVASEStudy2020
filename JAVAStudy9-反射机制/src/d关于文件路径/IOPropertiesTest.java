package d�����ļ�·��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * ����ȡ�����ļ�ֱ����������ʽ����
 */

public class IOPropertiesTest {
	
	public static void main(String[] args) {
		
		FileReader reader1 = null;
		InputStream reader2 = null;
		try {
			/*
			 * ����������
			 */
//			String path = Thread.currentThread().getContextClassLoader().getResource("cͨ������ʵ��������/classinfo.properties").getPath();
//			reader = new FileReader(path);
			
			/*
			 * ��������ʽ����
			 */
			reader2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("cͨ������ʵ��������/classinfo.properties");
			
			
			//����Properties���ϣ�key��value����String���͵�
			Properties properties = new Properties();
			
			//��ȡ�����ļ��浽����
			try {
				properties.load(reader2);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}

			//ͨ��key��ȡvalue
			Object value1 = properties.get("className1");
			Object value2 = properties.get("className2");
			System.out.println(value1);//bean.User
			
			//�û�ȡ��value��ͨ��������ƣ�ʵ����User����
			Class c;
			try {
				
				c = Class.forName((String)value1);
				Class c2 = Class.forName((String)value2);
				
				Object obj1 = c.newInstance();
				Object obj2 = c2.newInstance();
				
				System.out.println(obj1);
				System.out.println(obj2);
			} catch (ClassNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			
		}finally {
			if (reader1 != null) {
				try {
					reader1.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (reader2 != null) {
				try {
					reader2.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
