package i������ҵ��������;

/*
 * ս���������������ƶ��ɷ���
 */

public class Fighter extends Weapon implements Moveable,Shootable{
	
	@Override
	public void move() {
		// TODO �Զ����ɵķ������
		System.out.println("ս�������ٷ���");
		
	}
	
	@Override
	public void shoot() {
		// TODO �Զ����ɵķ������
		System.out.println("ս������������ڵ�");
	}

}
