package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.SesionClaseEntity;
import pe.com.ServicioRegistro.repository.SesionClaseRepository;
import pe.com.ServicioRegistro.service.SesionClaseService;

import java.util.List;

@Service
public class SesionClaseServiceImpl implements SesionClaseService {
    @Autowired
    private SesionClaseRepository repository;

    @Override
    public List<SesionClaseEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<SesionClaseEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public SesionClaseEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public SesionClaseEntity add(SesionClaseEntity sc) {
        return repository.save(sc);
    }

    @Override
    public SesionClaseEntity update(SesionClaseEntity sc) {
        SesionClaseEntity objSesion = new SesionClaseEntity();
        BeanUtils.copyProperties(sc, objSesion);
        return repository.save(objSesion);
    }

    @Override
    public SesionClaseEntity delete(SesionClaseEntity sc) {
        SesionClaseEntity objSesion = repository.findById(sc.getCodigo()).get();
        objSesion.setEstado(false);
        return repository.save(objSesion);
    }
}
