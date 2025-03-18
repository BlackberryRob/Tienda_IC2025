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

    //Ejemplo 1: Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    /*Practica #4 Debe agregar al proyecto tienda una versión de una consulta ampliada de su libre escogencia, 
    puede ser de tabla producto, categoria o venta.*/  
    public List<Producto> findByExistenciasGreaterThanOrderByPrecioAsc(int existencias);

    //Ejemplo 2: Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Ejemplo 3: Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
