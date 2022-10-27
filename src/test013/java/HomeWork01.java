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
//		System.out.println("卡车拉货货");
//	}
//	public void outGoods() {
//		System.out.println("卡车卸货");
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("卡车行驶");
//	}
//	@Override
//	public void brake() {
//		System.out.println("卡车刹车");
//	}
//}
//
//class Bus extends Automobile{
//	public void say() {
//		System.out.println("公共汽车报站");
//	}
//	public void stop() {
//		System.out.println("停靠站");
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("公共汽车行驶");
//	}
//	@Override
//	public void brake() {
//		System.out.println("公共汽车刹车");
//	}
//}