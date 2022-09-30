import java.util.Random;
import java.util.Scanner;

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

    public boolean decidirVidaExtra(String Misericordia) {
        return true; //Falta fazer
    }

    public String prologoIntroducao() {
        String t = "Olá " + guerreiro.nome + ", me chamo " + this.nome + ". Você tem " + guerreiro.vidas + " vidas."; //Prólogo da história do jogo
        return t;
    }

    public int loadLevel1() {
        Scanner t = new Scanner(System.in);
        System.out.println("#### Level 1 ###");
        System.out.println("Advinhe um número...");
        int s = g.nextInt(100) + 1;
        t.nextInt();
        if (t == s) {
            System.out.println("INDEFINIDO");
        }
        else {
            while (t != s) {
                if (t > s) {
                    System.out.println("Menor.");
                    guerreiro.vidas--;
                } 
                else {
                    System.out.println("Maior.");
                    guerreiro.vidas--;
                }
                if (guerreiro.vidas == 0) {
                    System.out.println("Você está sem vidas.");
                    return 0;
                }
            }
        }
    }

    public int loadLevel2(int o) {
        System.out.println("#### Level 2 ###");
        int a = g.nextInt(6);
        int b = g.nextInt(6);
        if (a+b % 2 == o) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
