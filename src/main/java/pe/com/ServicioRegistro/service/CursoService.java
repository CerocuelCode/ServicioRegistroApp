package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.CursoEntity;

import java.util.List;

public interface CursoService {
    public List<CursoEntity> findAll();
    public List<CursoEntity> findAllCustom();
    public CursoEntity findById(long id);
    public CursoEntity add(CursoEntity c);
    public CursoEntity update(CursoEntity c);
    public CursoEntity delete(CursoEntity c);
}
