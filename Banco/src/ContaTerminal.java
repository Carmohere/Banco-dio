import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        float Saldo;

        System.out.println("Por favor, digite o seu nome: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite a agência da conta: ");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta: ");
        Saldo = scanner.nextFloat();

        System.out.println("Olá " + NomeCliente +"!, obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +", conta "+numero+" e seu saldo de "+Saldo+"R$ já está disponível para saque!");

        scanner.close();
    }
}