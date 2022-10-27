package test020.java.shopping;

public class View {
	// 功能展示	
	public ExeGoods exeGoods;
	public boolean loop = true;
	
	public void view() {
		exeGoods = new ExeGoods();
		menuView();	
		
		while(loop) {	
			System.out.print("请选择菜单：");
			String option = Utils.inputStr();
			
			switch(option) {
			case "1":
//				exeGoods.addTest(); // 添加测试数据
				addView();
				break;
			case "2":
				updateView();
				break;
			case "3":
				delView();
				break;
			case "4":
				showView();
				break;
			case "5":
				loop = false;
				break;
			}						
		}
		System.out.println("程序退出......");
	}
	
	public void menuView() {
		System.out.println("********************菜单********************");
		System.out.println("1.添加；2.修改数量；3.删除商品； 4.查询全部 ; 5.退出");		
		System.out.println("********************************************");
	}
	
	public void addView() {
		System.out.println("====正在进行添加====");
		System.out.print("请输入编号：");
		int num = Utils.inputInt();
		System.out.print("请输入名称: ");
		String name = Utils.inputStr();
		System.out.print("请输入价格: ");
		double price = Utils.inputDouble();
		System.out.print("请输入数量: ");
		int quantity = Utils.inputInt();		
		Goods newGoods = exeGoods.add(num, name, price, quantity);
		if(newGoods == null) {
			System.out.println("你要添加的商品编号已存在，请重新添加");
			return;
		}
		System.out.println("商品添加完成......");
	}
	
	public void updateView() {
		System.out.println("====正在进行修改====");
		System.out.print("请选择需要修改的编号：");
		int changeNum = Utils.inputInt();
		
		Goods changeGoods = exeGoods.showOne(changeNum);
		if(changeGoods == null) {
			System.out.println("修改失败，你输入的编号不存在/或输入有误");
			return;
		}
		
		// 提示原有的修改数据  请输入修改编号(1)
		System.out.print("请输入修改编号 ( " + changeGoods.getNum() + " ):");
		int num = Utils.inputInt();
		System.out.print("请输入修改名称 ( " + changeGoods.getName() + " ):");
		String name = Utils.inputStr();
		System.out.print("请输入修改价格 ( " + changeGoods.getPrice() + " ): ");
		double price = Utils.inputDouble();
		System.out.print("请输入修改数量 ( " + changeGoods.getQuantity() + " ): ");
		int quantity = Utils.inputInt();		
		changeGoods = exeGoods.update(changeNum, num, name, price, quantity);
		
		System.out.println("编号\t名称\t价格\t数量");
		System.out.println(changeGoods.info() + " 修改成功...");
	}
	public void delView() {
		System.out.print("请输入要删除的编号：");
		int num = Utils.inputInt();
		Goods delGoods = exeGoods.del(num);
		if(delGoods == null) {
			System.out.println("删除失败，你输入的编号不存在/或输入有误");
			return;
		}
		
		System.out.println("编号\t名称\t价格\t数量");
		System.out.println(delGoods.getName() + " 被删除成功...");		
	}
	public void showView() {
		System.out.println("编号\t名称\t价格\t数量");
		exeGoods.show();
	}
	
}
