
package com.example.services;

import com.example.entididades.Pedido;
import java.util.List;


public interface PedidoServicio {
    
    //Para guardar pedido
    public void guardarPedido(Pedido pedido);
    
    //Para borrar pedido
    public void borrarPedido(Pedido pedido);
    
    //Para los mostrar los pedidos
    public List<Pedido> mostrarPedidos();
}

