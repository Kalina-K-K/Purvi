package edu;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean isAnagram = true;
		String b2 = b;
		int lengtha=a.length();
		for(int i = 0; i < lengtha; i++) {
			char charIna = a.charAt(i);
			if (charIna > 'a' && charIna < 'z' || charIna > 'A' && charIna < 'Z') {
				int positionInb = b2.indexOf(charIna);
				if(positionInb == -1) {
					isAnagram=false;
					break;
				}else {
					b2=b2.substring(0, positionInb) + b2.substring(positionInb + 1);
					System.out.println(b2);
				}
			}
		}
		if (isAnagram) {
			int charsLeftb2 = b2.length();
			for (int i = 0; i<charsLeftb2; i++) {
			char currentChar = b2.charAt(i);
			if(currentChar>='a' && currentChar<='z' || currentChar>='A' && currentChar <= 'Z') {
				isAnagram=false;
				break;
			}
			}
		}
		System.out.println(isAnagram ? "is an anagram" : "isn't an anagram");
	}

}
