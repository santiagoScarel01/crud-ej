package santiago.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import santiago.crud.model.Estudiante;
@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
