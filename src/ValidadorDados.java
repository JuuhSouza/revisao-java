import java.util.Scanner;

public class ValidadorDados {
    Scanner scanner = new Scanner(System.in);
     
    public void parImpar(){
        System.out.println("Digite um numero para saber se ele é par ou impar: ");
        double numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero é par");
        }else{
            System.out.println("Este numero é impar");
        }
    }

    public void positivoNegativo(){
        System.out.println("Digite um numero para saber se ele é negatico ou positivo: ");
        double numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Este número positivo");
        } else{
            System.out.println("Este número é negativo");
        } if (numero == 0) {
            System.out.println("seu número é 0");
        }
    }

    public void anoBissexto(){
        System.out.println("Digite uma ano para saber se ele é um bissexto: ");
        double numero = scanner.nextInt();

        if (numero % 400 == 0 || (numero % 4 == 0 && numero % 100 !=0)
        ) {
            System.out.println("Este ano é bissexto");
        }else{
            System.out.println("Este ano não é bissexto");
        }
    }

}
