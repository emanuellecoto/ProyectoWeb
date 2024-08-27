
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Snacks;
import com.proyectoWeb.services.SnacksService;
import com.proyectoWeb.services.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/snacks")
public class SnacksController {
        @Autowired
    private SnacksService snacksService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = snacksService.getSnacks(true);
        model.addAttribute("snacks", lista);
        model.addAttribute("totalConfites", lista.size());
        return "/snacks/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Snacks snacks) {

        snacksService.save(snacks);
        
           return "redirect:/snacks/listado";
    }
    
    @GetMapping("/eliminar/{idSnack}")
    public String eliminar(Snacks snacks){
        snacksService.delete(snacks);
    return "redirect:/snacks/listado";
    }
    
    @GetMapping("/modificar/{idSnack}")
    public String modificar(Snacks snacks, Model model){
        snacks = snacksService.getSnack(snacks);
        model.addAttribute("snacks", snacks);
    return "/snacks/modifica";
    }
}
