package com.desarrollo.skills.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.skills.entidades.Profesiones;

//Interfaz repositorios para los CRUD de las profesiones


@Repository
@Transactional
public interface ProfesionRepository extends CrudRepository<Profesiones,Long> {
    
}
