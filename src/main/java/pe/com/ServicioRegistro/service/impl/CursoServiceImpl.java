package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.CursoEntity;
import pe.com.ServicioRegistro.repository.CursoRepository;
import pe.com.ServicioRegistro.service.CursoService;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;

    @Override
    public List<CursoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<CursoEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public CursoEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public CursoEntity add(CursoEntity c) {
        return repository.save(c);
    }

    @Override
    public CursoEntity update(CursoEntity c) {
        CursoEntity objCurso = new CursoEntity();
        BeanUtils.copyProperties(c, objCurso);
        return repository.save(objCurso);
    }

    @Override
    public CursoEntity delete(CursoEntity c) {
        CursoEntity objCurso = repository.findById(c.getCodigo()).get();
        objCurso.setEstado(false);
        return repository.save(objCurso);
    }
}
