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
		System.out.println("���������� " + col.size());
		
		System.out.println("ʹ����ǿfor ��������");
		for(Penguin penguin : col) {
			System.out.println(penguin);
		}
		
		System.out.println("ʹ��Iterator��������������");
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
		list.add(new Penguin("����"));
		list.add(new Penguin("�ϴ�"));
		list.add(new Penguin("����"));
		System.out.println("������������" + list.size());
		
		// 3�б���List�ķ�ʽ for ��ǿfor Iterator
		System.out.println("ʹ�ó���forѭ����������Ԫ��");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("ʹ����ǿforѭ����������");
		for(Penguin penguin : list) {
			System.out.println(penguin);
		}
		
		System.out.println("ʹ�õ�������������");
		Iterator<Penguin> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ɾ������ֵ����λ��
		Penguin rePenguin = list.remove(2);
		System.out.println("��ɾ����Ԫ�أ�" + rePenguin);
		System.out.println("�����л�ʣ�����Ԫ�أ�" + list);
		
	}
}
/**
 * ����һ��
����Ҫ�� 
1.	����һ������࣬��������֣���������������ԣ�
2.	�Ѷ��������Ϣ��ӵ�������
3.	�鿴��������
4.	�����������������Ϣ
5.	ɾ������������ֵ��2������Ԫ��
֪ʶ�㣺List�ӿ�

 */
