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
		map.put("PBCH", "ũҵ����");
		map.put("BC", "�й�����");
		map.put("CBC", "��������");
		map.put("ICBC", "��������");
		
		// ���ֱ�����ʽ 
		Set<String> key1 = map.keySet();
		System.out.println("==��ǿfor keySet����==");
		for(String key : key1) {
			System.out.println(key + " : " + map.get(key));
		}
	
		Iterator<String> it1 = key1.iterator();
		System.out.println("==����������keySet==");
		while(it1.hasNext()) {
			System.out.println(it1.next() + " : " + map.get(it1.next()));
		}
		
		Collection<String> values = map.values();
		System.out.println("==��ǿfor values����==");
		for(String value : values) {
			System.out.println(value);
		}
		
		Iterator<String> it2 = values.iterator();
		System.out.println("==������ values����==");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println("==��ǿfor entrySet����==");
		for(Entry entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<Entry<String, String>> it3 = entrySet.iterator();
		System.out.println("==������ entrySet����==");
		while(it3.hasNext()) {
			Entry<String, String> next = it3.next();
			System.out.println(next.getKey() + " : " + next.getValue());
		}
		
		
	}

}
