package i数组作业武器数组;

/*
 * 战斗机是武器，可移动可发射
 */

public class Fighter extends Weapon implements Moveable,Shootable{
	
	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("战斗机急速飞行");
		
	}
	
	@Override
	public void shoot() {
		// TODO 自动生成的方法存根
		System.out.println("战斗机发射高柳炮弹");
	}

}
