package com.tuempresa.facturacion.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Getter @Setter @Entity
public class Factura extends DocumentoComercial {
  @OneToMany(mappedBy = "factura")
  Collection<Pedido> pedidos;
}
