/*
 *   ��ε��ò���ͬһ�����е��ࣺimport
 *   
 *      1.import����������������
 *      2.import���ֻ�ܳ�����package���֮�£�
 *        class��������֮��
 *        
 *      3.java.lang;������������಻��Ҫ�ֶ����룬ϵͳ�Զ����룬��Object��
 *      
 *      4.
 */
package s��package���1;


import java.util.Date;

import s��package���2.User;

public class Test01 {
	
	//���
	public static void main(String[] args){
		
		//��û������import��䣬���鷳
		s��package���2.User u = new User();
		System.out.println(u);//com.bjpowernode.javase.day05.User@663d0426
		
		//����import��䣬ֱ����User������
		User u1 = new User();
		System.out.println(u1);//com.bjpowernode.javase.day05.User@2fdb8f3a
		
		Object o = new Object();
		System.out.println(o);//java.lang.Object@5bf6b81c
		
		Date t = new Date();//��������ַ���������˵Date������д��toString����
		System.out.println(t);//Wed Sep 25 18:16:54 CST 2019
	}

}
