import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		//logica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("________________");
		System.out.println("____JokenPo_____");
		System.out.println("________________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		//estrutura switch case admite apenas tipo int e char
		switch (jogador) {
		case 1:
			System.out.println("jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		//lógica do computador
		// a linha abaixo gera números aleatórios entre 0 e 2 somando +1
		//(int) converte para o tipo inteiro (casting)
		int computador = (int)(Math.random() * 3 + 1);
		System.out.println(computador);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//lógica para determinar o vencedor ou empate
		if (jogador == computador) {
			System.out.println("EMPATE");
			} else {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ) {
					System.out.println("Jogador Venceu");
			} else {
				System.out.println("Computador Venceu");
			}
		mao.close();

	}
  }
}
