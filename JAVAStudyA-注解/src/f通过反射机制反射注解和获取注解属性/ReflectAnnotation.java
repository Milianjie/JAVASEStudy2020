package fͨ��������Ʒ���ע��ͻ�ȡע������;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//��ע��ֻ��������ͷ�����
@Target(value = {ElementType.TYPE,ElementType.METHOD})

//��ע�Ᵽ����.class�ļ����ҿ��Ա�������ƶ�ȡ
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ReflectAnnotation {
	
	String value() default "�����찲�Ź㳡";
	
	String username() default "���ٽ�";
	
	String password() default "123456789987654321";

}
