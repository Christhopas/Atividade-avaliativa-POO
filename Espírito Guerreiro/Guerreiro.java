import java.util.Scanner;

public class Guerreiro {

    String nome;
    int vidas;

    Scanner t = new Scanner(System.in);

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }

    public String vidaExtra() {
        System.out.println("Quer uma vida extra? Implore.");
        t.next();
        return "Não sei o que retornar";
        //chama a função decidirVidaExtra(String Misericordia);
    }

}