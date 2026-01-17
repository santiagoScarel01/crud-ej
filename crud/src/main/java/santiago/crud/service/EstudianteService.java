package santiago.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santiago.crud.model.Estudiante;
import santiago.crud.repository.IEstudianteRepository;

import java.util.List;

@Service
public class EstudianteService implements IEstudianteService{
    @Autowired
    private IEstudianteRepository estudRepo;


    @Override
    public List<Estudiante> listEstudiante() {
        return estudRepo.findAll();
    }

    @Override
    public void saveEstudiante(Estudiante estud) {
        estudRepo.save(estud);

    }

    @Override
    public void updateEstudiante(Estudiante estud) {
        estudRepo.save(estud);
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudRepo.deleteById(id);
    }
}
