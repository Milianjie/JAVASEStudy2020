package bJDK���õ�ע��Override;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * java.lang���µ�Overrideע��
 * 
 * ��־��ע�⣬�����������ο�������ʱ��飬������ʱ�޹�
 * 	
 * 	Դ�����£�
 * 
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public @interface Override {
	
	}
	
	���ǿ��Կ���ע��@Override�����ϻ�������ע��@Target��@Retention����������Ԫע�⡣
	���ǳƳ�����ע���ϵ�ע����Ԫע�⡣���У�
	
	@Target����ʾ����ע��ע��ֻ�ܳ�������Щλ����
	@Target(ElementType.METHOD)����ʾ�����ע��ע��ֻ�ܳ��֣�ע�⣩�ڷ�����
	
	@Retention����ʾ�����ע��ע��ֻ�����ձ���������
	@Retention(RetentionPolicy.SOURCE)����ʾ�����ע��ע������ֻ�ܱ�����javaԴ�ļ��У�
	�ͱ���˵Overrideע���ע��ĳ�������д�����ϣ������������к����ɵ�.class�ļ�����û��Overrideע���
	����չ��
	@Retention(RetentionPolicy.CLASS)����ʾ�����ע��ע������ֻ�ܱ�����.class�ļ���
	@Retention(RetentionPolicy.RUNTIME)����ʾ�����ע��ע������ֻ�ܱ�����.class�ļ���,���ҿ��Ա�������ƶ�ȡ
	����ʹ�õ����ֽ����ļ�.class�����Ա����ע��ע�����ʾ��Ϣmsg��������ʱ��ʾ����

	Overrideע��ֻ��ע�ⷽ�����������Ǹ����������ο��ģ������н׶�û��ϵ
	����java�е�ĳ�������������ע�⣬���������������������飬����÷���������д����
	�еķ������������ᱨ��@Override�²����߱��죬Ҳ����������ʾ����д�ķ����ǲ�������ȱ�˴���ʲô��
 * 		
 */

public class OverrideAnnotationTest {
	
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return super.toString();
	}

}
