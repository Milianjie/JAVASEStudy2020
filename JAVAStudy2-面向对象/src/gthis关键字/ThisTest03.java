/*
 *    this���������ṩ�ֲ������ͳ�Ա����
 */
package gthis�ؼ���;

public class ThisTest03 {
	
	public static void main(String[] args){
		
		Manager u1 = new Manager();//�����޲����Ĺ��췽����ϵͳĬ�ϸ�ֵname=null
		u1.setManager("���ٽ�");//���˴��ֵ����˸�ֵ����name="���ٽ�"
		System.out.println(u1.getManager());
		
		Manager u2 = new Manager("��仰��˯�����Ͽο��ǼٵļӴ�����");
		System.out.println(u2.getManager());
		
		
	}

}
class Manager{
	
	//Field
	private String name;
	
	//constructor
	Manager(){}
	
	Manager(String name){//�˹��췽��Ҳ��һ����ֵ��䣬�������һ��
		this.name=name;//���Ե��ù��췽�����ٵ���getManager����
	}
	
	//Method
	public void setManager(String name){
		this.name=name;//�Ӹ�this.��֪��ǰ���name�ǳ�Ա������
	}
	public String getManager(){
		return name;//�˴���this.����ʡ��
	}
}