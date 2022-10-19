
import java.util.HashMap;

public class Loja {
    
    HashMap<Integer, Integer> listaPedido = new HashMap<>();

    public void menu() {
        System.out.println("Funcoes: ");
        System.out.println("inserirPedido()");
        System.out.println("buscarPedido()");
        System.out.println("removerPedido()");
    }
    public void inserirPedido(int i, int p) {
        listaPedido.put(i, p);
    }
    public void buscarPedido(int i) {
        System.out.println("PedidoID: "+listaPedido.get(i));
    }
    public void removerPedido(int i) {
        listaPedido.remove(i);
    }
    public void limparPedido() {
        listaPedido.clear();
    }
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Pedido p1 = new Pedido(1, 3, 2);
        Pedido p2 = new Pedido(2, 4, 5);
        Pedido p3 = new Pedido(3, 3, 7);
        p1.totalCalculado();
        p2.totalCalculado();
        p3.totalCalculado();
        americanas.menu();
        americanas.inserirPedido(1, p1.pedidoID);
        americanas.inserirPedido(2, p2.pedidoID);
        americanas.inserirPedido(45, p3.pedidoID);
        americanas.buscarPedido(45);
    }
}
