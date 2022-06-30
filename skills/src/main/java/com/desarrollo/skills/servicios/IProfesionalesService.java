package com.desarrollo.skills.servicios;

import java.util.List;

import com.desarrollo.skills.dto.ProfesionalesDto;


public interface IProfesionalesService {
    List<ProfesionalesDto> listarProfesionales();
    ProfesionalesDto buscarProfesional(Long Id);
    ProfesionalesDto guardarProfesional(ProfesionalesDto profesionalesDto);
    void eliminarProfesional(Long Id);
}
