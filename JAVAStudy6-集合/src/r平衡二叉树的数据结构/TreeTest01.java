package rƽ������������ݽṹ;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;


/*
 * 	����ƽ���������TreeSet��TreeMap�ײ��Ǹö���������ѭ��С�Ҵ�ԭ����
 * 
 * 	�����������������ַ�ʽ��
 * 		1��ǰ�������������
 * 		2����������������
 * 		3��������������Ҹ�
 * 	����Ҫע����ǡ�
 * 		������ʽ�е�ǰ�к��ʾ���Ǹ��ڵ��λ��
 * 		����������һ�����������ȱ�������Զ�����������
 * 
 * 	TreeSet���Ϻ�TreeMap���ϲ��õ�����������ķ�ʽ������˵Iterator�����������������
 * 
 * 	����������ľ�����⣬�Ա����µ�ͼƬ�еĶ���������Ϊ����
 * 		�����������ȡ����
 * 		1����ȡ���ڵ���������������
 * 		���ڵ�Ϊ100����������50��50�ڵ㻹�з��ӣ�ȡ�ұ�������ֻ��һ���ڵ�40��40û�з�֧��ȡ��40�������нڵ�50��ȡ��50��
 * 		Ȼ��ȡ50���������ڵ�60������60�����ҷ�֧����ô������ȡ�ڵ㣬����һ���ڵ�55���Ҹýڵ�û�����ҷ�֧��ȡ���������нڵ�60��ȡ����
 * 		Ȼ��ȡ60���������ڵ�80������80�ڵ�û�����ҷ�ֱ֧��ȡ�������˷��ָ��ڵ㣨�нڵ㣩100�������ڵ���ȫ��ȡ������ʱȡ���ڵ�100��
 * 		˳���ǣ�40��50��55��60��80��100
 * 		2��ȡ���ڵ���������ڵ�
 * 		ȡ����ڵ�100��ȡ���ҽڵ�200�����ָýڵ������ҷ�֧����ô��ȡ�������ڵ�120���ַ���120�ڵ�ֻ����һ���ҽڵ�140��û����ڵ㣬��ô
 * 		�Ȱ�120�ڵ�ȡ����Ȼ������ȡ�ڵ�140��ȡ140��ʱ���ָýڵ㻹�����ҷ�֧����ôȡ���ҽڵ�130���ַ���130�ڵ�ֻ���ҷ�֧�ڵ㣬
 * 		��ô��ȡ���ڵ�130��Ȼ��ȡ�ҷ�֧�ڵ�135��ȡ��135�ڵ����ȡ�нڵ�140��ȡ���нڵ�140��ȡ�ýڵ���ҽڵ�180������180û�з�֧��ֱ��ȡ����
 * 		�����Ѿ���200�ڵ����ߵ����з�֧�ڵ�ȡ�������ڰ�200ȡ����Ȼ����ȡ�ýڵ���ҽڵ�666�����ָýڵ�û�����ҷ�֧��ֱ��ȡ����
 * 		˳��120��130��135��140��180��200��666
 * 		���������� ��40��50��55��60��80��100��120��130��135��140��180��200��666
 * 	���ܽ᡿ÿһ��ȡ�ڵ㶼Ҫ�ȰѸýڵ����ڵ���ȡ����ȡ�Լ���Ȼ��ȡ�ұ߽ڵ�
 * 
 * 	��TreeMap���е�put(k,v)Դ�������
 * 	TreeMapʵ��������һ����̬�ڲ���Entry<K,V>����HashMap�Լ�Hashtableʵ����һ���������ļ������������Զ���new���ڲ���Ķ���
 * 	���ڲ����������ĸ����ԣ�
 * 		   	 K key���洢��������keyֵ
 * 		   V value���洢��������valueֵ
 * Entry<K,V> left���洢��ǰ�����������ڵ㣨Ҳ����˵���ڴ��ַ��
 * Entry<K,V> right���洢��ǰ�����������ڵ㣨Ҳ����˵���ڴ��ַ��
 * Entry<K,V> parent���洢��ǰ���󸸽ڵ㣨Ҳ����˵���ڴ��ַ��
 	public V put(K key, V value) {
        Entry<K,V> t = root;	//root�����Ǵ洢���ڵ�ģ�����������Entry<K,V>
        if (t == null) {      //˵����ǰ����û�д洢�κ�Ԫ�أ����ifִ�к󼯺����˵�һ����ֵ�ԣ�Ҳ��һ�����ڵ�
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;			//����һ�����ͱ������洢�ȽϺ�ķ���ֵ
        Entry<K,V> parent;	//�洢�ö��󸸽ڵ�
        // split comparator and comparable paths
        Comparator<? super K> cpr = comparator; //���Ƚ�������cpr
        if (cpr != null) {						//��ʾ��������ʱnew��һ���Ƚ��������comparator����
            do {//��ѭ�����������key�������븸�ڵ��е�key�Ƚ�
                parent = t;			
                cmp = cpr.compare(key, t.key);//���ñȽ����еıȽϷ���compare�Ƚ��²�key�뵱ǰ�ڵ�keyֵ�Ƚ�
                if (cmp < 0)
                    t = t.left;		//�����keyС�ڵ�ǰ�ڵ�key���ͽ���ǰ�ڵ����ڵ㣨�ڴ��ַ������t�������Ƚ�
                else if (cmp > 0)
                    t = t.right;	//�����key���ڵ�ǰ�ڵ�key���ͽ���ǰ�ڵ���ҽڵ㣨�ڴ��ַ������t�������Ƚ�
                else
                    return t.setValue(value);	//�����key���ڵ�ǰ�ڵ�key����ʱ�ͽ���keyһͬ�����valueֵ���ǵ�ǰ�ڵ��value
            } while (t != null);		//һֱѭ����ĳ���ڵ�û����������Ϊֹ
        }
//        else {			//��ʾ��������ʱ���췽����û��new��һ���Ƚ��������comparator����	
            if (key == null)
                throw new NullPointerException();
            @SuppressWarnings("unchecked")
                Comparable<? super K> k = (Comparable<? super K>) key;	//������һ�ֱȽϴ���key�뵱ǰ�ڵ�key�ķ�������Ҫ����key������ʵ����Comparable�ӿڣ�
                														//����ʵ�ָýӿڵ�compareTo�������ø÷�����ıȽϹ������Ƚ�keyֵ���󣬵�Ȼ��������Զ�����
            do {
                parent = t;			//�Ӹ��ӿڿ�ʼ�Ƚϣ���ʼѭ�����﷨�������һ��
                cmp = k.compareTo(t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        
        Entry<K,V> e = new Entry<>(key, value, parent);//��������ıȽ�ѭ�����������key��û���뼯���е�keyһ�������������ѭ��parent�д洢����һ��û�����������Ľڵ����
       								//��cmp���ȽϺ�ķ���ֵ��Ҫô����0��ҪôС��0����ʱ�ô�����key��value�͵õ���parentֱ��newһ���µ�Entry�����
       								//��Ϊ����Ԫ�أ��ǿ϶�û�����������ڵ㣬���Ըö�����left��right���Զ���null
        if (cmp < 0)								
            parent.left = e;		//���ݱȽϷ���ֵ��ȷ����Ԫ����parent�ڵ������������������
        else
            parent.right = e;
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }
 * 		
 * 
 */

//�˴�����ͨ��ʵ��Comparator�ӿ���newһ���Ƚ����Ž��������ñȽ������Ƚ�key

/*
 * �����ս��ۡ����ŵ�TreeSet�����Լ�TreeMap�����е�key����Ԫ��Ҫ�������������ַ�ʽ��
 * 			1���÷��ڼ����е�Ԫ�ص���ʵ��java.lang.Comparable�ӿ�
 * 			2���ڹ���TreeSet����TreeMap���ϵ�ʱ�������һ���Ƚ�������
 * ����ôѡ���أ���
 * 		���ȽϹ��򲻻ᷢ���ı䣬����˵�ȽϹ���ֻ��һ����ʱ�򣬽���ʵ��Comparable�ӿ�
 * 		��һ������Ӧ����ȽϹ�������Ҫ����Щ�ȽϹ�����Ƶ���л�������ʹ��Comparator�ӿ�
 * 
 * Comparator�ӿڷ���OPCԭ��
 */

public class TreeTest01 {
	
	public static void main(String[] args) {
		
		//����ʹ�ñȽ����Ƿ�ʽ�Ƚ�key��Ҫ�ڹ��췽����������ʱnew���Ƚ�����Ϊ����
		//TreeSet<WuGui> t = new TreeSet<>();//��������
		//TreeSet<WuGui> t = new TreeSet<>(new WuGuiComparator());
		
		//��ȻҲ���Բ�������дһ����ʵ��Comparator�ӿ�
		//����ʹ�������ڲ���ķ�ʽ��ֱ���ڹ��췽��������ʵ�ֱȽ���,���·����췽����С����������new +�ո� +Co �������ֱ����ʾ���Ƿ�ѡ�������ڲ��� 
		TreeSet<WuGui> t = new TreeSet<>(new Comparator<WuGui>() {
			@Override
			public int compare(WuGui o1, WuGui o2) {
				// TODO �Զ����ɵķ������
				return o1.age - o2.age;
			}
		});
		
		t.add(new WuGui(1000));
		t.add(new WuGui(50));
		t.add(new WuGui(500));
		t.add(new WuGui(100));
		t.add(new WuGui(10));
		
		for (WuGui wuGui : t) {
			System.out.println(wuGui);
		}
	}

}

class WuGui{
	
	int age;
	
	public WuGui() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public WuGui(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "С�ڹ� [age=" + age + "]";
	}
	
	
}

//���ⵥ��дһ���Ƚ���
//�Ƚ���ʵ��java.util.Comparator�ӿڣ�Comparable�ӿ���lang���µģ�
class WuGuiComparator implements Comparator<WuGui> {//�ӿ��÷��ͣ���ʵ����Ҳ�̳и÷����࣬ʹ��ר�űȽ�WuGui������С�ıȽ���
	
	//�ȽϹ���ʹ���뼯���е�WuGui�����ڹ���������
	@Override
	public int compare(WuGui o1, WuGui o2) {
		// TODO �Զ����ɵķ������
		return o1.age - o2.age;
	}
	
}

