package edu;
import java.util.Scanner;

public class DvumerniMasivi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int num[][]=new int [m][n];
		int num2 [] [] = new int [n][m];
		for (int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.println("Number?");
				num[i][j]=sc.nextInt();
			}
		}
		for (int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				num2[j][i]=num[i][j];
			}
		}
		for (int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(num2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
