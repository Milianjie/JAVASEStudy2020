
/*
 *   ����ģʽ��23�����ģʽ����򵥵�ģʽ
 *   ��Ҫ���ã�
 *           Ϊ�˱�֤JVM��ĳһ�����͵�java������Զֻ��һ����
 *           Ϊ�˽�ʡ�ڴ濪��
 */
package h����ģʽ����;

public class UserTest {
	
	public static void main(String[] args){
		
		
	User u1 = new User();
	User u2 = new User();
	
	//���==���߶��ǻ����������ͣ���Ƚ��������������ݵĴ�С
	//���==���߶��������������ͣ���Ƚϵ����ڴ��ַ�Ƿ���ͬ
	System.out.println(u1==u2);//false
	//u1.setName("dshkasjh");
	System.out.println(u1.getName());
	System.out.print(u1.age);

	}
	
}
