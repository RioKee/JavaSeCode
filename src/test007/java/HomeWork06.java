package test007.java;
import java.util.Arrays;

public class HomeWork06 {
	public static void main(String[]args) {
		//删除重复的元素
//		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
//		
//		for(int m = 0; m < add.length; m++) {
//			String[] arr = new String[words.length - 1];
//			for(int i = 0, k = 0; i < words.length - 1; i++) {  //遍历对应的坐标，先一个一个的删除
//				if(add[m] != i) {   //当下标不相等时，把words里面的值取出来，就完成了删除对应下标值
//					arr[k] = words[i];
//					System.out.println(arr[k]);
//					k++;
//				}
//			}
//			words = arr;
//		}
//		System.out.println(Arrays.toString(words));
		
		
		//删除重复的元素
		//将指定的元素删除为null
		int[] add = {3, 4, 6};
		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
		for(int i = 0; i < add.length; i++) {
			for(int j = 0; j < words.length; j++) {
				if(add[i] == j) {
					words[j] = null;
				}
			}
		}
		
		//判断为空时，跳过数值拷贝
		String[] temp = new String[words.length - add.length];  //最终列表的长度确定
		for(int i = 0, k = 0; i < words.length; i++) {  //遍历对应的坐标，先一个一个的删除
			if( words[i] != null) {   //当遇到数组里面元素为空值时，缩小数组空间
				temp[k] = words[i];
				k++;
			}
		}
		words = temp;
		System.out.println(Arrays.toString(words));
	}
}
