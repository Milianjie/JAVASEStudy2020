package e��������������;

public class User {
	

	//����  ʵ������  �Ǿ�̬���� ��Ա����
	//Feild
	String name;
	int age;
	
	//���췽�� Constructor(���¹��췽�������˷�������)
	public User(){//���췽��û�з���ֵ
		/*
		 * �˴����췽��û�в��������˴����������
		 * name=null;
		 * age=0;   ���ڹ��췽��������ʱϵͳĬ�ϸ�ֵ
		 */
	}
	     User(String _name){//public����ʡ��
	    	 name=_name;//Ĭ�ϸ�ֵage=0;
	    	             //��_name��Ϊ�����ֳ�Ա������ֲ�����
	    	            //�ڵ��ù��췽��ʱ���˸����׿�����ֵ������Ա����
	     }
	     
	     User(int _age){
	    	 age=_age;//Ĭ�ϸ�ֵname=null;
	     }
	     
	     User(int _age,String _name){
	    	 age=_age;
	    	 name=_name;
	     }


}
