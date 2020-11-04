package a注解的定义;

/*
 * 1、注解，也叫注释类型，英文名：annotation
 * 
 * 2、注解是一种类，编译后也会生产.class文件，所以是一种引用数据类型
 * 
 * 3、自定义注解，语法格式如下：
 * 		[修饰符列表] @interface 注解名{
 * 
 * 	}
 * 
 * 4、注解的使用
 * 		第一、注解使用的语法格式：
 * 			@注解类型名
 * 		第二、注解使用的位置：
 * 			注解可以出现在类上、方法上（包括成员方法静态方法以及构造方法）、成员变量与局部变量上、注解上,接口上，枚举上,形参上等等
 * 
 */
@MyAnnotation
public class AnnotationTest {
	
	@MyAnnotation
	private int i;
	
	@MyAnnotation
	public AnnotationTest() {
		// TODO 自动生成的构造函数存根
	}
	
	@MyAnnotation
	public void m1() {
		
		@MyAnnotation
		int a = 0;
		
	}
	
	@MyAnnotation
	public static void m2(
			@MyAnnotation
			String name,
			@MyAnnotation
			int c) {
		
		
	}

}

@MyAnnotation
interface MyInterface{}

@MyAnnotation
enum MyEnum{}

@MyAnnotation
@interface OtherAnnotation{}


