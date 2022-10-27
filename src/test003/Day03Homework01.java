package test003;

public class Day03Homework01 {
	public static void main(String[]args) {
		int [] nums= {33,44,55,22,48,10};
		int temp=0;
		for(int i=0;i<=nums.length;i++) {
			for(int j=0;j<=nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(" sds");
	}
}
