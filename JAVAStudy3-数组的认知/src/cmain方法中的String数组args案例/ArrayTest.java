package cmain�����е�String����args����;

/**
 *                ����main�����е�Strong[] args�ڳ���������÷���Ȩ��
 *             				����Ϊ���û���Ҫ�����û���������
 * @author ���ٽ�
 *
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//Object aObject =  new Object();
		//System.out.println(aObject.toString());//java.lang.Object@ee7d9f1
		if (args.length!=2) {
			System.out.println("ϵͳ�޷�����!!!\n�������û���������!\n����:zhangsan 123");
			return;
		}
		
		//����ִ�е��˴�˵�����ṩ�û���������
		//�������ж��û����������Ƿ���ȷ
		//ȡ���û���
		String name = args[0];
		//ȡ������
		String password = args[1];
		
		//�ж������ַ����Ƿ������String�е�equals����
		//Ϊ�˱����ָ���쳣�����ǿ��԰ѱ����ŵ�������
		//if (name.equals("admin")&&password.equals("123")) {
		if ("admin".equals(name)&&"123".equals(password)) {
			System.out.println("�𾴵�"+name+"�û������ѳɹ���¼!\n��ӭʹ�ñ�ϵͳ!\n�����뿪ʼ����ɧ����....");
		}else {
			System.out.println("��¼ʧ��!\n�û������������!");
			return;
		}
		
		
	}

}
