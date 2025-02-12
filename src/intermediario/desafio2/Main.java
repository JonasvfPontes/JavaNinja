package intermediario.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        List <Ninja> todosOsNinjas = new ArrayList<>();

        while (true) {
            System.out.println("=== Selecione uma opção ===");
            System.out.println("1 - Exibir informações de todos os ninjas\n2 - Adicionar novos ninjas");
            System.out.println("3 - atualizar as habilidades especiais\n4 - Sair");
            int opc = sn.nextInt();
            sn.nextLine(); // Consome a quebra de linha pendente pra não dá bug
            switch (opc){
                case 1:
                    System.out.println("Segue informações de todos os ninjas abaixo:");
                    System.out.println("============================================\n");

                    for (Ninja ninja : todosOsNinjas) {
                        ninja.mostrarInformacoes();
                        System.out.println("========================\n");
                    }
                    break;
                case 2:
                    System.out.println("Preencha os campos abaixo:\n==========================\n");
                    System.out.print("Nome: ");
                    String nome = sn.nextLine();

                    System.out.print("Idade: ");
                    int idade = sn.nextInt();
                    sn.nextLine();

                    System.out.print("Missão: ");
                    String missao = sn.nextLine();

                    System.out.print("Dificuldade: ");
                    String nivelDificuldade = sn.nextLine();

                    System.out.print("Status da missão: ");
                    String statusMissao = sn.nextLine();

                    int tipo;
                    while (true){
                        System.out.println("Qual tipo de Ninja?\n1 - Ninja\n2 - Uchiha\n0 - Sair");
                        tipo = sn.nextInt();
                        sn.nextLine();
                        if (tipo == 0) {
                            System.out.println("Retornando ao menu anterior...");
                            break;
                        }
                        else if (tipo == 1) {
                            todosOsNinjas.add(new Ninja(nome, idade, missao, nivelDificuldade, statusMissao));
                            break;
                        }
                        else if(tipo == 2){
                            System.out.print("Habilidade especial: ");
                            String habilidadeEspecial = sn.nextLine();
                            todosOsNinjas.add(new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao, habilidadeEspecial));
                            break;
                        }
                        else {
                            System.out.println("opção inválida, tente novamente");
                        }


                    }
                    break;

                case 3:
                    System.out.println("Segue lista de Ninjas, qual ninja você deseja fazer atualizações?");

                    int i=1;
                    for (Ninja ninja: todosOsNinjas){
                        System.out.println(i +" - "+ ninja.nome);
                        i++;
                    }

                    System.out.println("Selecione o numero [0 = sair]");
                    while (true) {
                        int opcAtualizacao = sn.nextInt();
                        sn.nextLine();
                        if (opcAtualizacao == 0) {
                            System.out.println("Saindo...");
                            break;
                        } else if (opcAtualizacao > todosOsNinjas.size()) {
                            System.out.println("opção inválida, tente novamente");
                        }else {

                            i = 1;
                            for (Ninja ninja: todosOsNinjas){
                                if (i == opcAtualizacao){
                                    String nomeClasse = ninja.getClass().getName() ;
                                    String[] arrayNomeClasse = nomeClasse.split("\\.");
                                    nomeClasse = arrayNomeClasse[arrayNomeClasse.length -1 ];

                                    if (nomeClasse.equalsIgnoreCase("uchiha") ) {
                                        System.out.print("Nova habilidade de "+ ninja.nome+ ": ");
                                        ((Uchiha) ninja).habilidadeEspecial = sn.nextLine();
                                        System.out.println("Sucesso!");
                                        break;
                                    }else{
                                        System.out.println("Infelizmente "+ ninja.nome +" não possue habilidades especiais");
                                    }
                                }
                                i++;
                            }
                        }

                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("**************************\nSelecione uma opção válida\n**************************");
                    break;
            }
            // Saindo do loop do  menu
            if (opc == 4){
                break;
            }

        }
        sn.close();
    }
}
