package practice6;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringTokenizer st;
		StringBuffer sb ;
		String order;
		
		String temp1, temp2;
		System.out.print(">>");
		String str = scanner.nextLine();
		sb = new StringBuffer(str);
		while(true) {
			System.out.print("명령: ");
			order = scanner.nextLine();
			if (order.equals("그만")) break;
			
			try {
			st = new StringTokenizer(order,"!");

			temp1 = st.nextToken();
			temp2 = st.nextToken();
			}
			catch(NoSuchElementException e){
				System.out.println("잘못된 명령 입니다!");
				continue;
			}
			if(sb.indexOf(temp1)!=-1) {
				sb.replace(sb.indexOf(temp1),sb.indexOf(temp1)+temp1.length(),temp2);
				System.out.println(sb);
			}
			else {
				System.out.println("찾을 수 없습니다!!");
			}
		}
		System.out.println("종료합니다.");
		scanner.close();
	}
}
