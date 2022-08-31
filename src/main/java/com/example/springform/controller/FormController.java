package com.example.springform.controller;

import com.example.springform.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario Usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesarFormulario(@Valid@ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model){

        model.addAttribute("titulo", "Formulario Usuarios");

        if (result.hasErrors()){
            return "form";
        }

        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
