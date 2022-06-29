package com.desarrollo.skills.dto;

import lombok.Getter;
import lombok.Setter;

//Clase tipo Dto enmascarar los datos profesiones de un profesiona

@Getter
@Setter
public class ProfesionesDto {

    private Long Id;
    private String Nombre;
    private boolean Estado;
}
