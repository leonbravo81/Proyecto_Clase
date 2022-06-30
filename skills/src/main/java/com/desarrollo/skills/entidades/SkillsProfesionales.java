package com.desarrollo.skills.entidades;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
//Clase tipo entidad para guardar los skills de los profesionales

@Getter
@Setter
@Entity
@Table (name="TBL_Profesiones_Profesional")
public class SkillsProfesionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (name="Id_Profesion")
    private Long Id_Profesion;
    @Column (name="Id_Profesional")
    private Long Id_Profesional;
    @Column (name="fecha_Graduacion")
    private Date Fecha_Graduacion;
    
}
