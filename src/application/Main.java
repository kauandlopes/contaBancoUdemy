package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		account conta = new account();
		
		//numero da conta
		System.out.print("Enter account number: ");
		conta.setAccountNumber(sc.nextInt());
		sc.nextLine();
		
		//nome da conta
		System.out.print("Enter account holder: ");
		conta.setAccountHolder(sc.nextLine());
		
		//valor inicial
		System.out.print("Is there an initial deposit (y/n): ");
	        char validacao = sc.next().charAt(0);

	        if (validacao == 'y') {
	            System.out.print("Enter initial deposit value: ");
	            double deposit = sc.nextDouble();
	            conta.deposit(deposit);    
	        }
	        
	        System.out.println(conta);
	        
	        //deposito
	        System.out.print("Enter a deposit value: ");
	        double deposit = sc.nextDouble();
            conta.deposit(deposit);
	        
            System.out.println(conta);
	        
	        //saque
	        System.out.print("Enter a withdraw value: ");
	        double withdraw = sc.nextDouble();
            conta.withdraw (withdraw );
            
            System.out.println(conta);
	        
	        
	        sc.close();
	    }
	
	}