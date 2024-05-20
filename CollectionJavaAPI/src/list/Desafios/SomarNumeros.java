package list.Desafios;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {

    public List<Integer> numeros = new ArrayList<>();

    public SomarNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int num) {
        this.numeros.add(num);
    }

    public int calcularSoma(List<Integer> numeros) {
        int soma = 0;
        for (int i = 0; i < this.numeros.size(); i++) {
            soma += this.numeros.get(i);
        }
        return soma;
    }

    public void encontrarMaiorNumero(List<Integer> numeros) {
        int maior = 0;
        for (int i = 0; i < this.numeros.size(); i++) {
            if (this.numeros.get(i) > maior) {
                maior = this.numeros.get(i);
            }
        }
        System.out.println(maior);
    }

    public void encontrarMenorNumero(List<Integer> numeros) {
        int menor = this.numeros.get(0);
        for (int i = 0; i < this.numeros.size(); i++) {
            if (this.numeros.get(i) < menor) {
                menor = this.numeros.get(i);
            }
        }
        System.out.println(menor);
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }

    @Override
    public String toString() {
        return "SomarNumeros{" +
                "numeros=" + numeros +
                '}';
    }

}
