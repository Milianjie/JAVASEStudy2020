package hģ�������첽�̶߳�һ���˻�ȡ��;

import java.awt.Desktop.Action;

/*
 * ������һ������ȡ������߳���
 */

public class MyAccount extends Thread{
	
	//����������Ҫ����һ��������˻�����
	//���ǲ���ֱ���ڸ�����newһ��Account���������ͰѴ���д���ˣ��뻻�˻�ֻ�ܸ�����Ĵ���
	//�������������ﶨ��һ���˻�������ñ����������洫�˻�����������˻����Զ����仯�����
	private Account act;
	
	private double money;
	
	//�ڴ����̶߳����ʱ��һ���˻�����
	public MyAccount(Account act,double money) {
		// TODO �Զ����ɵĹ��캯�����
		this.act = act;
		this.money = money;
	}
	
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		//Ȼ����act�����˻����ȡ���
		act.getMoney(money);
		
		//��ӡȡ����Ϣ.
		System.out.println(Thread.currentThread().getName()+"ȡ����"+money+";"+"�˻�"+act.getActno()+"���Ϊ��"+ act.getBalance());
				
	}

}
