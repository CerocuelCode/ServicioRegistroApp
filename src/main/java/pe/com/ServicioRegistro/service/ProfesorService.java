package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.ProfesorEntity;

import java.util.List;

public interface ProfesorService {
    public List<ProfesorEntity> findAll();
    public List<ProfesorEntity> findAllCustom();
    public ProfesorEntity findById(long id);
    public ProfesorEntity add(ProfesorEntity p);
    public ProfesorEntity update(ProfesorEntity p);
    public ProfesorEntity delete(ProfesorEntity p);
}
