
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Estrenos;
import com.proyectoWeb.services.EstrenoService;
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
@RequestMapping("/estreno")
public class EstrenoController {
        @Autowired
    private EstrenoService estrenoService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = estrenoService.getEstrenos(true);
        model.addAttribute("estrenos", lista);
        model.addAttribute("totalConfites", lista.size());
        return "/estreno/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Estrenos estrenos) {

        estrenoService.save(estrenos);
        
           return "redirect:/estreno/listado";
    }
    
    @GetMapping("/eliminar/{idEstreno}")
    public String eliminar(Estrenos estrenos){
        estrenoService.delete(estrenos);
    return "redirect:/estreno/listado";
    }
    
    @GetMapping("/modificar/{idEstreno}")
    public String modificar(Estrenos estrenos, Model model){
        estrenos = estrenoService.getEstreno(estrenos);
        model.addAttribute("estreno", estrenos);
    return "/estreno/modifica";
    }
}
