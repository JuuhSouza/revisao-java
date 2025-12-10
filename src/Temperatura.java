import java.util.Scanner;

public class Temperatura {

      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para fazer a conversão de celsius para fahrenheit: ");

        double temperatura = scanner.nextDouble();

        conversao(temperatura);
    }

    double celsius;
    double fahrenheit;

    public static void conversao(double celsius){
        double fahrenheit = 9 * celsius / 5 + 32;
        System.out.println("Conversão em fahrenheit: " + fahrenheit);
    }

}
