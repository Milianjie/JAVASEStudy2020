package dע�����Զ�������;

/*
 * 	�Զ���ע��@MyAnnotation
 * 	�Զ���ע���е��Զ�������
 */

public @interface MyAnnotation {
	
	/**
	 * �Զ���ע���е����ԣ����������ע��MyAnnotation��name����
	 * @return
	 */
	String name();
	
	/*
	 * ��ɫ����
	 */
	String color();
	
	/*
	 * ��������,Ϊ����������һ��Ĭ��ֵ
	 */
	int age() default 25;

}
