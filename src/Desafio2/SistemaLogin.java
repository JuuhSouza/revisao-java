package Desafio2;

import java.util.Scanner;

public class SistemaLogin {

    public void sistemaLogin(){
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        int senha = scanner.nextInt();

        String validarNome = nome;
        int validarSenha = senha;

        for (int i = 0; i >= 3; i++) {
            
            if (nome == validarNome && senha == validarSenha) {
                System.out.println("Login feito com sucesso");
            }else{
                System.out.println("Senha ou nome incorretos");
            }
            
        }
    
    }
}
