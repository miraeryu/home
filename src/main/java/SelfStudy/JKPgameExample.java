package SelfStudy;

import java.util.Scanner;

public class JKPgameExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);


		boolean game =true;
		System.out.println("---------------------------");
		System.out.println("가위바위보 게임");
		System.out.println("---------------------------");
		while( game ) {
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하시오.");
			int com = (int) (Math.random()*3) + 1;
			int user = scn.nextInt();
			
			if (user == 1){
				if (com == 2) {
					System.out.println("당신의 승리입니다.\n 프로그램 종료");
					break;
				}if (com == 3) {
					System.out.println("틀렸습니다. 다시 도전하세요.");
				}if (com == 1) {
					System.out.println("틀렸습니다. 다시 도전하세요.");
				}
				
				if (user == 2) {
					if (com ==3) {
						System.out.println("당신의 승리입니다.\n 프로그램 종료");
						break;
					}if (com ==2) {
						System.out.println("틀렸습니다. 다시 도전하세요.");
					}if (com == 1) {
						System.out.println("틀렸습니다. 다시 도전하세요.");
					}
				}if (user == 3) {
					if (com == 1) {
						System.out.println("당신의 승리입니다.\n 프로그램 종료");
						break;
					}if (com == 2) {
						System.out.println("틀렸습니다. 다시 도전하세요.");
					}if (com == 3) {
						System.out.println("틀렸습니다. 다시 도전하세요.");
					}
				}
					
				}
			}
			{
		}
	}

}
