package SA.world_builder.Model;


import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ToFeatureBaseDetail<T> extends BaseDetail<T, Feature> {
}
