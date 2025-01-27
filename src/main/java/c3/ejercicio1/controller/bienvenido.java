package c3.ejercicio1.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class bienvenido {
    @GetMapping("/bienvenida")
    public String bienvenida(Model model) {
        model.addAttribute("fechayhora", LocalDateTime.now().format(DateTimeFormatter.ofPattern(
            "yyyy-MM-dd hh:mm:ss"
        )));
        return "bienvenida";
    }

    @GetMapping("/")
    public String redirect() {
        return "redirect:bienvenida";
    }
}