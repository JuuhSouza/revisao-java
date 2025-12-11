package Desafio1;
import java.util.Scanner;

public class IMC {

     public static void calcularIMC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(imc);
         
        if (imc < 25) {
                System.out.println("Seu IMC esta normal");
        }else if(imc < 30){
                System.out.println("Você está com sobrepeso");
        }else if(imc < 35){
                System.out.println("Obesidade Grau I");
        }
        else if(imc < 40){
                System.out.println("Obesidade Grau II (Severo)");
        }else{
                System.out.println("Obesidade Grau III ( Mórbina, vá á um médico com urgencia AGORA!");
        }
        }

}
