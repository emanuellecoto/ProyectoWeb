package com.proyectoWeb.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Forum {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forum")
    private Long idForum;
    private String opinion;
    private int rating;
    private boolean visto;
    private String pelicula;
}

