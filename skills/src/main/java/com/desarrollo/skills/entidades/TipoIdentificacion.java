package com.desarrollo.skills.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
//Clase de tipo entidad para guardar los tipos de identificacioon

@Getter
@Setter
@Entity
@Table(name="TBL_Tipo_Identificacion")
public class TipoIdentificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (name="Nombre")
    private String Nombre;
    @Column (name="Estado")
    private boolean Estado;

}
