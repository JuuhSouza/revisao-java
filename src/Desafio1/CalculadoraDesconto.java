package Desafio1;
import java.util.Scanner;

public class CalculadoraDesconto {

    public static void calcularDesconto(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço para aplicar o desconto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a porcentagem do desconto");
        int desconto = scanner.nextInt();
        
        double valorDesconto = (desconto / 100.0) * preco;
        double total = preco - valorDesconto;
        System.out.println("Com o desconto de " + desconto + "% " + " no valor de R$" + preco + " o valor final fica " + "R$" + total);
    }

}
