package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.TurnoEntity;

import java.util.List;

public interface TurnoService {
    public List<TurnoEntity> findAll();
    public List<TurnoEntity> findAllCustom();
    public TurnoEntity findById(long id);
    public TurnoEntity add(TurnoEntity t);
    public TurnoEntity update(TurnoEntity t);
    public TurnoEntity delete(TurnoEntity t);
}
