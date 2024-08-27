
package com.proyectoWeb.controller;

import com.proyectoWeb.domain.Factura;
import com.proyectoWeb.services.FacturaService;
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
@RequestMapping("/factura")
public class FacturaController {
        @Autowired
    private FacturaService facturaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = facturaService.getFacturas(true);
        model.addAttribute("facturas", lista);
        model.addAttribute("totalConfites", lista.size());
        return "/factura/listado";
    }
    
        @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Factura factura) {

        facturaService.save(factura);
        
           return "redirect:/factura/listado";
    }
    
    @GetMapping("/eliminar/{idFactura}")
    public String eliminar(Factura factura){
        facturaService.delete(factura);
    return "redirect:/factura/listado";
    }
    
    @GetMapping("/modificar/{idFactura}")
    public String modificar(Factura factura, Model model){
        factura = facturaService.getFactura(factura);
        model.addAttribute("factura", factura);
    return "/factura/modifica";
    }
}
