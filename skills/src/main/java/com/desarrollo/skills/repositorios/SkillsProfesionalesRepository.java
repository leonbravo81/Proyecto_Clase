package com.desarrollo.skills.repositorios;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.skills.entidades.SkillsProfesionales;


//Interfaz repositorios para los CRUD de los skills de los profesionales
@Repository
@Transactional
public interface SkillsProfesionalesRepository extends CrudRepository<SkillsProfesionales,Long> {
    
}
