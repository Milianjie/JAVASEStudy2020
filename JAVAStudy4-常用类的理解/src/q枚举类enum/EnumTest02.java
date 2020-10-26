package q枚举类enum;

/*
 * 		以下程序使用枚举改造程序
 * 
 * 		总结：
 * 			1、枚举是一种引用数据类型
 * 			2、枚举类型定义的语法：
 * 				enum 枚举类型名{
 * 					枚举值1,枚举值2,...
 * 				}
 * 			枚举值是常量，但并不需要赋值，直接大写
 * 			3、结果只有两种情况的，建议使用布尔类型
 * 			结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型。
 * 			例如：颜色、四季、星期等都可以使用枚举类型
 */

public class EnumTest02 {
	
	public static void main(String[] args) {
		
		Result value = divide(18, 5);
		System.out.println(value == Result.SUCCESS?"计算成功":"计算失败");
		
	}
	
	/**
	 * (需求)设计者说：以下程序计算俩个int类型数据的商，计算成功返回SUCESS，计算失败返回FAIL
	 * @param a	int类型数据
	 * @param b	int类型数据
	 * @return	计算成功返回SUCESS，计算失败返回FAIL
	 */
	public static Result divide(int a,int b) {
		
		try {
			
			int c = a/b;
			//执行到这表示代码没有发生异常，执行成功
			return Result.SUCCESS;
			
		} catch (Exception e) {
			// TODO: handle exception
			//执行到这表示发生异常，执行失败
			return Result.FAIL;
		}
		
	}


}

enum Result{
	SUCCESS,FAIL
}
