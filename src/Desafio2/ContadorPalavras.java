package Desafio2;

import java.util.Scanner;

public class ContadorPalavras {

    public void contadorPalavras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println("Quantidade de palabras: " + palavras.length);

        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        System.out.println("Frase invertida: " + invertida);

    }

}
