/*
 *    ָ���Ǹ��ڲ���û������
 */
package u�����ڲ���;

public class OutClassnm {
	
	//��̬����
	public static void m1(CustomerService cs){
		cs.logout();
	}
	
	//���
	public static void main(String[] args){
		
		//����m1����
		//�ӿ�û����������
		//���Բ���m1(new CustomerService());
		//дһ���ӿڵ�ʵ�����newһ��ʵ����Ķ���
		//m1(new CusyomerServiceImp());ϵͳ�Ѱ�ȫ�˳���
		
		
		//������ʵ���ֱ࣬���ڲ����б�дһ�������ڲ���
		m1( new CustomerService(){
			//��дlogout����
			public void logout(){
				System.out.println("ϵͳ�Ѱ�ȫ�˳���");
			}
		});
		//�����ڲ����ŵ㣺�ٶ���һ����
		//ȱ�㣺�����ظ�����
	}

}

interface CustomerService{
	
	//�˳�ϵͳ
    public abstract void logout();
    
}

//�����ӿڵ�ʵ����
/*class CusyomerServiceImp implements CustomerService{
	
	//��дlogout����
	public void logout(){
		System.out.println("ϵͳ�Ѱ�ȫ�˳���");
	}
}*/

