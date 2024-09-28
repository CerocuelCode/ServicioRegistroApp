package pe.com.ServicioRegistro.service;

import pe.com.ServicioRegistro.entity.AlumnoEntity;
import java.util.List;

public interface AlumnoService {
    public List<AlumnoEntity> findAll();
    public List<AlumnoEntity> findAllCustom();
    public AlumnoEntity findById(long id);
    public AlumnoEntity add(AlumnoEntity a);
    public AlumnoEntity update(AlumnoEntity a);
    public AlumnoEntity delete(AlumnoEntity a);
}
