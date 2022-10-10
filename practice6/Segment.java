package practice6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Segment {

	public static void main(String[] args) {
		String s;
		int n;
		StringTokenizer st;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print(">>");
			s=scanner.nextLine();
			if(s.equals("그만")) break;
			st = new StringTokenizer(s," ");
			n = st.countTokens();
			System.out.println("어절 개수는 "+n);	
		}while(!s.equals("그만"));
		
		scanner.close();
	}
	
	
}
