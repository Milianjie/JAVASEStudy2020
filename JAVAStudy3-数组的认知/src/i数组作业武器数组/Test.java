package i������ҵ��������;

public class Test {
	
	public static void main(String[] args) {
		
		//��������
		Army army = new Army(4);
		
		//������ʽ����
		Weapon tank = new Tank();
		Weapon fighter = new Fighter();
		Weapon gaoshepao = new GaoShePao();
		Weapon yunshuji = new YunShuJi();
		
		//�������Ž����ӵ�������������
		try {
			army.addWeapon(tank);
			army.addWeapon(fighter);
			army.addWeapon(gaoshepao);
			army.addWeapon(yunshuji);
		} catch (WeaponIndexOutOfBoundsException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//ʹ�������ƶ��������ƶ�
		army.moveAll();
		
		System.out.println("=============================");
		
		//ʹ�����ܹ�������������
		army.attackAll();
		
	}

}
