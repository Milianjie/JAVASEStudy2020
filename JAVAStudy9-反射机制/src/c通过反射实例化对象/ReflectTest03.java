package cͨ������ʵ��������;

/*
 * 	����Class.forName()����������ʲô��
 * 		ִ�и÷���ʱ��ʹ��õ�class�ֽ����ļ������еľ�̬�����ִ��
 * 		����˵�����������
 * 
 * 	���ص㡿���ϣ��һ�����еľ�̬�����ִ�У�����������һ�ɲ�ִ��
 * 		����ʹ��
 * 				Class.forName("����������");
 * 		����������÷���ִ�У���������أ�������þ�̬�����ִ��
 * 
 * 	JDBC��Ҫ��
 */

public class ReflectTest03 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("bean.MyClass");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
