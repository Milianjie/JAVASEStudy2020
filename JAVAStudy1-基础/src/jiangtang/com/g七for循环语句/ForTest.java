package jiangtang.com.g七for循环语句;

/*
 *     for循环
 *     语法：
 *          for(表达式1;表达式2;表达式3){
 *                 java语句;
 *          }
 *          
 *          表达式1是初始化表达式，最先执行，只执行一次
 *          表达式2必须是Boolean类型表达式。
 *          
 *          for循环开始执行，先执行表达式1，只执行一次；
 *          进而判断表达2的结果，结果是true，则执行java语句，
 *          再执行表达式3，然后再转到表达式2判断true或false；一直循环
 *          直到表达式2为false，整个for循环结束
 */


public class ForTest {
	
	public static void main(String[] args){
		 
		//死循环
		/*for(;;){
			System.out.println("Good");
		}得出三个表达式都不是必要的*/
		
		for(int i=0;i<10;i++){
			System.out.println("i="+i);
		}
		
		int k;
		for (k=0;k<1953;k+=10){
			System.out.println("k="+k);
		}
	




/*
 *     关于for的嵌套
 *          
 *          所有的控制语句都可以嵌套在一起使用
 */

/*
 *     关于for的嵌套
 *          
 *          所有的控制语句都可以嵌套在一起使用
 */


		
		for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(i*j+" ");
			
			}
			//换行
			//System.out.println();
			System.out.println("\n");
		}
	}

}
