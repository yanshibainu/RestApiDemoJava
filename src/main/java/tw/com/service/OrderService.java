package tw.com.service;

import org.springframework.stereotype.Service;
import tw.com.dao.IRepository;
import tw.com.dao.OrderRepository;
import tw.com.entities.Order;

@Service
public class OrderService extends AbstractService<Order>{
    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
    }
}
