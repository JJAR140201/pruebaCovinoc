package prueba.covinoc.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name = "persona")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nombre;
    private String apellido;
    private int edad;


    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
