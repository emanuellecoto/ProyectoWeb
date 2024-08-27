package com.proyectoWeb.services.impl;

import com.proyectoWeb.dao.SnacksDao;
import com.proyectoWeb.domain.Snacks;
import com.proyectoWeb.services.SnacksService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class SnacksServiceImpl 
     implements SnacksService {

    @Autowired
    private SnacksDao snacksDao;

    @Override
    @Transactional(readOnly = true)
    public List<Snacks> getSnacks(boolean stock) {
        var lista = snacksDao.findAll();
        return lista;
    }

    @Override
    public Snacks getSnack(Snacks snacks) {
        return snacksDao.findById(snacks.getIdSnack()).orElse(null);
    }

    @Override
    public void save(Snacks snacks) {
        snacksDao.save(snacks);
    }

    @Override
    public void delete(Snacks snacks) {
        snacksDao.delete(snacks);
    }





}
