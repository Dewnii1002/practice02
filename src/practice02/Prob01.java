package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		Scanner scanner = new Scanner(System.in);
		String moneys = scanner.nextLine();

		int money = Integer.parseInt(moneys);
		int[] temp = new int[10];
		int[] change = new int[11];

		change[0] = money;

		for (int i = 0; i < 10; i++) {

			temp[i] = change[i] / MONEYS[i];
			change[i + 1] = change[i] - MONEYS[i] * temp[i];
			System.out.println(MONEYS[i] + "원: " + temp[i]);
		}
		scanner.close();
	}

	/* 肄붾뱶瑜� �셿�꽦�빀�땲�떎 */

}
