package test018.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ThrowsExer01 {
	public static void main(String[] args) {

		
		
		ArrayList list1 = new ArrayList(10123);
//		list1.add("ArrayList��һ�θ�ֵ����");
		for (int i = 1; i < 1000; i++) {
			list1.add("ArrayList�� "+ i + "�θ�ֵ����");
			System.out.println("ArrayList�� "+ i + "�θ�ֵ����");
		}		
		System.out.println("ArrayList " + list1.size());

		
		Vector list2 = new Vector();
		System.out.println("Vector " + list2.size());
		
		list2.add("conten1");
		System.out.println("Vector " + list2.size());
		
		
		LinkedList list3 = new LinkedList(); //Ĭ�ϴ�������
		System.out.println("LinkedList " + list3.size());
		list3.add("conten1");
		System.out.println("LinkedList " + list3.size());
		
		int n = 0;
		switch(n) {
		
		}

		
	} 

}
class Error {}
