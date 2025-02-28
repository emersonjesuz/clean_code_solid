package nomes_significativos;

import java.util.ArrayList;
import java.util.List;

public class exemplo01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    // exemplo ruim de código:
    // ele não deixa o nome do método claro sobre oque ele faz
    // alem variaveis totalmente sem significado
    public List<Integer> getNumeros(List<Integer> entrada) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < entrada.size(); i++) {
            if (entrada.get(i) % 2 == 0) {
                resultado.add(entrada.get(i));
            }
        }
        return resultado;

    }

    // exemplo bom de código
    // ele deixa claro oque metodo faz
    // e com variaveis claras e legiveis
    public List<Integer> getNumerosPares(List<Integer> numerosParaAvaliar) {
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer numeroParaAvaliar : numerosParaAvaliar) {
            boolean isPar = numeroParaAvaliar % 2 == 0;
            if (isPar) {
                numerosPares.add(numeroParaAvaliar);
            }
        }
        return numerosPares;
    }
}