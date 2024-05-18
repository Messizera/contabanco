import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Contaterminal {
    public static void main(String[] args) {
        int saldo = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<String> historico = new ArrayList<>();

        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua Agência");
        String agencia = scanner.next();

        System.out.println("Digite o Número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite sua senha");
        String senhaCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " reais.");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nOpções:");
            System.out.println("1 - Realizar depósito");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Verificar saldo");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Digite sua senha");
                String senhaDigitada = scanner.next();
                if (!senhaDigitada.equals(senhaCliente)) {
                    System.out.println("Senha incorreta. Tente novamente.");
                    continue;
                }
            }

            try {
                if (opcao == 1) {
                    System.out.print("Digite o valor a ser depositado: ");
                    int valorDeposito = scanner.nextInt();
                    saldo += valorDeposito;
                    historico.add("Depósito de " + valorDeposito + " reais");
                    System.out.println("Seu saldo atual é de " + saldo + " reais.");
                } else if (opcao == 2) {
                    System.out.print("Digite o valor de saque: ");
                    int valorSaque = scanner.nextInt();

                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        historico.add("Saque de " + valorSaque + " reais");
                        System.out.println("Saque efetuado no valor de " + valorSaque + " reais. Seu saldo atual é de " + saldo + " reais.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } else if (opcao == 3) {
                    System.out.println("Seu saldo é de " + saldo + " reais.");
                } else if (opcao == 4) {
                    System.out.println("Obrigado por utilizar o banco.");
                } else {
                    System.out.println("Opção incorreta. Digite novamente.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

        // Exiba o histórico ao final
        System.out.println("\nHistórico de Transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }

        scanner.close(); // Não se esqueça de fechar o Scanner
    }
}
