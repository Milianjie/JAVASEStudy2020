package bString�ַ����洢ԭ��;

import java.awt.print.Printable;

public class StringTest {
	
	public static void main(String[] args) {
		
		//�����������ǲ����ͷ��ַ����������еĶ����
		String s1 = "hello";
		String s2 = "hello";//"hello"�Ǵ洢���ַ����������У����"hello"���󲻻��½�
		System.out.println(s1 == s1);//true
		
		//˼���������ַ������󱣴����ַ����������У�ͬһ���ַ���Ψһ�������ڴ��ַΨһ���ǲ��ǱȽ������ַ����Ͳ���Ҫ�Ƚ����е���������
		String x = new String("xy");
		String y = new String("xy");
		System.out.println(x == y);//false-->�Ƚϵ���x��y�����String��������õ�ַ
		//ͨ����������ַ����Ƚ���==�����գ�Ҫ��String����д��equals����
		System.out.println(x.equals(y));//true-->�Ƚϵ���������String�����б����ָ���ַ�������"xy"���ڴ��ַ
		
		String k = new String("test");
		//�ַ�������� . ����Ϊ"test"��һ���ַ�������ֻҪ�Ƕ����ܵ��÷��������Կ��Լ�.
		//�磺String s = "kkk";--->���ǿ��Է��ֿ���s��"kkk"�ǵȼ۵ģ�s����s.  ��ô"kkk"Ҳ����
		System.out.println("test".equals(k));//����ʹ�����ַ�ʽ
		System.out.println(k.equals("test"));//������ʹ�����ַ�ʽ��k����Ϊnull�����쳣
		
		
	}

}
