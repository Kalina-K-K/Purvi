package edu;

public class EdnomerniMasivi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums=new int[20];
		int min=1;
		int max=100;
		int range = max-min+1;
		for(int i=0;i<10;i++){
			nums[i]=(int)(Math.random()*range);
		}
		for(int i=0; i<10; i++){
			System.out.println(nums[i]);
		}
	}

}
