package com.desarrollo.skills.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.skills.entidades.Profesionales;


@Repository
@Transactional
public interface ProfesionalesRepository extends CrudRepository<Profesionales,Long>{
    
}
