/*
 *   ����û�и��������ָ����������
 */
package e��������������;

public class Test01 {
	 
	  public static void main(String[] args){
		  
		  //u1�����ã������ڴ��ַָ����еĶ���
		  User u1=new User();
		  
		  u1=null;//��null��ֵ��u1������ִ�е��˴�ʱu1����ָ����еĶ���
		          //����ͳ�������
		  
		/*��ʱ��һ���յ�����u1ȥ���ʳ�Ա����������ֵ����
		 * System.out.println(u1.name);//java.lang.NullPointerException(��ָ���쳣)
		 */
		  
		  Star s=new Star();
		 // s = null;
		  s.sing();
	  }

}
class  Star{//����һ���಻��Ҫ���ţ��޲���
	
	public void sing(){//����һ����Ա����
		
		System.out.println("sing a song");
	}
	
}