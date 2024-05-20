import list.Desafios.CarrinhoDeCompras;
import list.Desafios.SomarNumeros;

public class Main {
    public static void main(String[] args) {
        SomarNumeros somarNumeros = new SomarNumeros();
        somarNumeros.adicionarNumeros(1);
        somarNumeros.adicionarNumeros(2);
        somarNumeros.adicionarNumeros(3);
        somarNumeros.adicionarNumeros(4);
        somarNumeros.adicionarNumeros(5);
        somarNumeros.exibirNumeros();
        System.out.println(somarNumeros.calcularSoma(somarNumeros.numeros));
        somarNumeros.encontrarMaiorNumero(somarNumeros.numeros);
        somarNumeros.encontrarMenorNumero(somarNumeros.numeros);

    }
}