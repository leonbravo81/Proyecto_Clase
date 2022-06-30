package com.desarrollo.skills.servicios;

import java.util.List;


import com.desarrollo.skills.dto.ProfesionesDto;

public interface IProfesionService {
    List<ProfesionesDto> listarProfesiones();
    ProfesionesDto buscarProfesion(Long Id);
    ProfesionesDto guardarProfesion(ProfesionesDto profesionesDto);
    void eliminarProfesion(Long Id);
    
}
