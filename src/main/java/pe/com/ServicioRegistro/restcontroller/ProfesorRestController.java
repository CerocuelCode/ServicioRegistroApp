package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.ProfesorEntity;
import pe.com.ServicioRegistro.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorRestController {
    @Autowired
    private ProfesorService service;

    //Listados --> GET
    @GetMapping
    public List<ProfesorEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<ProfesorEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public ProfesorEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public ProfesorEntity add(@RequestBody ProfesorEntity p){
        return service.add(p);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public ProfesorEntity update(@PathVariable long id, @RequestBody ProfesorEntity p){
        p.setCodigo(id);
        return service.update(p);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public ProfesorEntity delete(@PathVariable long id){
        ProfesorEntity objProfesor = new ProfesorEntity();
        objProfesor.setEstado(false);
        return service.delete(ProfesorEntity.builder().codigo(id).build());
    }
}
