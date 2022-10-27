package test019.java.homework;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Penguin> col = new ArrayList();
		col.add(new Penguin("tom"));
		col.add(new Penguin("jack"));
		col.add(new Penguin("smith"));
		System.out.println("企鹅的数量： " + col.size());
		
		System.out.println("使用增强for 遍历集合");
		for(Penguin penguin : col) {
			System.out.println(penguin);
		}
		
		System.out.println("使用Iterator迭代器遍历集合");
		Iterator<Penguin> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
				
	}

}
class Penguin{
	private String name;
	public Penguin() {}
	public Penguin(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name=" + name;
	}
}

class Test2{
	public static void main(String[] args) {
		List<Penguin> list = new ArrayList();
		list.add(new Penguin("菜鸟"));
		list.add(new Penguin("老大"));
		list.add(new Penguin("老三"));
		System.out.println("企鹅的数据量：" + list.size());
		
		// 3中遍历List的方式 for 增强for Iterator
		System.out.println("使用常规for循环遍历集合元素");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("使用增强for循环遍历集合");
		for(Penguin penguin : list) {
			System.out.println(penguin);
		}
		
		System.out.println("使用迭代器遍历集合");
		Iterator<Penguin> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 删除索引值所在位置
		Penguin rePenguin = list.remove(2);
		System.out.println("被删除的元素：" + rePenguin);
		System.out.println("集合中还剩与对象元素：" + list);
		
	}
}
/**
 * 任务一：
任务要求： 
1.	建立一个企鹅类，企鹅有名字（可以自由添加属性）
2.	把多个企鹅的信息添加到集合中
3.	查看企鹅的数量
4.	遍历输出所有企鹅的信息
5.	删除集合中索引值是2的企鹅的元素
知识点：List接口

 */
