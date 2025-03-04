package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Se obtiene un listado de prodructos en un List
    public List<Producto> getProductos(boolean activos);
    
   // Se obtiene un Producto, a partir del id de un prodructo
    public Producto getProducto(Producto prodructo);
    
    // Se inserta un nuevo prodructo si el id del prodructo esta vacío
    // Se actualiza un prodructo si el id del prodructo NO esta vacío
    public void save(Producto prodructo);
    
    // Se elimina el prodructo que tiene el id pasado por parámetro
    public void delete(Producto prodructo);
}

