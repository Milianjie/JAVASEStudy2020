package i������ҵ��������;

/*
 * 		����
 */
public class Army {
	
	/*
	 * ���ӵ�һ�����ԣ��������ж��֣���������ʽ����
	 */
	private Weapon[] weapons;
	
	/*
	 * �޲����Ĺ������ӹ��췽��
	 */
	public Army() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**
	 * 
	 * @param count ��������
	 */
	public Army(int count) {
		// TODO �Զ����ɵĹ��캯�����
		//��̬��ʼ��������ÿһ��Ԫ��Ĭ��ֵΪnull
		weapons = new Weapon[count];
	}
	
	/**
	 * ��������������
	 * @param weapon
	 * @throws WeaponIndexOutOfBoundsException 
	 */
	public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundsException {
		
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[weapons.length-1]==null) {
				
			}
			if (null == weapons[i]) {
				weapons[i] = weapon;
				return;
			}
		}
		//�������ִ�е���˵������û����ӳɹ����׸��쳣,���ҷ���forѭ������
		throw new WeaponIndexOutOfBoundsException("�����Դﵽ����");
		
	}
	
	/**
	 * �����пɹ�������������
	 */
	public void attackAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Shootable) {
				//���������е����з���������ת��
				Shootable shootable = (Shootable)weapons[i];
				shootable.shoot();
			}
		}
	}
	
	
	/**	
	 * �����п��ƶ��������ƶ�
	 */
	public void moveAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Moveable) {
				//���������е����з���������ת��
				Moveable moveable = (Moveable)weapons[i];
				moveable.move();
			}
			}
	}
	
}
