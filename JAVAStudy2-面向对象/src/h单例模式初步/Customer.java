package h����ģʽ����;

public class Customer {
	
	//��̬����
		private static Customer s = new Customer();//�����ʱִֻ��һ��
		
		private Customer(){
			
		}
		
		//�����ṩһ�������Ļ�ȡCustomer���Ͷ���ķ���
		public static Customer getCustomer(){
			return s;
		}

}
