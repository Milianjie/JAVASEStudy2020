package jiangtang.com.i九break语句;

/*
 *   break;语句:
 *           1.可以用在switch语句中，结束分支语句
 *           2.break;语句可以出现在循环当中，默认结束离它最近的循环
 */



public class BreakTest {
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			System.out.println(i);
			if(i==5){
				break;//输出0 1 2 3 4 5 结束的是离它最近的循环
				//return;若break换成return，结束的是main方法
				//输出没有hello world
			
			}
		}
		System.out.println("hello world");
	




/*
 *     深入break
 */

		Outfor: for(int i=5;i>0;i--){
			      for(int j=0;j<i;j++){
				    if(j==2){
				      break Outfor;
				      //可以给循环命名，且break后直接加其名字指定结束某个循环
				     }//continue也类似
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
					System.out.println(i);//结果为0 1 2 3 4 6 7 8 9
					//continue语句可用来结束当前本一次的循环，直接跳过本次循环及Java语句
					//即执行了continue直接执行表达式3，continue后的不执行了
				}
				
			


		
	}	
      
}
