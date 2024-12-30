
package com.example.web;

import com.example.entididades.Producto;
import com.example.services.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAgregarProducto {
    
    @Autowired
    public ProductoServicio productoServicio;
    
    //Para guardar el producto ala base de datos
    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto){
        productoServicio.guardarProducto(producto);
        System.out.println("El  precio del producto : "+producto.getPrecio());
    return "redirect:/";
    }
    
    //Para volver al inicio
    //@GetMapping("/volverAlMenu")
    //public String volverAlMenu(){
    //return "redirect:/";
    //}
}
