package e通过反射获取字节码文件的Filed;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * 反射Student类中的所有Filed
 */

public class ReflectTest {
	
	public static void main(String[] args) {
		
		//先获取Student.classs
		Class class1 = null;
		try {
			class1 = Class.forName("bean.Student");
			
			//获取class1的完整类名的字符串表示，getName()
			String className1 = class1.getName();
			System.out.println(className1);//bean.Student
			
			//获取class1的简洁类名的字符串表示，getSimpleName()
			String className2 = class1.getSimpleName();
			System.out.println(className2);//Student
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//通过Class中的方法获取Filed
		/*
 			1、 Field getField(String name)  返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
 			Field field = class1.getField("num");-->返回class1中一个public修饰的指定字段的Filed对象
 			 
 			2、Field[] getFields() 返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
 			Field[] file = class1.getFields(); -->将class1中的所有public修饰的Filed放进Filed数组中
 			
 			3、Field getDeclaredField(String name) 返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
 			 
 			4、Field[] getDeclaredFields() 返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
 			
 			 后面两个方法是返回所有被访问控制修饰符以及不被修饰的Filed。
		 */
		//下面用返回数组的方式
		Field[] fields1 = class1.getFields();
		System.out.println(fields1.length);//2 --因为Student类中只有两个Field被public修饰
		
		Field[] fields2 = class1.getDeclaredFields();
		System.out.println(fields2.length);//5 --上面无视权限控制符直接将Field放进数组
		
		//取出某一个Field对象,并获取这个Field对象的名字
		//取出
		Field firstField = fields2[0];
		//获取Field名字,该方法是Field对象的方法，返回String
		String firstName = firstField.getName();
		System.out.println(firstName);//num
		
		//遍历数组,这里直接输出获取到的Field对象
		for (Field field : fields2) {
			System.out.println(field);
		}
		/*下面是直接输出获取到的Field对象，这个Field对象包括各种修饰符以及所属的类和字段名等等，
		 * 里面的每一个都可以分别获取，如上面的获取Field的名字即字段的名字
		public int bean.Student.num
		protected int bean.Student.age
		boolean bean.Student.sex
		private java.lang.String bean.Student.name
		public static final double bean.Student.PI
		*/
		
		//遍历数组，这里获取每个Field对象的字段名
		for (Field field : fields2) {
			System.out.println(field.getName());
		}
		/*输出如下：
		num
		age
		sex
		name
		PI
		*/
	
		//获取Filed对象类型,用getType()方法，返回的是一个Class类型的对象
		//因为Class对象中的getName是返回这个对象类型的完整类名的字符串表示，还有一个是简洁类名的返回方法
		//所以这里用Class对象firstClass调用getSimpleName()可知晓Field对象的类型
		Class firstClass = firstField.getType();
		String firstClassName = firstClass.getName();
		System.out.println("第一个Field的类型："+firstClassName);//int
		
		//获取属性的修饰符列表，getMOdifiers();该方法返回的数字是这些修饰符的代号表示
		//java.lang.reflect包下有一个MOdifier类，这个类中有一个静态方法
		//static String toString(int mod) --返回描述指定修饰符中的访问修饰符标志的字符串。 
		int fieldNum = firstField.getModifiers();
		System.out.println(fieldNum);//1 public的代号是1
		
		//用Modifier类中的静态toString方法将1转成字符串
		String moString = Modifier.toString(fieldNum);
		System.out.println(moString);
		
		//看一下Student类中的第五个字段，其有很多修饰符修饰，输出的代号是咋样的
		Field field5 = fields2[4];
		System.out.println(field5.getModifiers());//25
		System.out.println(Modifier.toString(field5.getModifiers()));//public static final
		
	}

}
