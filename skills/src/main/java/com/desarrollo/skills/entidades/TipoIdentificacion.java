package com.desarrollo.skills.entidades;

import lombok.Getter;
import lombok.Setter;

//Clase de tipo entidadpara guardar los tipos de documento

@Getter
@Setter
public class TipoIdentificacion{
    private Long Id;
    private String nombre;
    private boolean estado;

}