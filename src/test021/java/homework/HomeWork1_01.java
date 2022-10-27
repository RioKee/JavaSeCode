package test021.java.homework;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class HomeWork1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*任务描述
			定义一个老鼠类，该类有属性名字，爱好，年龄。创建老鼠对象，并初始化，然后把这些老鼠对象添加到一个集合中。
			任务要求
		 * 1. 使用集合添加2只老鼠,：淘淘和杰瑞 
		 * 2. 使用Iterator显示所有老鼠信息； 
		 * 3. 删除老鼠杰瑞
		 *  4. 输出集合中有多少只老鼠
		 */
		Set<Mouse> set = new HashSet<>();
		Mouse taotao = new Mouse("淘淘", "奶酪", 2);
		Mouse jery = new Mouse("杰瑞", "爆米花", 3);
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




