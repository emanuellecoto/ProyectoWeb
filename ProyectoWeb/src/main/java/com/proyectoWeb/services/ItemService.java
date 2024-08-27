package com.proyectoWeb.services;

import com.proyectoWeb.domain.Item;
import java.util.List;

public interface ItemService {

    
    public List<Item> gets();

    public Item get(Item item);

    public void delete(Item item);

    public void save(Item item);
    
    public void update(Item item);
    
    public void facturar();
    
    public double getTotal();
}