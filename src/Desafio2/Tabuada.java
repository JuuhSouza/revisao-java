package Desafio2;

import java.util.Scanner;

public class Tabuada {
    
    public void tabuada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para gerar a tabuada: ");
        int numeroTabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabuada * i;
            System.out.println( "| " + numeroTabuada + " x " + i + " = " + resultado + " |");
        }
    }
}
