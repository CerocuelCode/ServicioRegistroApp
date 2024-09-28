package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.TurnoEntity;
import pe.com.ServicioRegistro.service.TurnoService;

import java.util.List;

@RestController
@RequestMapping("/turno")

public class TurnoRestController {
    @Autowired
    private TurnoService service;

    //Listados --> GET
    @GetMapping
    public List<TurnoEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<TurnoEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public TurnoEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public TurnoEntity add(@RequestBody TurnoEntity t){
        return service.add(t);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public TurnoEntity update(@PathVariable long id, @RequestBody TurnoEntity t){
        t.setCodigo(id);
        return service.update(t);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public TurnoEntity delete(@PathVariable long id){
        TurnoEntity objTurno = new TurnoEntity();
        objTurno.setEstado(false);
        return service.delete(TurnoEntity.builder().codigo(id).build());
    }
}
