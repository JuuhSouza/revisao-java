package Desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaLogin sistemaLogin = new SistemaLogin();
        Tabuada tabuada = new Tabuada();
        ListaComprar listaCompras = new ListaComprar();

        Produto sistemaProdutos = new Produto();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("                                                             ");
            System.out.println("------------- Escolha uma das opções abaixo -----------------");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Gerar tabuada");
            System.out.println("3 - Contador de palavras");
            System.out.println("4 - Lista de comprar");
            System.out.println("5 - Sistema de produtos");
            System.out.println("6 - Sair do menu");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistemaLogin.sistemaLogin();
                    break;

                case 2: 
                    tabuada.tabuada();
                    break;

                case 3: 
                    
                    break;

                case 4: 
                    listaCompras.gerenciadorListas();
                    
                    break;

                case 5: 
                    sistemaProdutos.sistemProdutos();

                    break;
            
                default:
                    break;
            }
        }while (opcao != 6);
    }
}
