package jiangtang.com.i��break���;

/*
 *   break;���:
 *           1.��������switch����У�������֧���
 *           2.break;�����Գ�����ѭ�����У�Ĭ�Ͻ������������ѭ��
 */



public class BreakTest {
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			System.out.println(i);
			if(i==5){
				break;//���0 1 2 3 4 5 �����������������ѭ��
				//return;��break����return����������main����
				//���û��hello world
			
			}
		}
		System.out.println("hello world");
	




/*
 *     ����break
 */

		Outfor: for(int i=5;i>0;i--){
			      for(int j=0;j<i;j++){
				    if(j==2){
				      break Outfor;
				      //���Ը�ѭ����������break��ֱ�Ӽ�������ָ������ĳ��ѭ��
				     }//continueҲ����
				  System.out.println(j);//0 1
			 }
			
		 }
		
			
		
		/*
		 *     continue
		 */
				
				for(int i=0;i<10;i++){
					
					if(i==5){
						continue;
					}
					System.out.println(i);//���Ϊ0 1 2 3 4 6 7 8 9
					//continue��������������ǰ��һ�ε�ѭ����ֱ����������ѭ����Java���
					//��ִ����continueֱ��ִ�б��ʽ3��continue��Ĳ�ִ����
				}
				
			


		
	}	
      
}
