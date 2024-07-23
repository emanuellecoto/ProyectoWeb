
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Forum;
import com.proyectoWeb.services.FirebaseStorageService;
import com.proyectoWeb.services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/forum")
public class ForumController {
        @Autowired
    private ForumService forumService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = forumService.getForums(true);
        model.addAttribute("forums", lista);
        model.addAttribute("totalForum", lista.size());
        return "/forum/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Forum forum) {

        forumService.save(forum);
        
           return "redirect:/forum/listado";
    }
    
    @GetMapping("/eliminar/{idForum}")
    public String eliminar(Forum forum){
        forumService.delete(forum);
    return "redirect:/forum/listado";
    }
    
    @GetMapping("/modificar/{idForum}")
    public String modificar(Forum forum, Model model){
        forum = forumService.getForum(forum);
        model.addAttribute("forum", forum);
    return "/forum/modifica";
    }
}
