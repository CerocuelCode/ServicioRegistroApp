package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.AsistenciaEntity;
import pe.com.ServicioRegistro.repository.AsistenciaRepository;
import pe.com.ServicioRegistro.service.AsistenciaService;

import java.util.List;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {

    @Autowired
    private AsistenciaRepository repository;

    @Override
    public List<AsistenciaEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<AsistenciaEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public AsistenciaEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public AsistenciaEntity add(AsistenciaEntity aa) {
        return repository.save(aa);
    }

    @Override
    public AsistenciaEntity update(AsistenciaEntity aa) {
        AsistenciaEntity objAsistencia = new AsistenciaEntity();
        BeanUtils.copyProperties(aa, objAsistencia);
        return repository.save(objAsistencia);
    }

    @Override
    public AsistenciaEntity delete(AsistenciaEntity aa) {
        AsistenciaEntity objAsistencia = repository.findById(aa.getCodigo()).orElse(null);
        if (objAsistencia != null) {
            repository.delete(objAsistencia);
        }
        return objAsistencia;
    }
}
