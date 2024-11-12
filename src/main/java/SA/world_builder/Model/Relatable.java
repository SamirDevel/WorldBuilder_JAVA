package SA.world_builder.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@MappedSuperclass
public abstract  class Relatable extends BaseEntity{
    protected String history;
}
