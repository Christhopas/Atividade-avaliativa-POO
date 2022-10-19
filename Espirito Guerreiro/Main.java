public class Main {
    
    public static void main(String[] args) {
        
        Guerreiro joao = new Guerreiro();
        Oraculo oraculo = new Oraculo();
        
        oraculo.guerreiro = joao;
        
        joao.setNome("joao");
        oraculo.setNome("Oraculo");
        oraculo.setVidas();
        System.out.println("Voce tem:   " + joao.vidas + " vidas");
        oraculo.loadLevel1();
        
        if(oraculo.checkVitoria == 1) {     
            oraculo.loadLevel2(0); // 0 para PAR e 1 para IMPAR
        }
    }
}
