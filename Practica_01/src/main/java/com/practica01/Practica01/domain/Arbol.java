
package com.practica01.Practica01.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Arbol {

    private static final long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_arbol")
    private Long idArbol;
    private String nombre;
    private String tipoFlor;
    private String rutaImagen;
    private int dureza;
    private String provincia;
    private boolean extinto;
}
