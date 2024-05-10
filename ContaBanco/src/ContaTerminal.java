import java.util.Locale;
import java.util.Scanner;

// ContaTerminal simples, sem tratar exceções como não foi definido no desafio.
public class ContaTerminal {
    public static void main(String[] args) {
        // Instanciando o scanner para ler os dados, nesse caso System.in referente ao teclado.
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Para conseguir ler ponto/vírgula no Double.

        // getNome - Pegar o nome da pessoa.
        System.out.print("Olá, bem-vindo(a) ao Banco DIO! Digite seu nome: ");
        String nome = scanner.nextLine();

        // getAgencia - Pegar a agência.
        // Utilizando o "\n" para quebrar linha, assim como em outras linguagens.
        System.out.print("\nCerto, " + nome + ". Agora digite a agência: ");
        String agencia = scanner.nextLine();

        // getNumeroAgencia - Pegar o número da agência.
        System.out.print("\nPor favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();

        // getSaldo - Pegar o saldo da pessoa.
        System.out.print("\nAgora digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // Mensagem final.
        System.out.print("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroAgencia + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
