package jiangtang.com.d�����;

public class OperatorTest1 {
		
		public static void main(String[] args){
			
			int a=10,b=3;
				System.out.println(a+b);//13
				System.out.println(a-b);//7
				System.out.println(a/b);//3
				System.out.println(a*b);//30
				System.out.println(a%b);//1
			
			//����++
			int m=10;
				m++;
				System.out.println("m="+m);//11
				
			int s=10;
				System.out.println("s="+s);
				++s;
				System.out.println("s="+s);
			
			//++�����ڱ����ĺ���
			int k=10;
			int e=k++;//�����ں��棬k�ȸ�ֵ���Լ�1
		    	System.out.println("k="+k);//11
		    	System.out.println("e="+e);//10
			
			//++�����ڱ���ǰ��
			int i=10;
			int d=++i;//�ڱ���ǰ��i���Լ�1�ٸ�ֵ��d
				System.out.println("i="+i);
				System.out.println("d="+d);
		}	


}
