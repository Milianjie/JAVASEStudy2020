package fͨ��������Ʒ���ע��ͻ�ȡע������;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectAnnotationTest {
	
	public static void main(String[] args) throws Exception{
		
		//��ȡAnnotationTest��Class
		Class annotationTestClass = Class.forName("fͨ��������Ʒ���ע��ͻ�ȡע������.AnnotationTest");
		
		/*
		 * �ж��������ע���Լ���ȡ��ע������л�ȡ��ע����������ֵ
		 */
		//�жϻ�ȡ��.class�ļ������Ƿ����@ReflectAnnotation,��Ȼ��Ҳ���ж�AnnotationTest�������Ƿ���@ReflectAnnotation
		System.out.println(annotationTestClass.isAnnotationPresent(ReflectAnnotation.class));//true
		if (annotationTestClass.isAnnotationPresent(ReflectAnnotation.class)) {
			
			//��ȡע�����
			ReflectAnnotation ran = (ReflectAnnotation)annotationTestClass.getAnnotation(ReflectAnnotation.class);
			System.out.println("�������ע�����"+ran);//@fͨ��������Ʒ���ע��ͻ�ȡע������.ReflectAnnotation()
			
			//����ע����󣬾�����ӿ�һ��ֱ�ӵ��Ϳ��Ի�ȡע���������
			String value = ran.value();
			System.out.println(value);//�����찲�Ź㳡	--��Ϊ���������ע��ע���õ���Ĭ�ϵ�����ֵ
			System.out.println(ran.username());//���ٽ�
			System.out.println(ran.password());//123456789987654321
		}
		
		//�ж�String�ࣨString.class�ļ��������Ƿ���@ReflectAnnotation
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.isAnnotationPresent(ReflectAnnotation.class));//false
		
		/*
		 * �ж����з����ϵ�ע�⣬��ִ������Ĳ���
		 */
		//����Ҫ��ȡָ����Method
		Method m1Method = annotationTestClass.getDeclaredMethod("m1");
		
		//�ж�����������Ƿ���@ReflectAnnotation
		System.out.println(m1Method.isAnnotationPresent(ReflectAnnotation.class));//true
		
		//�����true����ȡ��ע�����
		if (m1Method.isAnnotationPresent(ReflectAnnotation.class)) {
			
			//��ȡע��ReflectAnnotation�Ķ���
			Object object =m1Method.getAnnotation(ReflectAnnotation.class);
			ReflectAnnotation m1ReflectAnnotation = (ReflectAnnotation)object;
			
			//ͨ����ȡ��ע�������������Ի�ȡ����ֵ
			System.out.println(m1ReflectAnnotation.value());//�����찲�Ź㳡
			System.out.println(m1ReflectAnnotation.username());//�ӳ���
			System.out.println(m1ReflectAnnotation.password());//123456789001
			
		}
	}
	

}
