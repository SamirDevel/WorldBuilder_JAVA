package SA.world_builder.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biome extends BaseEntity{
    @OneToMany(mappedBy = "biome")
    private List<Species> species;

    @OneToMany(mappedBy = "biome")
    private List<Flora> floraList;

    @OneToMany(mappedBy = "biome")
    private List<Fauna> faunaList;

    @OneToMany(mappedBy = "origin")
    private List<BiomeDetail> details;
}
