package edu;
import java.util.Scanner;
public class DvumerniMasivi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] verni = new char[10];
		char[] [] otg = new char[8][10];
		for(int i=0; i<10; i++) {
			System.out.println("Въведете верния отговор на въпрос " + (i+1));
			verni[i]=sc.nextLine().charAt(0);
		}
		for(int i=0; i<8; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("Въведете отговора на ученик " + (i+1) + " на въпрос " + (j+1));
				otg[i][j]=sc.nextLine().charAt(0);
			}
		}
		for(int i=0; i<8; i++) {
			int tochki=0;
			for(int j=0; j<10; j++) {
				if(otg[i][j]==verni[j]) {
					tochki++;
				}
			}
			System.out.println("Резултатът на ученик " + (i+1) + " е " + tochki);
		}
	}

}
