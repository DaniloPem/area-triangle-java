package entidades;

public class Triangulo {
	public double lado1;
	public double lado2;
	public double lado3;

	public double area() {
		double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
		return Math.sqrt(semiperimetro*(semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado3));
	}
}
