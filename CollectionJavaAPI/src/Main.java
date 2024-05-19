import list.Desafios.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefas;

import java.sql.ClientInfoStatus;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 5.00, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 10.00, 1);
        carrinhoDeCompras.adicionarItem("Macarrão", 2.00, 3);
        carrinhoDeCompras.adicionarItem("Carne", 20.00, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Total: " + carrinhoDeCompras.calcularValorTotal());

    }
}