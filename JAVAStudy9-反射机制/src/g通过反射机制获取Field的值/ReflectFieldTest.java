package g通过反射机制获取Field的值;

/*
 * 通过反射机制给Field赋值或者获取字段的值，这样可以将一些可以可变的字符以及要赋值的数据写进属性配置文件
 * 这样只需要修改属性配置文件中的内容就可以给不同对象的字段赋值和获取字段值了
 */

import java.lang.reflect.Field;

import bean.Student;

public class ReflectFieldTest {
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * 普通赋值和获取对象的属性，
		 */
		Student student = new Student();
		student.num = 100;//三要素：这个类的对象、该对象的字段以及要赋值的数据
		System.out.println(student.PI);//两要素：这个类的对象、要获取的该对象的字段
		
		
		/*
		 * 反射机制
		 */
		//获取Class
		Class class1 = Class.forName("bean.Student");
		
		Object obj = class1.newInstance();//创建Student类字段，obj是学生类对象
		
		//获取指定字段的Field
		Field numField = class1.getDeclaredField("num");//拿取指定字段num的Field
		Field ageField = class1.getDeclaredField("age");//拿取指定私有字段age的Field
		
		//赋值，方法：获取的字段.set(对象,赋值的数据);
		//但是有权限控制符的字段，不能直接在其他类中直接赋值和获取，需要打破封装
		ageField.setAccessible(true);//这也是反射机制的缺点，太容易把封装性打破了
		ageField.set(obj, 28566);//三要素：这个类的对象、该对象的字段以及要赋值的数据 也要缺一不可
		
		//获取Field的值
		Object age = ageField.get(obj);//两要素：这个类的对象、要获取的该对象的字段
		System.out.println(ageField.getName()+":"+age);
		
	}

}
