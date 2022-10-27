package test019.java;
enum Color{
	RED,GREEN,BLUE;
}
public class EnumExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String scolor = "Red";
		scolor = scolor.toUpperCase();
		System.out.println(scolor);
		
		Color color = Color.valueOf(scolor);
		switch(color) {
		case RED:
			System.out.println("ºìÉ«");
			break;
		case GREEN:
			System.out.println("ÂÌÉ«");
			break;
		case BLUE:
			System.out.println("À¶É«");
			break;
		}
	}

}
