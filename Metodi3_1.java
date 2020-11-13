package edu2;

public class Metodi3_1 {
	
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
		int count=0;
		int number=13;
		
		while(count<120) {
			int number2=number;
			int reversed = 0;
			while(number2>0) {
				int a=number2%10;
				reversed=reversed*10+a;
				number2=number2/10;
			}
		boolean prime = isPrime(number);
		boolean reversedPrime = isPrime(reversed);
		boolean palindrom = isPalindrom(number);
		if(prime==true&&palindrom==false&&reversedPrime==true) {
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
