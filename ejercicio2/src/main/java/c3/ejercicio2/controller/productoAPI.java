package c3.ejercicio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import c3.ejercicio2.model.Producto;


@Controller
public class productoAPI {
    @GetMapping("/api/producto")
    @ResponseBody
    public Producto getProducto() {
        Producto ponymalta = new Producto("Coca Cola", 1500.00, "Bebida energetica");
        return ponymalta;
    }
}