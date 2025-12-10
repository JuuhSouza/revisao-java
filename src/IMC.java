import java.util.Scanner;

public class IMC {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        calcularIMC(altura, peso);
    }

     public static void calcularIMC(double altura, double peso){
            double imc = peso / (altura * altura);
            System.out.println(imc);
        }

}
