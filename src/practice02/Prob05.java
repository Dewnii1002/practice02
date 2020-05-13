package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100) +1;
		int tryCount = 1;
		
		while(true) {
			System.out.print(tryCount+">>");
			int input = scanner.nextInt();
			
			if(k==input) {
				break;
			}
			
			tryCount++;
		}

		
		/* 코드를 완성합니다 */

		
		
		scanner.close();
	}

}
