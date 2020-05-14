package practice02;

import java.util.Scanner;

public class Prob02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sum = 0.;
		int[] intArray = new int[5];

		System.out.println("5개의 숫자를 입력하세요.");

		for(int i = 0; i < 5; i++) {
			intArray[i]=scanner.nextInt();
			sum += intArray[i];
		}
		
		
		/* 코드를 완성합니다 */


		System.out.println("평균은 "+sum / intArray.length+"입니다.");
		scanner.close();
	}

}
