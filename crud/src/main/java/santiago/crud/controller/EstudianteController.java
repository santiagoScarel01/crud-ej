package santiago.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import santiago.crud.model.Estudiante;
import santiago.crud.service.IEstudianteService;

import java.util.List;

@RestController
public class EstudianteController {
    @Autowired
    private IEstudianteService estudServ;


    @GetMapping("/estudiantes")
    public List<Estudiante> listEstudiantes(){
        return estudServ.listEstudiante();
    }

    @PostMapping("/estudiante/save")
    public void saveEstudiante(@RequestBody Estudiante estud){
        estudServ.saveEstudiante(estud);
    }

    @PutMapping("/estudiante/update")
    public void updateEstudiante(@RequestBody Estudiante estud){
        estudServ.updateEstudiante(estud);
    }

    @DeleteMapping("/estudiante/delete/{id}")
    public void deleteEstudiante(@PathVariable Long id){
        estudServ.deleteEstudiante(id);
    }
}
