package Desafio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Opções */
        Temperatura temperaturas = new Temperatura();
        IMC calcularImc = new IMC();
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        MetrosCentimetros conversorUnidades = new MetrosCentimetros();
        ValidadorDados validadorDados = new ValidadorDados();

        Scanner scanner = new Scanner(System.in);

        int opcao;
     
        do{
             System.out.println("------------- Escolha uma das opções abaixo -----------------");
            System.out.println("1 - Conversão de celsius para fahrenheit");
            System.out.println("2 - Calcular o IMC");
            System.out.println("3 - Calculadora de descontos");
            System.out.println("4 - Conversor de unidades");
            System.out.println("5 - Validador de Dados");
            System.out.println("6 - Sair do menu");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    temperaturas.conversao(opcao);;
                    break;
            
                case 2 :
                    calcularImc.calcularIMC();
                    break;

                case 3 :
                    calculadoraDesconto.calcularDesconto();
                    break;

                case 4 :
                    int opcaoConversorUnidades;
                    do{
                        System.out.println("----- Conversor de Unidades -----");
                        System.out.println("1 - Metros para Centimetros");
                        System.out.println("2 - Centimetros para Metros");
                        System.out.println("3 - Quilometros para Metros");
                        System.out.println("4 - Metros para quilometros");
                        System.out.println("5 - Metros para Milhas");
                        System.out.println("6 - Voltar");

                        opcaoConversorUnidades = scanner.nextInt();
                        switch (opcaoConversorUnidades) {
                            case 1:
                                conversorUnidades.metrosCentimetros();
                                break;
                                
                            case 2:
                                conversorUnidades.centimetroMetros();
                                break;
                                
                            case 3:
                                conversorUnidades.quilometrosMetro();
                                break;
                                
                            case 4:
                                conversorUnidades.metrosQuilometros();
                                break;
                                
                            case 5:
                                conversorUnidades.metrosMilhas();
                                break;
                        
                            default:
                                System.out.println("Voltando para o menu principal");
                                break;
                        }
                    }while (opcaoConversorUnidades != 6);

                    break;

                case 5 :
                    int opcaoValidarDados;
                        do{
                        System.out.println("----- Validação de dados -----");
                        System.out.println("1 - Par ou impar");
                        System.out.println("2 - Positivo ou negativo");
                        System.out.println("3 - Ano bissexto");
                        System.out.println("4 - Voltar");

                        opcaoValidarDados = scanner.nextInt();

                        switch (opcaoValidarDados) {
                            case 1:
                                validadorDados.parImpar();
                                break;
                        
                            case 2:
                                validadorDados.positivoNegativo();
                                break;
                        
                            case 3:
                                validadorDados.anoBissexto();
                                break;
                        
                            default:
                                System.out.println("Voltando para o menu principal");
                                break;
                        }
                    }while (opcaoValidarDados != 4);
                    break;

                case 6 :
                    System.out.println("Programa encerrado tenha uma boa vida :)");

                default:
                    System.out.println("Opção inválida! tente novamente");
                    break;
            }
        }while (opcao != 6);
    }
}
