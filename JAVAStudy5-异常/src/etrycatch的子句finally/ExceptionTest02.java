package etrycatch���Ӿ�finally;

/*
 * finally�е������һ����ִ�еļ�ʹ���쳣������return
 * ���ǰ����������return�ĳ�System.exit(0)--�˳�JVM,finally�е����Ͳ�ִ����
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		/*
		 * try�����finally��䣬û��catch���ʱ��������ʹ��
		 * ����try���ܵ���ʹ��
		 */
		//�������ִ��˳�������try...,�����finally...,Ȼ��ִ��return
		try {
			
			System.out.println("try...");
			return;
			
		} finally {
			// TODO: handle finally clause
			//finally�е�����Ȼִ��
			System.out.println("finally...");
			
		}
		//try..finally�����try����return���������治���д��룬��Ϊִ�в���
		//System.out.println("wudidjskdjsk");//���ɴ����
	}

}
