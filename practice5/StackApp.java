package practice5;

import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack{
	int len;
	int capa;
	String[] arr;
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return len;
	}

	@Override
	public int capacity() {
		return capa;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		int top = len-capa-1;
		capa++;
		return arr[top];
	}

	@Override
	public boolean push(String val) {
		if(this.capacity()==0) return false;
		else {
			arr[len-capa]=val;
			capa--;
			return true;
		}
	}

}

public class StackApp{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		StringStack s = new StringStack();
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int len = scanner.nextInt();
		s.arr = new String[len];
		s.len=len;
		s.capa=len;
		
		while(true) {
			System.out.print("문자열 입력 >>");
			input = scanner.next();
			if(input.equals("그만")) break;
			
			if(!s.push(input)) {
				System.out.println("스택이 꽉차서 푸시 불가!");
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.pop()+" ");
		}
		
		scanner.close();
		
	}
}
