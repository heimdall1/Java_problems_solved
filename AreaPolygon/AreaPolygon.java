import java.util.Scanner;
import java.lang.Math;

public class AreaPolygon{

	public static void main(String[] args)
	{
		double area = 0;
		System.out.println();
		System.out.println("BIENVENIDO AL CALCULADOR DE AREA DE POLIGONOS!");
		System.out.println("Introduce numero de lados del poligono:");
		Scanner sc = new Scanner(System.in);
		int lados = sc.nextInt();
		System.out.println("Introducir la medida de un lado:");
		int medida = sc.nextInt();
		area = calculo(lados, medida);
		System.out.println("AREA:");
		System.out.println(area);
	}

	public static double calculo(int lados, int medida)
	{
		double res = 0;
		double pi = 3.14;
		
		res = (lados*(medida*medida))/(4*Math.tan(pi/lados));
		return res;
	}

}
