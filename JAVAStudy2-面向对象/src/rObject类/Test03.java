/*
 *  ����java��������αȽ������ַ����Ƿ����  
 *  
 *     ��java�бȽ������ַ����Ƿ�һ�²�����"=="
 *     ֻ�ܵ���String���equals����
 */
package rObject��;

public class Test03 {
	
	public static void main(String[] args){
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);//false
		
		//String�Ѿ���д��Object�е�equals�������Ƚϵ�������
		System.out.println(s1.equals(s2));//true
	}

}
