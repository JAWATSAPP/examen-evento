/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evento.controller;


import com.example.evento.demo.modelo.Usuario;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author FLHORIAN
 */

@Controller
    public class Registro{ 
        @GetMapping("/evento") 
        public String registroForm(Model model) {
model.addAttribute("usuario", new Usuario());
return "evento";

    }
    @PostMapping("/evento") 
    public String registroSubmit(@ModelAttribute Usuario usuario, Model model) { model.addAttribute("usuario", usuario);
return "succes";
}
}