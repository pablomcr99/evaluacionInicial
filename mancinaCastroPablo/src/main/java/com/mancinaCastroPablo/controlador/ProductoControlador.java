package com.mancinaCastroPablo.controlador;


import com.mancinaCastroPablo.modelo.Producto;
import com.mancinaCastroPablo.servicio.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio ps;


    //LISTADO PRODUCTOS
    @GetMapping("/")
    public String productos(Model model){
        model.addAttribute("listaProductos", ps.findAll());
        return "index";
    }


    //AÑADIR PRODUCTO
    @GetMapping("/formularioProducto")
    public String nuevoProducto(Model model){
        model.addAttribute("productoForm", new Producto());
        return "nuevoProducto";
    }

    @PostMapping("/addProducto")
    public String addProducto(@ModelAttribute("productoForm") Producto p, Model model){
        ps.save(p);
        return "redirect:/";
    }

    //PARA EDITAR

    @GetMapping("/producto/editar/{id}")
    public String editarProducto(@PathVariable("id") Long id, Model model){
        Optional<Producto> p= ps.findById(id);
        if(p != null){
            model.addAttribute("productoForm",p);
            return "nuevoProducto";
        } else{
            return "redirect:/";
        }
    }



    //PARA BORRAR

    /*
    @GetMapping("/producto/borrar/{id}")
    public String borrarProducto(@PathVariable("id") Long id, Model model){
        Producto p= ps.findById(id);
        if(p != null){
            ps.delete(p);
        }
            return "redirect:/";

    }*/


}
