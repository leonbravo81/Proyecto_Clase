package com.desarrollo.skills.dto;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

// Clase de tipo DTO para enmascarar los profesionales
@Getter
@Setter
public class ProfesionalesDto {
    private Long Id;
    private String Nombre;
    private String Apellidos;
    private Long Id_TipoIdentificacion;
    private Long Nro_Documento;
    private Date Fecha_Nacimiento;
    private Boolean Estado;
    private List<String> Profesiones;//Listar profesiones ya existentes
    private List<Long> AsignarProfesion;//[1,2,3,4] lo que vamos a guardar
}
