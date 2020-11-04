package f通过反射机制反编译Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * 通过利用java.lang.reflect.Field中的方法反编译.class文件的字段/属性
 */

public class ReflectFieldTest {
	
	public static void main(String[] args) {
		
		//创建字符串拼接对象
		StringBuilder s = new StringBuilder();
		
		//获取Class对象
		Class class1 = null;
		try {
			 class1 = Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//获取Student字节码文件的Field
		Field[] fields = class1.getDeclaredFields();
		//需要拼接成一个类的模型。如下:
		/*
		 * public class Student {}
		 */
		//具体代码
		//s.append("public class Student { ");
		//其中public class 以及Student都可以获取
		s.append(Modifier.toString(class1.getModifiers())+" class "+class1.getSimpleName()+" {\n");
		
		//中间属性部分通过遍历Field进行拼接
		for (Field field : fields) {
			
			s.append("\t");
			s.append(Modifier.toString(field.getModifiers()));
			s.append(" ");
			s.append(field.getType().getSimpleName());
			s.append(" ");
			s.append(field.getName());
			s.append(";\n");
		}
		
		s.append("\n}");
		
		System.out.println(s);
		
	}

}
