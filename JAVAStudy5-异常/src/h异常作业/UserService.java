package h�쳣��ҵ;

/*
 * 		��д����ģ���û�ע��
 * 			1������ʼִ��ʱ����ʾ�û�����"�û���"��"����"��Ϣ
 * 			2��������Ϣ��java����ģ���û�ע��
 * 			3��ע��ʱҪ�����û���������[6-14]֮�䣬С�ڻ���ڸó��ȶ���ʾ�쳣
 * 
 * ע�⣺���ע��ķ������뵥����һ�����У��쳣���Զ��弴��
 * 		class UserService{
 * 		public void register(String name,String password){
 * 			//��������������ע��
 * 		}
 * }
 * 
 * 		��дmain��������main�����н����û�������Ϣ����main�����е���UserService�е�register�������ע��
 */

public class UserService {
	
	 String userName;
	 String passWord;
	
	public void registter(String name,String password) throws IllegalUserNameException {
		
		//���齫name==null����������������ǰ�棬��Ϊ���nameΪnull����name==nullȴ���ں���
		//name.length()<6||name.length()>14������������ǰ��ͻᱨ��ָ���쳣������Ĵ����
		//ȫ��������ִ����,���Լ�д���쳣Ҳ��������
		if (name == null||name.length()<6||name.length()>14) {
			throw new IllegalUserNameException("�û������Ϸ�������������");
		}
		this.userName = name;
		this.passWord = password;
		
	}

}
