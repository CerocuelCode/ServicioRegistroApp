package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.SeccionEntity;
import pe.com.ServicioRegistro.repository.SeccionRepository;
import pe.com.ServicioRegistro.service.SeccionService;

import java.util.List;

@Service
public class SeccionServiceImpl implements SeccionService {

    @Autowired
    private SeccionRepository repository;

    @Override
    public List<SeccionEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<SeccionEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public SeccionEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public SeccionEntity add(SeccionEntity s) {
        return repository.save(s);
    }

    @Override
    public SeccionEntity update(SeccionEntity s) {
        SeccionEntity objSeccion = new SeccionEntity();
        BeanUtils.copyProperties(s, objSeccion);
        return repository.save(objSeccion);
    }

    @Override
    public SeccionEntity delete(SeccionEntity s) {
        SeccionEntity objSeccion = repository.findById(s.getCodigo()).get();
        objSeccion.setEstado(false);
        return repository.save(objSeccion);
    }
}
