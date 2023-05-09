package sia.tacocloud.data.jdbc;

import sia.tacocloud.model.entity.TacoOrder;

public interface TacoOrderRepositoryJdbc {
    TacoOrder save(TacoOrder tacoOrder);
}
