
package com.example.web;

import com.example.entididades.Pedido;
import com.example.entididades.Producto;
import com.example.services.PedidoServicio;
import com.example.services.ProductoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class ControladorInicio {
    
    @Autowired
    public ProductoServicio productoServicio;
    
    @Autowired
    public PedidoServicio pedidoServicio;
    
    //Al empezar el programa moestrara los productos
    @GetMapping("/")
    public String inicio(Model model){
    
        List<Producto> productos = productoServicio.mostrarProductos();
        model.addAttribute("productos", productos);
        
        return "Inicio";
    }    
    
    //Para ir ala pagina que agrega el producto
    @GetMapping("/agregarProducto")
    public String agregarProducto(Producto producto){
    return "AgregarProducto";
    }
    
    //Para borra un producto de la base de datos
    @GetMapping("/borrarProducto")
    public String borrarProducto(Producto producto){
        productoServicio.borrarProducto(producto);
    return "redirect:/";
    }
    
    //Para cambiar un producto del inventario
    @GetMapping("/cambiarProducto/{idProducto}")
    public String cambiarProducto(Producto producto, Model model){
        producto=productoServicio.localizarProducto(producto);
        model.addAttribute("producto",producto);
    return "AgregarProducto";
    }
    
    //Para buscar por id un producto
    @GetMapping("/buscarPorId")
    public String buscarPorId(Producto producto, Model model){
        producto = productoServicio.localizarProducto(producto);
        model.addAttribute("productos", producto);
    return "Busqueda";
    }
    
    //Para buscar por categoría
    @GetMapping("/buscarPorCategoria")
    public String buscarPorCategoria(Producto producto, Model model){
        List<Producto> productoCategoria = productoServicio.productoCategoria(producto);
        model.addAttribute("productos", productoCategoria);
    return "Busqueda";
    }
    
    //Para redirigir a los pedidos
    @GetMapping("/verPedidos")
    public String verPedidos(Pedido pedido, Model model){
        List<Pedido> verPedidos = pedidoServicio.mostrarPedidos();
        model.addAttribute("pedidos", verPedidos);
    return "Pedidos";
    }
    
    //Para ir ala pagina que agrega el producto
    @GetMapping("/agregarPedido")
    public String agregarPedido(Pedido pedido){
    return "AgregarPedido";
    }
    
}
