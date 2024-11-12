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
public class Feature extends BaseEntity{

    @ManyToOne
    private Index type;

    @OneToMany(mappedBy = "destination")
    private List<CharacterDetail> characterDetails;

    @OneToMany(mappedBy = "destination")
    private List<CultureDetail> cultureDetails;

    @OneToMany(mappedBy = "destination")
    private List<FloraDetail> floraDetails;

    @OneToMany(mappedBy = "destination")
    private List<FaunaDetail> faunaDetails;

    @OneToMany(mappedBy = "destination")
    private List<OcupationDetail> ocupationDetails;

    @OneToMany(mappedBy = "destination")
    private List<ObjectDetail> objectDetails;

    @OneToMany(mappedBy = "destination")
    private List<PlaceDetail> placeDetails;

    @OneToMany(mappedBy = "destination")
    private List<SpeciesDetail> speciesDetails;

    @OneToMany(mappedBy = "destination")
    private List<BiomeDetail> biomeDetails;

}
