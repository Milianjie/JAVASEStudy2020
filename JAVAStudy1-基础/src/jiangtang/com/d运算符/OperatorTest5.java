package jiangtang.com.d�����;

/*
 *     ���������(��Ŀ�����)
 *        ?:
 *        �﷨��
 *        Boolean���ʽ ? ���ʽ1 : ���ʽ2
 *        
 *        Boolean���ʽ�Ľ����true����ô��������ǵĽ��
 *        ���Ǳ��ʽ1�Ľ������֮���Ǳ��ʽ2�Ľ�� 
 */


public class OperatorTest5 {
	
	public static void main(String[] args){
		
		//�ж���������Ƿ����ͨ��
		boolean sex=true;
		  
		//sex?"boy":"girl";//���벻ͨ�����������
		
		//һ��Ҫ������ʽ1.2�Ľ�����ͣ���Ȼ�����ڶ����������ʽ�����Ƿ�����
		String result=(sex?"boy":"girl");
		System.out.println(result);
				
	}

}