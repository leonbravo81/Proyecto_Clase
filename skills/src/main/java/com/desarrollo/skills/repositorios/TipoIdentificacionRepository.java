package com.desarrollo.skills.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.skills.entidades.TipoIdentificacion;



//Interfaz repositorios para los CRUD de tipos de identificacion

@Repository
@Transactional
public interface TipoIdentificacionRepository extends CrudRepository<TipoIdentificacion,Long>{
    
}
