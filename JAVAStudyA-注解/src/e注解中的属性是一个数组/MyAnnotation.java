package eע���е�������һ������;

public @interface MyAnnotation {
	
	/*
	 * ע�⵱�е��������Ϳ����У�
	 * 	byte short int long float double char boolean String Class �Լ�ö������
	 * �������ϵ�������ʽ
	 */
	
	int value1();
	
	String value2();
	
	int[] value3();
	
	String[] value4();
	
	Season value5();
	
	Season[] value6();
	
	Class parameterType();
	
	Class[] parameterTypes();
	

}
