package practice5;

public class Point3d extends Point{
	
	private String z;
	public Point3d(int x, int y,int z) {
		super(x, y);
		this.z=Integer.toString(z);
	}

	public static void main(String[] args) {
		Point3d p = new Point3d(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");
	}
	
	public String getZ() {
		return this.z;
	}
	public String toString(){
		return ("("+this.getX()+","+this.getY()+","+this.getZ()+")");
	}
	public void moveUp() {
		this.z= Integer.toString(Integer.parseInt(this.z)+1);
	}
	public void moveDown() {
		this.z= Integer.toString(Integer.parseInt(this.z)-1);
	}
	
	public void move(int x, int y ,int z) {
		this.move(x,y);
		this.z=Integer.toString(z);
	}
	
}
