import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class banco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;


        System.out.print("Enter account number: "); 
        int numConta = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("Is there an initial deposit? (y/n)");
        String resposta = scanner.next();
        char res = resposta.charAt(0);

        switch(res = Character.toUpperCase(res)) {
            case 'N':
                conta = new Conta(numConta, nome);
                break;
            case 'Y':
                System.out.print("Enter initial deposit value: ");
                double saldo = scanner.nextDouble();
                conta = new Conta(numConta, nome, saldo);
                break;
            default:
                conta = new Conta(numConta, nome);
        }

        System.out.print(" ");
        System.out.println("Account data: ");
        System.out.print(conta.toString());
        System.out.println(' ');

        System.out.print("Enter a deposit value: ");
        double valorD = scanner.nextDouble();
        conta.deposito(valorD);
        System.out.println("Updates account data: ");
        System.out.print(conta.toString());
        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        double valorS = scanner.nextDouble();
        conta.saque(valorS);
        System.out.println("Updates account data: ");
        System.out.print(conta.toString());
        System.out.println(" ");


        scanner.close();
    }
}
