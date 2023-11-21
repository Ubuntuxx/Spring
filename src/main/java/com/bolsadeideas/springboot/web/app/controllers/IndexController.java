package com.bolsadeideas.springboot.web.app.controllers;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index","/home","/",""})
    public String index(Model model){
        model.addAttribute("titulo","Bienvenido a spring");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario("Luis","Amador");
        model.addAttribute("nombre", usuario);
        model.addAttribute("titulo","Perfil de usuario: " + usuario.getNombre());
        return "perfil";
    }
}
