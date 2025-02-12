package intermediario.desafio2;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial de "+ nome +" é: "+ habilidadeEspecial);
    }

    @Override //Massa demais isso aqui
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
