package i数组作业武器数组;

/*
 * 		军队
 */
public class Army {
	
	/*
	 * 军队的一个属性，武器，有多种，以数组形式存在
	 */
	private Weapon[] weapons;
	
	/*
	 * 无参数的构建军队构造方法
	 */
	public Army() {
		// TODO 自动生成的构造函数存根
	}
	
	/**
	 * 
	 * @param count 武器数量
	 */
	public Army(int count) {
		// TODO 自动生成的构造函数存根
		//动态初始化数组中每一个元素默认值为null
		weapons = new Weapon[count];
	}
	
	/**
	 * 将武器加入数组
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
		//如果程序执行到这说明武器没有添加成功，抛个异常,而且放在for循环外面
		throw new WeaponIndexOutOfBoundsException("武器以达到上限");
		
	}
	
	/**
	 * 让所有可攻击的武器攻击
	 */
	public void attackAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Shootable) {
				//调用子类中的特有方法，向下转型
				Shootable shootable = (Shootable)weapons[i];
				shootable.shoot();
			}
		}
	}
	
	
	/**	
	 * 让所有可移动的武器移动
	 */
	public void moveAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Moveable) {
				//调用子类中的特有方法，向下转型
				Moveable moveable = (Moveable)weapons[i];
				moveable.move();
			}
			}
	}
	
}
