
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Oraculo {

    String nome;
    Guerreiro guerreiro;

    Random g = new Random(); //g recebe a classe random

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setVidas() {
        return guerreiro.vidas = g.nextInt(4) + 9;
    }

    public boolean decidirVidaExtra(String txt) {
        StringTokenizer st = new StringTokenizer(txt);
        return st.countTokens() > 5;
    }

    public String prologoIntroducao() {
        String txt = "Olá " + guerreiro.nome + ", me chamo " + this.nome + ". Você tem " + guerreiro.vidas + " vidas."; //Prólogo da história do jogo
        return txt;
    }

    public int loadLevel1() {
        Scanner t = new Scanner(System.in);

        System.out.println("#### Level 1 ###");
        System.out.println("Advinhe um número...");

        int n = t.nextInt();
        int s = g.nextInt(100) + 1;

        if (n == s) {
            System.out.println("Ganhou.");
        }
        else {
            while (n != s) {
                
                if (n > s) {
                    System.out.println("Menor.");
                    guerreiro.vidas--;
                    System.out.println("Tente novamente: ");
                    n = t.nextInt();
                } 
                else {
                    System.out.println("Maior.");
                    guerreiro.vidas--;
                    System.out.println("Tente novamente: ");
                    n = t.nextInt();
                }
                if (guerreiro.vidas == 0) {
                    System.out.println("Voce esta sem vidas.");
                    break;
                }
            }
        }
        return 0;
    }

    public int loadLevel2(int o) {

        System.out.println("#### Level 2 ###");

        int n1 = g.nextInt(6);
        int n2 = g.nextInt(6);

        if (n1+n2 % 2 == o) {
            System.out.println("Ganhou.");
        }
        else {
            System.out.println("Perdeu.");
        }
        return 0;
    }
}

