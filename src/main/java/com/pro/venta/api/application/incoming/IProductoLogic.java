package com.pro.venta.api.application.incoming;

import com.pro.venta.api.application.model.ProductoModel;
import java.util.List;
import java.util.Optional;

public interface IProductoLogic {
    ProductoModel Save(ProductoModel item);

    ProductoModel Update(ProductoModel item,String idProducto);


    List<ProductoModel> FibdAll();

    ProductoModel FindById(String idProducto);

    void Delete(String idProducto);
}
