package f����Զ����쳣;

/*
 * 	1��SUN��JDK���ṩ�������쳣�ǲ����õġ���ʵ�ʿ����У�ҵ��࣬��Щҵ����ֵ��쳣
 * 	     ����JDK��û�еġ���ô��ʱ���Ǿ���Ҫ�Լ������쳣��
 * 	2��Java����ô�Զ����쳣��
 * 			������	
 * 				��һ������дһ����̳�Exception����RunTimeException
 * 				�ڶ������ṩ�������췽����һ���޲εģ�һ������String������
 * 			ֱ������Ӳ��
 */

public class MyException extends Exception { //�̳�Exception����ʱ�쳣
	
	public MyException() {
		// TODO �Զ����ɵĹ��캯�����
		super();
	}
	
	public MyException(String s) {
		super(s);
	}
	
}
//
//public class MyException extends RunTimeException { //�̳�RunTimeException����ʱ�쳣
//	
//	public MyException() {
//		// TODO �Զ����ɵĹ��캯�����
//		super();
//	}
//	
//	public MyException(String s) {
//		super(s);
//	}
//	
//}
