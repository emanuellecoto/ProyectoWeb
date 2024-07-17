
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Confiteria;
import com.proyectoWeb.services.ConfiteriaService;
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
@RequestMapping("/confiteria")
public class ConfiteriaController {
        @Autowired
    private ConfiteriaService confiteriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = confiteriaService.getConfiterias(true);
        model.addAttribute("confiterias", lista);
        model.addAttribute("totalConfites", lista.size());
        return "/confiteria/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Confiteria confiteria) {

        confiteriaService.save(confiteria);
        
           return "redirect:/confiteria/listado";
    }
    
    @GetMapping("/eliminar/{idRegistro}")
    public String eliminar(Confiteria confiteria){
        confiteriaService.delete(confiteria);
    return "redirect:/confiteria/listado";
    }
    
    @GetMapping("/modificar/{idRegistro}")
    public String modificar(Confiteria confiteria, Model model){
        confiteria = confiteriaService.getConfiteria(confiteria);
        model.addAttribute("confiteria", confiteria);
    return "/confiteria/modifica";
    }
}
