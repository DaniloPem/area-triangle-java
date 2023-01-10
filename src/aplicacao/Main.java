package aplicacao;

import java.util.Scanner;

import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira as medidas dos lados do triangulo X: ");
		x.lado1 = sc.nextDouble();
		x.lado2 = sc.nextDouble();
		x.lado3 = sc.nextDouble();
		
		System.out.println("Insira as medidas dos lados do triangulo Y: ");
		y.lado1 = sc.nextDouble();
		y.lado2 = sc.nextDouble();
		y.lado3 = sc.nextDouble();
		
		double areaTrianguloX = x.area();
		double areaTrianguloY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaTrianguloX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaTrianguloY);
		
		if(areaTrianguloX > areaTrianguloY) {
			System.out.println("A maior área é do triângulo X.");
		} else {
			System.out.println("A maior área é do triângulo Y.");
		}
		
		sc.close();
	}

}
