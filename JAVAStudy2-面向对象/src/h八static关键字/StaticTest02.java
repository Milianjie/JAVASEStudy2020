/*
 *   ����ʵ������
 *         1.ÿһ�ε��ù��췽��֮ǰִ��һ�Σ�����n�Σ���ִ��n��
 *         2.ʵ������ִ��˳��Ҳ�����϶���
 */
package h��static�ؼ���;

public class StaticTest02 {
	
	//��̬����
	static{
		System.out.println('A');
	}
	
	//ʵ������
	{
		System.out.println('1');
	}
	{
		System.out.println('2');
	}
	{
		System.out.println('3');
	}
	{
		System.out.println('4');
	}
	//���
	public static void main(String[] args){
		    new StaticTest02();//�����˹��췽�����С����
		    new StaticTest02();
		    new StaticTest02();
	}
	
	//���췽��
	StaticTest02(){
		System.out.println("StaticTest02ִ���޲������췽��");
	}

}
