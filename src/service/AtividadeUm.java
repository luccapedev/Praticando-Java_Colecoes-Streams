package service;

import java.util.ArrayList;
import java.util.List;

public class AtividadeUm {
    public void executar() {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionários: " + funcionarios);
    }
}