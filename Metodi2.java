package edu2;

public class Metodi2 {
	
	public static boolean isPrime (int num) {
		boolean isPrime=true;
		int maxDivider=(int)Math.ceil(Math.sqrt(num));
		for(int i = 2; i<=maxDivider;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static boolean isPalindrom(int num) {
		boolean pal=false;
		int num2=num;
		int reversed=0;
		while(num2>0) {
		int a=num2%10;
		reversed = reversed*10+a;
		num2=num2/10;
	}
		if(reversed==num) {
			pal=true;
		}
		return pal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		int number=2;
		System.out.print(number + "\t");
		while(count<120) {
			boolean prime=isPrime(number);
			boolean palindrom=isPalindrom(number);
			if(prime&&palindrom) {
				System.out.print(number + "\t");
				count++;
				if(count%10==0) {
					System.out.println();
				}
			}
			number++;
		}
	}

}
