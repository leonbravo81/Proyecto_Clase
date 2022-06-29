package com.desarrollo.skills.entidades;


import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
//Clase tipo entidad para guardar los skills de los profesionales

@Getter
@Setter
public class SkillsProfesionales {
    private Long Id_Profesion;
    private Long Id_Profesional;
    private Date fecha_Graduacion;
    
}
