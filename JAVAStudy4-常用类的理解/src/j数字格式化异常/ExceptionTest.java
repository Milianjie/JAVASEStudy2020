package j���ָ�ʽ���쳣;

/*
 * 		��ѧ���ľ����쳣��
 * 			��ָ���쳣��NullPointException
 * 			����ת���쳣��ClassCastException
 * 			�����±�Խ���쳣��ArrayIndexOutOfBoundsEception
 * 			���ָ�ʽ���쳣��NumberFormatException
 */

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		//�ֶ�װ��
		Integer x = new Integer(1000);
		
		//�ֶ�����
		int y = x.intValue();
		System.out.println(y);
		
		//���ַ�����ȥ���ٵ��������ַ���
		Integer d = new Integer("565656");
		
		//���´������û�����⣬����Java����﷨��Integer�д��ַ�����ȥ�Ĺ��췽��
		//��������ʱ�ᱨ�쳣java.lang.NumberFormatException
		//Integer a = new Integer("�й���");
		
		
	}

}
