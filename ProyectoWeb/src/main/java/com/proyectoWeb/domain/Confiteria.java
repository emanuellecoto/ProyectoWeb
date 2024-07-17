package com.proyectoWeb.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Confiteria {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Long idRegistro;
    private String producto;
    private String precio;
    private int cantidad;
    private boolean stock;
}

