package edu;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String a1="";
		String b1="";
		boolean isAnagram = true;
		int la=a.length();
		int lb=b.length();
		for(int i=0; i<la; i++) {
			char c=a.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				a1+=c;
			}
		}
		for(int i=0; i<lb; i++) {
			char c=b.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				b1+=c;
			}
		}
		if(a1.length()!=b1.length()) {
			isAnagram = false;
		}else {
			a1 = a1.toLowerCase();
			b1 = b1.toLowerCase();
			char[] a2 = a1.toCharArray();
			char[] b2 = b1.toCharArray();
			Arrays.sort(a2);
			Arrays.sort(b2);
			String finala = new String (a2);
			String finalb = new String (b2);
			if(finala.equals(finalb)) {
				isAnagram=true;
			}else {
				isAnagram=false;
			}
//			for(int i=0; i<a1.length(); i++) {
//				for(int j=0; j<a1.length()-i;j++) {
//				char min = 'z';	
//				char d=a1.charAt(i);
//				char e=a1.charAt(i+1);
//				if(e<d) {
//					char swap = d;
//					
//				}
//				}
//			}
		}
		if(isAnagram) {
			System.out.println("This is an anagram");
		}else {
			System.out.println("This isn't an anagram");
		}
	}

}
