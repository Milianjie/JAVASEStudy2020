package jiangtang.com.e��if�����������;

/*
 *     ����
 *     1.ϵͳ�����˵����䡣[1-100]
 *     2.ϵͳ��������ͨ���˵����䣬���ж�����˴����ĸ������׶�
 *     [1-5]  ����
 *     [6-16]  ����
 *     [17-25]  ������
 *     [26-35]  ����
 *     [36-60]  ����
 *     [61-100]  ����
 */



import java.util.Scanner;
public class Practice {
	
	public static void main(String[] args){
		 
		Scanner scanner=new Scanner(System.in);
		
		int i=scanner.nextInt();
		/*
		if (i>100 || i<1){
			System.out.println("����");
		}else if(i>=1 && i<=5){
			System.out.println("����");
		}else if(i<=16){
			System.out.println("����");
		}else if(i<=25){
			System.out.println("������");
		}else if(i<=35){
			System.out.println("����");
		}else if(i<=60){
			System.out.println("����");
		}else if(i<=100){
			System.out.println("����");
		}
		*/
		
		String grade="����";
		if (i>100 || i<1){
			grade="����";
		}else if(i>=1 && i<=5){
			grade="����";
		}else if(i<=16){
			grade="����";
		}else if(i<=25){
			grade="������";
		}else if(i<=35){
			grade="����";
		}else if(i<=60){
			grade="����";
		}
			System.out.println(grade);
		}
	}