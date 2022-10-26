package test020.java.shopping;

public class View {
	// ����չʾ	
	public ExeGoods exeGoods;
	public boolean loop = true;
	
	public void view() {
		exeGoods = new ExeGoods();
		menuView();	
		
		while(loop) {	
			System.out.print("��ѡ��˵���");
			String option = Utils.inputStr();
			
			switch(option) {
			case "1":
//				exeGoods.addTest(); // ��Ӳ�������
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
		System.out.println("�����˳�......");
	}
	
	public void menuView() {
		System.out.println("********************�˵�********************");
		System.out.println("1.��ӣ�2.�޸�������3.ɾ����Ʒ�� 4.��ѯȫ�� ; 5.�˳�");		
		System.out.println("********************************************");
	}
	
	public void addView() {
		System.out.println("====���ڽ������====");
		System.out.print("�������ţ�");
		int num = Utils.inputInt();
		System.out.print("����������: ");
		String name = Utils.inputStr();
		System.out.print("������۸�: ");
		double price = Utils.inputDouble();
		System.out.print("����������: ");
		int quantity = Utils.inputInt();		
		Goods newGoods = exeGoods.add(num, name, price, quantity);
		if(newGoods == null) {
			System.out.println("��Ҫ��ӵ���Ʒ����Ѵ��ڣ����������");
			return;
		}
		System.out.println("��Ʒ������......");
	}
	
	public void updateView() {
		System.out.println("====���ڽ����޸�====");
		System.out.print("��ѡ����Ҫ�޸ĵı�ţ�");
		int changeNum = Utils.inputInt();
		
		Goods changeGoods = exeGoods.showOne(changeNum);
		if(changeGoods == null) {
			System.out.println("�޸�ʧ�ܣ�������ı�Ų�����/����������");
			return;
		}
		
		// ��ʾԭ�е��޸�����  �������޸ı��(1)
		System.out.print("�������޸ı�� ( " + changeGoods.getNum() + " ):");
		int num = Utils.inputInt();
		System.out.print("�������޸����� ( " + changeGoods.getName() + " ):");
		String name = Utils.inputStr();
		System.out.print("�������޸ļ۸� ( " + changeGoods.getPrice() + " ): ");
		double price = Utils.inputDouble();
		System.out.print("�������޸����� ( " + changeGoods.getQuantity() + " ): ");
		int quantity = Utils.inputInt();		
		changeGoods = exeGoods.update(changeNum, num, name, price, quantity);
		
		System.out.println("���\t����\t�۸�\t����");
		System.out.println(changeGoods.info() + " �޸ĳɹ�...");
	}
	public void delView() {
		System.out.print("������Ҫɾ���ı�ţ�");
		int num = Utils.inputInt();
		Goods delGoods = exeGoods.del(num);
		if(delGoods == null) {
			System.out.println("ɾ��ʧ�ܣ�������ı�Ų�����/����������");
			return;
		}
		
		System.out.println("���\t����\t�۸�\t����");
		System.out.println(delGoods.getName() + " ��ɾ���ɹ�...");		
	}
	public void showView() {
		System.out.println("���\t����\t�۸�\t����");
		exeGoods.show();
	}
	
}
