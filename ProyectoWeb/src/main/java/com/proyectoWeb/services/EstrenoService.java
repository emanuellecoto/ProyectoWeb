package com.proyectoWeb.services;

import com.proyectoWeb.domain.Estrenos;
import java.util.List;

public interface EstrenoService {

    public List<Estrenos> getEstrenos(boolean stock);

    public Estrenos getEstreno(Estrenos estrenos);

    public void save(Estrenos estrenos);

    public void delete(Estrenos estrenos);
}
