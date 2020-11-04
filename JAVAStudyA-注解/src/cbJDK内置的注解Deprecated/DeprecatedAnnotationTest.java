package cbJDK内置的注解Deprecated;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 注解@Deprecated
 * 	源码：
		@Documented
		@Retention(RetentionPolicy.RUNTIME)
		@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
		public @interface Deprecated {
		}
 * 		被该注解标注的构造方法、字段、局部变量、方法、包、形式参数、类、模块表示已经过时了，在其它类中使用时会有一条横线穿插而过
 * 		作用就是提示程序员有更好的来代替它了，由于@Retention(RetentionPolicy.RUNTIME)保存在.class 文件中，运行
 * 		被标注的会在控制台提示警告程序员它已经过时了
 */

public class DeprecatedAnnotationTest {
	
	public static void main(String[] args) {
		
		Exmple exmple = new Exmple();
		
		exmple.doSome();
		Exmple.doOther();
		
		try {
			Class exmpleClass = Class.forName("cbJDK内置的注解Deprecated.Exmple");
			
			exmpleClass.newInstance();
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
		
	}

}

class Exmple{
	
	@Deprecated
	public void doSome() {
		System.out.println("doSome方法执行");
	}
	
	@Deprecated
	public static void doOther() {
		System.out.println("doOther方法执行");
	}
	
}