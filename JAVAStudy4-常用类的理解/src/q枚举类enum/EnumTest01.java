package qö����enum;

/*
 * 		����java����û��ʹ��ö���࣬���������������ʲôȱ��?
 * 		
 * 			ȱ�����ڣ������ķ���ֵ�����ϣ������󷵻�int��ǡ��
 * 					��Ϊ���Ľ��ֻ�ǳɹ���ʧ�ܣ���ô���ʹ��boolean���ͣ��������͵�true��false���ñ�ʾ���ֲ�ͬ��״̬
 * 					int���͵Ļ��������Աд����������ֵ���ڱ���������ǲ��ᱨ��ģ���������ƫ��������
 * 			׷����ǣ������ڱ���׶ν����д����ҳ���
 * 
 * 			˼�������·����еĽ��ֻ�����֣�ʹ�ò������ͷ��أ���ʵ�á�
 * 				Ȼ�����Ժ�Ŀ��������п��ܷ����Ľ������3�֡�4�ֵ���������Ľ����
 * 				��Щ���ܳ��ֵĽ�������ܹ�������ģ�����һöһö�оٳ����ģ���ʱ�������;��޷�
 * 				���������ˣ�������Ǿ�Ҫ��java�е�ö�����͡�
 */

public class EnumTest01 {
	
	public static void main(String[] args) {
		
		int retValue1 = divide(10, 5);
		System.out.println(retValue1);
		
		System.out.println("==========================");

		int retValue2 = divide(10, 0);
		System.out.println(retValue2);
		
	}
	
	/**
	 * (����)�����˵�����³����������int�������ݵ��̣�����ɹ�����1������ʧ�ܷ���0
	 * @param a	int��������
	 * @param b	int��������
	 * @return	����ɹ�����1������ʧ�ܷ���0
	 */
	public static int divide(int a,int b) {
		
		try {
			
			int c = a/b;
			//ִ�е����ʾ����û�з����쳣��ִ�гɹ�
			System.out.println(a+"/"+b+"="+c);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			//ִ�е����ʾ�����쳣��ִ��ʧ��
			System.out.println("�����쳣��"+e);
			return 0;
		}
		
	}

}
