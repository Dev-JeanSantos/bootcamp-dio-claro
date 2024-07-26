import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
       
    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);

        scn.useLocale(Locale.US);

        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da Agência! Exemplo: 067-8\nAgencia: ");
        conta.setNumeroDaAgencia(scn.next());
        scn.nextLine();

        System.out.println("Por favor, digite o número da Conta! Exemplo: 1021\nConta: ");
        conta.setNumeroDaConta(scn.nextInt());
        scn.nextLine();

        System.out.println("Por favor, digite o seu Nome! Exemplo: John Doe\nNome Completo: ");
        conta.setNomeCliente(scn.nextLine());

        System.out.println("Por favor, digite o valor do deposito inicial! Exemplo: 539.32\nR$ ");
        conta.setSaldo(scn.nextDouble()); 

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", conta.getNomeCliente(), conta.getNumeroDaAgencia(), conta.getNumeroDaConta(), conta.getSaldo());
        
        scn.close();
    }
}
