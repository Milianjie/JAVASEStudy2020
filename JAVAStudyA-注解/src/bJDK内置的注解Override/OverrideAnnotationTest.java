package bJDK内置的注解Override;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * java.lang包下的Override注解
 * 
 * 标志性注解，给编译器做参考，编译时检查，与运行时无关
 * 	
 * 	源码如下：
 * 
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public @interface Override {
	
	}
	
	我们可以看到注解@Override定义上还有两个注解@Target和@Retention，这是两个元注解。
	我们称出现在注解上的注解是元注解。其中：
	
	@Target：表示被标注的注解只能出现在哪些位置上
	@Target(ElementType.METHOD)：表示被其标注的注解只能出现（注解）在方法上
	
	@Retention：表示被其标注的注解只能最终保存在哪里
	@Retention(RetentionPolicy.SOURCE)：表示被其标注的注解最终只能保存在java源文件中，
	就比如说Override注解标注在某个类的重写方法上，这个类编译运行后，生成的.class文件中是没有Override注解的
	【扩展】
	@Retention(RetentionPolicy.CLASS)：表示被其标注的注解最终只能保存在.class文件中
	@Retention(RetentionPolicy.RUNTIME)：表示被其标注的注解最终只能保存在.class文件中,并且可以被反射机制读取
	运行使用的是字节码文件.class，所以被其标注的注解的提示信息msg会在运行时提示出来

	Override注解只能注解方法，其作用是给编译器做参考的，与运行阶段没关系
	例如java中的某个方法带有这个注解，编译器会对这个方法编译检查，如果该方法不是重写父类
	中的方法，编译器会报错。@Override下波浪线爆红，也可以另类提示你重写的方法是不是哪里缺了错了什么的
 * 		
 */

public class OverrideAnnotationTest {
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return super.toString();
	}

}
