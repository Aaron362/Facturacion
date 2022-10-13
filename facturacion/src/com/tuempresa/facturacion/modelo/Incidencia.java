package com.tuempresa.facturacion.modelo;

public class Incidencia {
  int numero;
  String descripcion;

  public String getDescripcion()	{
	  if(descripcion == null)  return "Todavia no hay descripcion";
	  return descripcion;
  }
}
