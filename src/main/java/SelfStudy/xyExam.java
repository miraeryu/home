package SelfStudy;

public class xyExam {
	public static void main(String[] args) {
		int x, y;
		
		System.out.println("4x+5y=60에 들어가는 (x,y)는?(단, x와 y는 10을 넘지 않음)");
		
		for(x=1; x<=10;x++) {
			for(y=1; y<=10; y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("("+x+", "+y+")");
				};
			}
		}
	}

}
