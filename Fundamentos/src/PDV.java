import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
public class PDV {

	public static void main (String[] args) {
	double valor, porcentagem, desconto = 0, calculo, total, pago, troco;
	Date data = new Date();
		
	DateFormat Formatador = 
	DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println(Formatador.format(data));
	Scanner leia = new Scanner(System.in);
	System.out.println("============");
	System.out.println("====PDV====");
	System.out.println("==============");
	System.out.println("");
	System.out.println("Valor total: ");
	valor = leia.nextDouble();
	System.out.println("Desconto em %: ");
	porcentagem = (valor * desconto) / 100;
	desconto = leia.nextDouble();
	calculo = (desconto * valor) / 100;
	total = (valor - calculo);
	System.out.println("Total com desconto: " + total);
	System.out.println("________________________");
	System.out.println("");
	System.out.println("Valor Pago: ");
	pago = leia.nextDouble();
	troco = (pago - total);
	System.out.println("troco: " + troco);
	}
	
	
}
