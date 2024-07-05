package com.pro.venta.api.presentation.controller;


import com.pro.venta.api.application.incoming.IProductoLogic;
import com.pro.venta.api.application.model.ProductoModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoLogic productoLogic;

    @Operation(summary = "Retorna la lista de los productos guardados")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<ProductoModel> ListaProducto(){
        return productoLogic.FibdAll();
    }

    @Operation(summary = "Crea un producto de acuerdo sus datos")
    @PostMapping
    public  ProductoModel CreateProducto(@Validated @RequestBody final ProductoModel productoModel){

        return productoLogic.Save(productoModel);
    }

    @Operation(summary = "Actualiza un producto de acuerdo a su id de producto y sus datos actualizados")
    @PatchMapping(value = "{idProducto}")
    public  ProductoModel UpdateProducto(@Validated @RequestBody final ProductoModel productoModel, @PathVariable("idProducto") String idProducto){

        return productoLogic.Update(productoModel,idProducto);
    }

    @Operation(summary = "Retorna un producto de acuerdo a su id de producto")
    @GetMapping(value = "{idProducto}")
    public ProductoModel ReadProducto(@PathVariable("idProducto") String idProducto){
        return productoLogic.FindById(idProducto);
    }

    @Operation(summary = "Elimina un producto, enviando un item de un producto")
    @DeleteMapping(value = "{idProducto}")
    public void DeleteProducto( @PathVariable("idProducto") String idProducto){
         productoLogic.Delete(idProducto);
    }

}
