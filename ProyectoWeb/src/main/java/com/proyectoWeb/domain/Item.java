package com.proyectoWeb.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Item extends Snacks {
    private int cantidades; //Almacenar la cantidad de items de un snacks

    public Item() {
    }

    public Item(Snacks snacks) {
        super.setIdSnack(snacks.getIdSnack());
        super.setNombre(snacks.getNombre());
        super.setDescripcion(snacks.getDescripcion());
        super.setCantidad(snacks.getCantidad());
        super.setPrecio(snacks.getPrecio());
        super.setRutaImagen(snacks.getRutaImagen());
        this.cantidades= 0;
    }
}
