package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Cau2
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("n =");
		n =sc.nextInt();
		if(n % 2 == 0) {
			System.out.println(n + " la so chan");
		}else {
			System.out.println( n + "la so chan");
		}
		//S = 1 + 1/2 + ... + /n;
		double tong = 0;
		for (int i = 2; i <= n; i++) {
			tong += (double)1/i;
		}
		System.out.println("Tong" + tong);
	}
}
