package practice5;

class Point{
	private int x,y;
	public Point(int x,int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}
public class ColorPoint extends Point{
	String Color;
	public ColorPoint(int i, int j, String string) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.Color=string;
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
	}

	private void setColor(String string) {
		// TODO Auto-generated method stub
		this.Color=string;
	}

	private void setXY(int i, int j) {
		// TODO Auto-generated method stub
		this.move(i, j);
	}
	public String toString(){
		return (this.Color+"색의 ("+this.getX()+","+this.getY()+")의 점");
	}
}
