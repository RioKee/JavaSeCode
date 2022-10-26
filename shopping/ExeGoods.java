package test020.java.shopping;
import java.util.ArrayList;

public class ExeGoods {	
	
	public ArrayList<Goods> list = new ArrayList<>();
 
	/**
	 * 新增，修改，删除，查询
	 */
	public void addTest() {
		// 测试数据数据
		list.add(new Goods(1, "笔记", 12, 50));	
		list.add(new Goods(2, "钢笔", 13, 50));	
		list.add(new Goods(3, "铅笔", 2, 200));	
		list.add(new Goods(4, "草稿纸", 0.5, 500));
	}
	
	public Goods  add(int num, String name, double price, int quantity) {		
		
		// 编号确定唯一值
		for(Goods goods : list) {
			if(num == goods.getNum()) {  // 如果添加的编号已经存在，则添加失败
				return null;
			}
		}
		Goods newGoods = new Goods(num, name, price, quantity);
		return newGoods;
	}
	
	public Goods update(int changeNum, int num, String name, double price, int quantity) {
			
		for(Goods goods : list) {
			if(changeNum == goods.getNum()) {  // 修改成功则返回修改后的对象
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
		for(Goods goods : list) {  // 如果编号不存在，则无法删除
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
