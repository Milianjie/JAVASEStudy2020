package jiangtang.com.d�����;

public class OperatorTest3 {
	
	/*
	 *     ���ڸ�ֵ�����
	 *         �����ĸ�ֵ�����
	 *            =
	 *            
	 *         ��չ�ĸ�ֵ�����
	 *            +=   ׷��
	 *            -=
	 *            *=
	 *            /=
	 *            
	 *          += ���ӣ�
	 *          int i=10;
	 *          i += 10;  �൱��i = i+10;
	 *            
	 */


		public static void main(String[] args){
			
			//������ֵ�����
			int i=10;
			System.out.println(i);//10
			
			//׷��
			i += 10;
			System.out.println(i);//20
			
			//-=
			i-=5;
			System.out.println(i);//15
			
			//*=
			i*=3;
			System.out.println(i);//45
			
			///=
			i/=15;
			System.out.println(i);//3
			
			//%=
			i%=2;
			System.out.println(i);//1
			
			//������ֵ���������չ��ֵ�����������
			byte b=10;
			
			//���´�����벻ͨ������Ϊ��������int���ͣ���=ǰ����byte����
			//i = i+10;
			
			//���¿ɱ���ͨ��
			//�﷨����չ��ֵ��������ı����������ͣ���������ʧ����
			b += 10;
			System.out.println(b);//20
			
			//����ͨ������������ʧ����
			b+=1000;
			System.out.println(b);//���Ϊ-4
					
			
		}



}
