package cbJDK���õ�ע��Deprecated;

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
 * ע��@Deprecated
 * 	Դ�룺
		@Documented
		@Retention(RetentionPolicy.RUNTIME)
		@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
		public @interface Deprecated {
		}
 * 		����ע���ע�Ĺ��췽�����ֶΡ��ֲ�������������������ʽ�������ࡢģ���ʾ�Ѿ���ʱ�ˣ�����������ʹ��ʱ����һ�����ߴ������
 * 		���þ�����ʾ����Ա�и��õ����������ˣ�����@Retention(RetentionPolicy.RUNTIME)������.class �ļ��У�����
 * 		����ע�Ļ��ڿ���̨��ʾ�������Ա���Ѿ���ʱ��
 */

public class DeprecatedAnnotationTest {
	
	public static void main(String[] args) {
		
		Exmple exmple = new Exmple();
		
		exmple.doSome();
		Exmple.doOther();
		
		try {
			Class exmpleClass = Class.forName("cbJDK���õ�ע��Deprecated.Exmple");
			
			exmpleClass.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}

class Exmple{
	
	@Deprecated
	public void doSome() {
		System.out.println("doSome����ִ��");
	}
	
	@Deprecated
	public static void doOther() {
		System.out.println("doOther����ִ��");
	}
	
}