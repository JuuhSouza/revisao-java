package Desafio1;
import java.util.Scanner;

public class MetrosCentimetros {

    Scanner scanner = new Scanner(System.in);
    
    public void metrosCentimetros(){
        System.out.println("Digite um número para fazer a conversão de metros para centimetro: ");
        double metros = scanner.nextDouble();

        //metros para centimetro
        double metroC = metros * 100;
        System.out.println("Conversão de metros para centimetros: " + metroC);
    }

    public void centimetroMetros(){
        System.out.println("Digite um número para fazer a conversão de centimetros para metros: ");
        double metros = scanner.nextDouble();

        //centimetros para metros
        double centimetroM = metros / 100;
        System.out.println("Conversão de centimetros para metros foi de : " + centimetroM);
    }

     public void quilometrosMetro(){
        System.out.println("Digite um número para fazer a conversão de quilometros para metros: ");
        double metros = scanner.nextDouble();

        //quilometros para metros
        double quilometrosM = metros * 1000;
        System.out.println("Conversão de quilometros para metros: " + quilometrosM);
    }

     public void metrosQuilometros(){
        System.out.println("Digite um número para fazer a conversão de metros para quilometros: ");
        double metros = scanner.nextDouble();

        //metros para quilometros 
        double metrosQ = metros / 1000;
        System.out.println("Metros em quilometros: " + metrosQ);
    }

     public void metrosMilhas(){
        System.out.println("Digite um número para fazer a conversão de Metros para milhas: ");
        double metros = scanner.nextDouble();
        
        //Metros para milhas
        double metroMilhas = metros / 1609;
        System.out.println("A conversão de metros para milhas é : " + metroMilhas);
    }
}
