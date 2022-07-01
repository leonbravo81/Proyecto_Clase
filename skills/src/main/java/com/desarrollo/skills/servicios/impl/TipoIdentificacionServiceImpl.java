package com.desarrollo.skills.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desarrollo.skills.dto.TipoIdentificacionDto;
import com.desarrollo.skills.servicios.ITipoIdentificacionService;

public class TipoIdentificacionServiceImpl implements ITipoIdentificacionService{

    //Inyeccion de una interfaz que ya esta en memoria
    @Autowired

    @Override
    public List<TipoIdentificacionDto> listarTiposIdentificacion() {
        // TODO Auto-generated method stub
        return null;
    } 

    @Override
    public TipoIdentificacionDto buscarTipoIdentificacion(Long Id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TipoIdentificacionDto guardarTipoIdentificacion(TipoIdentificacionDto TipoIdentificacionDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarTipoIdentificacion(Long Id) {
        // TODO Auto-generated method stub
        
    }
    
}
