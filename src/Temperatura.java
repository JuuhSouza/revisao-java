import java.util.Scanner;

public class Temperatura {
    double celsius;

    public static void conversao(double celsius){

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para fazer a conversão de celsius para fahrenheit: ");

        double temperatura = scanner.nextDouble();

        double fahrenheit = 9 * celsius / 5 + 32;
        System.out.println("Conversão em fahrenheit: " + fahrenheit);
    }

}
