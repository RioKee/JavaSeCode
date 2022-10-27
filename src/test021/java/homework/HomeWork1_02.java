package test021.java.homework;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;



public class HomeWork1_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Book> books = new HashMap<>();
		books.put("1001", new Book("1001", "水浒传", 50, "人名出版社"));
		books.put("1002", new Book("1002", "三国演绎", 60, "人名出版社"));
		books.put("1003", new Book("1003", "西游记", 70, "人名出版社"));
		books.put("1004", new Book("1004", "红楼梦", 40, "人名出版社"));
		
		
		// 六种方式遍历 ketSet  vlaues  entrySet<K, V>
		System.out.println("ketSet for");
		Set<String> keySet = books.keySet();
		for(String key : keySet) {
			System.out.println(key + " " + books.get(key));
		}
		
		System.out.println("ketSet 迭代");
		Iterator<String> it1 = keySet.iterator();
		while(it1.hasNext()) {
			String next = it1.next();
			System.out.println(next + " " + books.get(next));
		}
		
		// values 
		Collection<Book> values = books.values();
		System.out.println("values for");
		for(Book book : values) {
			System.out.println(book);
		}
		
		System.out.println("values 迭代");
		Iterator<Book> it2 = values.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		// entrySet
		Set<Entry<String, Book>> entrySet = books.entrySet();
		System.out.println("Entry  for");
		for(Entry<String, Book> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// 关于Entry的理解，本身也是一个集合，但是只能保存两个值
		System.out.println("Entry  迭代");
		Iterator it3 = entrySet.iterator();		
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
/*
任务二：
定义图书类：其中商品属性：编号，名称，单价，出版社； 
使用Map存放多个图书信息，使用商品编号作为Map中的key，图书作为value。
遍历并输出。
*/

class Book{
	private String no;
	private String name;
	private double price;
	private String press;
	public Book(String no, String name, double price, String press) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.press = press;
	}
	
	@Override
	public String toString() {
		return "no:" + no + " name:" + name + " price:" + price + " press:" + press;
	} 
}