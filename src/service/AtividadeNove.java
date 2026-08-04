package service;

import java.util.List;

public class AtividadeNove {
    public void executar(){
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        double totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: R$" + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: R$" + String.format("%.2f", totalComImposto));
    }
}
