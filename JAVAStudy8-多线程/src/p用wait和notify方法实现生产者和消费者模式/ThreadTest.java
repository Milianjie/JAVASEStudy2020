package p��wait��notify����ʵ�������ߺ�������ģʽ;

import java.util.ArrayList;
import java.util.List;

/*
 * ����wait��notify����ʵ�������ߺ�������ģʽ��
 * 	1����ʲô�������ߺ�������ģʽ��
 * 		�����̸߳��������������̸߳�������
 * 		���������������߳�֮��Ҫʵ�־���
 * 		����һ�������ҵ��������������Ҫʹ�õ������wait��notify����
 * 
 * 	2��wait��notify���������̶߳���ķ�������ÿ��java�����еķ���
 * 
 * 	3��wait��notify�����ǽ������߳�ͬ���Ļ����ϡ����߳�Ҫ����ͬһ���ֿ⣬���̰߳�ȫ����
 * 
 * 	4����wait�������á�o.wait()ʹ���o�����ϵ��߳�t�������õȴ�״̬�����ҽ�t�߳���ռ�е�o���������й黹��Ȼ����Ѱ��ռ�ж�����
 * 
 * 	5����notify�������á�o.notify()ʹ��o�����ϵȴ��������̣߳�������t�̺߳͵�ǰ�̣߳����ѣ��������ص㣩���õȴ���t�߳̿�ʼ
 * 						Ѱ��o�������ռ����Ȼ�������̣߳��÷��������ͷŵ�ǰ�߳���ռ�е�o��������������ڻ���������o����
 * 						�ϵȴ��ģ�t���̺߳󣬵�ǰ�̼߳������У�ֱ������ĳ�������߳�ִ����wait������Ȼ��ǰ�߳̿�ʼ�ȴ�
 * 						�����ͷ�o���������ʹ��t�߳��ҵ�o����������ʼִ���߳��еĴ��롣
 * 	
 * 	7��ģ��һ������
 * 		��List������Ϊ�ֿ�
 * 		����List������ֻ�ܴ洢һ��Ԫ��
 * 		һ��Ԫ�ؾͱ�ʾ�ֿ�����
 * 		��List��Ԫ�ظ���Ϊ0�ͱ�ʾ�ֿ����
 * 		��֤�ֿ�List�еĴ洢��Ԫ�����ֻ�ܴ�һ��
 * 
 * 		����һ���߳�����һ���߳����Ѵﵽ����Ч��
 * 
 * ������ԭ����������������߳���������list����������ʼ����ͬ��������룻ִ��if��䣬�жϼ���list����ʱ����Ԫ��Ϊ0
 * 				ִ�����������䣺�������󣬲��ҽ��ö�����ӽ����ϣ�Ȼ��ִ��notify������������list���϶���
 * 				�ϵȴ����̣߳���Ȼ����û�У������߳�����Ҳ���ѵģ����ڿ���ͬ������������Ѱ��list��������أ�����Ϊnotify
 * 				�����ǲ��ͷ����ģ����Է�������ѭ�����ж�list���ϣ���ʱ������������ִ�������wait�����������߳�
 * 				����ȴ����黹list���϶����������ʱ�����߳��õ�����ʼִ��ͬ�������еĴ��룺�ж�list�����Ƿ�Ϊ0������
 * 				��Ȼ���ǣ�ִ�����������䣬ɾ����һ��Ԫ�أ�0С�꣩��������list���϶����ϵȴ��������̣߳�����ֻ�е�ǰ�������̣߳���
 * 				��ʱ�����߳̿���ռ�����ˣ����������������߳��ϣ������̼߳���ִ�У���ʼѭ�����жϼ���list��Ϊ0��ִ��wait��������ǰ�߳�
 * 				����ȴ����ͷ�list���϶�������������߳��õ�....;����ѭ��
 * 				����һ������һ��
 * 
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		Thread thread1 = new Producter(list);
		Thread thread2 = new Consumer(list);
		
		thread1.setName("�����߳�");
		thread2.setName("�����߳�");
		
		thread1.start();
		thread2.start();
	}

}

//�����߳�
class Producter extends Thread{
	
	//����Ĳֿ�
	List list;
	
	
	
	public Producter() {
		super();
	}



	public Producter(List list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		//һֱ����������ѭ��ģ��
		while (true) {
			// Ϊ���������߳�ֻ��һ�����жϼ����е�Ԫ�ظ������Ӷ���ĳ���߳��Ƚ���ȴ�״̬
			//�����������߳�һ���жϣ�����һ���߳���ס���϶��󣬲�Ȼ���������߳��е��ж����
			//�ͻ�һ�����ȴ�״̬���Ӷ������̰߳�ȫ���⣬����synchronizedӦ�����£�
			synchronized (list) {
				if (list.size()>0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				
				Object object = new Object();
				list.add(object);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"��������-->"+object);
				
				//������list���϶����ϵȴ����̣߳�������ǰ�߳�
				list.notify();
			}
		}
		
		
	}
	
}

//�����߳�
class Consumer extends Thread{
	
	//����Ĳֿ�
	List list;
	
	
	
	public Consumer() {
		super();
	}



	public Consumer(List list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		
		while (true) {
			// Ϊ���������߳�ֻ��һ�����жϼ����е�Ԫ�ظ������Ӷ���ĳ���߳��Ƚ���ȴ�״̬
			//�����������߳�һ���жϣ�����һ���߳���ס���϶��󣬲�Ȼ���������߳��е��ж����
			//�ͻ�һ�����ȴ�״̬���Ӷ������̰߳�ȫ���⣬����synchronizedӦ�����£�
			synchronized (list) {
				if (list.size() == 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				
				Object object = list.remove(0);//�÷������ص��Ǳ�ɾ����Ԫ�ض���
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���Ѷ���-->"+object);
				
				//������list���϶����ϵȴ����̣߳�������ǰ�߳�
				list.notify();
			}
		}
		
		
	}
	
}