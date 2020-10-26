package jiangtang.com.h八while循环语句;

/*
 *      关于while循环
 *      语法:
 *           while(bollean表达式){
 *                Java语句;
 *           }
 */


public class WhileTest {
	
	public static void main(String[] args){
		
		//死循环
		/*while(true){
			System.out.println("神之力量无敌");
		}*/
		
		/*
		int i=0;
		while(i<10){
			i++;
			System.out.println(i);//输出1 2 ... 9 10
		}*/
		
		int i=0;
		while(i<10){
			
			System.out.println(i);//输出0 1 ... 8 9
			i++;
	}





/*
 *     do..while..
 *     语法:
 *          do{
 *             java语句;
 *          }while(boolean表达式);
 *          该循环执行的次数是1-N次
 */

		int j=0;
		do{
			j++;
			System.out.println(j);
			//++i放这输出不一样
		}while(j<10);
	}

}
