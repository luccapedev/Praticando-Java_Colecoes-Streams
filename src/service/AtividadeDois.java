package service;

import java.util.ArrayList;
import java.util.List;

public class AtividadeDois {
    public void executar() {
        List<String> alunos = new ArrayList<>(List.of("Joana","Lucas","Pedro","Antônio"));
        System.out.println("Lista inicial: " + alunos);
        alunos.remove("Pedro");
        System.out.println("Lista após exclusão: " + alunos);
    }
}
