package bean;

/*
 * 反射属性Field
 */

public class Student {
	
	//Field翻译为字段，就是属性/成员
	//五个Field，分别采用了不同访问控制权限修饰符以及其他修饰符
	//从字节码中反射获取的Filed包括字段以及修饰该字段的所有修饰符
	
	public int num;//这里3个表示一个Field对象
	
	private int age;//这里3个表示一个Field对象
	
	boolean sex;//这里两个表示一个Field对象
	
	protected String name;//这里3个表示一个Field对象
	
	public static final double PI = 3.1415926;//这里5个表示一个Field对象

}
