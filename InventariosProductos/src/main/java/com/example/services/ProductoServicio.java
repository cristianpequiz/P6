
package com.example.services;

import com.example.entididades.Producto;
import java.util.List;


public interface ProductoServicio {
    
    //para traer todos los productos guardados
    public List<Producto>mostrarProductos();
    
    //Para guardar producto
    public void guardarProducto(Producto producto);
    
    //Para borrar producto
    public void borrarProducto(Producto producto);
    
    //Para ubicar el producto a cambiar
    public Producto localizarProducto(Producto producto);
    
    //Para buscar categorias
    public List<Producto> productoCategoria(Producto producto);
    
    
}
