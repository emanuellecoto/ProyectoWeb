package com.proyectoWeb.services;

import com.proyectoWeb.domain.Confiteria;
import java.util.List;

public interface ConfiteriaService {

    public List<Confiteria> getConfiterias(boolean stock);

    public Confiteria getConfiteria(Confiteria confiteria);

    public void save(Confiteria confiteria);

    public void delete(Confiteria confiteria);
}
