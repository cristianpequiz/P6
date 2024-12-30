
package com.example.services;

import com.example.dao.PedidoDao;
import com.example.entididades.Pedido;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicioImp implements PedidoServicio {
    
    @Autowired
    private PedidoDao pedidoDao;

    @Override
    public void guardarPedido(Pedido pedido) {
        pedidoDao.save(pedido);
    }

    @Override
    public void borrarPedido(Pedido pedido) {
        pedidoDao.delete(pedido);
    }

    @Override
    public List<Pedido> mostrarPedidos() {
        return (List<Pedido>) pedidoDao.findAll();
    }
    
}
