/*
 *     ������δ����������ʹ��
 *     
 */
package b����Ľ�����ʹ��;

class Student {
	
	//����:
	//ѧ��
	int id;//��Ա������ʵ������
			//id�Ƕ��󼶱�ģ��������ж�����ܷ��ʣ�����ʹ����ֱ�ӷ���
	//����
	String name;
	//�Ա�
	boolean sex;
	//����
	int age;
	//סַ
	String addr;
	
	
	//����:
	

}

public class Test01 {
	
	public static void main(String[] args){
		
		//1.��������
		//stu1��һ���ֲ�����������ֲ�����stu1��Student���ͣ�Ҳ����һ����������
		Student stu1 = new Student();//�ؼ���new���þ�����JVM�Ķ�(heap)�ڴ��п���һ��Student���͵Ŀռ�
		                           //��ռ����ж��󣬶�stu1�洢���Ƕ�����ڴ��ַ��stu1�ƣ�����
									//ͨ�������á���ӷ��ʶ��еĶ���
		//һ������Դ����������
		//Student stu2 = new Student();
		
		//2.ʹ�ö���
		//���ʳ�Ա����(ʵ���������Ǿ�̬����)������ʹ��"����."
		
		//name�ǳ�Ա������������أ��������ж�����ܷ��ʣ���ʹ��"����."
		//ERROR ��System.out.println(Student.name);
		
		//��ȡ����
		System.out.println("id="+stu1.id);//0
		System.out.println("name="+stu1.name);//null
		System.out.println("age="+stu1.age);//0
		System.out.println("sex="+(stu1.sex?"��":"Ů"));//false
		
		/*
		 * ����ϵͳĬ��ֵ
		 *              ������������
		 *              byte short int long   0
		 *              float double   0.0
		 *              boolean    false
		 *              char    \u0000
		 *              
		 *              ������������   null
		 */
		//��ֵ����
		
		stu1.id=5664;
		stu1.name="ksjdkjs";
		stu1.age=54516;//��Ȼ�������ͨ��������������ʵ��ҵ���߼�
		stu1.sex=true;
		
		//��ȡ����
				System.out.println("id="+stu1.id);//5664
				System.out.println("name="+stu1.name);//ksjdkjs
				System.out.println("age="+stu1.age);//54516
				System.out.println("sex="+(stu1.sex?"��":"Ů"));//true
				
				
		
	}

}
