package c3.ejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import c3.ejercicio4.model.Producto;
import c3.ejercicio4.model.ProductoList;

@Controller
public class productoAPI {
    @PostMapping("api/producto")
    @ResponseBody
    public Producto apiProducto(@RequestParam("nombre") String nombre, @RequestParam("precio") double precio, @RequestParam("descripcion") String descripcion) {
        Producto nuevoproducto = new Producto(nombre, precio, descripcion);
        ProductoList.guardarProducto(nuevoproducto);
        return nuevoproducto;
    }
}