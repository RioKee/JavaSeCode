package test020.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();	
		
		Collections.addAll(list, "����", "����", "����", "����");		
		System.out.println("ѧ������: " + list);	
		
		for(String value:list) {
			if(Collections.frequency(list, value) > 1) { 
				set.add(value);
			}
		}
		System.out.println("�ظ�����: " + set);
	}

}
