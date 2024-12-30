
package com.example.web;

import com.example.entididades.Pedido;
import com.example.entididades.Producto;
import com.example.services.PedidoServicio;
import com.example.services.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAgregarPedido {
    
     @Autowired
    public PedidoServicio pedidoServicio;
    
    //Para guardar el pedido ala base de datos
    @PostMapping("/guardarPedido")
    public String guardarProducto(Pedido pedido){
        pedidoServicio.guardarPedido(pedido);
    return "redirect:/";
    }
    
}
