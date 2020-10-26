package etrycatch的子句finally;

/*
 * finally中的语句是一定会执行的即使有异常还是有return
 * 但是把下面代码中return改成System.exit(0)--退出JVM,finally中的语句就不执行了
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		/*
		 * try语句与finally语句，没有catch语句时可以联合使用
		 * 但是try不能单独使用
		 */
		//下面代码执行顺序，先输出try...,再输出finally...,然后执行return
		try {
			
			System.out.println("try...");
			return;
			
		} finally {
			// TODO: handle finally clause
			//finally中的语句必然执行
			System.out.println("finally...");
			
		}
		//try..finally语句中try中有return，语句块下面不能有代码，因为执行不到
		//System.out.println("wudidjskdjsk");//不可达代码
	}

}
