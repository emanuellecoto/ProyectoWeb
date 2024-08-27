package com.proyectoWeb.services;

import com.proyectoWeb.domain.Factura;
import java.util.List;

public interface FacturaService {

    public List<Factura> getFacturas(boolean stock);

    public Factura getFactura(Factura factura);

    public void save(Factura factura);

    public void delete(Factura factura);
}
