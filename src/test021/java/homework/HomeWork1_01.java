package test021.java.homework;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class HomeWork1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��������
			����һ�������࣬�������������֣����ã����䡣����������󣬲���ʼ����Ȼ�����Щ���������ӵ�һ�������С�
			����Ҫ��
		 * 1. ʹ�ü������2ֻ����,�����Ժͽ��� 
		 * 2. ʹ��Iterator��ʾ����������Ϣ�� 
		 * 3. ɾ���������
		 *  4. ����������ж���ֻ����
		 */
		Set<Mouse> set = new HashSet<>();
		Mouse taotao = new Mouse("����", "����", 2);
		Mouse jery = new Mouse("����", "���׻�", 3);
		set.add(taotao);
		set.add(jery);
		
		Iterator<Mouse> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		set.remove(jery);
		set.forEach(System.out::println);
		System.out.println(set.size());
		
	}

}
class Mouse{
	private String name;
	private String hobby;
	private int age;
	
	public Mouse(String name, String hobby, int age) {
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}
	public String toString() {
		return "name: " + name + " hobby: " + hobby + " age: " + age; 
	}
	
}




