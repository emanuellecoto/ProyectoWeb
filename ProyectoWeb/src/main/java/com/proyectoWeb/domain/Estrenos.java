package com.proyectoWeb.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="proximos_estrenos")
public class Estrenos {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estreno")
    private Long idEstreno;
    private String nombre;
    private String sinopsis;
    private String director;
    private String fechaEstreno;
    private String rutaImagen;
}

