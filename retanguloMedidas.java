import java.util.*;

public class retanguloMedidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Base do retângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Altura do retângulo: ");
		double altura = scanner.nextDouble();
		
		System.out.println("AREA: " + base * altura);
		
		System.out.println("PERIMETRO " + 2*(base+altura));
		
		System.out.println("Diagonal " + Math.sqrt((altura*altura) + (base*base)));
		
		scanner.close();
	}

}
