package SA.world_builder.Model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
public abstract class BaseDetail<T,U> extends IdBaseEntity{
    @ManyToOne
    private T origin;

    @ManyToOne
    private U destination;

}
