package edu;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
