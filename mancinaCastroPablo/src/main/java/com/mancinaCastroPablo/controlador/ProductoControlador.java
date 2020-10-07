package com.mancinaCastroPablo.controlador;


import com.mancinaCastroPablo.modelo.Producto;
import com.mancinaCastroPablo.servicio.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
