package edu;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double taksa = 10000;
		double suma = 0;
		for(int i = 0; i<10; i++) {
			taksa=taksa*106/100;
		}
		taksa = Math.round(taksa*100.0)/100.0;
		System.out.println(taksa);
		for (int i = 0; i<4; i++) {
			suma = suma + taksa;
			taksa = taksa*106/100;
		}
		suma = Math.round(suma*100.0)/100.0;
		System.out.println(suma);
	}

}
