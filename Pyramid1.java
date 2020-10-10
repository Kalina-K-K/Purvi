package edu;
import java.util.Scanner;
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i>0; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j = 2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
