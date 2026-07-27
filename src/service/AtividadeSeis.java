package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtividadeSeis {
    public void executar(){
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do cliente: ");
        int id = scanner.nextInt();

        if (clientes.containsKey(id)){
            System.out.println("O nome do cliente com ID " + id + " é: " + clientes.get(id));
        } else {
            System.out.println(" Cliente com ID " + id + " não encontrado.");
        }
    }
}
