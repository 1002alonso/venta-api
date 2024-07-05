package com.pro.venta.api.application.mapper;
import com.pro.venta.api.application.model.ProductoModel;
import com.pro.venta.api.domain.entity.TabProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);


    ProductoModel toProductoModel (TabProducto tabProducto);
    TabProducto toTabProducto(ProductoModel productoModel);

    List<ProductoModel> toProductoModels (List<TabProducto> tabProductos);
    List<TabProducto> toTabProductos(List<ProductoModel> productoModels);


}
