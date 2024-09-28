package pe.com.ServicioRegistro.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ServicioRegistro.entity.CursoEntity;
import pe.com.ServicioRegistro.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoRestController {
    @Autowired
    private CursoService service;

    //Listados --> GET
    @GetMapping
    public List<CursoEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<CursoEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @GetMapping("/{id}")
    public CursoEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    //Registrar -->POST
    @PostMapping
    public CursoEntity add(@RequestBody CursoEntity c){
        return service.add(c);
    }

    //Actualizar -->PUT
    @PutMapping("/{id}")
    public CursoEntity update(@PathVariable long id, @RequestBody CursoEntity c){
        c.setCodigo(id);
        return service.update(c);
    }

    //Eliminar --> DELETE
    @DeleteMapping("/{id}")
    public CursoEntity delete(@PathVariable long id){
        CursoEntity objCurso = new CursoEntity();
        objCurso.setEstado(false);
        return service.delete(CursoEntity.builder().codigo(id).build());
    }
}
