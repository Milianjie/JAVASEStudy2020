package g��������ݽṹ;

/*
 * 		����ģ�ⵥ��������������ݽṹ���������Ԫ�ǽڵ�Node
 * 						  ���ڵ���������˵�����Ľڵ����������ԣ�
 * 				1����һ���Ǵ洢������
 * 				2���ڶ�������һ���ڵ������ڴ��ַ
 */

public class DanLink01 {
	
	//ͷ�ڵ�
	Node01 header = null;
	
	int size;
	
	public int size() {
		return size;
	}
	
	//������ĩβ�����Ԫ�صķ���
	public void add(Object obj) {
		//����һ���µĽڵ����
		//��������ĩβ�ڵ����һ���ڵ��ڴ��ַnull�����½ڵ������ڴ��ַ
		//�п�������ڵ��ǵ�һ����Ҳ���ܵڶ���������....
		
		if (header == null) {
			//˵����û�нڵ�
			//newһ���µĽڵ������Ϊͷ�ڵ㣬��ͷ�ڵ����ͷ����β
			header =new Node01(obj, null);
		}else {
			//˵��ͷ�ڵ��Ѿ�����
			//�ҳ�ĩ�ڵ��next���ԣ��õ�ǰĩ�ڵ��next���½ڵ�
			Node01 currentLastNode = findLast(header);
			currentLastNode.next = new Node01(obj, null);
		}
		size++;
	}
	
	/**
	 * ר�Ų���ĩβ�ڵ�ķ���
	 * @param node �Ӵ���ĸýڵ㿪ʼ��
	 * @return
	 */
	private Node01 findLast(Node01 node) {
		// TODO �Զ����ɵķ������
		if (node.next == null) {
			return node;
		}
		//ͨ���ݹ��ѯ��ʼ����ڵ����һ���ڵ㣬ֱ���ҵ�ĩβ�ڵ�
		return findLast(node.next);
	}

	//ɾ��������ĳ�����ݵķ���
	public void remov(Object obj) {
		
	}
	
	//�޸�������ĳ�����ݵķ���
	public void modify(Object newobj) {
		
	}
	
	//����������ĳ�����ݵķ���
	public int get(Object obj) {
		return 1;
	}

}
