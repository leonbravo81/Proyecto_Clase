package com.desarrollo.skills.entidades;


import java.sql.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Profesionales {
    private Long Id;
    private String Nombre;
    private String Apellido;
    private Long id_TipoIdentificacion;
    private Long Nro_Documento;
    private Date Fecha_Nacimiento;
    private boolean Estado;
    private Date Fecha_Modificacion;
    
}
