
/*
 *   ���ھ�̬�ڲ���
 *       1.��̬�ڲ�����Ե�ͬ������̬����
 *       
 *       �ڲ�����Ҫ���ã����Է����ⲿ���е�˽������
 *       
 *       2.��̬�ڲ������ֱ�ӷ����ⲿ��˽�еľ�̬���ݣ��޷����ʷǾ�̬����
 */
package u��̬�ڲ���;

public class OutClassjt {
	
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
		static class InnerClass{
			
			//���徲̬����
			public static void m3(){
				
				System.out.println(s1);
				m1();
				//System.out.println(s2);
				//m2();
			}
			
			
			//��Ա����
			public void m4(){
				System.out.println(s1);
				m1();
			}
		
	}
		public static void main(String[] args){
			
			//���þ�̬����m3��ֱ������.
			OutClassjt.InnerClass.m3();
			
			//���ó�Ա����m4,��������
			InnerClass inner = new OutClassjt.InnerClass();
		    inner.m4();
			
		}

}

