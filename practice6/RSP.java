package practice6;

import java.util.Scanner;

abstract class Player{
	int choice;
	abstract void turn();
}

class Cheolsu extends Player{
	Scanner scanner = new Scanner(System.in);
	@Override
	void turn() {
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
		this.choice = this.scanner.nextInt();
		
	}
}

class Computer extends Player{

	@Override
	void turn() {
		this.choice = (int)(Math.random()*3+1);
	}
}
public class RSP {
	static void Game(int x, int y){
		if(x==1) System.out.print("철수(가위) : ");
		else if(x==2) System.out.print("철수(바위) : ");
		else if(x==3) System.out.print("철수(보) : ");
		
		if(y==1) System.out.println("컴퓨터(가위)");
		else if(y==2) System.out.println("컴퓨터(바위)");
		else if(y==3) System.out.println("컴퓨터(보)");
		
		if(x==1 && y==2) {
			System.out.println("콤퓨타가 이겼습니다.");
		}
		else if(x==1 && y==3) {
			System.out.println("철수가 이겼습니다.");
		}
		else if(x==2 && y==1) {
			System.out.println("철수가 이겼습니다.");
		}
		else if(x==2 && y==3) {
			System.out.println("콤퓨타가 이겼습니다.");
		}
		else if(x==3 && y==2) {
			System.out.println("철수가 이겼습니다.");
		}
		else if(x==3 && y==1) {
			System.out.println("콤퓨타가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
			
		}
	}
	
	public static void main(String[] args) {
		
		Cheolsu cheolsu = new Cheolsu();
		Computer computer = new Computer();
		while(true) {
			cheolsu.turn();
			if(cheolsu.choice == 4) break;
			computer.turn();
			
			Game(cheolsu.choice,computer.choice);
			
		}
		cheolsu.scanner.close();
	}
}
