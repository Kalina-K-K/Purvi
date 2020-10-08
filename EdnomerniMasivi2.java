package edu;
import java.util.Scanner;
public class EdnomerniMasivi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		int min=0;
		int max = 9;
		int range = max-min+1;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.println("Input number" + (i+1));
			nums[i] =sc.nextInt();
		}
		for(int j=0; j<10; j++){
			int rIndex = (int)(Math.random()*range);
			int swap = nums[j];
			nums[j]= nums[rIndex];
			nums[rIndex]=swap;
		}
		for(int i=0; i<10; i++){
			System.out.println(nums[i]);
		}
	}

}
