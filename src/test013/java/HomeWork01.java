//package test013.java;
//
//public class HomeWork01 {
//	public static void main(String[] args) {
//		Bus bus = new Bus();
//		bus.run();
//		bus.brake();
//		bus.say();
//		bus.stop();
//		
//		System.out.println("========");
//		Truck truck = new Truck();
//		truck.run();
//		truck.brake();
//		truck.inGoods();
//		truck.outGoods();
//		
//	}
//}
//
//class Automobile{
//	public void run() {}
//	public void brake() {}
//}
//
//class Truck extends Automobile{
//	public void inGoods() {
//		System.out.println("����������");
//	}
//	public void outGoods() {
//		System.out.println("����ж��");
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("������ʻ");
//	}
//	@Override
//	public void brake() {
//		System.out.println("����ɲ��");
//	}
//}
//
//class Bus extends Automobile{
//	public void say() {
//		System.out.println("����������վ");
//	}
//	public void stop() {
//		System.out.println("ͣ��վ");
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("����������ʻ");
//	}
//	@Override
//	public void brake() {
//		System.out.println("��������ɲ��");
//	}
//}