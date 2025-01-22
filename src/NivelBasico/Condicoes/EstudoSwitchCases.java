package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção:");
        String[] nomes = {"Jonas", "Jéssica", "Helena"};
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " - " + nomes[i-1]);
        }
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        sc.close();
        switch (opt) {
            case 1:
                System.out.println("Você escolheu Jonas");
                break;
            case 2:
                System.out.println("Você escolheu Jéssica");
                break;
            case 3:
                System.out.println("Você escolhe Helena");
                break;
            default:
                System.out.println("Você é burro, tente de novo");
        }
    }
}
