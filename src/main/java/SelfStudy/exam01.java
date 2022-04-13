package SelfStudy;

public class exam01 {
	public static void main(String[] args) {
		int score = 85;
		System.out.println("등급은");
		if(score < 70) {
			System.out.println("D");
		}else if (score <80) {
			System.out.println("C");
		}else if (score <90) {
			System.out.println("B");
		}else if (score <100) {
			System.out.println("A");
		}
		System.out.println("입니다.");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		int sum = 0;
		System.out.println("-------------");
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	} 

}
