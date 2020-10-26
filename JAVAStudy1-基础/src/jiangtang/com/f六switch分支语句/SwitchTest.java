package jiangtang.com.f六switch分支语句;

import java.util.Scanner;

/*
 *       关于switch语句
 *           1.语法
 *              switch(int类型){
 *                 
 *              case int类型:
 *                   java语句;
 *                   java语句;
 *                   break;
 *                   
 *              case int类型;
 *                   java语句;
 *                   java语句;
 *                   break;
 *                   
 *              case int类型;
 *                   java语句;
 *                   java语句;
 *                   break;
 *                   
 *               default:
 *                   java语句;
 *              }
 *              注意：思路是，switch的int类型与第一个case的int类型匹配，成功的话
 *                    就执行其中的语句，遇到break，停止执行程序；如没有break，不用
 *                    匹配第二个case的int类型直接执行第二个的语句；
 *                    当无法匹配所有case的int类型时就执行default的语句
 *                    
 *                    break;语句可以没有，但是有的话，只要程序执行碰到break下面的
 *                    case中的语句就不执行了；没有的话，就发生case穿透现象；
 *                    default 语句也可以没有
 *                    
 *                    switch后面的括号中可以填byte/short/char类型，因为可自动转换成int类型
 *                    
 *                    
 */



public class SwitchTest {
	     
	    public static void main(String[] args){
//	    	错误示范
//	    	long a=1000L;
//	    	switch (a){
//	    	case 100:
//	    		System.out.println("good");
//	    	}
//	    	
	    	Scanner scanner = new Scanner(System.in);
	    	String c =scanner.next();
	    	switch(c){
	    	
	    	/*
	    	case 'A':
	    		System.out.println("优秀");
	    		break;
	    		
	    	case 'B':
	    		System.out.println("良好");
	    		break;
	    		
	    	case 'C':
	    		System.out.println("及格");
	    		break;
	    		
	    	case 'D':
	    		System.out.println("不及格");
	    		break;
	    		
	    		default:
	    		System.out.println("不及格");
	    		//输出为“良好”-->当char='B'
	    		 *       优秀-->当char='A'
	    		*/
	    		
	    	
	    	
	    		//case穿透
		   /* 	case 'A':
		    		System.out.println("优秀");
		    		
		    		
		    	case 'B':
		    		System.out.println("良好");
		    		
		    		
		    	case 'C':
		    		System.out.println("及格");
		    		break;
		    		
		    	case 'D':
		    		System.out.println("不及格");
		    		break;
		    		
		    		default:
		    		System.out.println("不及格");
		    		*/
		    		/*输出为：
		    		 *           良好
		    		 *           及格
		    		 */
		    		  
	    	
	    	//case可以合并
	    	case "A":case "B":case "C":
	    		System.out.println("优秀");
	    		break;
	    		
	    	case "D":
	    		System.out.println("不及格");
	    		//输出为：优秀-->当char='A' or 'B' or 'C'
	    		//        不及格-->当char='D' or 其他
	    	}
	    	
	    }

}
