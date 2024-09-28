package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.AlumnoEntity;
import pe.com.ServicioRegistro.repository.AlumnoRepository;
import pe.com.ServicioRegistro.service.AlumnoService;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository repository;

    @Override
    public List<AlumnoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<AlumnoEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public AlumnoEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public AlumnoEntity add(AlumnoEntity a) {
        return repository.save(a);
    }

    @Override
    public AlumnoEntity update(AlumnoEntity a) {
        AlumnoEntity objAlumno = new AlumnoEntity();
        BeanUtils.copyProperties(a, objAlumno);
        return repository.save(objAlumno);
    }

    @Override
    public AlumnoEntity delete(AlumnoEntity a) {
        AlumnoEntity objAlumno = repository.findById(a.getCodigo()).get();
        objAlumno.setEstado(false);
        return repository.save(objAlumno);
    }
}
