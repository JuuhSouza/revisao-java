package Desafio2;

import java.util.Scanner;

public class SistemaLogin {

    public void sistemaLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para seu usuário: ");
        String nomeCadastrado = scanner.nextLine();

        System.out.print("Crie uma senha: ");
        String senhaCadastrada = scanner.nextLine();
        System.out.println("                               ");
        System.out.println("Usuário cadastrado com sucesso!");
         System.out.println("                               ");

        int tentativas = 0;
        boolean loginCerto = false;

        while (tentativas < 3 && !loginCerto) {
            System.out.println("Digite o nome cadastrado: ");
            String nomeLogin = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String senhaLogin = scanner.nextLine();
            
            if (nomeLogin.equals(nomeCadastrado) && senhaLogin.equals(senhaCadastrada)) {
                System.out.println("Login feito com sucesso!");
                System.out.println("Acerto mizerávi...");
                loginCerto = true;
            }else{
                tentativas++;
                System.out.println("Nome ou senha incorretos");
                System.out.println("Só restam " + (3 - tentativas) + " tentativas, se errar mais vezes irá bloquear seu login!!");
            }
        }

        if (!loginCerto) {
            System.out.println("Conta bloqueada, Você atingiu o limite de tentativas, esqueceu a senha né...");
        }
    }
}
