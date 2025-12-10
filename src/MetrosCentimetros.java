import java.util.Scanner;

public class MetrosCentimetros {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite em metro para fazer a conversão: ");
        double metros = scanner.nextDouble();

        conversao(metros);        
    }

    public static void conversao(double metro){
        //metros para centimetro
        double metroC = metro * 100;
        System.out.println("Conversão de metros para centimetros: " + metroC);

        //centimetros para metros
        double centimetroM = metro / 100;
        System.out.println("Conversão de centimetros para metros foi de : " + centimetroM);

        //quilometros para metros
        double quilometrosM = metro * 1000;
        System.out.println("Conversão de quilometros para metros: " + quilometrosM);

        //metros para quilometros 
        double metrosQ = metro / 1000;
        System.out.println("Metros em quilometros: " + metrosQ);

        //Metros para milhas
        double metroMilhas = metro / 1609;
        System.out.println("A conversão de metros para milhas é : " + metroMilhas);
        
    }
}
