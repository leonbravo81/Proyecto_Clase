package com.desarrollo.skills.dto;

import lombok.Getter;
import lombok.Setter;

/*
* Clase tipo Dto para enmascarar los tipos de Identificacion
*/

@Getter
@Setter
public class TipoIdentificacionDto {

    private Long Id;
    private String Nombre;
    private boolean Estado;
}
