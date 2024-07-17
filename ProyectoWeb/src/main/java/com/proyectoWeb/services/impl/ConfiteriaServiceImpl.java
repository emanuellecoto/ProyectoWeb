package com.proyectoWeb.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.proyectoWeb.domain.Confiteria;
import com.proyectoWeb.dao.ConfiteriaDao;
import com.proyectoWeb.services.ConfiteriaService;
import org.springframework.stereotype.Service;

@Service
public class ConfiteriaServiceImpl 
     implements ConfiteriaService {

    @Autowired
    private ConfiteriaDao confiteriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Confiteria> getConfiterias(boolean stock) {
        var lista = confiteriaDao.findAll();
        return lista;
    }

    @Override
    public Confiteria getConfiteria(Confiteria confiteria) {
        return confiteriaDao.findById(confiteria.getIdRegistro()).orElse(null);
    }

    @Override
    public void save(Confiteria confiteria) {
        confiteriaDao.save(confiteria);
    }

    @Override
    public void delete(Confiteria confiteria) {
        confiteriaDao.delete(confiteria);
    }



}
