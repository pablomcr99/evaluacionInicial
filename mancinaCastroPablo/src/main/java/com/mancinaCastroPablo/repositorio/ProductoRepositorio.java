package com.mancinaCastroPablo.repositorio;

import com.mancinaCastroPablo.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto,Long> {
}
