package kInteger���÷���;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		/*
		 * ��Ҫ����
		 * static int parseInt(String s)
		 * ��̬����������String������int����
		 * �ͱ�������ҳ�ı����������100ʵ������"100".Ҫ������̨�洢�����ݿ��еı�����100���֣���ʱ
		 * java������Ҫ���ַ���"100"ת����100����
		 */
		//��Ȼ�ַ���ֻ�������ֵ��ַ�������Ȼ�ᱨ���ָ�ʽ���쳣NumberFormatException
		//Ҫ����������쳣�ܼ���ִ������Ĵ��룬�Ͳ����쳣
		try {
				int getValue = Integer.parseInt("123456");//String -->ת��  int
				System.out.println(getValue+1222);//124678
				int getValue2 = Integer.parseInt("zhkjh");//String -->ת��  int
				System.out.println(getValue+1222);//124678
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����쳣"+e);//�����쳣java.lang.NumberFormatException: For input string: "zhkjh"
		}
		int getValue = Integer.parseInt("123456");//String -->ת��  int
		System.out.println(getValue+1222);//124678
		
		//ͬ���ģ�������װ����Ҳ�и÷���
		double retValue = Double.parseDouble("3.125");
		System.out.println(retValue+1000);
		
		//--------------------���·��������˽�------------------------------------------------
		/*
		 * static String toBinaryString(int i) 
		 * ��̬�ģ���ʮ����ת���ɶ����Ƶ��ַ���
		 */
		System.out.println(Integer.toBinaryString(56));//111000
		
		/*
		 * static String toHexString(int i)
		 *  ��ʮ�������޷���������ʽ���� int �������ַ�����ʾ��ʽ��
		 *  16���ƣ�1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,10,11,12,13,14,15,16,17,18,19,1a 
		 *  ��16��1
		 */
		System.out.println(Integer.toHexString(26));//1a
		
		/*
		 * static String toOctalString(long i) 
		 *  �԰˽����޷���������ʽ���� long �������ַ�����ʾ��ʽ�� 
		 */
		System.out.println(Integer.toOctalString(8));//10
		
		//Object�е�toString��������
		/*
		 public String toString() {
        		return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	 }
		 */
		//hashCode��������ַת����int��toHexString�ٽ���ת��16�������ַ�������
		Object a = new Object();
		System.out.println(a);//java.lang.Object@7dc5e7b4
		
	}

}
