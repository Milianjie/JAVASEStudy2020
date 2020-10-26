package q枚举类enum;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		//switch语句支持枚举类型
		//switch语句也支持String、int类型，低版本JDK只支持int
		switch (Season.AUTUMN) {
		case SPRING:
			System.out.println("春天");
			break;
			
		case SUMMER:
			System.out.println("夏天");
			break;
			
		case AUTUMN:
			System.out.println("秋天");
			break;
			
		case WINTER:
			System.out.println("冬天");
			break;

		default:
			System.out.println("未匹配到相关季节");
			break;
		}
		
	}

}
