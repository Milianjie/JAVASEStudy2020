/*
 *   ���� ��Ա�ڲ���
 *       1. ��Ա�ڲ�����Ե�ͬ���� ��Ա����
 *       
 *       �ڲ�����Ҫ���ã����Է����ⲿ���е�˽������
 *       
 *       2. ��Ա�ڲ������ֱ�ӷ����ⲿ�����е�����
 *       
 *       3.��Ա�ڲ����в����о�̬����
 */
package u��Ա�ڲ���;

public class OutClasscy {
	
	//��̬����
	private static String s1 = "A";
	
	//��Ա����
	private String s2 = "B";
	
	//��̬����
	private static void m1(){
		System.out.println("static's m1 method excuted!");
	}
	
	//��Ա����
	private  void m2(){
		System.out.println("m2 method excuted!");
		}
	
	    //��̬�ڲ���
		//�����÷��ʿ���Ȩ�޵����η�����
		//public private protected ȱʡ
	 class InnerClass{
			
			//���ܶ��徲̬����
			//public static void m3(){}
			
			
			//��Ա����
			public void m4(){
				//���ʾ�̬����
				System.out.println(s1);
				m1();
				//���ʳ�Ա����
				System.out.println(s2);
				m2();
			}
		
	}
		public static void main(String[] args){
			
			//��Ա�ڲ����൱�ڳ�Ա������Ҫ�����봴���ⲿ�����
			//�����ⲿ�����
			OutClasscy oc = new OutClasscy();
			
			//�ڲ������ٷ��ʳ�Ա������Ҫ��������
			InnerClass inner =oc.new InnerClass();
			//InnerClass inner = new InnerClass();
			//û���κ����� OutClasscy �����ʵ���ɷ��ʡ����������� OutClasscy �����ʵ�������磬x.new A()������ x �� OutClasscy ��ʵ�������޶����䡣
			inner.m4();
			
		}

}

