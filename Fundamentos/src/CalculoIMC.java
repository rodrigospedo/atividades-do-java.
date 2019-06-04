import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		double altura, peso, resultado;
		System.out.println("Cálculo da média");
		// criando um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		// criando um objeto para formatar o resultado
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.print("Digite a Altura: ");
		altura = leia.nextDouble();
		System.out.print("Digite o Peso: ");
		peso = leia.nextDouble();
		resultado = peso / (altura  * altura);
		System.out.println("O IMC é: " + formatador.format(resultado));
		if (resultado < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (resultado >= 18.5 && resultado < 25) {
			System.out.println("Peso Normal");
		leia.close();
		} else if (resultado >= 25 && resultado < 30) {
			System.out.print("Acima do peso");
		} else {
			System.out.print("Obeso");
		}
	}
}
