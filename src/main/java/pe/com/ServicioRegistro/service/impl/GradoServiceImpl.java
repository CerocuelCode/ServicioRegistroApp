package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.GradoEntity;
import pe.com.ServicioRegistro.repository.GradoRepository;
import pe.com.ServicioRegistro.service.GradoService;

import java.util.List;

@Service
public class GradoServiceImpl implements GradoService {

    @Autowired
    private GradoRepository repository;

    @Override
    public List<GradoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<GradoEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public GradoEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public GradoEntity add(GradoEntity g) {
        return repository.save(g);
    }

    @Override
    public GradoEntity update(GradoEntity g) {
        GradoEntity objGrado = new GradoEntity();
        BeanUtils.copyProperties(g, objGrado);
        return repository.save(objGrado);
    }

    @Override
    public GradoEntity delete(GradoEntity g) {
        GradoEntity objGrado = repository.findById(g.getCodigo()).get();
        objGrado.setEstado(false);
        return repository.save(objGrado);
    }
}
