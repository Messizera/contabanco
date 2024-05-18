import java.util.Scanner;
import java.util.Locale;

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

        int depositar = 0;
        while (depositar != 4) {
            System.out.println("Digite 1 - para realizar um depósito");
            System.out.println("Digite 2 - para realizar um saque");
            System.out.println("Digite 3 - para verificar seu saldo");
            System.out.println("Digite 4 - para sair");
            depositar = scanner.nextInt();

            if (depositar == 1) {
                System.out.print("Digite o Valor a ser depositado: ");
                int valordeposito = scanner.nextInt();
                saldo += valordeposito;
                System.out.println("Seu saldo atual é de " + saldo + " reais");
            } else if (depositar == 2) {
                System.out.print("Digite o Valor de saque: ");
                int valorsaque = scanner.nextInt();

                if (saldo >= valorsaque) {
                    saldo -= valorsaque;
                    System.out.println("Saque efetuado no valor de " + valorsaque + " reais. Seu saldo atual é de " + saldo + " reais");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (depositar == 3) {
                System.out.println("Seu saldo é de " + saldo + " reais");
            } else if (depositar == 4) {
                System.out.println("Obrigado por utilizar o banco");
            } else {
                System.out.println("Opção incorreta");
            }
        }
    }
}
    
