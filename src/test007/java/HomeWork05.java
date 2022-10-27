package test007.java;

public class HomeWork05 {
	public static void main(String[]args) {
		//找出元素重复的下标
		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
		
		//题目分解
		//将第一个元素，和第二元素进行比较，相同就记录下来，
		//删除相同对应的下标元素，利用数组记录下来
		
		for(int i = 0; i < words.length ; i++) {  
			for(int j = i; j < words.length; j++) {
				if(i != j) {  //去除和自己本身比较
//					System.out.print(words[i] + " " + words[j] + " \t");
					if(words[i].equals(words[j])) {  //判断是否已经出现过，出现过则记录
						System.out.print(j + " ");  //获得重复值的下标
					}
				}	
			}
		}
		
		
		
		
		
 	}
}
