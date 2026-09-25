import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        conta = scanner.nextInt();
        scanner.nextLine(); // Consumir o ENTER pendente

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final usando concatenação
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(conta))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}
