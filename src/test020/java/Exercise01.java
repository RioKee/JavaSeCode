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
		
		Collections.addAll(list, "张三", "李四", "王五", "李四");		
		System.out.println("学生名单: " + list);	
		
		for(String value:list) {
			if(Collections.frequency(list, value) > 1) { 
				set.add(value);
			}
		}
		System.out.println("重复名单: " + set);
	}

}
