package edu;
import java.util.Scanner;
public class Planets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Your weight?");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter planet");
		String planet = sc.nextLine();
		double coeff = 1;
		switch(planet) {
		case "Mercury":
			coeff=0.38; break;
		case "Venus":
			coeff=0.91; break;
		case "Mars":
			coeff=0.38; break;
		case "Jupiter":
			coeff=2.36; break;
		case "Saturn":
			coeff=0.92; break;
		case "Uranus":
			coeff=0.89; break;
		case "Neptune":
			coeff=1.13; break;
		}
		System.out.println("Your weight on " + planet + " is " + Math.round((weight*coeff)*100.0)/100.0);
		}

}
