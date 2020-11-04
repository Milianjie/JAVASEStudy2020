package mIO和Properties集合联合使用;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * 【IO流与Map类集合Properties的联合使用】
 * 
 * 		【设计理念】以后经常改变是数据，可以单独写到一个文件中，使用程序动态读取。
 * 				将来需要修改数据仅需修改文件中的，java代码不需要变动，也不需要重新
 * 				编译和部署，服务器也无需重启，就可以拿到动态信息
 * 			类似于上面机制这样的文件，称之为配置文件：
 * 			当配置文件中的内容格式是：
 * 			key1=value1
 * 			key2=value2
 * 			的时候，把这种配置文件叫做属性配置文件
 * 	java规范要求：属性配置文件要以.properties结尾，但这不是必须的
 * 	其中Properties是专门存放属性配置文件的一个类，如果配置文件中key重复的话就发生value值覆盖
 * 	【属性配置文件中#是注释，数据等号之间不能有空格，等号可以换成':'，但不建议】
 */

public class IOPropertiesTest {
	
	public static void main(String[] args) {
		
		//创建一个文件字符输入流
		FileReader reader = null;
		try {
			
			reader = new FileReader("src/mIO和Properties集合联合使用/userinfo");
			
			//创建Properties集合,这类集合中key和value都是String类型的
			Properties properties = new Properties();
			
			//用laod方法将管道/流对准集合properties，让文件userinfo中的数据放进集合中
			properties.load(reader);//此时集合中文件里的等号=左边数据作为集合的key值，右边数据作为集合的value值
			
			//利用key值获取value值
			String value1 = properties.getProperty("username");
			//System.out.println(value1);//zhorongjie
			
			//在文件中修改value之后输出
			System.out.println(value1);//朴初珑
			
			//【结论】在程序当中经常发生变化的信息，直接写到配置文件当中，需要修改就直接修改配置文件就可以了
			//不需要再修改java程序了，不然的话需要改变的时候程序又得重新编译，重新部署，服务器还得重启，麻烦
			System.out.println(properties.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
