package test018.java.exceptionhomework;

public enum Season {
	
	// SPRING("春暖花开")   -> private static final Season SPRING1 = new Season("春暖花开");
	
	SPRING("春暖花开"),SUMMER("夏日炎炎"),AUTUMN("秋高气爽"),WINTER("冬日雪飘");
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