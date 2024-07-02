package com.practica01.Practica01.service;

import com.practica01.Practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {

    public List<Arbol> getArboles(boolean extinto);

    public Arbol getArbol(Arbol arbol);

    public void save(Arbol arbol);

    public void delete(Arbol arbol);
}
