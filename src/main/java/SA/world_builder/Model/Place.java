package SA.world_builder.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place extends Relatable{

    @ManyToOne
    private Place origin;

    @OneToMany(mappedBy = "origin")
    private List<PlaceDetail> details;
}
