package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.SeccionEntity;

import java.util.List;

public interface SeccionService {
    public List<SeccionEntity> findAll();
    public List<SeccionEntity> findAllCustom();
    public SeccionEntity findById(long id);
    public SeccionEntity add(SeccionEntity s);
    public SeccionEntity update(SeccionEntity s);
    public SeccionEntity delete(SeccionEntity s);
}