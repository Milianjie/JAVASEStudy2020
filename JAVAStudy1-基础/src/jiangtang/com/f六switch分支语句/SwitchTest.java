package jiangtang.com.f��switch��֧���;

import java.util.Scanner;

/*
 *       ����switch���
 *           1.�﷨
 *              switch(int����){
 *                 
 *              case int����:
 *                   java���;
 *                   java���;
 *                   break;
 *                   
 *              case int����;
 *                   java���;
 *                   java���;
 *                   break;
 *                   
 *              case int����;
 *                   java���;
 *                   java���;
 *                   break;
 *                   
 *               default:
 *                   java���;
 *              }
 *              ע�⣺˼·�ǣ�switch��int�������һ��case��int����ƥ�䣬�ɹ��Ļ�
 *                    ��ִ�����е���䣬����break��ִֹͣ�г�����û��break������
 *                    ƥ��ڶ���case��int����ֱ��ִ�еڶ�������䣻
 *                    ���޷�ƥ������case��int����ʱ��ִ��default�����
 *                    
 *                    break;������û�У������еĻ���ֻҪ����ִ������break�����
 *                    case�е����Ͳ�ִ���ˣ�û�еĻ����ͷ���case��͸����
 *                    default ���Ҳ����û��
 *                    
 *                    switch����������п�����byte/short/char���ͣ���Ϊ���Զ�ת����int����
 *                    
 *                    
 */



public class SwitchTest {
	     
	    public static void main(String[] args){
//	    	����ʾ��
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
	    		System.out.println("����");
	    		break;
	    		
	    	case 'B':
	    		System.out.println("����");
	    		break;
	    		
	    	case 'C':
	    		System.out.println("����");
	    		break;
	    		
	    	case 'D':
	    		System.out.println("������");
	    		break;
	    		
	    		default:
	    		System.out.println("������");
	    		//���Ϊ�����á�-->��char='B'
	    		 *       ����-->��char='A'
	    		*/
	    		
	    	
	    	
	    		//case��͸
		   /* 	case 'A':
		    		System.out.println("����");
		    		
		    		
		    	case 'B':
		    		System.out.println("����");
		    		
		    		
		    	case 'C':
		    		System.out.println("����");
		    		break;
		    		
		    	case 'D':
		    		System.out.println("������");
		    		break;
		    		
		    		default:
		    		System.out.println("������");
		    		*/
		    		/*���Ϊ��
		    		 *           ����
		    		 *           ����
		    		 */
		    		  
	    	
	    	//case���Ժϲ�
	    	case "A":case "B":case "C":
	    		System.out.println("����");
	    		break;
	    		
	    	case "D":
	    		System.out.println("������");
	    		//���Ϊ������-->��char='A' or 'B' or 'C'
	    		//        ������-->��char='D' or ����
	    	}
	    	
	    }

}
