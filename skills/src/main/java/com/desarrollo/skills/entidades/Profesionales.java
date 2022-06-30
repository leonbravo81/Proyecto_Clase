package com.desarrollo.skills.entidades;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table (name="TBL_Profesional")
public class Profesionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ID_Profesional")
    private Long Id;
    @Column (name="Nombre")
    private String Nombre;
    @Column (name="Apellidos")
    private String Apellidos;
    @Column (name="Id_TipoIdentificacion")
    private Long Id_TipoIdentificacion;
    @Column (name="Nro_Documento")
    private Long Nro_Documento;
    @Column (name="Fecha_Nacimiento")
    private Date Fecha_Nacimiento;
    @Column (name="Estado")
    private boolean Estado;
    @Column (name="Fecha_Modificacion")
    private Date Fecha_Modificacion;
}
