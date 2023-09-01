package ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		 System.out.println("Digite o numero da agencia");
	        int numero = scanner.nextInt();
	        
	       System.out.println("digite a agencia");
		    String agencia = scanner.next();
		    
		    System.out.println("digite seu nome");
		    String nomeCliente  = scanner.next();
		    
		    System.out.println("digite seu saldo");
		    double saldo = scanner.nextDouble();
		    
		    
		    System.out.println("ola " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta "+ numero +" e seu saldo " + saldo + " ja esta disponivel para saque." );
		    
		    
		    
		    
		    
		    
	}
}
