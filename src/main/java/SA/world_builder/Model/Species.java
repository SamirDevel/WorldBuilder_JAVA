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
public class Species extends BaseEntity{
    @ManyToOne
    private Biome biome;

    @OneToMany(mappedBy = "species")
    private List<Character> characters;

    @OneToMany(mappedBy = "origin")
    private List<SpeciesDetail> details;
}
