package c3.ejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class productoForm {
    @GetMapping("formulario/producto")
    public String formularioProducto() {
        return "formulario";
    }

    @GetMapping("/")
    public String redirect() {
        return "redirect:formulario/producto";
    }
}