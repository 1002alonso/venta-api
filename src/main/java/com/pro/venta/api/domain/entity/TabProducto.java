package com.pro.venta.api.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TAB_PRODUCTO")
public class TabProducto {
    @Id
    @Column(name = "ID_PRODUCTO")
    public String idProducto;

    @Column(name="CVE_PRODUCTO")
    public String cveProducto;

    @Column(name = "NOM_PRODUCTO")
    public String nomProducto;

    @Column(name = "TS_ALTA")
    public Date tsAlta;

    @Column(name = "TS_MODIFICA")
    public Date tsModifica;

    @Column(name = "USUARIO_ALTA")
    public String usuarioAlta;
}
