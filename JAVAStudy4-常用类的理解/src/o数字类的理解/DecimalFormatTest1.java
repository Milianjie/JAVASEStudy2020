package o����������;

import java.text.DecimalFormat;

/*
 * 		�������ָ�ʽ�����˽⣩
 */

public class DecimalFormatTest1 {
	
	public static void main(String[] args) {
		
		//java.text.DecimalFormatר�Ÿ�����������ְ�ָ����ʽ���и�ʽ���������ڵĸ�ʽ��ԭ��һ��
				//DecimalFormat dFormat = new DecimalFormat("������������ָ�ʽ");
			
				/*
				 * ���ָ�ʽ���ţ�
				 * 			#   ������������
				 * 			,   ����ǧ��λ
				 * 			.	����С����
				 * 			0     �������������û��������ʽ�з���λ�ò�0
				 * 
				 * 			##,###.##   ��ʾ������ǧ��λ��������λС��
				 */
			
			DecimalFormat df1 = new DecimalFormat("###,###.##");
			String s1 = df1.format(1124.1515);
			System.out.println(s1);//1,124.15
			
			DecimalFormat df2 = new DecimalFormat("###,###.0000");//����4��С��λ��������0
			System.out.println(df2.format(3140.22));//3,140.2200

		
	}
		
}
