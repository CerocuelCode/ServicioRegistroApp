package pe.com.ServicioRegistro.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ServicioRegistro.entity.TurnoEntity;
import pe.com.ServicioRegistro.repository.TurnoRepository;
import pe.com.ServicioRegistro.service.TurnoService;

import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {
    @Autowired
    private TurnoRepository repository;

    @Override
    public List<TurnoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<TurnoEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public TurnoEntity findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public TurnoEntity add(TurnoEntity t) {
        return repository.save(t);
    }

    @Override
    public TurnoEntity update(TurnoEntity t) {
        TurnoEntity objTurno = new TurnoEntity();
        BeanUtils.copyProperties(t, objTurno);
        return repository.save(objTurno);
    }

    @Override
    public TurnoEntity delete(TurnoEntity t) {
        TurnoEntity objTurno = repository.findById(t.getCodigo()).get();
        objTurno.setEstado(false);
        return repository.save(objTurno);
    }
}
