package com.example.springform.controller;

import com.example.springform.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo", "Formulario Usuarios");
        return "form";
    }

    @PostMapping("/form")
    public String procesarFormulariio(Usuario usuario, Model model){
        model.addAttribute("titulo", "Resultado Formulario");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
