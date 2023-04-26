package prueba.covinoc.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name = "estado")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreEstado;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
