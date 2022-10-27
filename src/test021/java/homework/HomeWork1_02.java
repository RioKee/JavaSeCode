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
		books.put("1001", new Book("1001", "ˮ䰴�", 50, "����������"));
		books.put("1002", new Book("1002", "��������", 60, "����������"));
		books.put("1003", new Book("1003", "���μ�", 70, "����������"));
		books.put("1004", new Book("1004", "��¥��", 40, "����������"));
		
		
		// ���ַ�ʽ���� ketSet  vlaues  entrySet<K, V>
		System.out.println("ketSet for");
		Set<String> keySet = books.keySet();
		for(String key : keySet) {
			System.out.println(key + " " + books.get(key));
		}
		
		System.out.println("ketSet ����");
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
		
		System.out.println("values ����");
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
		
		// ����Entry����⣬����Ҳ��һ�����ϣ�����ֻ�ܱ�������ֵ
		System.out.println("Entry  ����");
		Iterator it3 = entrySet.iterator();		
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
/*
�������
����ͼ���ࣺ������Ʒ���ԣ���ţ����ƣ����ۣ������磻 
ʹ��Map��Ŷ��ͼ����Ϣ��ʹ����Ʒ�����ΪMap�е�key��ͼ����Ϊvalue��
�����������
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