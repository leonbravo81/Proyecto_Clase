package com.desarrollo.skills.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
//Clase tipo entidad para guardar las profesiones de un profesional
@Getter
@Setter
@Entity
@Table (name="TBL_Profesiones")
public class Profesiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (name="Nombres")
    private String Nombre;
    @Column (name="Estado")
    private boolean Estado;
}
