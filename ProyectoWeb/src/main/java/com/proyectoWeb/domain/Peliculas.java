package com.proyectoWeb.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="peliculas")
public class Peliculas {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idPelicula;
    private String titulo;
    private String director;
    private String genero;
    private String fechaEstreno;
    private int duracionMinutos;
    private String descripcion;
    private String rutaImagen;
}

