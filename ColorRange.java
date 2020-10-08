package edu;
import java.util.Scanner;
public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double waveLenght;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color code");
		waveLenght = sc.nextDouble();
		if(waveLenght>=380.0&&waveLenght<450.0){
		System.out.println("The color is Violet.");
		}else if(waveLenght>=450.0&&waveLenght<495.0){
		System.out.println("The color is Blue.");	
		}else if(waveLenght>=495.0&&waveLenght<570.0){
		System.out.println("The color is Green.");	
		}else if(waveLenght>=570.0&&waveLenght<590.0){
		System.out.println("The color is Yellow.");	
		}else if(waveLenght>=590.0&&waveLenght<620.0){
		System.out.println("The color is Orange.");	
		}else if(waveLenght>=620.0&&waveLenght<750.0){
		System.out.println("The color is Red.");	
		}else{
		System.out.println("The entered wavelength is not a part of the visible spectrum");
		}
		sc.close();
	}

}
