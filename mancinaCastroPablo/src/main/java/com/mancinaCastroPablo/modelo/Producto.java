package com.mancinaCastroPablo.modelo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private long Id;

    private String nombre;
    private int unidades;
    private String observacion;
}
