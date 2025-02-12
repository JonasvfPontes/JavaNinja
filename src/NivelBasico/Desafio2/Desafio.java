package NivelBasico.Desafio2;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Iniciando as variáveis
        String[] menu = {"Ver ninjas cadastrados", "Cadastrar ninjas",  "Sair"};
        int lim = 10;
        String[] name = new String[lim];
        int[] idade = new int[lim];
        String saudacao = "Bem vindo!";
        Scanner sc = new Scanner(System.in);

        // loop do menu principal
        while (true){
            //Exibindo menu principal
            System.out.println("-----------\n"+ saudacao +"\nEscolha uma opção\n-----------");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i+1 + " - " + menu[i]);
            }
            System.out.println("-----------");
            // Local onde o corno irá digitar a opção
            int opt = sc.nextInt();
            sc.nextLine(); //Consome o caractere de nova linha

            //Exibindo a opção selecionada pelo usuario
            if (opt > menu.length) {
                System.out.println("Pelo visto vc quer me prejudicar");
                System.out.println("Pelo amor de Deus, digite umas das opções abaixo");
                saudacao = "Vamos tentar de novo";
            }else{
                saudacao = "Olá!";

                if(menu[opt - 1].equals("Sair")) {
                    break;

                } else if (menu[opt - 1].equals("Cadastrar ninjas")) {
                    // Iniciando variaveis desse escopo
                    int pos = 0;
                    int posMaiUm;
                    String nomeNinja;
                    int idadeNinja;

                    System.out.println("Cadastro de ninjas [Sair = S]\n================");
                    while (true){
                        //Procurando primeira posição livre do array
                        for (int i = 0; i < name.length; i++) {
                            if (name[i] == null){
                                pos = i;
                                break;
                            }
                        }

                        //Recebendo nome
                        posMaiUm = pos +1;
                        System.out.println("Esse será nosso "+ posMaiUm +"º ninja cadastrado");
                        System.out.print("Nome do ninja: ");
                        nomeNinja = sc.nextLine();
                        nomeNinja = nomeNinja.trim();

                        if (nomeNinja.equalsIgnoreCase("S")){
                            System.out.println("Ok, retornando ao menu principal");
                            break;
                        }else if (!nomeNinja.isEmpty()){
                            System.out.println("Idade do ninja "+ nomeNinja.toUpperCase() + ": ");
                            idadeNinja = sc.nextInt();
                            sc.nextLine();
                            name[pos] = nomeNinja.toUpperCase();
                            idade[pos] = idadeNinja;

                        }

                    }

                } else if (menu[opt - 1].equals("Ver ninjas cadastrados")) {
                    System.out.println("LISTA DE NINJAS CADASTRADOS\n================");
                    int ultPos = 0;
                    //Procurando ultima posição não livre do array
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null){
                            ultPos = i;
                        }
                    }

                    //Exibindo lista de cadastros
                    if (ultPos == 0) {
                        System.out.println("\n************************\nVocê ainda não tem ninjas cadastrados!");
                    }else{
                        String cabecalho1 = String.format("%-20s", "NOME");
                        String cabecalho2 = "| IDADE";
                        System.out.println("    " + cabecalho1+cabecalho2);
                        String col1, col2;
                        int index = 0;
                        for (int i = 0; i <= ultPos; i++) {
                            index++;
                            if (name[i] != null) {
                                col1 = String.format("%-20s", name[i]);
                                col2 = String.format("%-20s", idade[i]);
                                System.out.println(index+"| " + col1+ " | " + col2);
                            }
                        }
                    }

                    //Exibir menu de edição
                    while (true) {
                        int opcIndex;
                        System.out.println("\n\n================\nO que quer fazer?");
                        System.out.println("1 - Excluir\n2 - Editar\n3 - Voltar");
                        int opc = sc.nextInt();

                        switch (opc) {
                            case 1:
                                System.out.println("Digite o número do ninja a ser excluído");
                                opcIndex = sc.nextInt();
                                if (opcIndex > name.length) {
                                    System.out.println("Opção inválida");
                                } else {
                                    name[opcIndex - 1] = null;
                                    idade[opcIndex - 1] = 0;
                                    System.out.println("Sucesso!");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o número do ninja a ser editado");
                                opcIndex = sc.nextInt();
                                if (opcIndex > name.length) {
                                    System.out.println("Opção inválida");
                                } else {
                                    System.out.print("Novo nome para "+name[opcIndex-1]+": ");
                                    sc.nextLine();
                                    name[opcIndex - 1] = sc.nextLine().toUpperCase() ;

                                    System.out.print("Nova idade, de "+idade[opcIndex-1]+" para: ");
                                    idade[opcIndex - 1] = sc.nextInt();
                                    System.out.println("Sucesso!");
                                }
                                break;
                            case 3:
                                System.out.println("************\nRetornando ao menu principal\n");
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                        }
                        if (opc == 3) {
                            break;
                        }
                    }



                }


            }
        }
        sc.close();
        System.out.println("Saindo...Até mais!");
    }
}
