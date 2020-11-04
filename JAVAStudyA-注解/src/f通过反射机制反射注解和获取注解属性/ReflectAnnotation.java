package f通过反射机制反射注解和获取注解属性;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//该注解只能用在类和方法上
@Target(value = {ElementType.TYPE,ElementType.METHOD})

//该注解保存在.class文件中且可以被反射机制读取
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ReflectAnnotation {
	
	String value() default "北京天安门广场";
	
	String username() default "钟荣杰";
	
	String password() default "123456789987654321";

}
