package sia.tacocloud.data.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.entity.TacoOrder;

import java.util.Date;
import java.util.List;

public interface TacoOrderRepositoryJpa extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readTacoOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<TacoOrder> findByDeliveryCityOrderByDeliveryName(String city);

    @Query("select o FROM TacoOrder o WHERE o.deliveryCity = 'Seattle'")
    List<TacoOrder> readOrderDeliveredInSeattle();

}
