"InventariosProductos" aplicación web desarrollada con SpringBoot en 
NetBeans que hace CRUD en un inventario de productos, estos
estaran divididos por categorias. 
La aplicación utiliza HTML 
para la interfaz de usuario y se conecta a una base de datos 
relacional mediante JPA (MySQL), seran 2 tablas una de pedidos
y la otra para los productos

Base de datos:


1ra tabla producto:
atributos

id_producto INT NOT NULL PRIMARY KEY AUTO_INCREMENT

nombre VARCHAR<200> NOT NULL

cantidad INT

categoria VARCHAR<20> 

descripcion TEXT NOT NULL

precio DECIMAL<10,2> NOT NULL


2da tabla pedido:
atributos

id_pedido INT NOT NULL PRIMARY KEY AUTO_INCREMENT

cantidad INT NOT NULL 

categoria VARCHAR<20> NOT NULL

nombre VARCHAR<200> NOT NULL