/*
 *    ʵ�ֵ���ģʽ
 *    
 *    Ҫ�죺
 *         1.���ȹ��췽��˽�л�private
 *         2.�����ṩһ�������Ҿ�̬�Ļ�ȡ��ǰ����(����ֵΪ��ǰ��)����ķ���
 *         3.����ṩһ����ǰ���͵ľ�̬����
 *         
 *         ����ģʽ�����֣�
 *         ����ʽ������������ؽ׶ξʹ����˶���
 *         ����ʽ�������õ������ʱ��Ŵ�������
 */
     //����ʽ����
package h����ģʽ����;

public class Singleton {
	
	//��̬����
	private static Singleton s = null;
	
	private Singleton(){
		
	}
	
	//�����ṩһ�������Ļ�ȡSingleton���Ͷ���ķ���
	public static Singleton set(){
		if (s==null){
			  s=new Singleton();
		}
		return s;
	}

}
