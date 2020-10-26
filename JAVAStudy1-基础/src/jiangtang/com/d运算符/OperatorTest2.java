package jiangtang.com.d运算符;
/*
 *    布尔运算符
 *         &  逻辑与     两边都是true，结果就是true
 *         |  逻辑或     只要有一边是true，结果就是true
 *         !  取反     !true-->false
 *         ^  逻辑异或     两边只要不一致，就是true
 *         
 *         &&  短路与     用法和&一样
 *         ||  短路或     用法和|一样
 *         
 *         布尔类型两边的算子必须是布尔类型（即true或false的类型），结果也必须是布尔类型
 */

public class OperatorTest2 {
	     public static void main(String[] args){
	    	 
	    	 //关于短路与
	    	 int a=10;
	    	 int b=10;
	    	 System.out.println(a<b & a++>=b);
	    	 System.out.println(a);//11
	    	 
	    	 //短路：后面那个表达式不执行
	    	 //什么时候发生短路与？第一个算子是false的时候
	    	 //什么时候发生短路或？第一个算子是true的时候
	    	 System.out.println(b<a || b++>=a);
	    	 System.out.println(b);//10
	    	
	     }

}


