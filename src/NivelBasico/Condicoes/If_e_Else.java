package NivelBasico.Condicoes;

public class If_e_Else {
    public static void main(String[] args) {
        String nome = "Jonas";
        int idade = 30;
        boolean morto = false;
        short numeroMissoes = 4;

        // passar o ninja de nível de a  cordo com o numero de missoes
        if (numeroMissoes > 10){
            System.out.println("Vc tem mais de 10 mossões");
        } else if (numeroMissoes <10 && numeroMissoes >5) {
            System.out.println("Vc tem menos de 10 mais tem mais que 5");
        }else {
            System.out.println("vc tem menos de 5");
        }
    }
}
