
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Peliculas;
import com.proyectoWeb.services.PeliculaService;
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
@RequestMapping("/pelicula")
public class PeliculaController {
        @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = peliculaService.getPeliculas(true);
        model.addAttribute("peliculas", lista);
        model.addAttribute("totalConfites", lista.size());
        return "/pelicula/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Peliculas peliculas) {

        peliculaService.save(peliculas);
        
           return "redirect:/pelicula/listado";
    }
    
    @GetMapping("/eliminar/{idRegistro}")
    public String eliminar(Peliculas peliculas){
        peliculaService.delete(peliculas);
    return "redirect:/pelicula/listado";
    }
    
    @GetMapping("/modificar/{idRegistro}")
    public String modificar(Peliculas peliculas, Model model){
        peliculas = peliculaService.getPelicula(peliculas);
        model.addAttribute("pelicula", peliculas);
    return "/pelicula/modifica";
    }
}
