package SelfStudy;

import java.util.Scanner;

public class DiceExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("주사위를 굴리고 있습니다.");
		
		int dice;
		dice = (int) (Math.random()*6)+1;
		boolean suc = true;
		while(suc) {
			System.out.println("주사위 숫자를 맞추시오.");
			int answer = scn.nextInt();
			if(dice == answer) {
				System.out.println("정답입니다.");
				System.out.println("프로그램 종료");
				suc = false;
				continue;
			}else {
				System.out.println("정답이 아닙니다. 다시 선택하세요.");
			}

		}
	}

}
