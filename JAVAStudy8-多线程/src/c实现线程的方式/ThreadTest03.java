package cʵ���̵߳ķ�ʽ;

/*
 * ���������ڲ���ķ�ʽʵ�ֶ��̣߳�
 * 		�����ڲ��ࣺ�����û�����֣�ֱ������Ҫ��һ������Ĳ���λ�� (new �ӿ���(){ʵ�ֽӿڵķ���})
 */

public class ThreadTest03 {	
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				for(int i = 0; i<20; i++) {
					System.out.println("��֧�߳�-->"+i);
				}
				
			}
		});
		
		thread.start();
		
		for(int i = 0; i<20; i++) {
			System.out.println("���߳�-->"+i);
		}
		
		
	}

}
