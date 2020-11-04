package oʵ���̵߳ĵ����ַ�ʽ;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 	�������ַ�ʽʵ���̡߳�ʵ��Callable�ӿڣ������ַ�ʽʵ�ֵĽӿڿ��Եõ��̵߳ķ���ֵ����˵ִ�н�������巽ʽ����
 */

public class ThreadTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//�½�һ��δ����������󣬹��췽����Ҫ��һ��Callable���󣬵�ȻҲ���Դ�Runnable��������޷���ȡ����ֵ
		//Callable�ӿ��޷�new��������Ҫ��һ���ýӿڵ�ʵ������󣬿�����дһ����ʵ�֣�Ҳ�����������ڲ��෽ʽ
		FutureTask task = new FutureTask<>(new Callable() {
			@Override
			public Object call() throws Exception {//�����൱��run������д��Ҫִ�еĴ��룬ֻ���������з���ֵ
				// TODO �Զ����ɵķ������
				//ģ������
				System.out.println(Thread.currentThread().getName()+"call method-->Bigin!");
				Thread.sleep(1000*5);
				System.out.println(Thread.currentThread().getName()+"call method-->End!");
				int a = 5;
				int b = 5;
				return a+b;//��a+b�Զ�װ�䣬תΪInteger
			}
		});
		
		//��task�������Ž��̶߳���
		Thread thread = new Thread(task);
		
		thread.setName("�����ַ�ʽʵ���߳�");
		
		//�����߳�
		thread.start();
		
		Object obj = null;
		//�����main���߳��л�ȡ��һ���̵߳ķ���ֵ?��get����
		try {
			obj = task.get();//��Ϊ�������ߴ��л�ȡ����ֵ����������δ���ִ��������ִ������Ĵ��룬��get������Ҫ����һ���߳�ִ��������
									//��ȡ����ֵ�������������������main�̣߳�Ч�ʱ�͡����ŵ�ȴ�����õ��̵߳�ִ�н��
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(thread.getName()+"ִ�н����"+obj);
		
		System.out.println("hello world!");
		
	}

}
