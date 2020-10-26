package r平衡二叉树的数据结构;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;


/*
 * 	【自平衡二叉树】TreeSet和TreeMap底层是该二叉树。遵循左小右大原则存放
 * 
 * 	【二叉树遍历的三种方式】
 * 		1、前序遍历，根左右
 * 		2、中序遍历，左根右
 * 		3、后序遍历，左右根
 * 	【需要注意的是】
 * 		遍历方式中的前中后表示的是根节点的位置
 * 		而且左子树一定比右子树先遍历，永远都是先左后右
 * 
 * 	TreeSet集合和TreeMap集合采用的是中序遍历的方式，就是说Iterator迭代器采用中序遍历
 * 
 * 	【中序遍历的具体理解，以本包下的图片中的二叉树数据为例】
 * 		采用中序遍历取出：
 * 		1、先取根节点的左边所有子树：
 * 		根节点为100，左子树存50，50节点还有分子，取右边子树，只有一个节点40，40没有分支，取出40；返回中节点50，取出50；
 * 		然后取50的右子树节点60，发现60有左右分支，那么往其右取节点，发现一个节点55，且该节点没有左右分支，取出；返回中节点60并取出；
 * 		然后取60的右子树节点80，发现80节点没有左右分支直接取出；至此发现根节点（中节点）100右子树节点已全部取出，此时取根节点100；
 * 		顺序是：40，50，55，60，80，100
 * 		2、取根节点的右子树节点
 * 		取完根节点100，取其右节点200，发现该节点有左右分支，那么先取右子树节点120，又发现120节点只有有一个右节点140，没有左节点，那么
 * 		先把120节点取出；然后再在取节点140，取140的时候发现该节点还有左右分支，那么取其右节点130，又发现130节点只有右分支节点，
 * 		那么先取出节点130；然后取右分支节点135；取完135节点后，再取中节点140；取完中节点140，取该节点的右节点180，发现180没有分支，直接取出；
 * 		到此已经把200节点的左边的所有分支节点取出，现在把200取出；然后再取该节点的右节点666，发现该节点没有左右分支，直接取出。
 * 		顺序：120，130，135，140，180，200，666
 * 		合起来就是 ：40，50，55，60，80，100，120，130，135，140，180，200，666
 * 	【总结】每一次取节点都要先把该节点的左节点先取，再取自己，然后取右边节点
 * 
 * 	【TreeMap类中的put(k,v)源码解析】
 * 	TreeMap实现类中有一个静态内部类Entry<K,V>，和HashMap以及Hashtable实现类一样，创建的集合如果添加属性都是new该内部类的对象
 * 	该内部类里面有四个属性：
 * 		   	 K key：存储传进来的key值
 * 		   V value：存储传进来的value值
 * Entry<K,V> left：存储当前对象左子树节点（也可以说是内存地址）
 * Entry<K,V> right：存储当前对象右子树节点（也可以说是内存地址）
 * Entry<K,V> parent：存储当前对象父节点（也可以说是内存地址）
 	public V put(K key, V value) {
        Entry<K,V> t = root;	//root属性是存储根节点的，它的类型是Entry<K,V>
        if (t == null) {      //说明当前集合没有存储任何元素，这个if执行后集合有了第一个键值对，也是一个父节点
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;			//定义一个整型变量，存储比较后的返回值
        Entry<K,V> parent;	//存储该对象父节点
        // split comparator and comparable paths
        Comparator<? super K> cpr = comparator; //将比较器赋给cpr
        if (cpr != null) {						//表示创建集合时new了一个比较器对象给comparator属性
            do {//作循环，将传入的key参数先与父节点中的key比较
                parent = t;			
                cmp = cpr.compare(key, t.key);//调用比较器中的比较方法compare比较新参key与当前节点key值比较
                if (cmp < 0)
                    t = t.left;		//传入的key小于当前节点key，就将当前节点的左节点（内存地址）赋给t，继续比较
                else if (cmp > 0)
                    t = t.right;	//传入的key大于当前节点key，就将当前节点的右节点（内存地址）赋给t，继续比较
                else
                    return t.setValue(value);	//传入的key等于当前节点key，此时就将与key一同传入的value值覆盖当前节点的value
            } while (t != null);		//一直循环到某个节点没有左右子树为止
        }
//        else {			//表示创建集合时构造方法中没有new了一个比较器对象给comparator属性	
            if (key == null)
                throw new NullPointerException();
            @SuppressWarnings("unchecked")
                Comparable<? super K> k = (Comparable<? super K>) key;	//这是另一种比较传入key与当前节点key的方法，需要传入key的类中实现了Comparable接口，
                														//并且实现该接口的compareTo方法，用该方法里的比较规则来比较key值对象，当然这是针对自定义类
            do {
                parent = t;			//从父接口开始比较，开始循环，语法与上面的一样
                cmp = k.compareTo(t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        
        Entry<K,V> e = new Entry<>(key, value, parent);//经过上面的比较循环，当传入的key并没有与集合中的key一样，经过上面的循环parent中存储的是一个没有左右子树的节点对象
       								//而cmp，比较后的返回值，要么大于0，要么小于0；此时用传进来key，value和得到的parent直接new一个新的Entry类对象
       								//因为是新元素，那肯定没有左右子树节点，所以该对象中left和right属性都是null
        if (cmp < 0)								
            parent.left = e;		//根据比较返回值来确定新元素在parent节点的左子树还是右子树
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

//此处我们通过实现Comparator接口来new一个比较器放进集合中用比较器来比较key

/*
 * 【最终结论】：放到TreeSet集合以及TreeMap集合中的key部分元素要想做排序，有两种方式：
 * 			1、让放在集合中的元素的类实现java.lang.Comparable接口
 * 			2、在构造TreeSet或者TreeMap集合的时候给他传一个比较器对象
 * 【怎么选择呢？】
 * 		当比较规则不会发生改变，或者说比较规则只有一个的时候，建议实现Comparable接口
 * 		当一个类适应多个比较规则，且需要在这些比较规则中频繁切换，建议使用Comparator接口
 * 
 * Comparator接口符合OPC原则
 */

public class TreeTest01 {
	
	public static void main(String[] args) {
		
		//这里使用比较器是方式比较key，要在构造方法创建集合时new个比较器作为参数
		//TreeSet<WuGui> t = new TreeSet<>();//这样不行
		//TreeSet<WuGui> t = new TreeSet<>(new WuGuiComparator());
		
		//当然也可以不用另外写一个类实现Comparator接口
		//可以使用匿名内部类的方式，直接在构造方法括号里实现比较器,在下方构造方法的小括号里输入new +空格 +Co 后编译器直接提示你是否选择匿名内部类 
		TreeSet<WuGui> t = new TreeSet<>(new Comparator<WuGui>() {
			@Override
			public int compare(WuGui o1, WuGui o2) {
				// TODO 自动生成的方法存根
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
		// TODO 自动生成的构造函数存根
	}

	public WuGui(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "小乌龟 [age=" + age + "]";
	}
	
	
}

//在这单独写一个比较器
//比较器实现java.util.Comparator接口（Comparable接口是lang包下的）
class WuGuiComparator implements Comparator<WuGui> {//接口用泛型，其实现类也继承该泛型类，使其专门比较WuGui类对象大小的比较器
	
	//比较规则，使传入集合中的WuGui对象按乌龟年龄排序
	@Override
	public int compare(WuGui o1, WuGui o2) {
		// TODO 自动生成的方法存根
		return o1.age - o2.age;
	}
	
}

