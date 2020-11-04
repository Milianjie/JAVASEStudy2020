package i同步线程对账户取款;

/*
 * 这里是一个调用取款方法的线程类
 */

public class MyAccount2 extends Thread{
	
	//在这里我们要定义一个共享的账户对象
	//但是不能直接在该类中new一个Account对象，这样就把代码写死了，想换账户只能改这里的代码
	//所以我们在这里定义一个账户类的引用变量，让外面传账户对象给它，账户可以多样变化，灵活
	private Account act;
	
	private double money;
	
	//在创建线程对象的时候传一个账户对象
	public MyAccount2(Account act,double money) {
		// TODO 自动生成的构造函数存根
		this.act = act;
		this.money = money;
	}
	
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		//然后用act调用账户类的取款方法
		act.getMoney(money);
		
		//打印取款信息.
		System.out.println(Thread.currentThread().getName()+"取出金额："+money+";"+"账户"+act.getActno()+"余额为："+ act.getBalance());
				
	}

}

