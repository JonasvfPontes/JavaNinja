package NivelBasico;

public class Array {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        //ou
        String[] nomes2 = {"JONAS","PONTES"};

        System.out.println(nomes[0]);
        System.out.println(nomes2[1]);

        //Redeclarando array
        nomes2 = new String[4];
        System.out.println(nomes2[1]);
    }
}
