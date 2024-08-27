package com.proyectoWeb.services;

import com.proyectoWeb.domain.Snacks;
import java.util.List;

public interface SnacksService {

    public List<Snacks> getSnacks(boolean stock);

    public Snacks getSnack(Snacks snacks);

    public void save(Snacks snacks);

    public void delete(Snacks snacks);
}
