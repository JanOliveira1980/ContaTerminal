import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o numero da Conta:");
        int numConta = sc.nextInt();

        System.out.println("Por favor digite o numero da agencia:");
        String numAgen = sc.next();

        System.out.println("Por favor digite seu nome:");
        String nome = sc.next();

        float saldo = 237.48f;

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é: " + numAgen
                + " conta " + numConta + " e seu saldo R$:" + saldo + " ja está disponivel para saque");
    }
}