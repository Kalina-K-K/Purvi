package edu;
import java.util.Scanner;
public class EdnomerniMasivi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.println("Insert number " + (i+1));
			nums[i]=sc.nextInt();
		}
		int swap=nums[0];
		for(int i=1; i<10; i++){
			nums[i-1]=nums[i];
		}
		nums[9]=swap;
		for(int i=0; i<10; i++){
			System.out.println(nums[i]);
		}
	}

}
