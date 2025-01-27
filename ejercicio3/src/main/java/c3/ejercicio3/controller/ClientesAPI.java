package c3.ejercicio3.controller;

import org.springframework.web.bind.annotation.RestController;

import c3.ejercicio3.model.Clientes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ClientesAPI {
    @GetMapping("/api/clientes")
    public List<Clientes> getClientes() {
        Clientes javier = new Clientes("Javier", 18);
        Clientes mariana = new Clientes("Mariana", 18);
        Clientes kevin = new Clientes("Kevin", 22);

        List<Clientes> clientes = new ArrayList<>();
        clientes.add(javier);
        clientes.add(mariana);
        clientes.add(kevin);
        return clientes;
    }
}