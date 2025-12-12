package Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaComprar {
    
    public void gerenciadorListas(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaCompras = new ArrayList<>();

        int opcoes;

        do{
            System.out.println("                                                             ");
            System.out.println("----------- Menu de compras -----------");
            System.out.println("1 - Adicionar nome á lista");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Calcular total de itens");
            System.out.println("5 - Sair");

            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes) {
                case 1: 
                    System.out.println("Adicionar item: ");
                    String nomeProduto = scanner.nextLine();
                    listaCompras.add(nomeProduto);
                    System.out.println("Item adiocionado !!");
                    System.out.println("_______________________");
                    break;

                case 2: 
                    System.out.println("Remover itens á lista ");
                    String removerItem = scanner.nextLine();
                    listaCompras.remove(removerItem);
                    System.out.println("Item removido !!");
                    break;

                case 3: 
                    System.out.println("Lista de itens ");
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista está vazia");
                    }else{
                        System.out.println(listaCompras);
                    }
                    break;

                case 4: 
                    int totalitens = listaCompras.size();
                    System.out.println("Quantidade de itens na lista " + totalitens);
                    break;

                case 5:
                    System.out.println("Saindo da lista...");
                    System.out.println("Voltando ao menu principal...");

            
                default:
                    break;
            }
        }while (opcoes != 5);
    }

}
