package jiangtang.com.f��switch��֧���;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float grades = scanner.nextFloat();
		
		switch ((int)grades/10) {//���ɼ���10��ǿ��ת����int�ͣ���9.5��ת����9������
		
		case 9:case 10:
			System.out.println("����");
			break;
		case 7:case 8:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
			break;

		default:
			System.out.println("������");
		}
		
		double a = 95.5;
		int c = ((int)a)/10;
		System.out.print(c);
	}

}
