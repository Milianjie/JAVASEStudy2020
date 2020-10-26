package jiangtang.com.e五if条件控制语句;

/*
 *      条件控制语句(流程控制语句)if...else
 *      语法：
 *          第一种结构：
 *           if(boolean表达式){
 *                java语句;
 *           }
 *           
 *           第二种结构：
 *            if(boolean表达式){
 *                java语句;
 *           }else{
 *                java语句;             
 *           }
 *           
 *           第三种结构：
 *            if(boolean表达式){
 *                java语句;
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }
 *           
 *           第四种结构：
 *           if(boolean表达式){
 *                java语句;
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else if(boolean表达式){
 *                java语句;             
 *           }else{
 *                java语句;
 *           }
 *           注意：在if语句中只要有一个分支执行，则整个if语句结束
 *           上面的第二和第四结构可以保证一定有一个分支语句执行，因为他们都有else语句
 */



public class IfTest {
	   
	 	public static void main(String[] args){
	 		
	 		boolean isSuccess=true;
	 		if(isSuccess){
	 			System.out.println("登录成功");
	 		}else {
 				System.out.println("登录失败");
 			}
	 		
	 		if(isSuccess)//分支语句中，如果只有一条java语句，可把{}去掉
	 			          // 不推荐这样写，能看懂别人这样就够了，这样可读性不高
	 			System.out.println("登录成功");
	 		else 
 				System.out.println("登录失败");
 			
	 	}
	 	
}
