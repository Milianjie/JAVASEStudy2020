package hģ�������첽�̶߳�һ���˻�ȡ��;

/*
 * ����һ���˻��࣬��˽�е��˻��������� һ��ȡ��ķ���
 * 	���ﲻʹ���߳�ͬ�����ƣ����̶߳Ը��˻�����ȡ�������̰߳�ȫ����
 */

public class Account {
	
	//���п��˺�
	private String actno;
	
	//���
	private double balance;

	public Account() {
		super();
	}
	

	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [actno=" + actno + ", balance=" + balance + "]";
	}


	public String getActno() {
		return actno;
	}


	public void setActno(String actno) {
		this.actno = actno;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalanc(double balance) {
		this.balance = balance;
	}
	
	/**
	 * ����һ��ȡ��ķ���
	 * @param money	ȡ����
	 */
	public void getMoney(double money) {
		
		//ȡ֮ǰ�����
		double before = this.balance;
		
		//ȡǮ������
		double after = before - money;
		
		//���������߳�˯��һ��Ļ�����һ��������̰߳�ȫ����,���߿��ܳ�������
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}
				
		//�������������˻�,�����ǰ�̻߳�û��ִ��������룬��һ���첽�߳̿�ʼ���ø�ȡ������ͻ����
		this.balance = after;
		
		
	}
	
	

}
