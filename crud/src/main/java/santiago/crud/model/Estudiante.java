package santiago.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String anio;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String anio) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
    }
}
