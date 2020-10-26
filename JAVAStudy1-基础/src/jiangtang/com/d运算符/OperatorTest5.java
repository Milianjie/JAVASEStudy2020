package jiangtang.com.d运算符;

/*
 *     条件运算符(三目运算符)
 *        ?:
 *        语法：
 *        Boolean表达式 ? 表达式1 : 表达式2
 *        
 *        Boolean表达式的结果是true，那么整个表达是的结果
 *        就是表达式1的结果，反之就是表达式2的结果 
 */


public class OperatorTest5 {
	
	public static void main(String[] args){
		
		//判断以下语句是否编译通过
		boolean sex=true;
		  
		//sex?"boy":"girl";//编译不通过，不是语句
		
		//一定要清楚表达式1.2的结果类型，不然可能在定义整个表达式类型是犯错误
		String result=(sex?"boy":"girl");
		System.out.println(result);
				
	}

}