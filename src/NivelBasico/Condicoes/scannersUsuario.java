package NivelBasico.Condicoes;

import java.util.Scanner;

public class scannersUsuario {
    public static void main(String[] args) {
        /*Antes → String nome =  "Jonas";
          mas o imput do Java é o Scanner
         */
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeInput = nome.nextLine();
        //Sempre fechar o Scanner
        nome.close();

        if (nomeInput.isEmpty()){
            System.out.println("Puts, queria saber teu nome");
        }
        else {
            System.out.println("Olá " + nomeInput +"!");
        }


    }
}
