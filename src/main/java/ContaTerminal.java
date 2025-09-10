import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Insira o numero da conta: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o numero da agencia: ");
        String numeroDaAgencia = sc.nextLine();

        System.out.println("Insira o seu nome: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Insira o seu Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: "
                + numeroDaAgencia + ", conta: " + numeroDaConta + " e seu saldo: " + saldo + " já está disponível para saque.");
    }
}
