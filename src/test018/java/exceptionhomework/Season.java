package test018.java.exceptionhomework;

public enum Season {
	
	// SPRING("��ů����")   -> private static final Season SPRING1 = new Season("��ů����");
	
	SPRING("��ů����"),SUMMER("��������"),AUTUMN("�����ˬ"),WINTER("����ѩƮ");
	private String feel;	
	private Season(String feel) {
		this.feel = feel;
	}
	
	public  String getFeel() {
		return feel;
	}
	
	
	public void setFeel(String feel) {
		this.feel = feel;
	}

//	public static String getValue(String feel1) {
//		for(Season season : Season.values()) {
//			if(season.getFeel().equals(feel1)) {
//				return season.getFeel();
//			}
//		}
//		return null;
//	}
	
	
	@Override
	public String toString() {
		return feel;
	}
}