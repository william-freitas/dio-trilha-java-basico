import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, por favor digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o número de sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número de sua agencia: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o saldo de sua conta: ");
        double saldo = sc.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "+
                        "sua agencia é %s , conta %d e seu saldo "+
                        "R$ %.2f%n já está disponível para saque",
                         nome,agencia,conta,saldo);
        sc.close();
    }
}
