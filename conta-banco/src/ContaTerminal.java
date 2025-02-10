import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu conta:");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua agencia:");
        String agency = sc.nextLine();


        System.out.println("Digite seu saldo:");
        float saldo = sc.nextFloat();


        System.out.println("nome:\n" + nome);
        System.out.println("conta:\n" + conta);
        System.out.println("agencia:\n" + agency);
        System.out.println("saldo:\n" + saldo);





        System.out.printf("\n Ola %s, obrigado por criar uma conta em nosso banco, sua agencia é: %s, numero:%d e saldo:%.2f", nome, agency, conta, saldo);
    }


// desafio:
//crie o projeto contabanco, que recebera dados via terminal contendo
//as caracteristicas de conta em banco conforme atributos:
//atributo, numero, agencia, nome cliente, saido
//tipo: inteiro, texto, texto, decimal{
}

