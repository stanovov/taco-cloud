package sia.tacocloud.data.jpa;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.entity.TacoOrder;

public interface TacoOrderRepositoryJpa extends CrudRepository<TacoOrder, Long> {
}
