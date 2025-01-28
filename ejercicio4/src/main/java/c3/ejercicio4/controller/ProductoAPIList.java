package c3.ejercicio4.controller;

import org.springframework.web.bind.annotation.RestController;

import c3.ejercicio4.model.Producto;
import c3.ejercicio4.model.ProductoList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductoAPIList {
    @GetMapping("api/producto/list")
    public List<Producto> getMethodName() {
        return ProductoList.getLista();
    }
}