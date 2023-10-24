package online.grupo3devops.order.repo;

import online.grupo3devops.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, Long> {
}
