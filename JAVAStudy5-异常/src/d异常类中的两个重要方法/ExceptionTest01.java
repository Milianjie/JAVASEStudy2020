package d�쳣���е�������Ҫ����;

/*
 * 		�쳣������������Ҫ������
 * 			1��String msg = exception.getMessage()
 * 			��ȡ�쳣�򵥵�������Ϣ
 * 			
 * 			2��exception.printStackTrace
 * 			��ӡ�쳣׷�ٵĶ�ջ��Ϣ
 */

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		NullPointerException exception = new NullPointerException("���׳��Ĵ�����ָ���쳣����");
		//throw exception;  -->�ֶ����쳣��������ʾ�ϱ����쳣�Ķ���˵�������쳣������Ĵ��벻��ִ��
		
		//��ȡ�쳣�򵥵�������Ϣ�������Ϣ���Ǹ��쳣�๹�췽������Ĳ���
		String msg = exception.getMessage();//���׳��Ĵ�����ָ���쳣����
		System.out.println(msg);
		
		//��ӡ�쳣׷�ٵĶ�ջ��Ϣ
		//����Ϣ�Ĵ�ӡ�ǲ����첽�̵߳ķ�ʽ��ӡ��
		exception.printStackTrace();
	}

}
