package practice5;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	abstract int calculate();
	
	
}
class Add extends Calc{
	@Override
	int calculate() {
		return this.a+this.b;
	}	
}
class Sub extends Calc{

	@Override
	int calculate() {
		return this.a-this.b;
	}	
}
class Mul extends Calc{
	@Override
	int calculate() {
		return this.a*this.b;
	}	
}
class Div extends Calc{
	@Override
	int calculate() {
		return this.a/this.b;
	}	
}
public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		
		switch(c) {
		case "+": {
			Add op = new Add();
			op.setValue(a, b);
			System.out.println(op.calculate());
			break;
		}
		case "-": {
			Sub op = new Sub();
			op.setValue(a, b);
			System.out.println(op.calculate());
			break;
		}
		case "*": {
			Mul op = new Mul();
			op.setValue(a, b);
			System.out.println(op.calculate());
			break;
		}
		case "/": {
			Mul op = new Mul();
			op.setValue(a, b);
			System.out.println(op.calculate());
			break;
		}
		}
		scanner.close();
	}
}
