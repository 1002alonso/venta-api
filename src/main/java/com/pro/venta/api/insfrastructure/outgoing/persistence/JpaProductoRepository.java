package com.pro.venta.api.insfrastructure.outgoing.persistence;

import com.pro.venta.api.domain.entity.TabProducto;
import com.pro.venta.api.insfrastructure.outgoing.interfaces.IProductoRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface JpaProductoRepository extends IProductoRepository,CrudRepository<TabProducto, String> {

    TabProducto save(TabProducto entity);

    List<TabProducto> findAll();

    Optional<TabProducto> findById(String id);

    void delete(TabProducto entity);



}
