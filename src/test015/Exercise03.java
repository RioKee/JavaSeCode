//package test015;
//public class Exercise03 {
//	public static void main(String[] args) {
//		Employee employee1 = new Employee("�����");
//		Employee employee2 = new Employee("��ѧϰ");
//		Car car = new Car();
//		Subway subway = new Subway();
//		
//		employee1.backHome(car);   // 
//		System.out.println("=================");
//		employee2.backHome(subway);  //  subway  = new Subway();   Vehicle vehicle = new Subway(); 
//	}
//}
//class Employee{
//	private String name;
//	public Employee(String name) {
//		this.name = name;
//	}
//	public void backHome(Vehicle vehicle) {  // new Subway()
//		System.out.println("Ա�� " + name + "�ؼ���");
//		vehicle.run();     // new Subway().run()
//	}
//}
//abstract class Vehicle{
//	public abstract void run();
//}
//class Car extends Vehicle{
//	@Override
//	public void run() {
//		System.out.println("����������ʻ�С�����");
//	}
//}
//class Subway extends Vehicle{
//	@Override
//	public void run() {
//		System.out.println("����������ʻ�С�����");
//		
//	}
//}