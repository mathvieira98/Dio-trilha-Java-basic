import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numerodaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomedoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomedoCliente +", Obrigado por criar uma conta em nosso banco, Sua agência é " + agencia + ", Conta " + numerodaConta + " e seu saldo é " + saldo + " Já está disponível para saque.");

        scanner.close();
    }
}