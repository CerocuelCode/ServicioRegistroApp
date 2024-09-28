package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.SesionClaseEntity;

import java.util.List;

public interface SesionClaseService {
    public List<SesionClaseEntity> findAll();
    public List<SesionClaseEntity> findAllCustom();
    public SesionClaseEntity findById(long id);
    public SesionClaseEntity add(SesionClaseEntity sc);
    public SesionClaseEntity update(SesionClaseEntity sc);
    public SesionClaseEntity delete(SesionClaseEntity sc);
}
