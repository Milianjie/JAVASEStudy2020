package jiangtang.com.g��forѭ�����;

/*
 *     forѭ��
 *     �﷨��
 *          for(���ʽ1;���ʽ2;���ʽ3){
 *                 java���;
 *          }
 *          
 *          ���ʽ1�ǳ�ʼ�����ʽ������ִ�У�ִֻ��һ��
 *          ���ʽ2������Boolean���ͱ��ʽ��
 *          
 *          forѭ����ʼִ�У���ִ�б��ʽ1��ִֻ��һ�Σ�
 *          �����жϱ��2�Ľ���������true����ִ��java��䣬
 *          ��ִ�б��ʽ3��Ȼ����ת�����ʽ2�ж�true��false��һֱѭ��
 *          ֱ�����ʽ2Ϊfalse������forѭ������
 */


public class ForTest {
	
	public static void main(String[] args){
		 
		//��ѭ��
		/*for(;;){
			System.out.println("Good");
		}�ó��������ʽ�����Ǳ�Ҫ��*/
		
		for(int i=0;i<10;i++){
			System.out.println("i="+i);
		}
		
		int k;
		for (k=0;k<1953;k+=10){
			System.out.println("k="+k);
		}
	




/*
 *     ����for��Ƕ��
 *          
 *          ���еĿ�����䶼����Ƕ����һ��ʹ��
 */

/*
 *     ����for��Ƕ��
 *          
 *          ���еĿ�����䶼����Ƕ����һ��ʹ��
 */


		
		for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(i*j+" ");
			
			}
			//����
			//System.out.println();
			System.out.println("\n");
		}
	}

}
