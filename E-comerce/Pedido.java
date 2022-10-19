import java.util.Date;

public class Pedido {
    
    public int pedidoID;
    private Date dataEmissao;
    private float total;
    private int qtd;
    
    public Pedido(int pedidoID, float total, int qtd) {
        this.pedidoID = pedidoID;
        this.total = total;
        this.qtd = qtd;
        this.dataEmissao = new Date();
    }
    
    public void totalCalculado() {
        float totalCalculado = this.total * this.qtd;
        System.out.println("O total do seu pedido e R$"+totalCalculado);
    }
}
