package com.proyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name="factura")
public class Factura implements Serializable {    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_factura")
    private Long idFactura;
    private Long idUsuario;
    private String fecha;
    private double total;
    private String pelicula;
    private int cantidadEntradas;
    
    
    public Factura() {
    }

    public Factura(Long idUsuario) {
        this.idUsuario = idUsuario;
    }    
}