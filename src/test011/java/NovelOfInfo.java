package test011.java;

public class NovelOfInfo {
	public static void main(String[] args) {
		
		//��ʼ������
		Novel[] novelAll = new Novel[3]; 
		novelAll[0]  = new Novel(1001, "�䶯Ǭ��", "�������", 1000);
		novelAll[1]  = new Novel(1002, "��Ĺ", "����", 2000);
		novelAll[2]  = new Novel(1003, "����", "�Ƽ�����", 456);

		//���С˵���ݵ�������


		infoTop();
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}

		System.out.println("\n���һ����¼");
		infoTop();
		Novel novelData = new Novel(1004, "���޴�½", "�Ƽ�����", 10000);
		novelAll = addInfo(novelAll, novelData);
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}


		System.out.println("\n��˿�������ѯ");
		infoTop();
		novelAll = sort(novelAll);
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}




	}
	//ð�����򣬽����ע��
	/**
	 @return Novel[]
	 */
	public static Novel[] sort(Novel[] allNovel){
		Novel novelTemp = new Novel();
		for(int i = 0; i < allNovel.length - 1; i++){
			for (int j = 0; j < allNovel.length -1 -i; j++){
				if(allNovel[j].fans < allNovel[j + 1].fans){
					novelTemp = allNovel[j + 1];
					allNovel[j + 1] = allNovel[j];
					allNovel[j] = novelTemp;
				}
			}
		}
		return allNovel;
	}

	/**
		@return Novel[]
	 */
	public static Novel[] addInfo(Novel[] allNovel, Novel novel){
		Novel[] temp = new Novel[allNovel.length + 1];
		for(int i = 0; i < allNovel.length; i++){
			temp[i] = allNovel[i];
		}
		temp[allNovel.length] = novel;
		return temp;
	}

	public static void infoTop(){
		System.out.println("\t\t����С˵�б�");
		System.out.println("��� \t ���� \t ���� \t ��ע��");

	}



}
