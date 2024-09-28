package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.ProfesorEntity;
import pe.com.ServicioRegistro.repository.ProfesorRepository;
import pe.com.ServicioRegistro.service.ProfesorService;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository repository;

    @Override
    public List<ProfesorEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProfesorEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public ProfesorEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public ProfesorEntity add(ProfesorEntity p) {
        return repository.save(p);
    }

    @Override
    public ProfesorEntity update(ProfesorEntity p) {
        ProfesorEntity objProfesor = new ProfesorEntity();
        BeanUtils.copyProperties(p, objProfesor);
        return repository.save(objProfesor);
    }

    @Override
    public ProfesorEntity delete(ProfesorEntity p) {
        ProfesorEntity objProfesor = repository.findById(p.getCodigo()).get();
        objProfesor.setEstado(false);
        return repository.save(objProfesor);
    }
}
