package hInteger�Ĺ��췽��;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//��idea��Integer����˵�������ʱ��
		//����JDK�汾9���Ժ󲻽���ʹ�ø���
		Integer x = new Integer(133);//������133ת����Integer��װ����
		
		Integer y = new Integer("133");//��String���͵�����133װ����Integer��װ����
		
		System.out.println(x+"\n"+y);
		
		//ͬ���ģ�������װ������
		Double m = new Double(133);//������133ת����Integer��װ����
		
		Double n = new Double("133.0");//��String���͵�����133װ����Integer��װ����
		
		System.out.println(m+"\n"+n);
		
		/*
		 * ��װ�����м��������������Ӧ�Ļ����������͵����ֵ����Сֵ��
		 */
		//ͨ�����ʰ���ĳ�����ȡ���ֵ��Сֵ
		System.out.println("int�������ֵ��"+Integer.MAX_VALUE);
		System.out.println("int������Сֵ��"+Integer.MIN_VALUE);
		System.out.println("byte�������ֵ��"+Byte.MAX_VALUE);
		System.out.println("byte������Сֵ��"+Byte.MIN_VALUE);
		
		
		
		
	}

}
