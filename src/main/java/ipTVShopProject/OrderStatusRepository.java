package ipTVShopProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long> {

    List<OrderStatus> findByOrderId(Long orderId);

}