package test020.java.shopping;
import java.util.ArrayList;

public class ExeGoods {	
	
	public ArrayList<Goods> list = new ArrayList<>();
 
	/**
	 * �������޸ģ�ɾ������ѯ
	 */
	public void addTest() {
		// ������������
		list.add(new Goods(1, "�ʼ�", 12, 50));	
		list.add(new Goods(2, "�ֱ�", 13, 50));	
		list.add(new Goods(3, "Ǧ��", 2, 200));	
		list.add(new Goods(4, "�ݸ�ֽ", 0.5, 500));
	}
	
	public Goods  add(int num, String name, double price, int quantity) {		
		
		// ���ȷ��Ψһֵ
		for(Goods goods : list) {
			if(num == goods.getNum()) {  // �����ӵı���Ѿ����ڣ������ʧ��
				return null;
			}
		}
		Goods newGoods = new Goods(num, name, price, quantity);
		return newGoods;
	}
	
	public Goods update(int changeNum, int num, String name, double price, int quantity) {
			
		for(Goods goods : list) {
			if(changeNum == goods.getNum()) {  // �޸ĳɹ��򷵻��޸ĺ�Ķ���
				goods.setNum(num);
				goods.setName(name);
				goods.setPrice(price);
				goods.setQuantity(quantity);
				return goods;
			}
		}
		return null;
	}
	
	public Goods del(int num) {	
		for(Goods goods : list) {  // �����Ų����ڣ����޷�ɾ��
			if(num == goods.getNum()) {
				Goods delGoods = list.remove(num);
				return delGoods;
			}
		}
		return null;
	}
	
	public Goods showOne(int index) {
		for(Goods goods : list) {
			if(goods.getNum() == index) {
				return goods;
			}
		}
		return null;
	}
	
	public void show() {
		for(Goods goods : list) {
			System.out.println(goods.info());	
		}
	}
	
}
