import java.util.HashMap;

public class Loja {
    
    //Funcionario funcionario = new Funcionario();
    //HashMap<Integer, Integer> listaFuncionario = new HashMap<>();
    
    HashMap<Integer, Pedido> listaPedido = new HashMap<>();

    public void menu() {
        System.out.println("metodos:");
        System.out.println("inserirPedido(int i, Pedido p)\nbuscarPedido(int i)");
        System.out.println("trocarPedido(int i, Pedido p)\nremoverPedido(int i)\nverLista()\nlimparLista()");
    }
    
    public void inserirPedido(int i, Pedido p) {
        listaPedido.put(i, p);
    }
    public void buscarPedido(int i) {
        System.out.println("PedidoID: "+listaPedido.get(i));
    }
    public void trocarPedido(int i, Pedido p){
        listaPedido.replace(i, p);
    }
    public void removerPedido(int i) {
        listaPedido.remove(i);
    }
    
    public void verLista() {
        System.out.println(listaPedido.toString());
    }
    public void limparLista() {
        listaPedido.clear();
    }
    
    public static void main(String[] args) {
        
        Pedido p1 = new Pedido();
        p1.inserirItem("Melancia", 1);
        p1.inserirItem("Kiwi", 5);
        p1.inserirItem("Goiaba", 3);
        p1.buscarItem("Melancia");
        p1.buscarItem("Kiwi");
        p1.removerItem("Goiaba");
        p1.trocarQtd("Melancia", 2);
        p1.buscarQtd("Melancia");
        p1.verLista();
        p1.limparLista();
        Pedido p2 = new Pedido();
        Pedido p3 = new Pedido();
        Pedido p4 = new Pedido();
        
        Loja americanas = new Loja(); 
        americanas.inserirPedido(1, p1);
        americanas.inserirPedido(2, p2);
        americanas.inserirPedido(3, p3);
        americanas.verLista();
        americanas.trocarPedido(2, p4);
        americanas.verLista();
        americanas.limparLista();
    }
}
