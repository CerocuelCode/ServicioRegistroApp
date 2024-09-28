package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.AsistenciaEntity;

import java.util.List;

public interface AsistenciaService {
    public List<AsistenciaEntity> findAll();
    public List<AsistenciaEntity> findAllCustom();
    public AsistenciaEntity findById(long id);
    public AsistenciaEntity add(AsistenciaEntity aa);
    public AsistenciaEntity update(AsistenciaEntity aa);
    public AsistenciaEntity delete(AsistenciaEntity aa);
}