package com.pro.venta.api.application.service;

import com.pro.venta.api.application.incoming.IProductoLogic;
import com.pro.venta.api.application.mapper.ProductoMapper;
import com.pro.venta.api.application.model.ProductoModel;
import com.pro.venta.api.domain.entity.TabProducto;
import com.pro.venta.api.insfrastructure.outgoing.persistence.JpaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductoService implements IProductoLogic {
    @Autowired
    private JpaProductoRepository jpaProductoRepository;


    private final ProductoMapper productoMapper= ProductoMapper.INSTANCE;



    @Override
    public ProductoModel Save(ProductoModel item) {
        final TabProducto newProducto;
        newProducto=productoMapper.toTabProducto(item);
        newProducto.idProducto= UUID.randomUUID().toString();
        newProducto.cveProducto=item.cveProducto;
        newProducto.nomProducto=item.nomProducto;
        newProducto.tsAlta=new Date();
        newProducto.tsModifica=new Date();
        newProducto.usuarioAlta="System";
       ;
        return productoMapper.toProductoModel(jpaProductoRepository.save(newProducto));
    }

    @Override
    public ProductoModel Update(ProductoModel item, String idProducto) {
        Optional<TabProducto> editProducto= jpaProductoRepository.findById(idProducto);
        final TabProducto readProducto= jpaProductoRepository.findById(idProducto).orElseThrow(()-> new RuntimeException("El producto no existe"));

        if(!editProducto.isEmpty()){
            readProducto.cveProducto=item.cveProducto;
            readProducto.nomProducto=item.nomProducto;
            return productoMapper.toProductoModel(jpaProductoRepository.save(readProducto));
        }
        return null;
    }

    @Override
    public List<ProductoModel> FibdAll() {
        List<TabProducto> listProductos = jpaProductoRepository.findAll();
        System.out.println(listProductos);
        return productoMapper.toProductoModels(listProductos);
    }

    @Override
    public ProductoModel FindById(String idProducto) {
        final TabProducto readProducto= jpaProductoRepository.findById(idProducto).orElseThrow(()-> new RuntimeException("El producto no existe"));
            return productoMapper.toProductoModel(readProducto);

    }

    @Override
    public void Delete(String idProducto) {
        final TabProducto readProducto= jpaProductoRepository.findById(idProducto).orElseThrow(()-> new RuntimeException("El producto no existe"));
        jpaProductoRepository.delete(readProducto);
    }
}
