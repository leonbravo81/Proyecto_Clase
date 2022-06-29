package com.desarrollo.skills.entidades;

import lombok.Getter;
import lombok.Setter;
//Clase de tipo entidad para guardar los tipos de identificacioon

@Getter
@Setter
public class TipoIdentificacion {
    private Long Id;
    private String Nombre;
    private boolean Estado;

}
