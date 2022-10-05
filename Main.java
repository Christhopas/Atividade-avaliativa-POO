
public class Main {
    
    public static void main(String[] args) {
        
        Guerreiro joao = new Guerreiro();
        Oraculo oraculo = new Oraculo();
        
        oraculo.guerreiro = joao;
        
        joao.setNome("joao");
        oraculo.setNome("Oraculo");
        oraculo.setVidas();
        System.out.println(joao.vidas);
        oraculo.loadLevel1();
        oraculo.loadLevel2(0);
    }
}
