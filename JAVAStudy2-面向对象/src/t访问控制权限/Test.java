/*
 *   ���ڷ��ʿ���Ȩ�����η��������࣬���η��������α���
 *   
 *        private��  ֻ���ڱ����з���
 *        
 *        ȱʡʱ��    ���ࡢͬһ�����¿ɷ��ʣ���ͬ�������಻�ܷ��ʣ������˰�Ҳ���ܷ���
 *        
 *        protected��  ����,ͬһ����,ͬһ�����Ͳ�ͬ���µ�����ɷ��ʣ���ͬ�����ܷ��ʣ������˰�Ҳ���ܷ���
 *        
 *        public��  �κεط����ܷ���
 *        
 *        
 */
package t���ʿ���Ȩ��;



class User1{//��ֻ����public��ȱʡ����
	
	//protected����
	protected String name;
	
	//ȱʡ����
	int age;
	
}



 public class Test {
	
	public static void main(String[] args){
		
		User1 u1  = new User1();
		System.out.println(u1.name);//null
		System.out.println(u1.age);//0
		
		}
}
//С�����޷�������ѡ�����û�����������
//����-->��������-->java���г���-->test-->���У��������ÿ�����½ǣ�
