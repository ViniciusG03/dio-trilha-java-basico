import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = terminal.nextLine();

        System.out.println("Informe o seu a sua agência: ");
        String agencia = terminal.nextLine();

        System.out.println("Informe o número da sua conta: ");
        int numero = terminal.nextInt();

        double saldo = 1200.50;
        String texto = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(texto);
    }
}