package cString���еĹ��췽��;

public class StringTest {
	
	public static void main(String[] args) {
		
		//�����ַ���������õ�һ�ַ�ʽ
		String s1 = "hello world";
		//s1��������б������һ���ڴ��ַ
		//���´���Ӧ�����һ���ڴ��ַ
		System.out.println(s1);//hello world  -->ȴ������ַ�����˵��String������д��toString����
		
		/*
		 * ���ù��췽����1��
		 */
		byte[] bs = {97,98,99};//97Ϊa��98Ϊb��99Ϊc
		String s2 = new String(bs);//abc
		//���ĳ�����͵�����ʱ�����Զ����ø����е�toString�������÷���δ��дʱ��Object�е�һ����������ڴ��ַ
		//�����������ַ��������£�˵��String�Ѿ���д��toString����
		//����ַ�������Ļ���������ַ������������ǵ�ַ
		System.out.println(s2);	
		
		/*
		 * ���õĹ��췽����2��
		 * String(�ֽ�����,Ҫת�����ַ���������Ԫ�ص���ʼ�±�,Ҫת���ĳ���)
		 *��byte�����һ����ת�����ַ���
		 */
		String s3 = new String(bs, 1, 2);
		System.out.println(s3);//bc
		
		//��char����ȫ��ת�����ַ���
		char[] chars = {'��','��','��','��','��'};
		String s4 = new String(chars);
		System.out.println(s4);
		//��char���鲿��ת�����ַ���
		System.out.println(new String(chars, 2, 3));
		
		/*
		 * ���ù��췽����3��
		 * 
		 */
		
	}

}
