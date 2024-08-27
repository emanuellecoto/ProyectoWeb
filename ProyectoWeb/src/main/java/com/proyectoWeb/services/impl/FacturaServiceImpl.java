package com.proyectoWeb.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.proyectoWeb.domain.Factura;
import com.proyectoWeb.dao.FacturaDao;
import com.proyectoWeb.services.FacturaService;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl 
     implements FacturaService {

    @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> getFacturas(boolean stock) {
        var lista = facturaDao.findAll();
        return lista;
    }

    @Override
    public Factura getFactura(Factura factura) {
        return facturaDao.findById(factura.getIdFactura()).orElse(null);
    }

    @Override
    public void save(Factura factura) {
        facturaDao.save(factura);
    }

    @Override
    public void delete(Factura factura) {
        facturaDao.delete(factura);
    }



}
