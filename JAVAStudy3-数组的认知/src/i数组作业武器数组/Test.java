package i数组作业武器数组;

public class Test {
	
	public static void main(String[] args) {
		
		//创建军队
		Army army = new Army(4);
		
		//创建各式武器
		Weapon tank = new Tank();
		Weapon fighter = new Fighter();
		Weapon gaoshepao = new GaoShePao();
		Weapon yunshuji = new YunShuJi();
		
		//将武器放进军队的武器库数组中
		try {
			army.addWeapon(tank);
			army.addWeapon(fighter);
			army.addWeapon(gaoshepao);
			army.addWeapon(yunshuji);
		} catch (WeaponIndexOutOfBoundsException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//使所有能移动的武器移动
		army.moveAll();
		
		System.out.println("=============================");
		
		//使所有能攻击的武器攻击
		army.attackAll();
		
	}

}
