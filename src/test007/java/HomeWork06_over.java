package test007.java;

import java.util.Arrays;

public class HomeWork06_over {
	public static void main(String[]args) {
		
		//找出元素重复的下标
		String[] words = {"apple", "banana", "cat", "banana", "cat", "banana","cat", "dog", "dog"};
		String[] wordsTemp = new String[words.length];  //拷贝一份数组元素,后续操作中不对原数组产生影响
		for(int i = 0; i < words.length; i++) {
			wordsTemp[i] = words[i];
		}
		
		//题目分解
		//将第一个元素，和第二元素进行比较，相同就记录下来，
		//比较值是否相等，利用数组记录下标
		
		//1.第一步去除重复，并赋值null
		for(int i = 0; i < words.length ; i++) { 
			for(int j = i; j < words.length; j++) {
				if(i != j) {  //去除和自己本身比较
					if(words[i].equals(words[j])) {  //判断是否已经出现过，出现过就记录
						wordsTemp[j] = null;    //将重复的数组部分赋值为null，只能使用拷贝的数组，不对原数组产生影响
					}
				}	
			}
		}
		System.out.println("第一步去除重复，并赋值null：" + Arrays.toString(wordsTemp));

		//2.记录重复的值下标为，并记录有多少空值，确定新建数组的长度
		int count = 0;
		System.out.print("第二步记录重复值下标为：");
		for(int i = 0; i < wordsTemp.length; i++) {
			if(wordsTemp[i] == null) {
				System.out.print(i + " ");
				count++;
			}
		}
		//新建一个数组，确定最终数组长度
		String[] over = new String[wordsTemp.length - count]; 
		
		//3.判断为空时，跳过数值拷贝
		for(int i = 0, k = 0; i < wordsTemp.length; i++) {  //遍历对应的坐标，先一个一个的删除
			if( wordsTemp[i] != null) {   //当遇到数组里面元素为空值时，缩小数组空间
				over[k] = wordsTemp[i];
				k++;
			}
		}
		words = over;
		System.out.println("\n第三步去除重复效果：" + Arrays.toString(words));
	}
}
