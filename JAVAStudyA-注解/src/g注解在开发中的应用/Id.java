package g注解在开发中的应用;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 有一个需求：注解Id只能标注在类上，而且被@Id标注的类中必须有一个int类型的id字段
 * 			否者就会报异常
 */
//这个注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)

//这个注解只能标注在类上
@Target(ElementType.TYPE)
public @interface Id {

}
