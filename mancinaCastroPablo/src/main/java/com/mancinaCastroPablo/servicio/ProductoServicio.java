package com.mancinaCastroPablo.servicio;

import com.mancinaCastroPablo.modelo.Producto;
import com.mancinaCastroPablo.repositorio.ProductoRepositorio;
import com.mancinaCastroPablo.servicio.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio extends ServicioBaseImpl<Producto,Long, ProductoRepositorio> {
}
