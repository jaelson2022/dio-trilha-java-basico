import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("por favor, digite o número da conta:");
            int numero = scanner.nextInt();

            System.out.println("por favor, digite o número da agência:");
            scanner.nextLine();
            String agencia = scanner.nextLine();

            System.out.println("por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("por favor, digite o saldo:");
            double saldo = scanner.nextDouble();

            
            String mensagem = "Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja está disponível para saque.";
                System.out.println(mensagem);
        }

    }
}
