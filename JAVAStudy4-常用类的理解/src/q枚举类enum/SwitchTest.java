package qö����enum;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		//switch���֧��ö������
		//switch���Ҳ֧��String��int���ͣ��Ͱ汾JDKֻ֧��int
		switch (Season.AUTUMN) {
		case SPRING:
			System.out.println("����");
			break;
			
		case SUMMER:
			System.out.println("����");
			break;
			
		case AUTUMN:
			System.out.println("����");
			break;
			
		case WINTER:
			System.out.println("����");
			break;

		default:
			System.out.println("δƥ�䵽��ؼ���");
			break;
		}
		
	}

}
