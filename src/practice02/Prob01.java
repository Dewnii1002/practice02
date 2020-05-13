package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		Scanner scanner = new Scanner(System.in);
		String moneys = scanner.nextLine();

		int length = moneys.length();

		int money = Integer.parseInt(moneys);
		int[] temp = new int[length];
		int[] change = new int[length];
		
		change[0] = money;

		for (int i = 0; i < length; i++) {
			if (change[i] / MONEYS[i] >= 1) {
				temp[i] = change[i] / MONEYS[i];
				change[i+1] = change[i] - MONEYS[i]*temp[i];
				System.out.println(temp[i]);
			}

		}
		scanner.close();
	}

	/* 코드를 완성합니다 */

}
