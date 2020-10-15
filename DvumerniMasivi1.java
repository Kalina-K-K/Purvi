package edu;
import java.util.Scanner;
public class DvumerniMasivi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] nums = new int[5][5];
		int max=-99999;
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println("Number?");
				nums[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<5; j++) {
				sum+=nums[i][j];
			}
			if(max<sum) {
				max=sum;
			}
		}
		System.out.println(max);
	}

}
