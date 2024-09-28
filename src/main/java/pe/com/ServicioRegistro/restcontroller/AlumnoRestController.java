package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.AlumnoEntity;
import pe.com.ServicioRegistro.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoRestController {
    @Autowired
    private AlumnoService service;

    //Listados --> GET
    @GetMapping
    public List<AlumnoEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<AlumnoEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public AlumnoEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public AlumnoEntity add(@RequestBody AlumnoEntity a){
        return service.add(a);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public AlumnoEntity update(@PathVariable long id, @RequestBody AlumnoEntity a){
        a.setCodigo(id);
        return service.update(a);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public AlumnoEntity delete(@PathVariable long id){
        AlumnoEntity objAlumno = new AlumnoEntity();
        objAlumno.setEstado(false);
        return service.delete(AlumnoEntity.builder().codigo(id).build());
    }
}
