package d关于文件路径;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * 将获取到是文件直接以流的形式返回
 */

public class IOPropertiesTest {
	
	public static void main(String[] args) {
		
		FileReader reader1 = null;
		InputStream reader2 = null;
		try {
			/*
			 * 创建输入流
			 */
//			String path = Thread.currentThread().getContextClassLoader().getResource("c通过反射实例化对象/classinfo.properties").getPath();
//			reader = new FileReader(path);
			
			/*
			 * 以流的形式返回
			 */
			reader2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("c通过反射实例化对象/classinfo.properties");
			
			
			//创建Properties集合，key和value都是String类型的
			Properties properties = new Properties();
			
			//读取配置文件存到集合
			try {
				properties.load(reader2);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

			//通过key获取value
			Object value1 = properties.get("className1");
			Object value2 = properties.get("className2");
			System.out.println(value1);//bean.User
			
			//用获取的value，通过反射机制，实例化User对象
			Class c;
			try {
				
				c = Class.forName((String)value1);
				Class c2 = Class.forName((String)value2);
				
				Object obj1 = c.newInstance();
				Object obj2 = c2.newInstance();
				
				System.out.println(obj1);
				System.out.println(obj2);
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			
		}finally {
			if (reader1 != null) {
				try {
					reader1.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (reader2 != null) {
				try {
					reader2.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
