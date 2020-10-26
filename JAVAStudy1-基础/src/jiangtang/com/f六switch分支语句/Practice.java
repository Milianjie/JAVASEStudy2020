package jiangtang.com.f六switch分支语句;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float grades = scanner.nextFloat();
		
		switch ((int)grades/10) {//将成绩除10在强制转换成int型，即9.5会转换成9这样子
		
		case 9:case 10:
			System.out.println("优秀");
			break;
		case 7:case 8:
			System.out.println("良好");
			break;
		case 6:
			System.out.println("及格");
			break;

		default:
			System.out.println("不及格");
		}
		
		double a = 95.5;
		int c = ((int)a)/10;
		System.out.print(c);
	}

}
