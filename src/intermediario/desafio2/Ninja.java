package intermediario.desafio2;
public class Ninja {
    String nome;
    int idade;
    String missao ;
    String nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }


    public void mostrarInformacoes() {
        System.out.println("\n o ninja " + nome + " tem " + idade + " anos, a sua missão é '" + missao + "'");
        System.out.println("com o nível "+ nivelDificuldade+ " de dificuldade. No momento a missão está "+ statusMissao);
    }
}
