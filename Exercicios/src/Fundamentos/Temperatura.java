package Fundamentos;

public class Temperatura {
public static void main(String[] args) {
	
	// (�F - 32) x 5/9 = �C
	
	final double FATOR = 5/9.0;
	final double AJUSTE = 32;		
	double fahrenheit = 86;
	double celcius = (fahrenheit - AJUSTE) * FATOR;
	System.out.println("O resultado � " + celcius + "�C");
	
	fahrenheit = 0;
	celcius = (fahrenheit - AJUSTE) * FATOR;
	System.out.println("O resultado � " + celcius + "�C");
	
}
}
