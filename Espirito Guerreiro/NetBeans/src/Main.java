public class Main {
    
    public static void main(String[] args) {
        
        Guerreiro vinicius = new Guerreiro();
        Oraculo oraculo = new Oraculo();
        
        oraculo.guerreiro = vinicius;
        oraculo.prologoIntroducao();
        oraculo.prologoVencedor();
        oraculo.prologoPerdedor();
    }
}