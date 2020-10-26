package jiangtang.com.m方法的递归;

/*
 *   不使用递归计算1-N的求和
 */

public class Test {
	
	 public static void main(String[] args){
		
		 //非递归
		 int n=1999;
		 int A=m1(n);
		 System.out.println(A);
		 
		 //递归
		 int m=1999;
		 int B=m1(m);//使用该方法完成1-N的求和
		 System.out.println(A);
		 
	 }
	 
	 //非递归
	 public static int m1(int n){
		 int sum=0;
		 for(int i =1;i<=n;i++){
			 sum+=i; 
		 }
		 return sum;
	 }




/*
 *   使用递归计算1-N的求和
 */
	 //该方法完成1-N的求和
	 public static int m2(int m){
		 if (m==1){
			 return 1;
		 }else{
			 return m+m2(m-1);
		 }
		 
	 }

}
