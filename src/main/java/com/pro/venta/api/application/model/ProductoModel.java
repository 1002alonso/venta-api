package com.pro.venta.api.application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;
@Data
public class ProductoModel {
    public String idProducto;
    public String cveProducto;
    public String nomProducto;
    public Date tsAlta;
    public Date tsModifica;
    public String usuarioAlta;
}
