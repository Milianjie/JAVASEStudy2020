package i数组作业武器数组;

/*
 * 坦克是武器，能发射也能移动
 */

public class Tank extends Weapon implements Moveable,Shootable{
	
	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("坦克出动");
		
	}
	
	@Override
	public void shoot() {
		// TODO 自动生成的方法存根
		System.out.println("坦克发动炮击");
		
	}

}
