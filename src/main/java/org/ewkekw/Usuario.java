package org.ewkekw;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao tela de funções do Iphone!");
        System.out.println("Antes de tudo vamos ligar o Iphone" + "\n");;
        Iphone iphone = new Iphone();
        iphone.ligar();
        int escolha;

        do {
            System.out.println("""
                    1 - Tocar música
                    2 - Adicionar música
                    3 - Pausar música
                    4 - Navegar
                    5 - Exibir histórico
                    6 - Fazer chamada
                    7 - Encerrar chamada
                    8 - Desligar
                    """);
            System.out.println("Digite o número da opção desejada: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    iphone.tocarMusica();
                    break;
                case 2:
                    iphone.adicionarMusica("Música 1");
                    break;
                case 3:
                    iphone.pausarMusica();
                    break;
                case 4:
                    System.out.println("Digite a URL: ");
                    String url = "https://" + scanner.nextLine();
                    iphone.navegar(url);
                    break;
                case 5:
                    iphone.exibirHistorico();
                    break;
                case 6:
                    System.out.println("Digite o número: ");
                    String numero = scanner.nextLine();
                    iphone.fazerChamada(numero);
                    break;
                case 7:
                    iphone.encerrarChamada();
                    break;
                case 8:
                    iphone.desligar();
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 8);
    }
}
