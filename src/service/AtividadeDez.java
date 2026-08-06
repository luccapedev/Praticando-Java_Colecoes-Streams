package service;

import java.util.List;

public class AtividadeDez {
    public void executar(){
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        double mediaNotas = notas.stream().reduce(0.0, Double::sum) / notas.size();
        double maiorNota = notas.stream().reduce(Double::max).orElse(0.0);
        double menorNota = notas.stream().reduce(Double::min).orElse(0.0);

        System.out.println("A média das notas é: " + String.format("%.1f", mediaNotas));
        System.out.println("A maior nota é: " + String.format("%.1f", maiorNota));
        System.out.println("A menor nota é: " + String.format("%.1f", menorNota)); 
    }
}
