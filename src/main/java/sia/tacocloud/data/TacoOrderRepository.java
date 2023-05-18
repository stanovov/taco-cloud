package sia.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.entity.TacoOrder;

import java.util.UUID;

public interface TacoOrderRepository extends CrudRepository<TacoOrder, UUID> {
}
