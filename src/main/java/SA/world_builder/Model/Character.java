package SA.world_builder.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity //Iindica que el modelo se comunica con la base de datos
@Data //Ayuda a craer los metodos get y set del modelo
@NoArgsConstructor //Crea un constructor sin argumentos
@AllArgsConstructor //Crea un constructor con todos los argumentos
@ToString //Crea el metodo toString automaticamente
public class Character extends Relatable{
    private String lastName;

    @ManyToOne
    private Species species;

    @OneToMany(mappedBy = "origin")
    private List<CharacterDetail> details;
}
