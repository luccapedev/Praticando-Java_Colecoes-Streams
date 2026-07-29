package service;


import java.util.List;
import java.util.stream.Collectors;


public class AtividadeOito {
    public void executar(){
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> numerosQuadrados = numeros.stream().map(f -> f * f).collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + numerosQuadrados);
    }
}
