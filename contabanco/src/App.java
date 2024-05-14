import java.util.Locale;
import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) {
        int saldo = 0;
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite sua Agência");
        String agencia = scanner.next();

        System.out.println("Digite o Número da sua conta");
        int numero = scanner.nextInt();
        
        

        
        System.out.println("Olá" + nomeCliente +," obrigado por criar uma conta em nosso banco, sua agência é " + agencia +, "conta" + numero + "e seu saldo " +saldo + "já está disponível para saque");
        
        
        
    }
}
