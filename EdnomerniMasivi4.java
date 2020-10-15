package edu;

public class EdnomerniMasivi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] teste = new int[52];
		int min=1;
		int max=52;
		int range=max-min+1;
		int[] random = new int[4];
		for(int i=0; i<4; i++) {
			random[i]=(int)(Math.random()*range);
		}
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<4; j++) {
				if(random[i]==random[j]) {
					random[j]= (int)(Math.random()*range);
				}
			}
		}
		for(int i=0; i<4; i++) {
			int rank = random[i]%13;
			int boq = random[i]%4;
			switch(rank) {
			case 0:
				System.out.print("K ");
				break;
			case 1:
				System.out.print("A ");
				break;
			case 2:
				System.out.print("2 ");
				break;
			case 3:
				System.out.print("3 ");
				break;
			case 4:
				System.out.print("4 ");
				break;
			case 5:
				System.out.print("5 ");
				break;
			case 6:
				System.out.print("6 ");
				break;
			case 7:
				System.out.print("7 ");
				break;
			case 8:
				System.out.print("8 ");
				break;
			case 9:
				System.out.print("9 ");
				break;
			case 10:
				System.out.print("10 ");
				break;
			case 11:
				System.out.print("J ");
				break;
			case 12:
				System.out.print("Q ");
				break;
			}
			switch(boq) {
			case 0:
				System.out.print("пика\n");
				break;
			case 1:
				System.out.print("спатия\n");
				break;
			case 2:
				System.out.print("каро\n");
				break;
			case 3:
				System.out.print("купа\n");
				break;
			}
		}
	}

}
