package list.Desafios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("Carrinho vazio");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vazia!");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("Carrinho vazio");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
