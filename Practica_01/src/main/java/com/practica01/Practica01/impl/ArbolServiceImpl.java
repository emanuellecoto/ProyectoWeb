package com.practica01.Practica01.impl;

import com.practica01.Practica01.dao.ArbolDao;
import com.practica01.Practica01.domain.Arbol;
import com.practica01.Practica01.service.ArbolService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolServiceImpl
        implements ArbolService {
    
    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(boolean extinto) {
        var lista = arbolDao.findAll();
        if (extinto) {
            lista.removeIf(a -> a.isExtinto());
        }
        return lista;
    }
    
    @Override
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }
    
    @Override
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }
    
    @Override
    public void delete(Arbol arbol) {
        arbolDao.delete(arbol);
    }
    
}
