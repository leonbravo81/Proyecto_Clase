package com.desarrollo.skills.servicios;

import java.util.List;

import com.desarrollo.skills.dto.TipoIdentificacionDto;

public interface ITipoIdentificacionService {
    List<TipoIdentificacionDto> listarTiposIdentificacion();
    TipoIdentificacionDto buscarTipoIdentificacion(Long Id);
    TipoIdentificacionDto guardarTipoIdentificacion(TipoIdentificacionDto TipoIdentificacionDto);
    void eliminarTipoIdentificacion(Long Id);
}
