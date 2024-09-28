package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.GradoEntity;

import java.util.List;

public interface GradoService {
    public List<GradoEntity> findAll();
    public List<GradoEntity> findAllCustom();
    public GradoEntity findById(long id);
    public GradoEntity add(GradoEntity g);
    public GradoEntity update(GradoEntity g);
    public GradoEntity delete(GradoEntity g);
}
