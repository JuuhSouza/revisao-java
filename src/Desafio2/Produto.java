package Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    String nome;
    double preco;
    String estoque;
    int quantidade;

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> listaProdutos = new ArrayList<>();

    public void adionarProduto(){
        System.out.println("Digite e nome do item que deseja adiocionar ao estoque: ");
        nome = scanner.nextLine();

        System.out.println("Digite a Quantidade");
        quantidade = scanner.nextInt();

        listaProdutos.add(nome + " " + quantidade + " Unidades");
        System.out.println("Item adiocionado ao estoque");
    }

    public void listarEstoque(){
         System.out.println("Lista de itens ");
                    if (listaProdutos.isEmpty()) {
                        System.out.println("A lista está vazia");
                    }else{
                        System.out.println(listaProdutos);
                    }
    }

    public void vender(){
        System.out.println("Digite o nome do produto vendido: ");
        estoque = scanner.nextLine();

        listaProdutos.remove(estoque);
        System.out.println("Item vendido com sucesso");
    }

    public void aplicarDesconto(){
        System.out.println("Digite o valor do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Agora digite a % do desconto para fazer a aplicação");
        int desconto = scanner.nextInt();

        double valorDesconto = (desconto / 100.0) * preco;
        double valorFinal = preco - desconto;

        System.out.println("Valor final do produto com desconto : " + valorFinal);
    }

    public void sistemProdutos(){
        int opcoes;

        do{
             System.out.println("                                                             ");
            System.out.println("----------- Menu de produtos -----------");
            System.out.println("1 - Adionar ao estoque");
            System.out.println("2 - Produtos no estoque");
            System.out.println("3 - Fazer venda");
            System.out.println("4 - Aplicar desconto");
            System.out.println("5 - Sair");

            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes) {
                case 1:
                        adionarProduto();    
                    break;

                case 2:
                       listarEstoque();
                    break;

                case 3:
                        vender();  
                    break;

                case 4:
                        aplicarDesconto();
                    break;

                case 5:
                        System.out.println("Sair");
                    break;
            
                default:
                    break;
            }
        }while (opcoes != 5);
    }
}
