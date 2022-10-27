package test010.java;

public class HomeWork02 {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		student[0] = new Student(1001, "张三", 99);
		student[1] = new Student(1002, "张三", 80);
		student[2] = new Student(1003, "王五", 100);
		
		System.out.println("所有人员信息:");
		for (int i = 0; i < student.length; i++) {
			student[i].info();
		}
		
		
		
		Student temp = null;
		for(int i = 0; i < student.length - 1; i++) {
			for(int j = 0; j < student.length - 1 -i; j++) {
				if(student[j].score < student[j + 1].score) {
					temp = student[j];
					student[j + 1] = student[j];
					student[j] = student[j + 1];
					
				}
			}
		}
		
		System.out.println("\n排序后: ");
		for (int i = 0; i < student.length; i++) {
			student[i].info();
		}
		
		
	}
	
}
