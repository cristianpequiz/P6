
package com.example.dao;

import com.example.entididades.Producto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Long> {
    
    public List<Producto> findByCategoria(String categoria);
    
}
