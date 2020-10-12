package edu;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width");
		double width = sc.nextDouble();
		System.out.println("Enter length");
		double length = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		int area = (int) Math.ceil(width*length + 2*(width+length)*height);
		int fiveL=0;
		int oneL=0;
		fiveL+=area/140;
		int areaLeft = area%140;
		oneL = areaLeft/30 + ((areaLeft%30!=0)?1:0);
		if (oneL*4>fiveL) {
			oneL = 0;
			fiveL++;
		}
		System.out.println("You need " + fiveL + " five liter buckets and " + oneL + " one liter buckets.");
	}

}
