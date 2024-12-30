
package com.example.services;

import com.example.dao.ProductoDao;
import com.example.entididades.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioImp implements ProductoServicio {
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> mostrarProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public void guardarProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void borrarProducto(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    public Producto localizarProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public List<Producto> productoCategoria(Producto producto) {
        return productoDao.findByCategoria(producto.getCategoria());
    }
    
}
