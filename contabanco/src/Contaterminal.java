import java.util.Locale;
import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) {
        int saldo = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite sua Agência");
        String agencia = scanner.next();

        System.out.println("Digite o Número da sua conta");
        int numero = scanner.nextInt();
        
        

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
        System.out.println("Digite 1 - para realizar um deposito");
        System.out.println("Digite 2 - para realizar um saque");
        System.out.println("Digite 3 - para sair");
        int depositar = scanner.nextInt();

        if ( depositar == 1) {
            System.out.print("Digite o Valor a ser depositado: ");
            int valordeposito = scanner.nextInt();
    
        saldo = saldo + valordeposito;
        System.out.print( "seu saldo atual é de " + saldo + " reais");
        }
        
        if ( depositar == 2){
            System.out.print("Digite o Valor de saque: ");
            int valorsaque = scanner.nextInt();
                
            if (saldo > valorsaque){
            saldo = saldo - valorsaque;
            System.out.print( "seu saldo atual é de " + saldo + " reais");}
            else
            System.out.print( "Saldo insuficiente");}
            
        if ( depositar == 3){
            System.out.print("Obrigado por utilizar o banco");
        }

        }

    }
        
    
    
