package test021.java;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import java.util.Map.Entry;

import java.util.Iterator;
import java.util.Collection;
public class MapExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, String> map = new HashMap<>();
		map.put("PBCH", "农业银行");
		map.put("BC", "中国银行");
		map.put("CBC", "建设银行");
		map.put("ICBC", "工商银行");
		
		// 六种遍历方式 
		Set<String> key1 = map.keySet();
		System.out.println("==增强for keySet遍历==");
		for(String key : key1) {
			System.out.println(key + " : " + map.get(key));
		}
	
		Iterator<String> it1 = key1.iterator();
		System.out.println("==迭代器遍历keySet==");
		while(it1.hasNext()) {
			System.out.println(it1.next() + " : " + map.get(it1.next()));
		}
		
		Collection<String> values = map.values();
		System.out.println("==增强for values遍历==");
		for(String value : values) {
			System.out.println(value);
		}
		
		Iterator<String> it2 = values.iterator();
		System.out.println("==迭代器 values遍历==");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println("==增强for entrySet遍历==");
		for(Entry entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<Entry<String, String>> it3 = entrySet.iterator();
		System.out.println("==迭代器 entrySet遍历==");
		while(it3.hasNext()) {
			Entry<String, String> next = it3.next();
			System.out.println(next.getKey() + " : " + next.getValue());
		}
		
		
	}

}
