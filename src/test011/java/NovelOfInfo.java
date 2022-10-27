package test011.java;

public class NovelOfInfo {
	public static void main(String[] args) {
		
		//初始化数据
		Novel[] novelAll = new Novel[3]; 
		novelAll[0]  = new Novel(1001, "武动乾坤", "天蚕土豆", 1000);
		novelAll[1]  = new Novel(1002, "神墓", "辰东", 2000);
		novelAll[2]  = new Novel(1003, "狂神", "唐家三少", 456);

		//添加小说数据到数组中


		infoTop();
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}

		System.out.println("\n添加一条记录");
		infoTop();
		Novel novelData = new Novel(1004, "斗罗大陆", "唐家三少", 10000);
		novelAll = addInfo(novelAll, novelData);
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}


		System.out.println("\n粉丝数降序查询");
		infoTop();
		novelAll = sort(novelAll);
		for (int i = 0; i < novelAll.length; i++) {
			novelAll[i].info();
		}




	}
	//冒泡排序，降序关注量
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
		System.out.println("\t\t网络小说列表");
		System.out.println("编号 \t 名称 \t 作者 \t 关注量");

	}



}
