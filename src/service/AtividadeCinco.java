package service;

import java.util.HashMap;
import java.util.Map;

public class AtividadeCinco {
    public void executar(){
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");

        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }
}
