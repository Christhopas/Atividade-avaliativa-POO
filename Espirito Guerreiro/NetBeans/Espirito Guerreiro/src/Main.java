public class Main {
    
    public static void main(String[] args) {
        
        Guerreiro vinicius = new Guerreiro();
        Oraculo oraculo = new Oraculo();
        
        oraculo.guerreiro = vinicius;
        
        vinicius.setNome("Vinicius");
        oraculo.setNome("Oraculo");
        
        oraculo.prologoIntroducao();
        oraculo.prologoVencedor();
        oraculo.prologoPerdedor();    }
}