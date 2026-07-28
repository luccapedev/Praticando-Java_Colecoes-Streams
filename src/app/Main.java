package app;

import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - Adicionando elementos a uma lista\n" +
                "2 - Removendo elementos\n" +
                "3 - Acessando elementos\n" +
                "4 - Elementos únicos em uma lista\n" +
                "5 - Criando um Map de clientes\n" +
                "6 - Verificando se a chave existe\n" +
                "7 - Selecionando funcionários com nomes curtos\n" +
                "8 - Calculando o quadrado dos números\n" +
                "9 - Calculando o total com imposto\n" +
                "10 - Calculando estatísticas das notas\n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    AtividadeUm atividadeUm = new AtividadeUm();
                    atividadeUm.executar();
                    break;
                case 2:
                    AtividadeDois atividadeDois = new AtividadeDois();
                    atividadeDois.executar();
                    break;
                case 3:
                    AtividadeTres atividadeTres = new AtividadeTres();
                    atividadeTres.executar();
                    break;
                case 4:
                    AtividadeQuatro atividadeQuatro = new AtividadeQuatro();
                    atividadeQuatro.executar();
                    break;
                case 5:
                    AtividadeCinco atividadeCinco = new AtividadeCinco();
                    atividadeCinco.executar();
                    break;
                case 6:
                    AtividadeSeis atividadeSeis = new AtividadeSeis();
                    atividadeSeis.executar();
                    break;
                case 7:
                    AtividadeSete atividadeSete = new AtividadeSete();
                    atividadeSete.executar();
                    break;
                case 8:
                    AtividadeOito atividadeOito = new AtividadeOito();

                    break;
                case 9:
                    AtividadeNove atividadeNove = new AtividadeNove();

                    break;
                case 10:
                    AtividadeDez atividadeDez = new AtividadeDez();

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Não existe nenhuma funcionalidade com esse número!");
            }
        }

        scanner.close();
    }
}