package qö����enum;

/*
 * 		���³���ʹ��ö�ٸ������
 * 
 * 		�ܽ᣺
 * 			1��ö����һ��������������
 * 			2��ö�����Ͷ�����﷨��
 * 				enum ö��������{
 * 					ö��ֵ1,ö��ֵ2,...
 * 				}
 * 			ö��ֵ�ǳ�������������Ҫ��ֵ��ֱ�Ӵ�д
 * 			3�����ֻ����������ģ�����ʹ�ò�������
 * 			����������ֲ��һ��ǿ���һöһö�оٳ����ģ�����ʹ��ö�����͡�
 * 			���磺��ɫ���ļ������ڵȶ�����ʹ��ö������
 */

public class EnumTest02 {
	
	public static void main(String[] args) {
		
		Result value = divide(18, 5);
		System.out.println(value == Result.SUCCESS?"����ɹ�":"����ʧ��");
		
	}
	
	/**
	 * (����)�����˵�����³����������int�������ݵ��̣�����ɹ�����SUCESS������ʧ�ܷ���FAIL
	 * @param a	int��������
	 * @param b	int��������
	 * @return	����ɹ�����SUCESS������ʧ�ܷ���FAIL
	 */
	public static Result divide(int a,int b) {
		
		try {
			
			int c = a/b;
			//ִ�е����ʾ����û�з����쳣��ִ�гɹ�
			return Result.SUCCESS;
			
		} catch (Exception e) {
			// TODO: handle exception
			//ִ�е����ʾ�����쳣��ִ��ʧ��
			return Result.FAIL;
		}
		
	}


}

enum Result{
	SUCCESS,FAIL
}
