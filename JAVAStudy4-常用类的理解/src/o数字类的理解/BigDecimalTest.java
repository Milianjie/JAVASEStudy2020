package o����������;

import java.math.BigDecimal;

/*
 * 		1��BigDecimal ���ڴ����ݣ����ȼ��ߡ��䲻���ڻ����������ͣ�����Java����(������������)
 * 		   ����SUN�ṩ��һ���࣬���ڲ����������
 * 		2�����������double�ǲ����õģ�������java.math.BigDecimal
 * 
 * 		
 */

public class BigDecimalTest {
	
	public static void main(String[] args) {
		//�ⲻ����ͨ��100�����Ǿ��ȼ��ߵ�100
		BigDecimal v1 = new BigDecimal(100);
		
		BigDecimal v2 = new BigDecimal(200);
		
		//��Ͳ���v1+v2����Ϊv1��v2������
		BigDecimal v3 = v1.add(v2);//���÷������мӼ��˳�
		System.out.println(v3);//300   BigDecimal��������дtoString
		
	}

}
