package jiangtang.com.b�����ķ���;

/*
 * ���ݳ��ֵ�λ�ÿ��Խ�������Ϊ����
 * �ֲ��������ڷ������������ı�����������ʽ�����б�
 * ��Ա�������������У�������֮�������ı���ͳ�Ƴ�Ա����
 */

public class VarTest {
	
	    //��Ա����
		int i=10;
		
		//��Ա����
		int m;//��ʱm��ϵͳĬ�ϸ�ֵΪ0
		
		public void m1(int m){//mҲ�Ǿֲ�����
			int k=1;
		}

		public void m2(){
			System.out.println(m);//mֵΪ0
		}
		public static void main(String[] args){
			VarTest vt=new VarTest();
			vt.m2();
			
		}

}
