package practice5;

import java.util.Scanner;

public abstract class GameObject{
	protected int distance;
	protected int x,y;
	public GameObject(int startX, int startY, int distance) {
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) {
		if(this.x==p.getX() && this.y ==p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();
	protected abstract char getShape();

	
	public static void main(String[] args) {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		Bear b = new Bear();
		int tempx=(int)(Math.random()*20)+1;
		int tempy=(int)(Math.random()*10)+1;
		Fish f = new Fish(tempx,tempy,1);
		Game g = new Game(b,f);
		g.Show(b,f);
		while(!b.collide(f)) {
			 b.move();
			 f.move();
			 g.Show(b, f);
		}
		System.out.println("Bear Wins!!");
	}
}
class Game{
	Bear b;
	Fish f;
	public Game(Bear b, Fish f) {
		this.b =b;
		this.f = f;
	}
	public void Show(Bear b, Fish f) {
		int x1= b.getX(), y1= b.getY();
		int x2 = f.getX(), y2 = f.getY();
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				if(x1==x2 && y1==y2 && j==x2 && i ==y2 && j==x1 && i==y1 ) {
					System.out.print(b.getShape());
					continue;
				}
				if(j==x2 && i ==y2) {
					System.out.print(f.getShape());
				}
				if(j==x1 && i==y1) {
					System.out.print(b.getShape());
				}
				
				
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
class Bear extends GameObject{
	public Bear() {
		super(0, 0, 1);
//		int startX= (int)(Math.random()*20);
//		int startY= (int)(Math.random()*10);
//		int distance = 1;
	}
	String input;
	Scanner scanner = new Scanner(System.in);
	@Override
	protected void move() {
		while(true) {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f)>>");
		input = scanner.next();
		if(this.x<=0) {
			if(input.equals("a")) continue;
		}
		if(this.x>=19) {
			if(input.equals("f")) continue;
		}
		if(this.y<=0) {
			if(input.equals("d")) continue;
		}
		if(this.y>=9) {
			if(input.equals("s")) continue;
		}
		break;
	}
		switch(input) {
		case "a":this.x= this.x-distance; break;
		case "s":this.y=this.y+distance; break;
		case "d":this.y=this.y-distance; break;
		case "f":this.x=this.x+distance; break;
		}
	}
	@Override
	protected char getShape() {
		return 'B';
	}
}

class Fish extends GameObject{
	int check=0;
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void move() {
		if(check<3) {
			check++;
			return;
		}
		else {
			int input;
			while(true) {
				input = (int)(Math.random()*4);
				
				if(this.x<=0) {
					if(input==0) continue;
				}
				if(this.x>=19) {
					if(input==3) continue;
				}
				if(this.y<=0) {
					if(input==2) continue;
				}
				if(this.y>=9) {
					if(input==1) continue;
				}
				break;
			}
			
			switch(input) {
			case 0:this.x= this.x-distance; break;
			case 1:this.y=this.y+distance; break;
			case 2:this.y=this.y-distance; break;
			case 3:this.x=this.x+distance; break;
			}
			check++;
			if(check==5) check=0;
		}
	}
	@Override
	protected char getShape() {
		return '@';
	}
}

