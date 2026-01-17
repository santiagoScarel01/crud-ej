package santiago.crud.service;

import santiago.crud.model.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public List<Estudiante> listEstudiante();
    public void saveEstudiante(Estudiante estud);
    public void updateEstudiante(Estudiante estud);
    public void deleteEstudiante(Long id);





}
