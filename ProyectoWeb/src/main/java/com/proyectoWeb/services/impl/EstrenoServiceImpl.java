package com.proyectoWeb.services.impl;

import com.proyectoWeb.dao.EstrenosDao;
import com.proyectoWeb.domain.Estrenos;
import com.proyectoWeb.services.EstrenoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstrenoServiceImpl 
     implements EstrenoService {

    @Autowired
    private EstrenosDao estrenosDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estrenos> getEstrenos(boolean stock) {
        var lista = estrenosDao.findAll();
        return lista;
    }

    @Override
    public Estrenos getEstreno(Estrenos estrenos) {
        return estrenosDao.findById(estrenos.getIdEstreno()).orElse(null);
    }

    @Override
    public void save(Estrenos estrenos) {
        estrenosDao.save(estrenos);
    }

    @Override
    public void delete(Estrenos estrenos) {
        estrenosDao.delete(estrenos);
    }



}
