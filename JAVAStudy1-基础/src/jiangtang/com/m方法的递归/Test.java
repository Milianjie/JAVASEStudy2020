package jiangtang.com.m�����ĵݹ�;

/*
 *   ��ʹ�õݹ����1-N�����
 */

public class Test {
	
	 public static void main(String[] args){
		
		 //�ǵݹ�
		 int n=1999;
		 int A=m1(n);
		 System.out.println(A);
		 
		 //�ݹ�
		 int m=1999;
		 int B=m1(m);//ʹ�ø÷������1-N�����
		 System.out.println(A);
		 
	 }
	 
	 //�ǵݹ�
	 public static int m1(int n){
		 int sum=0;
		 for(int i =1;i<=n;i++){
			 sum+=i; 
		 }
		 return sum;
	 }




/*
 *   ʹ�õݹ����1-N�����
 */
	 //�÷������1-N�����
	 public static int m2(int m){
		 if (m==1){
			 return 1;
		 }else{
			 return m+m2(m-1);
		 }
		 
	 }

}
